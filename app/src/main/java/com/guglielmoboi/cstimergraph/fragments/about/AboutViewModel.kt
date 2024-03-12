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

package com.guglielmoboi.cstimergraph.fragments.about

import android.app.Application
import android.content.Intent
import android.net.Uri
import androidx.activity.result.ActivityResultLauncher
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.guglielmoboi.cstimergraph.R

class AboutViewModel(application: Application) : AndroidViewModel(application)
{
    private val _rateAppButtonClicked = MutableLiveData<Boolean>()
    val rateAppButtonClicked: LiveData<Boolean>
        get() = _rateAppButtonClicked

    private val _contactUsButtonClicked = MutableLiveData<Boolean>()
    val contactUsButtonClicked: LiveData<Boolean>
        get() = _contactUsButtonClicked

    private val _feedbackButtonClicked = MutableLiveData<Boolean>()
    val feedbackButtonClicked: LiveData<Boolean>
        get() = _feedbackButtonClicked

    private val _contributorsButtonClicked = MutableLiveData<Boolean>()
    val contributorsButtonClicked: LiveData<Boolean>
        get() = _contributorsButtonClicked

    private val _sourceCodeButtonClicked = MutableLiveData<Boolean>()
    val sourceCodeButtonClicked: LiveData<Boolean>
        get() = _sourceCodeButtonClicked

    private val _licenseButtonClicked = MutableLiveData<Boolean>()
    val licenseButtonClicked: LiveData<Boolean>
        get() = _licenseButtonClicked


    fun onRateAppButtonClicked() {
        _rateAppButtonClicked.value = true
    }

    fun onRateAppCompleted() {
        _rateAppButtonClicked.value = false
    }

    fun rateApp(resultLauncher: ActivityResultLauncher<Intent>) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(getApplication<Application>().applicationContext.getString(R.string.rate_app_uri))
        }

        resultLauncher.launch(intent)
    }


    fun onContactUsButtonClicked() {
        _contactUsButtonClicked.value = true
    }

    fun onContactUsCompleted() {
        _contactUsButtonClicked.value = false
    }

    fun contactUs(resultLauncher: ActivityResultLauncher<Intent>) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:${getApplication<Application>().applicationContext.getString(R.string.contact_us_email_address)}")
            putExtra(Intent.EXTRA_SUBJECT, getApplication<Application>().applicationContext.getString(R.string.contact_us_subject))
        }

        resultLauncher.launch(intent)
    }


    fun onFeedbackButtonClicked() {
        _feedbackButtonClicked.value = true
    }

    fun onFeedbackCompleted() {
        _feedbackButtonClicked.value = false
    }

    fun feedback(resultLauncher: ActivityResultLauncher<Intent>) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(getApplication<Application>().applicationContext.getString(R.string.feedback_google_form_uri))
        }

        resultLauncher.launch(intent)
    }


    fun onContributorsButtonClicked() {
        _contributorsButtonClicked.value = true
    }

    fun onViewContributorsCompleted() {
        _contributorsButtonClicked.value = false
    }


    fun onSourceCodeButtonClicked() {
        _sourceCodeButtonClicked.value = true
    }

    fun onViewSourceCodeCompleted() {
        _sourceCodeButtonClicked.value = false
    }

    fun viewSourceCode(resultLauncher: ActivityResultLauncher<Intent>) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(getApplication<Application>().applicationContext.getString(R.string.source_code_github_uri))
        }

        resultLauncher.launch(intent)
    }


    fun onLicenseButtonClicked() {
        _licenseButtonClicked.value = true
    }

    fun onViewLicenseCompleted() {
        _licenseButtonClicked.value = false
    }
}