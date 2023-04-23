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
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.util.preferences.DarkThemePreference

class SettingsViewModel(private val sharedPreferences: SharedPreferences, application: Application) : AndroidViewModel(application)
{
    private val _darkThemeSwitchClicked = MutableLiveData<Boolean>()
    val darkThemeSwitchClicked: LiveData<Boolean>
        get() = _darkThemeSwitchClicked


    fun onDarkThemeSwitchClicked() {
        _darkThemeSwitchClicked.value = true
    }

    fun onSetDarkThemeCompleted() {
        _darkThemeSwitchClicked.value = false
    }

    fun setDarkTheme(isChecked: Boolean) {
        if(isChecked) {
            with(sharedPreferences.edit()) {
                putInt(getApplication<Application?>().applicationContext.getString(R.string.dark_theme_preference_key), DarkThemePreference.DARK_THEME.ordinal)
                apply()
            }
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            with(sharedPreferences.edit()) {
                putInt(getApplication<Application?>().applicationContext.getString(R.string.dark_theme_preference_key), DarkThemePreference.LIGHT_THEME.ordinal)
                apply()
            }
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }


    fun setStartDestination(position: Int) {
        with(sharedPreferences.edit()) {
            putInt(getApplication<Application?>().applicationContext.getString(R.string.home_screen_preference_key), position)
            apply()
        }
    }
}