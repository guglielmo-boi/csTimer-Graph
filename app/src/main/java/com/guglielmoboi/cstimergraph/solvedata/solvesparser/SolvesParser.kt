//    This file is part of csTimer Graph.

//    Copyright © 2021-2024 Guglielmo Boi

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

package com.guglielmoboi.cstimergraph.solvedata.solvesparser

import android.content.Context
import android.net.Uri
import com.guglielmoboi.cstimergraph.solvedata.datetime.DateTime
import com.guglielmoboi.cstimergraph.solvedata.solve.Scramble
import com.guglielmoboi.cstimergraph.solvedata.solve.Solve
import com.guglielmoboi.cstimergraph.solvedata.solve.SolveTime
import java.io.BufferedReader
import java.io.InputStreamReader

object SolvesParser
{
    fun parse(context: Context, uri: Uri, firstSolveIndex: Int): List<Solve> =
        stringListToSolveList(readTextFromUri(context, uri), firstSolveIndex)

    private fun readTextFromUri(context: Context, uri: Uri): List<String> {
        val text = mutableListOf<String>()

        context.contentResolver?.openInputStream(uri)?.use { inputStream ->
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

    private fun stringListToSolveList(text: List<String>, firstSolveIndex: Int): List<Solve> {
        val solves = mutableListOf<Solve>()
        var index = firstSolveIndex

        if(text.size <= 1) {
            throw NumberFormatException("Invalid file formatting.")
        }

        for((i, line) in text.withIndex()) {
            if(i == 0) continue

            val fields = line.split(";")

            if(fields.size != 6) {
                throw NumberFormatException("Invalid file formatting.")
            }

            val number = fields[0].toInt()
            val timeStr = fields[1]
            val solveTime = SolveTime(fields[5]) +
                if(timeStr.contains("+")) {
                    SolveTime("2.00")
                } else {
                    SolveTime("0.0")
                }

            val comment = fields[2]
            val scramble = Scramble(fields[3])
            val dateTime = DateTime(fields[4])

            solves.add(Solve(0, index++, number, timeStr, solveTime, scramble, comment, dateTime))
        }

        return solves.toList()
    } // convert a text (List<String>) containing solves to a List<Solve>
}





