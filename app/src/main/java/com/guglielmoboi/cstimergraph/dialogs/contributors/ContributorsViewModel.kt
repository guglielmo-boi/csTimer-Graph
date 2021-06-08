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

package com.guglielmoboi.cstimergraph.dialogs.contributors

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guglielmoboi.cstimergraph.R

class ContributorsViewModel(private val context: Context) : ViewModel()
{
    /* PROPERTIES */

    // EmailDeveloperButton
    private val _emailDeveloperButtonClicked = MutableLiveData<Boolean>()
    val emailDeveloperButtonClicked: LiveData<Boolean>
            get() = _emailDeveloperButtonClicked

    // InstagramDeveloperButton
    private val _instagramDeveloperButtonClicked = MutableLiveData<Boolean>()
    val instagramDeveloperButtonClicked: LiveData<Boolean>
        get() = _instagramDeveloperButtonClicked

    // GithubDeveloperButton
    private val _githubDeveloperButtonClicked = MutableLiveData<Boolean>()
    val githubDeveloperButtonClicked: LiveData<Boolean>
        get() = _githubDeveloperButtonClicked

    // StackoverflowDeveloperButton
    private val _stackoverflowDeveloperButtonClicked = MutableLiveData<Boolean>()
    val stackoverflowDeveloperButtonClicked: LiveData<Boolean>
        get() = _stackoverflowDeveloperButtonClicked

    // EmailDesignerButton
    private val _emailDesignerButtonClicked = MutableLiveData<Boolean>()
    val emailDesignerButtonClicked: LiveData<Boolean>
        get() = _emailDesignerButtonClicked

    // InstagramDesignerButton
    private val _instagramDesignerButtonClicked = MutableLiveData<Boolean>()
    val instagramDesignerButtonClicked: LiveData<Boolean>
        get() = _instagramDesignerButtonClicked


    /* EMAIL DEVELOPER BUTTON METHODS */

    // EmailDeveloperButton control
    fun onEmailDeveloperButtonClicked() {
        _emailDeveloperButtonClicked.value = true
    }

    fun onEmailDeveloperComplete() {
        _emailDeveloperButtonClicked.value = false
    }

    // Email Developer
    fun emailDeveloper(dialogFragment: DialogFragment, requestCode: Int) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:${context.getString(R.string.developer_email_address)}")
            putExtra(Intent.EXTRA_SUBJECT, "csTimer Graph")
        }

        dialogFragment.startActivityForResult(intent, requestCode)
    }


    /* INSTAGRAM DEVELOPER BUTTON METHODS */

    // InstagramDeveloperButton control
    fun onInstagramDeveloperButtonClicked() {
        _instagramDeveloperButtonClicked.value = true
    }

    fun onViewInstagramDeveloperComplete() {
        _instagramDeveloperButtonClicked.value = false
    }

    // View Instagram Developer
    fun viewInstagramDeveloper(fragment: ContributorsDialog, requestCode: Int) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(context.getString(R.string.developer_instagram_uri))
        }

        fragment.startActivityForResult(intent, requestCode)
    }


    /* GITHUB DEVELOPER BUTTON METHODS */

    // GithubDeveloperButton control
    fun onGithubDeveloperButtonClicked() {
        _githubDeveloperButtonClicked.value = true
    }

    fun onViewGithubDeveloperComplete() {
        _githubDeveloperButtonClicked.value = false
    }

    // View Github Developer
    fun viewGithubDeveloper(fragment: ContributorsDialog, requestCode: Int) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(context.getString(R.string.developer_github_uri))
        }

        fragment.startActivityForResult(intent, requestCode)
    }


    /* STACKOVERFLOW DEVELOPER BUTTON METHODS */

    // StackoverflowDeveloperButton control
    fun onStackoverflowDeveloperButtonClicked() {
        _stackoverflowDeveloperButtonClicked.value = true
    }

    fun onViewStackoverflowDeveloperComplete() {
        _stackoverflowDeveloperButtonClicked.value = false
    }

    // View Stackoverflow Developer
    fun viewStackoverflowDeveloper(fragment: ContributorsDialog, requestCode: Int) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(context.getString(R.string.developer_stackoverflow_uri))
        }

        fragment.startActivityForResult(intent, requestCode)
    }


    /* EMAIL DESIGNER BUTTON METHODS */

    // EmailDesignerButton control
    fun onEmailDesignerButtonClicked() {
        _emailDesignerButtonClicked.value = true
    }

    fun onEmailDesignerComplete() {
        _emailDesignerButtonClicked.value = false
    }

    // Email Designer
    fun emailDesigner(dialogFragment: DialogFragment, requestCode: Int) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:${context.getString(R.string.designer_email_address)}")
            putExtra(Intent.EXTRA_SUBJECT, "csTimer Graph")
        }

        dialogFragment.startActivityForResult(intent, requestCode)
    }


    /* VIEW INSTAGRAM DESIGNER METHODS */

    // InstagramDesignerButton control
    fun onInstagramDesignerButtonClicked() {
        _instagramDesignerButtonClicked.value = true
    }

    fun onViewInstagramDesignerComplete() {
        _instagramDesignerButtonClicked.value = false
    }

    // View Instagram Designer
    fun viewInstagramDesigner(fragment: ContributorsDialog, requestCode: Int) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(context.getString(R.string.designer_instagram_uri))
        }

        fragment.startActivityForResult(intent, requestCode)
    }
}