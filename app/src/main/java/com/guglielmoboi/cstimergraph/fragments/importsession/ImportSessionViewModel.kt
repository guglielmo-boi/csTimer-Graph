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

package com.guglielmoboi.cstimergraph.fragments.importsession

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ImportSessionViewModel : ViewModel()
{
    /* PROPERTIES */

    // ImportButton
    private val _importButtonClicked = MutableLiveData<Boolean>()
    val importButtonClicked: LiveData<Boolean>
        get() = _importButtonClicked


    /* IMPORT BUTTON METHODS */

    // Import button control
    fun onImportButtonClicked() {
        _importButtonClicked.value = true
    }

    fun onNavigateToViewSessionsComplete() {
        _importButtonClicked.value = false
    }
}