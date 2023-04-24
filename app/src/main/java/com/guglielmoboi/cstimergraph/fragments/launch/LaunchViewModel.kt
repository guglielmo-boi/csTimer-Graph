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

package com.guglielmoboi.cstimergraph.fragments.launch

import android.app.Application
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.AndroidViewModel
import androidx.navigation.NavController
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.preferences.DarkThemePreference
import com.guglielmoboi.cstimergraph.preferences.HomeScreenPreference

class LaunchViewModel(private val sharedPreferences: SharedPreferences, application: Application) : AndroidViewModel(application)
{
    fun setDarkTheme() {
        when(sharedPreferences.getInt(getApplication<Application?>().applicationContext.getString(R.string.dark_theme_preference_key), DarkThemePreference.LIGHT_THEME.ordinal)) {
            DarkThemePreference.LIGHT_THEME.ordinal -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            DarkThemePreference.DARK_THEME.ordinal -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

            else -> throw IllegalArgumentException("Unknown Dark Theme preference value!")
        }
    }

    fun navigate(navController: NavController) {
        navController.navigate(
            when(sharedPreferences.getInt(getApplication<Application?>().applicationContext.getString(R.string.home_screen_preference_key), HomeScreenPreference.IMPORT_SESSION.ordinal)) {
                HomeScreenPreference.IMPORT_SESSION.ordinal -> LaunchFragmentDirections.actionLaunchFragmentToImportSessionFragment()
                HomeScreenPreference.VIEW_SESSIONS.ordinal -> LaunchFragmentDirections.actionLaunchFragmentToViewSessionsFragment()
                HomeScreenPreference.ABOUT.ordinal -> LaunchFragmentDirections.actionLaunchFragmentToAboutFragment()
                HomeScreenPreference.DONATE.ordinal -> LaunchFragmentDirections.actionLaunchFragmentToDonateFragment()
                HomeScreenPreference.SETTINGS.ordinal -> LaunchFragmentDirections.actionLaunchFragmentToSettingsFragment()

                else -> throw IllegalArgumentException("Unknown Launch Screen preference value!")
            })
    }
}
