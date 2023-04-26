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

package com.guglielmoboi.cstimergraph.database.solves

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "solves_table")
data class SolveEntity
    (
        @PrimaryKey(autoGenerate = true)
        var solveId: Long = 0L,

        @ColumnInfo(name = "solve_index")
        val solveIndex: Int,

        @ColumnInfo(name = "number")
        val number: Int,

        @ColumnInfo(name = "time_string")
        val timeStr: String,

        @ColumnInfo(name = "time")
        val time: String,

        @ColumnInfo(name = "scramble")
        val scramble: String,

        @ColumnInfo(name = "comment")
        val comment: String,

        @ColumnInfo(name = "date_time")
        val dateTime: String,
    )

