//    This file is part of csTimer Graph.

//    Copyright © 2021-2024 Guglielmo Boi

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
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.databinding.FragmentAboutBinding
import com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsDialog
import com.guglielmoboi.cstimergraph.dialogs.license.LicenseDialog

class AboutFragment : Fragment()
{
    private lateinit var application: Application

    private lateinit var viewModel: AboutViewModel
    private lateinit var viewModelFactory: AboutViewModelFactory

    private lateinit var binding: FragmentAboutBinding

    private lateinit var contributorsDialog: ContributorsDialog
    private lateinit var licenseDialog: LicenseDialog

    private lateinit var rateAppResultLauncher: ActivityResultLauncher<Intent>
    private lateinit var contactUsResultLauncher: ActivityResultLauncher<Intent>
    private lateinit var feedbackResultLauncher: ActivityResultLauncher<Intent>
    private lateinit var viewContributorsResultLauncher: ActivityResultLauncher<Intent>
    private lateinit var viewSourceCodeResultLauncher: ActivityResultLauncher<Intent>
    private lateinit var viewLicenseResultLauncher: ActivityResultLauncher<Intent>


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        application = requireNotNull(this.activity).application

        viewModelFactory = AboutViewModelFactory(application)
        viewModel = ViewModelProvider(this, viewModelFactory)[AboutViewModel::class.java]

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        contributorsDialog = ContributorsDialog()
        licenseDialog = LicenseDialog()

        rateAppResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { }
        contactUsResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { }
        feedbackResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { }
        viewContributorsResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { }
        viewSourceCodeResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { }
        viewLicenseResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { }

        viewModel.rateAppButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                viewModel.rateApp(rateAppResultLauncher)
                viewModel.onRateAppCompleted()
            }
        }

        viewModel.contactUsButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                viewModel.contactUs(contactUsResultLauncher)
                viewModel.onContactUsCompleted()
            }
        }

        viewModel.feedbackButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                viewModel.feedback(feedbackResultLauncher)
                viewModel.onFeedbackCompleted()
            }
        }

        viewModel.contributorsButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                contributorsDialog.show(childFragmentManager, ContributorsDialog.TAG)
                viewModel.onViewContributorsCompleted()
            }
        }

        viewModel.sourceCodeButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                viewModel.viewSourceCode(viewSourceCodeResultLauncher)
                viewModel.onViewSourceCodeCompleted()
            }
        }

        viewModel.licenseButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                licenseDialog.show(childFragmentManager, LicenseDialog.TAG)
                viewModel.onViewLicenseCompleted()
            }
        }

        return binding.root
    }
}