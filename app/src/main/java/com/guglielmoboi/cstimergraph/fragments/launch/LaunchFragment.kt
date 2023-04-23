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

package com.guglielmoboi.cstimergraph.fragments.launch

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
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
import com.guglielmoboi.cstimergraph.databinding.FragmentLaunchBinding

class LaunchFragment : Fragment()
{
    private lateinit var sharedPreferences: SharedPreferences

    private lateinit var application: Application

    private lateinit var viewModel: LaunchViewModel
    private lateinit var viewModelFactory: LaunchViewModelFactory

    private lateinit var binding: FragmentLaunchBinding

    private lateinit var navController: NavController


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        application = requireNotNull(this.activity).application

        sharedPreferences = requireActivity().getSharedPreferences(getString(R.string.settings_preferences_file_key), Context.MODE_PRIVATE)

        viewModelFactory = LaunchViewModelFactory(sharedPreferences, application)
        viewModel = ViewModelProvider(this, viewModelFactory)[LaunchViewModel::class.java]

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_launch, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        navController = this.findNavController()

        viewModel.setDarkTheme()

        viewModel.navigate(navController)

        return binding.root
    }
}