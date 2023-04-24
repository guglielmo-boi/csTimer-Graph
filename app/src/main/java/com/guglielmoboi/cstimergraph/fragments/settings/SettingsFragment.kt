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

package com.guglielmoboi.cstimergraph.fragments.settings

import android.app.Application
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
import com.guglielmoboi.cstimergraph.preferences.DarkThemePreference
import com.guglielmoboi.cstimergraph.preferences.HomeScreenPreference

class SettingsFragment : Fragment(), AdapterView.OnItemSelectedListener
{
    private lateinit var sharedPreferences: SharedPreferences

    private lateinit var application: Application

    private lateinit var viewModel: SettingsViewModel
    private lateinit var viewModelFactory: SettingsViewModelFactory

    private lateinit var binding: FragmentSettingsBinding

    private lateinit var darkThemeSwitch: SwitchMaterial

    private lateinit var homeScreenSpinner: Spinner


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        application = requireNotNull(this.activity).application

        sharedPreferences = requireActivity().getSharedPreferences(getString(R.string.settings_preferences_file_key), Context.MODE_PRIVATE)

        viewModelFactory = SettingsViewModelFactory(sharedPreferences, application)
        viewModel = ViewModelProvider(this, viewModelFactory)[SettingsViewModel::class.java]

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        darkThemeSwitch = binding.darkThemeSwitch

        homeScreenSpinner = binding.launchScreenSpinner
        homeScreenSpinner.onItemSelectedListener = this // the fragment represents the spinner listener by implementing 'AdapterView.OnItemSelectedListener' interface

        setupUI() // setup the ui based on the user settings preferences

        viewModel.darkThemeSwitchClicked.observe(viewLifecycleOwner) {
            if(it) {
                viewModel.setDarkTheme(darkThemeSwitch.isChecked)
                viewModel.onSetDarkThemeCompleted()
            }
        }


        return binding.root
    }


    private fun setupUI() {
        val darkThemePreference = sharedPreferences.getInt(getString(R.string.dark_theme_preference_key), DarkThemePreference.LIGHT_THEME.ordinal)
        val homeScreenPreference = sharedPreferences.getInt(getString(R.string.home_screen_preference_key), HomeScreenPreference.IMPORT_SESSION.ordinal)

        darkThemeSwitch.isChecked = (darkThemePreference == DarkThemePreference.DARK_THEME.ordinal)

        homeScreenSpinner.setSelection(homeScreenPreference)
    }


    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        viewModel.setStartDestination(position)
    }

    override fun onNothingSelected(parent: AdapterView<*>?) { }
}