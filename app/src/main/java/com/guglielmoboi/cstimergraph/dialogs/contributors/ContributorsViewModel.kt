//    This file is part of csTimer Graph.
//    Copyright © 2021-2023 Guglielmo Boi.

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

package com.guglielmoboi.cstimergraph.dialogs.contributors

import android.app.Application
import android.content.Intent
import android.net.Uri
import androidx.activity.result.ActivityResultLauncher
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.guglielmoboi.cstimergraph.R

class ContributorsViewModel(application: Application) : AndroidViewModel(application)
{
    private val _emailDeveloperButtonClicked = MutableLiveData<Boolean>()
    val emailDeveloperButtonClicked: LiveData<Boolean>
            get() = _emailDeveloperButtonClicked

    private val _instagramDeveloperButtonClicked = MutableLiveData<Boolean>()
    val instagramDeveloperButtonClicked: LiveData<Boolean>
        get() = _instagramDeveloperButtonClicked

    private val _githubDeveloperButtonClicked = MutableLiveData<Boolean>()
    val githubDeveloperButtonClicked: LiveData<Boolean>
        get() = _githubDeveloperButtonClicked

    private val _stackoverflowDeveloperButtonClicked = MutableLiveData<Boolean>()
    val stackoverflowDeveloperButtonClicked: LiveData<Boolean>
        get() = _stackoverflowDeveloperButtonClicked

    private val _emailDesignerButtonClicked = MutableLiveData<Boolean>()
    val emailDesignerButtonClicked: LiveData<Boolean>
        get() = _emailDesignerButtonClicked

    private val _instagramDesignerButtonClicked = MutableLiveData<Boolean>()
    val instagramDesignerButtonClicked: LiveData<Boolean>
        get() = _instagramDesignerButtonClicked


    fun onEmailDeveloperButtonClicked() {
        _emailDeveloperButtonClicked.value = true
    }

    fun onEmailDeveloperCompleted() {
        _emailDeveloperButtonClicked.value = false
    }

    fun emailDeveloper(resultLauncher: ActivityResultLauncher<Intent>) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:${getApplication<Application?>().applicationContext.getString(R.string.developer_email_address)}")
            putExtra(Intent.EXTRA_SUBJECT, "csTimer Graph")
        }

        resultLauncher.launch(intent)
    }


    fun onInstagramDeveloperButtonClicked() {
        _instagramDeveloperButtonClicked.value = true
    }

    fun onViewDeveloperInstagramCompleted() {
        _instagramDeveloperButtonClicked.value = false
    }

    fun viewDeveloperInstagram(resultLauncher: ActivityResultLauncher<Intent>) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(getApplication<Application?>().applicationContext.getString(R.string.developer_instagram_uri))
        }

        resultLauncher.launch(intent)
    }


    fun onGithubDeveloperButtonClicked() {
        _githubDeveloperButtonClicked.value = true
    }

    fun onViewDeveloperGithubCompleted() {
        _githubDeveloperButtonClicked.value = false
    }

    fun viewDeveloperGithub(resultLauncher: ActivityResultLauncher<Intent>) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(getApplication<Application?>().applicationContext.getString(R.string.developer_github_uri))
        }

        resultLauncher.launch(intent)
    }


    fun onStackoverflowDeveloperButtonClicked() {
        _stackoverflowDeveloperButtonClicked.value = true
    }

    fun onViewDeveloperStackoverflowCompleted() {
        _stackoverflowDeveloperButtonClicked.value = false
    }

    fun viewDeveloperStackoverflow(resultLauncher: ActivityResultLauncher<Intent>) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(getApplication<Application?>().applicationContext.getString(R.string.developer_stackoverflow_uri))
        }

        resultLauncher.launch(intent)
    }


    fun onEmailDesignerButtonClicked() {
        _emailDesignerButtonClicked.value = true
    }

    fun onEmailDesignerCompleted() {
        _emailDesignerButtonClicked.value = false
    }

    fun emailDesigner(resultLauncher: ActivityResultLauncher<Intent>) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:${getApplication<Application?>().applicationContext.getString(R.string.designer_email_address)}")
            putExtra(Intent.EXTRA_SUBJECT, "csTimer Graph")
        }

        resultLauncher.launch(intent)
    }


    fun onInstagramDesignerButtonClicked() {
        _instagramDesignerButtonClicked.value = true
    }

    fun onViewDesignerInstagramCompleted() {
        _instagramDesignerButtonClicked.value = false
    }

    fun viewDesignerInstagram(resultLauncher: ActivityResultLauncher<Intent>) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(getApplication<Application?>().applicationContext.getString(R.string.designer_instagram_uri))
        }

        resultLauncher.launch(intent)
    }
}