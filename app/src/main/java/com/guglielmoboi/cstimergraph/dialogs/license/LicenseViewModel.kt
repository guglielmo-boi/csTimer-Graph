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

package com.guglielmoboi.cstimergraph.dialogs.license

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guglielmoboi.cstimergraph.R

class LicenseViewModel(private val context: Context) : ViewModel()
{
    /* PROPERTIES */

    // LicenseText
    private val _licenseTextClicked = MutableLiveData<Boolean>()
    val licenseTextClicked: LiveData<Boolean>
        get() = _licenseTextClicked


    /* LICENSE TEXT METHODS */

    // LicenseText control
    fun onLicenseTextClicked() {
        _licenseTextClicked.value = true
    }
    fun onViewLicenseComplete() {
        _licenseTextClicked.value = false
    }

    // View License
    fun viewLicense(fragment: LicenseDialog, requestCode: Int) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(context.getString(R.string.license_gnu_gpl_uri))
        }

        fragment.startActivityForResult(intent, requestCode)
    }
}