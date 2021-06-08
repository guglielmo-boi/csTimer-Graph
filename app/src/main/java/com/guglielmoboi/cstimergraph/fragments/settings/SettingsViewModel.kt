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
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.util.preferences.DarkThemePreference

class SettingsViewModel(private val sharedPreferences: SharedPreferences, private val context: Context) : ViewModel()
{
    // Dark theme switch
    private val _darkThemeSwitchClicked = MutableLiveData<Boolean>()
    val darkThemeSwitchClicked: LiveData<Boolean>
        get() = _darkThemeSwitchClicked


    /* DARK THEME SWITCH METHODS */

    // Dark theme switch control
    fun onDarkThemeSwitchClicked() {
        _darkThemeSwitchClicked.value = true
    }

    fun onSetDarkThemeComplete() {
        _darkThemeSwitchClicked.value = false
    }

    // Set dark theme
    fun setDarkTheme(isChecked: Boolean) {
        if(isChecked) {
            with(sharedPreferences.edit()) {
                putInt(context.getString(R.string.dark_theme_preference_key), DarkThemePreference.DARK_THEME.ordinal)
                apply()
            }
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            with(sharedPreferences.edit()) {
                putInt(context.getString(R.string.dark_theme_preference_key), DarkThemePreference.LIGHT_THEME.ordinal)
                apply()
            }
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }


    /* LAUNCH SCREEN SPINNER METHODS */

    // Set start destination
    fun setStartDestination(position: Int) {
        with(sharedPreferences.edit()) {
            putInt(context.getString(R.string.home_screen_preference_key), position)
            apply()
        }
    }
}