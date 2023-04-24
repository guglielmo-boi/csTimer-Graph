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

package com.guglielmoboi.cstimergraph.fragments.viewsessions

import android.app.Application
import android.content.Intent
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavController
import com.guglielmoboi.cstimergraph.database.repository.Repository
import com.guglielmoboi.cstimergraph.database.session.SessionEntity
import com.guglielmoboi.cstimergraph.solvedata.session.Session
import com.guglielmoboi.cstimergraph.solvedata.solve.Solve
import com.guglielmoboi.cstimergraph.solvedata.solve.compareByDate
import com.guglielmoboi.cstimergraph.util.DeleteSessionsResult
import com.guglielmoboi.cstimergraph.util.SessionClickMode
import com.guglielmoboi.cstimergraph.util.converters.readTextFromUri
import com.guglielmoboi.cstimergraph.util.converters.textToSolves
import com.guglielmoboi.cstimergraph.util.datetime.DateTime
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class ViewSessionsViewModel(private val repository: Repository, application: Application) : AndroidViewModel(application)
{
    private var job = Job()
    private val mainScope = CoroutineScope(Dispatchers.Main + job)

    private val _maxIndex = MutableLiveData(0)
    private val _selectedSessionsIds = MutableLiveData(mutableSetOf<Long>())

    private val _sessions = MutableLiveData<List<Session>>()
    val sessions: LiveData<List<Session>>
        get() = _sessions

    private val _sessionClickMode = MutableLiveData(SessionClickMode.DETAIL)
    val sessionClickMode: LiveData<SessionClickMode>
        get() = _sessionClickMode

    private val _sessionClicked = MutableLiveData<Long?>()
    val sessionClicked: LiveData<Long?>
        get() = _sessionClicked

    private val _sessionLongClicked = MutableLiveData<Long?>()
    val sessionLongClicked: LiveData<Long?>
        get() = _sessionLongClicked

    private val _deleteSessionsButtonClicked = MutableLiveData<Boolean>()
    val deleteSessionsButtonClicked: LiveData<Boolean>
        get() = _deleteSessionsButtonClicked

    private val _deleteSessionsResult = MutableLiveData<DeleteSessionsResult>()
    val deleteSessionsResult: LiveData<DeleteSessionsResult>
        get() = _deleteSessionsResult

    private val _importSessionButtonClicked = MutableLiveData<Boolean>()
    val importSessionButtonClicked: LiveData<Boolean>
        get() = _importSessionButtonClicked
    

    companion object
    {
        private fun calcStartDateTime(solves: List<Solve>): DateTime? = solves.minWithOrNull(Solve::compareByDate)?.dateTime
        private fun calcEndDateTime(solves: List<Solve>): DateTime? = solves.maxWithOrNull(Solve::compareByDate)?.dateTime
    }


    fun getMutableDeleteSessionsResult(): MutableLiveData<DeleteSessionsResult> {
        return _deleteSessionsResult
    }

    fun setup() {
        updateMaxIndex()
        createSessions()
    }

    private fun updateMaxIndex() {
        mainScope.launch {
            _maxIndex.value = repository.getMaxSolveIndex() ?: 0
        }
    }

    private fun createSessions() {
        mainScope.launch {
            _sessions.value = repository.getAllSessions()
        }
    }

    private fun refreshSessions(navController: NavController) {
        val action = ViewSessionsFragmentDirections.actionViewSessionsFragmentToRefreshSessionsFragment()

        navController.navigate(action)
    }


    fun onSessionClicked(id: Long) {
        _sessionClicked.value = id
    }

    fun onOpenSessionDetailCompleted() {
        _sessionClicked.value = null
    }

    fun onSelectSessionCompleted() {
        _sessionClicked.value = null
    }

    fun openSessionDetail(navController: NavController, id: Long) {
        val action = ViewSessionsFragmentDirections.actionViewSessionsFragmentToDetailSessionFragment(id)

        navController.navigate(action)
    }

    fun selectSession(id: Long): Boolean {
        _selectedSessionsIds.value?.apply {
            if(contains(id)) {
                remove(id)

                if(isEmpty()) {
                    _sessionClickMode.value = SessionClickMode.DETAIL

                    return true
                }
            } else {
                add(id)
            }
        }

        return false
    }


    fun onSessionLongClicked(id: Long): Boolean {
        _sessionLongClicked.value = id

        return true
    }

    fun onOpenDeleteSessionsModeCompleted() {
        _sessionLongClicked.value = null
    }

    fun openDeleteSessionsMode(id: Long) {
        _sessionClickMode.value = SessionClickMode.DELETE
        _sessionClicked.value = id
    }


    fun onDeleteSessionsButtonClicked() {
        _deleteSessionsButtonClicked.value = true
    }

    fun onOpenDeleteSessionsDialogCompleted() {
        _deleteSessionsButtonClicked.value = false
    }


    fun onDeleteSessionsCompleted() {
        _deleteSessionsResult.value = DeleteSessionsResult.NULL
    }

    fun deleteSessions(navController: NavController) {
        mainScope.launch {
            _selectedSessionsIds.value?.forEach { id ->
                repository.clearSession(id)
            }

            refreshSessions(navController)
        }
    }


    fun onCancelDeleteSessionsCompleted() {
        _deleteSessionsResult.value = DeleteSessionsResult.NULL
    }

    fun cancelDeleteSessions() {
        _selectedSessionsIds.value?.clear()
        _sessionClickMode.value = SessionClickMode.DETAIL
    }


    fun onImportSessionButtonClicked() {
        _importSessionButtonClicked.value = true
    }

    fun onImportSessionCompleted() {
        _importSessionButtonClicked.value = false
    }

    fun importSession(resultLauncher: ActivityResultLauncher<Intent>) {
        val intent = Intent(Intent.ACTION_OPEN_DOCUMENT).apply {
            addCategory(Intent.CATEGORY_OPENABLE)
            type = "text/*"
        }

        resultLauncher.launch(intent)
    }


    fun loadSession(data: Intent?, navController: NavController) {
        val uri = data?.data

        // convert the file content to solves through its uri
        try {
            val firstSolveIndex = _maxIndex.value?.plus(1) ?: throw IndexOutOfBoundsException("Invalid database index.")
            val solves = textToSolves(readTextFromUri(uri!!, getApplication<Application?>().applicationContext), firstSolveIndex)

            mainScope.launch {
                saveSession(solves, navController)
            }
        } catch(numberFormatException: NumberFormatException) {
            Toast.makeText(getApplication<Application?>().applicationContext, "Import session failed, unexpected file formatting.", Toast.LENGTH_LONG).show()
        } catch(indexOutOfBoundException: IndexOutOfBoundsException) {
            Toast.makeText(getApplication<Application?>().applicationContext, "Import session failed, database integrity compromised.", Toast.LENGTH_LONG).show()
        }
    }

    private suspend fun saveSession(solves: List<Solve>, navController: NavController) {
        val size = solves.size
        val startDateTime = calcStartDateTime(solves).toString()
        val endDateTime = calcEndDateTime(solves).toString()
        val session = SessionEntity(0, "SAMPLE_NAME", startDateTime, endDateTime, solves.first().index, solves.last().index, size)

        // add the session and its solves to the repository
        solves.forEach { solve ->
            repository.insertSolve(solve.toSolveEntity())
        }

        repository.insertSession(session)

        refreshSessions(navController)
    }


    override fun onCleared() {
        super.onCleared()

        job.cancel()
    }
}
