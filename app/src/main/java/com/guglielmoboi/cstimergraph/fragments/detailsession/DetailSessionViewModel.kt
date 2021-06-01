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

package com.guglielmoboi.cstimergraph.fragments.detailsession

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.guglielmoboi.cstimergraph.database.repository.Repository
import com.guglielmoboi.cstimergraph.solvedata.session.Session
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class DetailSessionViewModel(private val repository: Repository, private val sessionId: Long, application: Application) : AndroidViewModel(application)
{
    /* PROPERTIES */

    // Coroutines
    private var viewModelJob = Job()
    private val mainScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    // Session
    private var _session = MutableLiveData<Session>()
    val session: LiveData<Session>
        get() = _session


    /* SESSION INITIALIZATION METHOD */

    fun createSession() {
        mainScope.launch {
            _session.value = repository.getSessionWithId(sessionId)
        }
    }


    /* CHART DRAW METHOD */

    fun drawChart(chartView: AAChartView) {
        if(session.value != null) {
            chartView.aa_drawChartWithChartModel(session.value!!.chart.chartModel)
        }
    }
}