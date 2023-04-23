//    This file is part of csTimer Graph.

//    Copyright © 2021-2023 Guglielmo Boi

//    csTimer Graph is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.

//    csTimer Graph is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.

//    You should have received a copy of the GNU General Public License
//    along with csTimer Graph.  If not, see https://www.gnu.org/licenses/.

package com.guglielmoboi.cstimergraph.solvedata.session

import com.guglielmoboi.cstimergraph.database.session.SessionEntity
import com.guglielmoboi.cstimergraph.solvedata.solve.Solve
import com.guglielmoboi.cstimergraph.solvedata.solve.SolveTime
import com.guglielmoboi.cstimergraph.solvedata.solve.getMeanFromSolvesTimes
import com.guglielmoboi.cstimergraph.util.datetime.DateTime

class Session(sessionEntity: SessionEntity, solveArgs: List<Solve>) : Comparable<Session>
{
    val id: Long = sessionEntity.sessionId
    val name: String? = sessionEntity.name

    val startDateTime: DateTime? = initDateTime(sessionEntity.startDateTime)
    val endDateTime: DateTime? = initDateTime(sessionEntity.endDateTime)

    val solves: List<Solve> = solveArgs

    val averagesFive: List<SolveTime> = calcAverages(solves, size = 5)
    val averagesTwelve: List<SolveTime> = calcAverages(solves, size = 12)

    val size: Int
        get() = solves.size

    val mean: SolveTime? = getMeanFromSolvesTimes(solves.map { it.time })
    val bestSolve: Solve? = solves.minOrNull()
    val worstSolve: Solve? = solves.maxOrNull()
    val bestAverageFive: SolveTime? = averagesFive.minOrNull()
    val worstAverageFive: SolveTime? = averagesFive.maxOrNull()
    val bestAverageTwelve: SolveTime? = averagesTwelve.minOrNull()
    val worstAverageTwelve: SolveTime? = averagesTwelve.maxOrNull()

    val chart = SessionChart(this)


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

                averages += (getMeanFromSolvesTimes(times.toList())!!)
            }

            return averages.toList()
        }
    }


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
    }

    override fun hashCode(): Int {
        return solves.hashCode() * 19
    }

    override fun compareTo(other: Session): Int {
        return compareValuesBy(this, other, Session::endDateTime)
    }
}