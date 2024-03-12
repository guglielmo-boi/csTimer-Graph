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

package com.guglielmoboi.cstimergraph.database.sessions

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sessions_table")
data class SessionEntity
    (
        @PrimaryKey(autoGenerate = true)
        var sessionId: Long = 0L,

        @ColumnInfo(name = "name")
        val name: String,

        @ColumnInfo(name = "start_date_time")
        val startDateTime: String,

        @ColumnInfo(name = "end_date_time")
        val endDateTime: String,

        @ColumnInfo(name = "first_solve_index")
        val firstSolveIndex: Int,

        @ColumnInfo(name = "last_solve_index")
        val lastSolveIndex: Int,

        @ColumnInfo(name = "size")
        val size: Int
    )
