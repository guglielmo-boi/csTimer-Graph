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

package com.guglielmoboi.cstimergraph.dialogs.deletesessions

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.guglielmoboi.cstimergraph.util.DeleteSessionsResult

class DeleteSessionsViewModel(application: Application, private val result: MutableLiveData<DeleteSessionsResult>) : AndroidViewModel(application)
{
    private val _deleteButtonClicked = MutableLiveData<Boolean>()
    val deleteButtonClicked: LiveData<Boolean>
        get() = _deleteButtonClicked

    private val _cancelButtonClicked = MutableLiveData<Boolean>()
    val cancelButtonClicked: LiveData<Boolean>
        get() = _cancelButtonClicked


    fun onDeleteButtonClicked() {
        _deleteButtonClicked.value = true
    }

    fun onDeleteSessionsCompleted() {
        _deleteButtonClicked.value = false
    }

    fun deleteSessions() {
        result.value = DeleteSessionsResult.DELETE
    }


    fun onCancelButtonClicked() {
        _cancelButtonClicked.value = true
    }

    fun onCancelCompleted() {
        _cancelButtonClicked.value = false
    }

    fun cancelDeleteSessions() {
        result.value = DeleteSessionsResult.CANCEL
    }
}