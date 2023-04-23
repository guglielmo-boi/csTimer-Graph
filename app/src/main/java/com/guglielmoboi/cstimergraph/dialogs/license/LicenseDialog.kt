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
import com.guglielmoboi.cstimergraph.databinding.DialogLicenseBinding

class LicenseDialog : DialogFragment()
{
    private lateinit var application: Application

    private lateinit var viewModel: LicenseViewModel
    private lateinit var viewModelFactory: LicenseViewModelFactory

    private lateinit var binding: DialogLicenseBinding

    private lateinit var viewLicenseResultLauncher: ActivityResultLauncher<Intent>

    companion object
    {
        const val TAG = "LicenseDialog"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        application = requireNotNull(this.activity).application

        viewModelFactory = LicenseViewModelFactory(application)
        viewModel = ViewModelProvider(this, viewModelFactory)[LicenseViewModel::class.java]

        binding = DataBindingUtil.inflate(inflater, R.layout.dialog_license, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewLicenseResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { }

        dialog?.window?.setBackgroundDrawable(ColorDrawable(getColor(requireContext(), R.color.transparent)))

        viewModel.licenseTextClicked.observe(viewLifecycleOwner) {
            if(it) {
                viewModel.viewLicense(viewLicenseResultLauncher)
                viewModel.onViewLicenseCompleted()
            }
        }

        return binding.root
    }
}