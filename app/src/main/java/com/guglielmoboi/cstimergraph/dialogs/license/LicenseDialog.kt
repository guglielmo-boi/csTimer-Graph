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
import com.guglielmoboi.cstimergraph.databinding.DialogLicenseBinding

class LicenseDialog : DialogFragment()
{
    /* PROPERTIES */

    // ViewModel
    private lateinit var viewModel: LicenseViewModel
    private lateinit var viewModelFactory: LicenseViewModelFactory

    // Binding Object
    private lateinit var binding: DialogLicenseBinding


    /* COMPANION OBJECT */

    companion object
    {
        const val TAG = "LicenseDialog"

        private const val VIEW_LICENSE_REQUEST_CODE = 21
    }


    /* LIFECYCLE METHODS */

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // ViewModel
        viewModelFactory = LicenseViewModelFactory(requireContext())
        viewModel = ViewModelProvider(this, viewModelFactory).get(LicenseViewModel::class.java)

        // Binding Object
        binding = DataBindingUtil.inflate(inflater, R.layout.dialog_license, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        // Dialog Window
        dialog?.window?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(requireContext(), R.color.transparent)))

        // Observers
        viewModel.licenseTextClicked.observe(viewLifecycleOwner, {
            if(it) {
                viewModel.viewLicense(this, VIEW_LICENSE_REQUEST_CODE)

                viewModel.onViewLicenseComplete()
            }
        })

        return binding.root
    }

    /* HELPER METHODS */

    // Activity Result Method
    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        if(resultCode == Activity.RESULT_OK) {
            when(requestCode) {
                VIEW_LICENSE_REQUEST_CODE -> startActivity(intent)

                else -> throw IllegalArgumentException("Unknown License Dialog Activity Result requestCode!")
            }
        }
    }
}