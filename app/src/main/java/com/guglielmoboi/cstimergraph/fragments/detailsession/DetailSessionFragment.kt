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

package com.guglielmoboi.cstimergraph.fragments.detailsession

import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.database.repository.Repository
import com.guglielmoboi.cstimergraph.databinding.FragmentDetailSessionBinding

class DetailSessionFragment : Fragment()
{
    private lateinit var application: Application

    private lateinit var navArgs: DetailSessionFragmentArgs

    private lateinit var viewModel: DetailSessionViewModel
    private lateinit var viewModelFactory: DetailSessionViewModelFactory

    private lateinit var binding: FragmentDetailSessionBinding

    private lateinit var navController: NavController


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        application = requireNotNull(this.activity).application

        navArgs = DetailSessionFragmentArgs.fromBundle(requireArguments())

        viewModelFactory = DetailSessionViewModelFactory(Repository(application), navArgs.sessionId, application)
        viewModel = ViewModelProvider(this, viewModelFactory)[DetailSessionViewModel::class.java]

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail_session, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        navController = this.findNavController()

        viewModel.session.observe(viewLifecycleOwner) {
            binding.session = viewModel.session.value
            viewModel.drawChart(binding.chartView)
        }

        viewModel.createSession()

        return binding.root
    }
}
