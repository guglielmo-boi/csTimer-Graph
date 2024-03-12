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

package com.guglielmoboi.cstimergraph.dialogs.license

import android.app.Application
import android.content.Intent
import android.net.Uri
import androidx.activity.result.ActivityResultLauncher
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.guglielmoboi.cstimergraph.R

class LicenseViewModel(application: Application) : AndroidViewModel(application)
{
    private val _licenseTextClicked = MutableLiveData<Boolean>()
    val licenseTextClicked: LiveData<Boolean>
        get() = _licenseTextClicked


    fun onLicenseTextClicked() {
        _licenseTextClicked.value = true
    }
    fun onViewLicenseCompleted() {
        _licenseTextClicked.value = false
    }

    fun viewLicense(resultLauncher: ActivityResultLauncher<Intent>) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(getApplication<Application>().applicationContext.getString(R.string.license_gnu_gpl_uri))
        }

        resultLauncher.launch(intent)
    }
}