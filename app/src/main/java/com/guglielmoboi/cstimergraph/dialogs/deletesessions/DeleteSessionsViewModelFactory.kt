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
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.guglielmoboi.cstimergraph.util.DeleteSessionsResult

class DeleteSessionsViewModelFactory(private val application: Application, private val result: MutableLiveData<DeleteSessionsResult>) : ViewModelProvider.Factory
{
    @Suppress("unchecked_cast")
    override fun <T: ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(DeleteSessionsViewModel::class.java)) {
            return DeleteSessionsViewModel(application, result) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}