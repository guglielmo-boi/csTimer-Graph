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

package com.guglielmoboi.cstimergraph.database.repository

import android.app.Application
import com.guglielmoboi.cstimergraph.database.session.SessionEntity
import com.guglielmoboi.cstimergraph.database.session.SessionsDatabase
import com.guglielmoboi.cstimergraph.database.solve.SolveEntity
import com.guglielmoboi.cstimergraph.database.solve.SolvesDatabase
import com.guglielmoboi.cstimergraph.solvedata.session.Session
import com.guglielmoboi.cstimergraph.solvedata.solve.Solve
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository(application: Application)
{
    private val solvesDatabase = SolvesDatabase.getInstance(application).solvesDao
    private val sessionsDatabase = SessionsDatabase.getInstance(application).sessionsDao


    private fun buildSolves(solvesEntities: List<SolveEntity>): List<Solve> =
        solvesEntities.map { solveEntity -> Solve(solveEntity) }

    private suspend fun buildSession(sessionEntity: SessionEntity): Session {
        if(sessionEntity.size == 0) {
            return Session(sessionEntity, listOf())
        }

        return Session(sessionEntity, buildSolves(getSolvesWithinIndexes(sessionEntity.firstSolveIndex, sessionEntity.lastSolveIndex)))
    }

    private suspend fun buildSessions(sessionsEntities: List<SessionEntity>): List<Session> =
        sessionsEntities.map { sessionEntity -> buildSession(sessionEntity) }


    suspend fun insertSolve(solveEntity: SolveEntity) {
        withContext(Dispatchers.IO) {
            solvesDatabase.insert(solveEntity)
        }
    }

    suspend fun updateSolve(solveEntity: SolveEntity) {
        withContext(Dispatchers.IO) {
            solvesDatabase.update(solveEntity)
        }
    }

    suspend fun clearSolves() {
        withContext(Dispatchers.IO) {
            solvesDatabase.clear()
        }
    }

    suspend fun clearSolvesWithinIndexes(firstSolveIndex: Int, lastSolveIndex: Int) {
        withContext(Dispatchers.IO) {
            solvesDatabase.clearSolvesWithinIndexes(firstSolveIndex, lastSolveIndex)
        }
    }

    private suspend fun getSolvesWithinIndexes(firstSolveIndex: Int?, lastSolveIndex: Int?): List<SolveEntity> {
        return withContext(Dispatchers.IO) {
            if(firstSolveIndex != null && lastSolveIndex != null) {
                solvesDatabase.getSolvesWithinIndexes(firstSolveIndex, lastSolveIndex)
            } else {
                listOf()
            }
        }
    }

    suspend fun getAllSolves(): List<Solve> {
        return buildSolves(withContext(Dispatchers.IO) {
            solvesDatabase.getAllSolves()
        })
    }

    suspend fun getMaxSolveIndex(): Int? {
        return withContext(Dispatchers.IO) {
            sessionsDatabase.getMaxSolveIndex()
        }
    }


    suspend fun insertSession(sessionEntity: SessionEntity) {
        withContext(Dispatchers.IO) {
            sessionsDatabase.insert(sessionEntity)
        }
    }

    suspend fun updateSession(sessionEntity: SessionEntity) {
        withContext(Dispatchers.IO) {
            sessionsDatabase.update(sessionEntity)
        }
    }

    suspend fun clearSessions() {
        withContext(Dispatchers.IO) {
            sessionsDatabase.clear()
        }
    }

    suspend fun clearSession(id: Long) {
        withContext(Dispatchers.IO) {
            val session = sessionsDatabase.getSessionWithId(id)
            solvesDatabase.clearSolvesWithinIndexes(session.firstSolveIndex, session.lastSolveIndex)

            sessionsDatabase.clearSession(id)
        }
    }

    suspend fun getSessionWithId(id: Long): Session {
        return withContext(Dispatchers.IO) {
            buildSession(sessionsDatabase.getSessionWithId(id))
        }
    }

    suspend fun getAllSessions(): List<Session> {
        return buildSessions(withContext(Dispatchers.IO) {
            sessionsDatabase.getAllSessions()
        })
    }
}


