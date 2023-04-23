//    This file is part of csTimer Graph.
//    Copyright © 2021-2023 Guglielmo Boi.

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

package com.guglielmoboi.cstimergraph.util.converters

import android.app.Application
import android.content.Context
import android.net.Uri
import android.widget.Toast
import com.guglielmoboi.cstimergraph.solvedata.solve.Scramble
import com.guglielmoboi.cstimergraph.solvedata.solve.Solve
import com.guglielmoboi.cstimergraph.solvedata.solve.SolvePenalty
import com.guglielmoboi.cstimergraph.solvedata.solve.SolveTime
import com.guglielmoboi.cstimergraph.util.datetime.DateTime
import java.io.BufferedReader
import java.io.InputStreamReader

fun readTextFromUri(uri: Uri, context: Context?): List<String> {
    val text = mutableListOf<String>()

    context?.contentResolver?.openInputStream(uri)?.use { inputStream ->
        BufferedReader(InputStreamReader(inputStream)).use { reader ->
            var line: String? = reader.readLine()
            while (line != null) {
                text.add(line)
                line = reader.readLine()
            }
        }
    }

    return text
} // convert a uri source (pointing to a csv file) to text (List<String>)

fun textToSolves(text: List<String>, firstSolveIndex: Int): List<Solve> {
    val solves = mutableListOf<Solve>()
    var index = firstSolveIndex

    for((i, line) in text.withIndex()) {
        if(i == 0) continue

        val fields = line.split(";")

        if(fields.size != 6) {
            throw NumberFormatException("Invalid file formatting.")
        }

        val number: Int = fields[0].toInt()
        val timeStr: String = fields[1]
        val solveTime = SolveTime(fields[5])
        val solvePenalty = SolvePenalty.timeStringToSolvePenalty(timeStr)
        val comment: String = fields[2]
        val scrambleStr: String = fields[3]
        val dateTime = DateTime(fields[4])

        solves.add(Solve(0, index++, number, timeStr, solveTime, solvePenalty, comment, Scramble(scrambleStr), dateTime))
    }

    return solves.toList()
} // convert a text (List<String>) containing solves to a List<Solve>

