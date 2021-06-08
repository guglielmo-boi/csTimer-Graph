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

package com.guglielmoboi.cstimergraph.solvedata.solve

import com.guglielmoboi.cstimergraph.database.solve.SolveEntity
import com.guglielmoboi.cstimergraph.util.datetime.DateTime

/* ENUMS */

enum class SolvePenalty
{
    DNF, PLUS2;

    companion object
    {
        fun timeStringToSolvePenalty(timeStr: String): SolvePenalty? {
            return when {
                timeStr.contains("DNF") -> SolvePenalty.DNF

                timeStr.contains("+") -> SolvePenalty.PLUS2

                else -> null
            }
        }
    }
}


data class Solve
    (
        val id: Long,
        val index: Int,
        val number: Int,
        val timeStr: String,
        val time: SolveTime,
        val solvePenalty: SolvePenalty?,
        val comment: String,
        val scramble: Scramble,
        val dateTime: DateTime
    )

    : Comparable<Solve>
{
    /* CONSTRUCTORS */

    constructor(solveEntity: SolveEntity) :
            this(solveEntity.solveId, solveEntity.solveIndex, solveEntity.number, solveEntity.timeStr, SolveTime(solveEntity.time),
                 SolvePenalty.timeStringToSolvePenalty(solveEntity.timeStr), solveEntity.comment, Scramble(solveEntity.scramble), DateTime(solveEntity.dateTime))


    /* UNIVERSAL METHODS & COMPARE */

    override fun toString(): String {
        return("$number $timeStr $comment $scramble $dateTime $timeStr")
    } // $number $timeStr $comment $scramble $dateTime $time

    override fun compareTo(other: Solve): Int {
        return compareValuesBy(this, other, Solve::time)
    } // compare by: time


    /* CONVERSION METHODS */

    fun toSolveEntity(): SolveEntity =
        SolveEntity(0, index, number, timeStr, comment, scramble.toString(), dateTime.toString(), time.toString())
}


/* EXTENSION FUNCTIONS */

fun Solve.compareByDate(other: Solve): Int {
    return compareValuesBy(this, other, Solve::dateTime)
}