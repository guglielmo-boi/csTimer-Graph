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

package com.guglielmoboi.cstimergraph.fragments.settings

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Spinner
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.switchmaterial.SwitchMaterial
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.databinding.FragmentSettingsBinding
import com.guglielmoboi.cstimergraph.util.preferences.DarkThemePreference
import com.guglielmoboi.cstimergraph.util.preferences.HomeScreenPreference

class SettingsFragment : Fragment(), AdapterView.OnItemSelectedListener
{
    /* PROPERTIES */

    // Shared Preferences
    private lateinit var sharedPreferences: SharedPreferences

    // ViewModel
    private lateinit var viewModel: SettingsViewModel
    private lateinit var viewModelFactory: SettingsViewModelFactory

    // Binding Object
    private lateinit var binding: FragmentSettingsBinding

    // darkThemeSwitch
    private lateinit var darkThemeSwitch: SwitchMaterial

    // launchScreenSpinner
    private lateinit var homeScreenSpinner: Spinner


    /* LIFECYCLE METHODS */

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Shared Preferences
        sharedPreferences = requireActivity().getSharedPreferences(getString(R.string.settings_preferences_file_key), Context.MODE_PRIVATE)

        // ViewModel
        viewModelFactory = SettingsViewModelFactory(sharedPreferences, requireContext())
        viewModel = ViewModelProvider(this, viewModelFactory).get(SettingsViewModel::class.java)

        // Binding Object
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        // darkThemeSwitch
        darkThemeSwitch = binding.darkThemeSwitch

        // launchScreenSpinner
        homeScreenSpinner = binding.launchScreenSpinner
        homeScreenSpinner.onItemSelectedListener = this // the fragment represents the spinner listener by implementing 'AdapterView.OnItemSelectedListener' interface

        // Setup UI
        setupUI() // setup the ui based on the user settings preferences

        // Observers
        viewModel.darkThemeSwitchClicked.observe(viewLifecycleOwner, {
            if(it) {
                viewModel.setDarkTheme(darkThemeSwitch.isChecked)

                viewModel.onSetDarkThemeComplete()
            }
        })


        return binding.root
    }


    /* SETUP UI METHODS */

    private fun setupUI() {
        val darkThemePreference = sharedPreferences.getInt(getString(R.string.dark_theme_preference_key), DarkThemePreference.LIGHT_THEME.ordinal)
        val homeScreenPreference = sharedPreferences.getInt(getString(R.string.home_screen_preference_key), HomeScreenPreference.IMPORT_SESSION.ordinal)

        darkThemeSwitch.isChecked = (darkThemePreference == DarkThemePreference.DARK_THEME.ordinal)

        homeScreenSpinner.setSelection(homeScreenPreference)
    }


    /* LAUNCH SCREEN SPINNER METHODS */

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        viewModel.setStartDestination(position)
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
}