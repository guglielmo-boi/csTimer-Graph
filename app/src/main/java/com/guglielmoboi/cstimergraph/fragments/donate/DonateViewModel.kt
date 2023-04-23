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

package com.guglielmoboi.cstimergraph.fragments.donate

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DonateViewModel(application: Application) : AndroidViewModel(application)
{
    private val _donateButtonClicked = MutableLiveData<Boolean>()
    val donateButtonClicked: LiveData<Boolean>
        get() = _donateButtonClicked


    fun onDonateButtonClicked() {
        _donateButtonClicked.value = true
    }

    fun onDonateCompleted() {
        _donateButtonClicked.value = false
    }

    fun donate() {
        Toast.makeText(getApplication<Application?>().applicationContext, "Donations are not available yet.", Toast.LENGTH_LONG).show()
    }
}