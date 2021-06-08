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

package com.guglielmoboi.cstimergraph.fragments.refreshsessions

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
import com.guglielmoboi.cstimergraph.databinding.FragmentRefreshSessionsBinding

class RefreshSessionsFragment  : Fragment()
{
    /* PROPERTIES */

    // ViewModel
    private lateinit var viewModel: RefreshSessionsViewModel
    private lateinit var viewModelFactory: RefreshSessionsViewModelFactory

    // Binding Object
    private lateinit var binding: FragmentRefreshSessionsBinding

    // NavController
    private lateinit var navController: NavController


    /* LIFECYCLE METHODS */

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // ViewModel
        viewModelFactory = RefreshSessionsViewModelFactory()
        viewModel = ViewModelProvider(this, viewModelFactory).get(RefreshSessionsViewModel::class.java)

        // Binding Object
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_refresh_sessions, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        // NavController
        navController = this.findNavController()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Complete Refresh Sessions
        onRefreshSessionsComplete()
    }


    /* HELPER METHODS */

    // Complete Refresh Sessions
    private fun onRefreshSessionsComplete() {
        val action = RefreshSessionsFragmentDirections.actionRefreshSessionsFragmentToViewSessionsFragment()

        navController.navigate(action)
    }
}