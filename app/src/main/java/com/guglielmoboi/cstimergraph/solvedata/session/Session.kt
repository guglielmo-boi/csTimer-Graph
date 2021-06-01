//  This file is part of csTimer Graph.
//
//  Copyright © 2021 Guglielmo Boi.
//
//  This program is free software: you can redistribute it and/or modify
//  it under the terms of the GNU General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.
//
//  This program is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU General Public License for more details.
//
//  You should have received a copy of the GNU General Public License
//  along with this program.  If not, see https://www.gnu.org/licenses/.

package com.guglielmoboi.cstimergraph.solvedata.session

import com.guglielmoboi.cstimergraph.database.session.SessionEntity
import com.guglielmoboi.cstimergraph.solvedata.solve.Solve
import com.guglielmoboi.cstimergraph.solvedata.solve.SolveTime
import com.guglielmoboi.cstimergraph.solvedata.solve.getMeanFromSolvesTimes
import com.guglielmoboi.cstimergraph.util.datetime.DateTime

class Session(sessionEntity: SessionEntity, solveArgs: List<Solve>) : Comparable<Session>
{
    /* PROPERTIES */

    // id & name
    val id: Long = sessionEntity.sessionId
    val name: String? = sessionEntity.name

    // Starting end Ending date of the session
    val startDateTime: DateTime? = initDateTime(sessionEntity.startDateTime)
    val endDateTime: DateTime? = initDateTime(sessionEntity.endDateTime)

    // Solves list
    val solves: List<Solve> = solveArgs

    // Averages lists
    val averagesFive: List<SolveTime> = calcAverages(solves, size = 5)
    val averagesTwelve: List<SolveTime> = calcAverages(solves, size = 12)

    // Solves list size
    private val size: Int
        get() = solves.size

    // Various session's data
    val mean: SolveTime? = getMeanFromSolvesTimes(solves.map { it.time })
    val bestSolve: Solve? = solves.minOrNull()
    val worstSolve: Solve? = solves.maxOrNull()
    val bestAverageFive: SolveTime? = averagesFive.minOrNull()
    val worstAverageFive: SolveTime? = averagesFive.maxOrNull()
    val bestAverageTwelve: SolveTime? = averagesTwelve.minOrNull()
    val worstAverageTwelve: SolveTime? = averagesTwelve.maxOrNull()

    // SessionChart (AAChartModel)
    val chart = SessionChart(this)


    /* COMPANION OBJECT */
    companion object
    {
        private fun initDateTime(dateTime: String?): DateTime? {
            return if(dateTime != null) {
                DateTime(dateTime)
            } else {
                null
            }
        } // initializes DateTime based on its nullable value

        private fun calcAverages(solves: List<Solve>, size: Int): List<SolveTime> {
            if(solves.size < size) return listOf() // checks if at least one average can be calculated

            val averages = mutableListOf<SolveTime>()

            for((i, _) in solves.subList(0, solves.size - size + 1).withIndex()) {
                val times = mutableListOf<SolveTime>()
                for(j in 0 until size) {
                    times += solves[(i + j)].time
                }

                times.remove(times.maxOrNull()) // remove the worst time
                times.remove(times.minOrNull()) // remove the best time

                averages += (getMeanFromSolvesTimes(times.toList())!!) // calculates the average
            }

            return averages.toList()
        } // calculates the averages of a list of solves, given the average set size
    }


    /* UNIVERSAL METHODS & COMPARE */
    override fun toString(): String {
        val ret = StringBuilder()

        ret.append("Mean: $mean\n")
        if(bestSolve != null) {
            ret.append("Best Solve: ${bestSolve.timeStr}\n")
        }
        if(worstSolve != null) {
            ret.append("Worst Solve: ${worstSolve.timeStr}\n")
        }

        for(solve in solves) {
            ret.append("Solve ${solve.number}: $solve\n")
        }
        return ret.toString()
    }

    override fun equals(other: Any?): Boolean {
        return if(other == null || other !is Session) {
            false
        } else {
            solves == other.solves
        }
    } // checks whether other is null or not SolveData

    override fun hashCode(): Int {
        return solves.hashCode() * 19
    } // solves.hashCode() * 19

    override fun compareTo(other: Session): Int {
        return compareValuesBy(this, other, Session::endDateTime)
    } // compare by: endDateTime
}