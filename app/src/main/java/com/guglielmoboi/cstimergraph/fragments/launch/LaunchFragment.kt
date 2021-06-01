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

package com.guglielmoboi.cstimergraph.fragments.launch

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.databinding.FragmentLaunchBinding
import com.guglielmoboi.cstimergraph.util.preferences.HomeScreenPreference

class LaunchFragment : Fragment()
{
    /* PROPERTIES */

    // Shared Preferences
    private lateinit var sharedPreferences: SharedPreferences

    // ViewModel
    private lateinit var viewModel: LaunchViewModel
    private lateinit var viewModelFactory: LaunchViewModelFactory

    // Binding Object
    private lateinit var binding: FragmentLaunchBinding

    // NavController & NavArgs
    private lateinit var navController: NavController


    /* LIFECYCLE METHODS */

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Shared Preferences
        sharedPreferences = requireActivity().getSharedPreferences(getString(R.string.settings_preferences_file_key), Context.MODE_PRIVATE)

        // ViewModel
        viewModelFactory = LaunchViewModelFactory(sharedPreferences, requireContext())
        viewModel = ViewModelProvider(this, viewModelFactory).get(LaunchViewModel::class.java)

        // Binding Object
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_launch, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        // Nav Controller
        navController = this.findNavController()

        // Dark Theme
        viewModel.setDarkTheme()

        // Navigate to Home Screen set in Preferences
        navController.navigate(
            when(sharedPreferences.getInt(getString(R.string.home_screen_preference_key), HomeScreenPreference.IMPORT_SESSION.ordinal)) {
                HomeScreenPreference.IMPORT_SESSION.ordinal -> LaunchFragmentDirections.actionLaunchFragmentToImportSessionFragment()
                HomeScreenPreference.VIEW_SESSIONS.ordinal -> LaunchFragmentDirections.actionLaunchFragmentToViewSessionsFragment()
                HomeScreenPreference.ABOUT.ordinal -> LaunchFragmentDirections.actionLaunchFragmentToAboutFragment()
                HomeScreenPreference.DONATE.ordinal -> LaunchFragmentDirections.actionLaunchFragmentToDonateFragment()
                HomeScreenPreference.SETTINGS.ordinal -> LaunchFragmentDirections.actionLaunchFragmentToSettingsFragment()

                else -> throw IllegalArgumentException("Unknown Launch Screen preference value!")
            })

        return binding.root
    }
}