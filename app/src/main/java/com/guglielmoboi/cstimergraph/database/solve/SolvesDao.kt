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

package com.guglielmoboi.cstimergraph.database.solve

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface SolvesDao
{
    @Insert
    suspend fun insert(solveEntity: SolveEntity)

    @Update
    suspend fun update(solveEntity: SolveEntity)

    @Query("DELETE FROM solves_table")
    suspend fun clear()

    @Query("SELECT * FROM solves_table WHERE solve_index >= :firstSolveIndex AND solve_index <= :lastSolveIndex")
    suspend fun getSolvesWithinIndexes(firstSolveIndex: Int, lastSolveIndex: Int): List<SolveEntity>

    @Query("DELETE FROM solves_table WHERE solve_index >= :firstSolveIndex AND solve_index <= :lastSolveIndex")
    suspend fun clearSolvesWithinIndexes(firstSolveIndex: Int, lastSolveIndex: Int)

    @Query("SELECT * FROM solves_table ORDER BY date_time ASC")
    suspend fun getAllSolves(): List<SolveEntity>
}