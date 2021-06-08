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

package com.guglielmoboi.cstimergraph.fragments.donate

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.billingclient.api.*
import com.guglielmoboi.cstimergraph.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DonateViewModel(private val context: Context) : ViewModel()
{
    /* PROPERTIES */

    // DonateButton
    private val _donateButtonClicked = MutableLiveData<Boolean>()
    val donateButtonClicked: LiveData<Boolean>
        get() = _donateButtonClicked


    /* DONATE BUTTON METHODS */

    // DonateButton control
    fun onDonateButtonClicked() {
        _donateButtonClicked.value = true
    }

    fun onDonateComplete() {
        _donateButtonClicked.value = false
    }

    // Donate
    fun donate(fragment: DonateFragment, requestCode: Int) {
        Toast.makeText(context, "Donations will be added in the next update!", Toast.LENGTH_LONG).show()
    }
}