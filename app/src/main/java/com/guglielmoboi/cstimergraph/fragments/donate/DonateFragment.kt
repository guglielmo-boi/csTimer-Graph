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

package com.guglielmoboi.cstimergraph.fragments.donate

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
import com.guglielmoboi.cstimergraph.databinding.FragmentDonateBinding

class DonateFragment : Fragment() {
    /* PROPERTIES */

    // ViewModel
    private lateinit var viewModel: DonateViewModel
    private lateinit var viewModelFactory: DonateViewModelFactory

    // Binding Object
    private lateinit var binding: FragmentDonateBinding


    /* COMPANION OBJECT */

    companion object
    {
        private const val VIEW_DONATE_REQUEST_CODE = 31
    }


    /* LIFECYCLE METHODS */

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // ViewModel
        viewModelFactory = DonateViewModelFactory(requireContext())
        viewModel = ViewModelProvider(this, viewModelFactory).get(DonateViewModel::class.java)

        // Binding Object
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_donate, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        // Observers
        viewModel.donateButtonClicked.observe(viewLifecycleOwner, {
            if(it) {
                viewModel.donate(this, VIEW_DONATE_REQUEST_CODE)

                viewModel.onDonateComplete()
            }
        })

        return binding.root
    }


    /* HELPER METHODS */

    // Activity Result Method
    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        if(resultCode == Activity.RESULT_OK) {
            when(requestCode) {
                VIEW_DONATE_REQUEST_CODE -> startActivity(intent)

                else -> throw IllegalArgumentException("Unknown About Fragment Activity Result requestCode!")
            }
        }
    }
}