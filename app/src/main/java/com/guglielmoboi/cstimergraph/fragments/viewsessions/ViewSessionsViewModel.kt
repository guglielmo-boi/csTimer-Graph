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

package com.guglielmoboi.cstimergraph.fragments.viewsessions

import android.app.Application
import android.content.Intent
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.guglielmoboi.cstimergraph.database.repository.Repository
import com.guglielmoboi.cstimergraph.database.session.SessionEntity
import com.guglielmoboi.cstimergraph.solvedata.session.Session
import com.guglielmoboi.cstimergraph.solvedata.solve.Solve
import com.guglielmoboi.cstimergraph.solvedata.solve.compareByDate
import com.guglielmoboi.cstimergraph.util.converters.readTextFromUri
import com.guglielmoboi.cstimergraph.util.converters.textToSolves
import com.guglielmoboi.cstimergraph.util.datetime.DateTime
import kotlinx.coroutines.*


class ViewSessionsViewModel(private val repository: Repository, application: Application) : AndroidViewModel(application)
{
    /* PROPERTIES */

    // Coroutines
    private var viewModelJob = Job()
    private val mainScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    // MaxSolveIndex
    private var maxSolveIndex: Int? = null

    // Sessions
    private val _sessions = MutableLiveData<List<Session>>()
    val sessions: LiveData<List<Session>>
        get() = _sessions

    // RefreshSessionsButton
    private val _refreshSessionsButtonClicked = MutableLiveData<Boolean>()
    val refreshSessionsButtonClicked: LiveData<Boolean>
        get() = _refreshSessionsButtonClicked

    // LoadSessionButton
    private val _loadSessionButtonClicked = MutableLiveData<Boolean>()
    val loadSessionButtonClicked: LiveData<Boolean>
        get() = _loadSessionButtonClicked

    
    /* COMPANION OBJECT */

    companion object
    {
        /* SESSIONS DATES CALC METHODS */

        private fun calcStartDate(solves: List<Solve>): DateTime? = solves.minWithOrNull(Solve::compareByDate)?.dateTime
        // calculates the starting dateTime of the session

        private fun calcEndDate(solves: List<Solve>): DateTime? = solves.maxWithOrNull(Solve::compareByDate)?.dateTime
        // calculates the ending dateTime of the session
    }


    /* SESSIONS INITIALIZE METHOD */

    fun createSessions() {
        mainScope.launch {
            _sessions.value = repository.getAllSessions()
        }
    }


    /* REFRESH SESSIONS BUTTON METHODS */

    // RefreshSessionsButton control
    fun onRefreshSessionsButtonClicked() {
        _refreshSessionsButtonClicked.value = true
    }

    fun onRefreshSessionsComplete() {
        _refreshSessionsButtonClicked.value = false
    }


    /* LOAD SESSION BUTTON METHODS */

    // LoadSessionButton control
    fun onLoadSessionButtonClicked() {
        _loadSessionButtonClicked.value = true
    }

    fun onLoadSessionComplete() {
        _loadSessionButtonClicked.value = false
    }

    // Load Session from file
    fun loadSession(fragment: ViewSessionsFragment, requestCode: Int) {
        val intent = Intent(Intent.ACTION_OPEN_DOCUMENT).apply {
            addCategory(Intent.CATEGORY_OPENABLE)
            type = "*/*"
        }

        fragment.startActivityForResult(intent, requestCode)
    }

    // Save Session from uri
    suspend fun saveSession(data: Intent?, fragment: ViewSessionsFragment) {
        // uri
        val uri = data?.data

        // Solves Indexes
        maxSolveIndex = repository.getMaxSolveIndex() ?: 0
        val index = (maxSolveIndex ?: 100000) + 1

        // convert the file content to solves through its uri
        val solves = textToSolves(readTextFromUri(uri!!, fragment.requireContext()), index)

        // setup the session to be added the database
        val size = solves.size

        val startDateTime = calcStartDate(solves).toString()
        val endDateTime = calcEndDate(solves).toString()
        val session = SessionEntity(0, "SAMPLE_NAME", startDateTime, endDateTime, solves.first().index, solves.last().index, size)

        // add the session and its solves to the repository
        mainScope.launch {
            solves.forEach { solve ->
                repository.insertSolve(solve.toSolveEntity())
            }
            repository.insertSession(session)
        }
    }

    /* LIFECYCLE METHODS */

    override fun onCleared() {
        super.onCleared()

        // Coroutines
        viewModelJob.cancel()
    }
}
