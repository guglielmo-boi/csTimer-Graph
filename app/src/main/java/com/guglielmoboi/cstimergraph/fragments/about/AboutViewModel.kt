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

package com.guglielmoboi.cstimergraph.fragments.about

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guglielmoboi.cstimergraph.R

class AboutViewModel(private val context: Context) : ViewModel()
{
    /* PROPERTIES */

    // RateAppButton
    private val _rateAppButtonClicked = MutableLiveData<Boolean>()
    val rateAppButtonClicked: LiveData<Boolean>
        get() = _rateAppButtonClicked

    // ContactUsButton
    private val _contactUsButtonClicked = MutableLiveData<Boolean>()
    val contactusButtonClicked: LiveData<Boolean>
        get() = _contactUsButtonClicked

    // FeedbackButton
    private val _feedbackButtonClicked = MutableLiveData<Boolean>()
    val feedbackButtonClicked: LiveData<Boolean>
        get() = _feedbackButtonClicked

    // ContributorsButton
    private val _contributorsButtonClicked = MutableLiveData<Boolean>()
    val contributorsButtonClicked: LiveData<Boolean>
        get() = _contributorsButtonClicked

    // SourceCodeButton
    private val _sourceCodeButtonClicked = MutableLiveData<Boolean>()
    val sourceCodeButtonClicked: LiveData<Boolean>
        get() = _sourceCodeButtonClicked

    // LicenseButton
    private val _licenseButtonClicked = MutableLiveData<Boolean>()
    val licenseButtonClicked: LiveData<Boolean>
        get() = _licenseButtonClicked


    /* RATE APP BUTTON METHODS */

    // RateAppButton control
    fun onRateAppButtonClicked() {
        _rateAppButtonClicked.value = true
    }

    fun onRateAppComplete() {
        _rateAppButtonClicked.value = false
    }

    // Rate App on the Play Store
    fun rateApp(fragment: AboutFragment, requestCode: Int) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(context.getString(R.string.rate_app_uri))
        }

        fragment.startActivityForResult(intent, requestCode)
    }


    /* CONTACT US BUTTON METHODS */

    // ContactUsButton control
    fun onContactUsButtonClicked() {
        _contactUsButtonClicked.value = true
    }

    fun onContactUsComplete() {
        _contactUsButtonClicked.value = false
    }

    // Contact Us
    fun contactUs(fragment: AboutFragment, requestCode: Int) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:${context.getString(R.string.contact_us_email_address)}")
            putExtra(Intent.EXTRA_SUBJECT, context.getString(R.string.contact_us_subject))
        }

        fragment.startActivityForResult(intent, requestCode)
    }


    /* FEEDBACK BUTTON METHODS */

    // FeedbackButton control
    fun onFeedbackButtonClicked() {
        _feedbackButtonClicked.value = true
    }

    fun onFeedbackComplete() {
        _feedbackButtonClicked.value = false
    }

    // Feedback
    fun feedback(fragment: AboutFragment, requestCode: Int) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(context.getString(R.string.feedback_google_form_uri))
        }

        fragment.startActivityForResult(intent, requestCode)
    }


    /* CONTRIBUTORS BUTTON METHODS */

    // ContributorsButton control
    fun onContributorsButtonClicked() {
        _contributorsButtonClicked.value = true
    }

    fun onLookContributorsComplete() {
        _contributorsButtonClicked.value = false
    }


    /* SOURCE CODE BUTTON METHODS */

    // SourceCodeButton control
    fun onSourceCodeButtonClicked() {
        _sourceCodeButtonClicked.value = true
    }

    fun onViewSourceCodeComplete() {
        _sourceCodeButtonClicked.value = false
    }

    // View Source Code
    fun viewSourceCode(fragment: AboutFragment, requestCode: Int) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(context.getString(R.string.source_code_github_uri))
        }

        fragment.startActivityForResult(intent, requestCode)
    }


    /* LICENSE BUTTON METHODS */

    // LicenseButton control
    fun onLicenseButtonClicked() {
        _licenseButtonClicked.value = true
    }

    fun onLookLicenseComplete() {
        _licenseButtonClicked.value = false
    }
}