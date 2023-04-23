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

package com.guglielmoboi.cstimergraph.database.session

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface SessionsDao
{
    @Insert
    suspend fun insert(sessionEntity: SessionEntity)

    @Update
    suspend fun update(sessionEntity: SessionEntity)

    @Query("DELETE FROM sessions_table")
    suspend fun clear()

    @Query("DELETE FROM sessions_table WHERE sessionId == :id")
    suspend fun clearSession(id: Long)

    @Query("SELECT * FROM sessions_table WHERE sessionId = :id")
    suspend fun getSessionWithId(id: Long): SessionEntity

    @Query("SELECT * FROM sessions_table ORDER BY end_date_time ASC")
    suspend fun getAllSessions(): List<SessionEntity>

    @Query("SELECT MAX(last_solve_index) FROM sessions_table ")
    suspend fun getMaxSolveIndex(): Int?
}