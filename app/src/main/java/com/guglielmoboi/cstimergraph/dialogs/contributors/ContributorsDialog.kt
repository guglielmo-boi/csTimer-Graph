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

import android.app.Activity
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.databinding.DialogContributorsBinding

class ContributorsDialog : DialogFragment()
{
    /* PROPERTIES */

    // ViewModel
    private lateinit var viewModel: ContributorsViewModel
    private lateinit var viewModelFactory: ContributorsViewModelFactory

    // Binding Object
    private lateinit var binding: DialogContributorsBinding


    /* COMPANION OBJECT */

    companion object
    {
        const val TAG = "ContributorsDialog"

        private const val EMAIL_DEVELOPER_REQUEST_CODE = 11
        private const val VIEW_INSTAGRAM_DEVELOPER_REQUEST_CODE = 12
        private const val VIEW_GITHUB_DEVELOPER_REQUEST_CODE = 13
        private const val VIEW_STACKOVERFLOW_DEVELOPER_REQUEST_CODE = 14

        private const val EMAIL_DESIGNER_REQUEST_CODE = 15
        private const val VIEW_INSTAGRAM_DESIGNER_REQUEST_CODE = 16
    }


    /* LIFECYCLE METHODS */

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // ViewModel
        viewModelFactory = ContributorsViewModelFactory(requireContext())
        viewModel = ViewModelProvider(this, viewModelFactory).get(ContributorsViewModel::class.java)

        // Binding Object
        binding = DataBindingUtil.inflate(inflater, R.layout.dialog_contributors, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        // Dialog Window
        dialog?.window?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(requireContext(), R.color.transparent)))

        // Observers
        viewModel.emailDeveloperButtonClicked.observe(viewLifecycleOwner, {
            if(it) {
                viewModel.emailDeveloper(this, EMAIL_DEVELOPER_REQUEST_CODE)

                viewModel.onEmailDeveloperComplete()
            }
        })

        viewModel.instagramDeveloperButtonClicked.observe(viewLifecycleOwner, {
            if(it) {
                viewModel.viewInstagramDeveloper(this, VIEW_INSTAGRAM_DEVELOPER_REQUEST_CODE)

                viewModel.onViewInstagramDeveloperComplete()
            }
        })

        viewModel.githubDeveloperButtonClicked.observe(viewLifecycleOwner, {
            if(it) {
                viewModel.viewGithubDeveloper(this, VIEW_GITHUB_DEVELOPER_REQUEST_CODE)

                viewModel.onViewGithubDeveloperComplete()
            }
        })

        viewModel.stackoverflowDeveloperButtonClicked.observe(viewLifecycleOwner, {
            if(it) {
                viewModel.viewStackoverflowDeveloper(this, VIEW_STACKOVERFLOW_DEVELOPER_REQUEST_CODE)

                viewModel.onViewStackoverflowDeveloperComplete()
            }
        })

        viewModel.emailDesignerButtonClicked.observe(viewLifecycleOwner, {
            if(it) {
                viewModel.emailDesigner(this, EMAIL_DESIGNER_REQUEST_CODE)

                viewModel.onEmailDesignerComplete()
            }
        })

        viewModel.instagramDesignerButtonClicked.observe(viewLifecycleOwner, {
            if(it) {
                viewModel.viewInstagramDesigner(this, VIEW_INSTAGRAM_DESIGNER_REQUEST_CODE)

                viewModel.onViewInstagramDesignerComplete()
            }
        })

        return binding.root
    }


    /* HELPER METHODS */

    // Activity Result Method
    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        if(resultCode == Activity.RESULT_OK) {
            when(requestCode) {
                EMAIL_DEVELOPER_REQUEST_CODE -> startActivity(intent)
                VIEW_INSTAGRAM_DEVELOPER_REQUEST_CODE-> startActivity(intent)
                VIEW_GITHUB_DEVELOPER_REQUEST_CODE -> startActivity(intent)
                VIEW_STACKOVERFLOW_DEVELOPER_REQUEST_CODE -> startActivity(intent)
                EMAIL_DESIGNER_REQUEST_CODE -> startActivity(intent)
                VIEW_INSTAGRAM_DESIGNER_REQUEST_CODE-> startActivity(intent)

                else -> throw IllegalArgumentException("Unknown Contributors Dialog Activity Result requestCode!")
            }
        }
    }
}