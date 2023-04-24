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

package com.guglielmoboi.cstimergraph.solvedata.solve

import com.guglielmoboi.cstimergraph.database.solve.SolveEntity
import com.guglielmoboi.cstimergraph.solvedata.datetime.DateTime

data class Solve
    (
        val id: Long,
        val index: Int,
        val number: Int,
        val timeStr: String,
        val time: SolveTime,
        val scramble: Scramble,
        val comment: String,
        val dateTime: DateTime,
    )

    : Comparable<Solve>
{
    constructor(solveEntity: SolveEntity) :
            this(solveEntity.solveId, solveEntity.solveIndex, solveEntity.number, solveEntity.timeStr,
                SolveTime(solveEntity.time), Scramble(solveEntity.scramble), solveEntity.comment, DateTime(solveEntity.dateTime))

    fun toSolveEntity(): SolveEntity = SolveEntity(0, index, number, timeStr, time.toString(), scramble.toString(), comment, dateTime.toString())


    override fun toString(): String {
        return("$number $timeStr $comment $scramble $dateTime $timeStr")
    }

    override fun compareTo(other: Solve): Int {
        return compareValuesBy(this, other, Solve::time)
    }
}


fun Solve.compareByDate(other: Solve): Int {
    return compareValuesBy(this, other, Solve::dateTime)
}