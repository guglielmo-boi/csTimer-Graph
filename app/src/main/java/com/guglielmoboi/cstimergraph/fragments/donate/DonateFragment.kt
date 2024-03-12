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

package com.guglielmoboi.cstimergraph.fragments.donate

import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.databinding.FragmentDonateBinding

class DonateFragment : Fragment()
{
    private lateinit var application: Application

    private lateinit var viewModel: DonateViewModel
    private lateinit var viewModelFactory: DonateViewModelFactory

    private lateinit var binding: FragmentDonateBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        application = requireNotNull(this.activity).application

        viewModelFactory = DonateViewModelFactory(application)
        viewModel = ViewModelProvider(this, viewModelFactory)[DonateViewModel::class.java]

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_donate, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.donateButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                viewModel.donate()
                viewModel.onDonateCompleted()
            }
        }

        return binding.root
    }
}