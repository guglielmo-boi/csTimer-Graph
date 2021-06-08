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

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.databinding.FragmentAboutBinding
import com.guglielmoboi.cstimergraph.dialogs.contributors.ContributorsDialog
import com.guglielmoboi.cstimergraph.dialogs.license.LicenseDialog

class AboutFragment : Fragment() {
    /* PROPERTIES */

    // ViewModel
    private lateinit var viewModel: AboutViewModel
    private lateinit var viewModelFactory: AboutViewModelFactory

    // Binding Object
    private lateinit var binding: FragmentAboutBinding

    // ContributorsDialog
    private lateinit var contributorsDialog: ContributorsDialog

    // LicenseDialog
    private lateinit var licenseDialog: LicenseDialog


    /* COMPANION OBJECT */

    companion object
    {
        private const val VIEW_APP_REQUEST_CODE = 1
        private const val CONTACT_US_REQUEST_CODE = 2
        private const val FEEDBACK_REQUEST_CODE = 3
        private const val VIEW_SOURCE_CODE_REQUEST_CODE = 4
    }


    /* LIFECYCLE METHODS */

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // ViewModel
        viewModelFactory = AboutViewModelFactory(requireContext())
        viewModel = ViewModelProvider(this, viewModelFactory).get(AboutViewModel::class.java)

        // Binding Object
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        // Contributors Dialog
        contributorsDialog = ContributorsDialog()

        // License Dialog
        licenseDialog = LicenseDialog()

        // Observers
        viewModel.rateAppButtonClicked.observe(viewLifecycleOwner, {
            if(it) {
                viewModel.rateApp(this, VIEW_APP_REQUEST_CODE)

                viewModel.onRateAppComplete()
            }
        })

        viewModel.contactusButtonClicked.observe(viewLifecycleOwner, {
            if(it) {
                viewModel.contactUs(this, CONTACT_US_REQUEST_CODE)

                viewModel.onContactUsComplete()
            }
        })

        viewModel.feedbackButtonClicked.observe(viewLifecycleOwner, {
            if(it) {
                viewModel.feedback(this, FEEDBACK_REQUEST_CODE)

                viewModel.onFeedbackComplete()
            }
        })

        viewModel.contributorsButtonClicked.observe(viewLifecycleOwner, {
            if(it) {
                contributorsDialog.show(childFragmentManager, ContributorsDialog.TAG)

                viewModel.onLookContributorsComplete()
            }
        })

        viewModel.sourceCodeButtonClicked.observe(viewLifecycleOwner, {
            if(it) {
                viewModel.viewSourceCode(this, VIEW_SOURCE_CODE_REQUEST_CODE)

                viewModel.onViewSourceCodeComplete()
            }
        })

        viewModel.licenseButtonClicked.observe(viewLifecycleOwner, {
            if(it) {
                licenseDialog.show(childFragmentManager, LicenseDialog.TAG)

                viewModel.onLookLicenseComplete()
            }
        })

        return binding.root
    }


    /* HELPER METHODS */

    // Activity Result Method
    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        if(resultCode == Activity.RESULT_OK) {
            when(requestCode) {
                VIEW_APP_REQUEST_CODE -> startActivity(intent)
                CONTACT_US_REQUEST_CODE -> startActivity(intent)
                FEEDBACK_REQUEST_CODE -> startActivity(intent)
                VIEW_SOURCE_CODE_REQUEST_CODE -> startActivity(intent)

                else -> throw IllegalArgumentException("Unknown About Fragment Activity Result requestCode!")
            }
        }
    }
}