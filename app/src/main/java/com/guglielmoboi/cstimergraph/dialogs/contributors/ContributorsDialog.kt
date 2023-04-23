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
import android.content.Context
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getColor
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.databinding.DialogContributorsBinding

class ContributorsDialog : DialogFragment()
{
    private lateinit var application: Application

    private lateinit var viewModel: ContributorsViewModel
    private lateinit var viewModelFactory: ContributorsViewModelFactory

    private lateinit var binding: DialogContributorsBinding

    private lateinit var emailDeveloperResultLauncher: ActivityResultLauncher<Intent>
    private lateinit var viewDeveloperInstagramResultLauncher: ActivityResultLauncher<Intent>
    private lateinit var viewDeveloperGithubResultLauncher: ActivityResultLauncher<Intent>
    private lateinit var viewDeveloperStackoverflowResultLauncher: ActivityResultLauncher<Intent>
    private lateinit var emailDesignerResultLauncher: ActivityResultLauncher<Intent>
    private lateinit var viewDesignerInstagramResultLauncher: ActivityResultLauncher<Intent>


    companion object
    {
        const val TAG = "ContributorsDialog"
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        application = requireNotNull(this.activity).application

        viewModelFactory = ContributorsViewModelFactory(application)
        viewModel = ViewModelProvider(this, viewModelFactory)[ContributorsViewModel::class.java]

        binding = DataBindingUtil.inflate(inflater, R.layout.dialog_contributors, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        dialog?.window?.setBackgroundDrawable(ColorDrawable(getColor(requireContext(), R.color.transparent)))

        emailDeveloperResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { }
        viewDeveloperInstagramResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { }
        viewDeveloperGithubResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { }
        viewDeveloperStackoverflowResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { }
        emailDesignerResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { }
        viewDesignerInstagramResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { }

        viewModel.emailDeveloperButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                viewModel.emailDeveloper(emailDeveloperResultLauncher)
                viewModel.onEmailDeveloperCompleted()
            }
        }

        viewModel.instagramDeveloperButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                viewModel.viewDeveloperInstagram(viewDeveloperInstagramResultLauncher)
                viewModel.onViewDeveloperInstagramCompleted()
            }
        }

        viewModel.githubDeveloperButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                viewModel.viewDeveloperGithub(viewDeveloperGithubResultLauncher)
                viewModel.onViewDeveloperGithubCompleted()
            }
        }

        viewModel.stackoverflowDeveloperButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                viewModel.viewDeveloperStackoverflow(viewDeveloperStackoverflowResultLauncher)
                viewModel.onViewDeveloperStackoverflowCompleted()
            }
        }

        viewModel.emailDesignerButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                viewModel.emailDesigner(emailDesignerResultLauncher)
                viewModel.onEmailDesignerCompleted()
            }
        }

        viewModel.instagramDesignerButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                viewModel.viewDesignerInstagram(viewDesignerInstagramResultLauncher)
                viewModel.onViewDesignerInstagramCompleted()
            }
        }

        return binding.root
    }
}