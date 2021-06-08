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

package com.guglielmoboi.cstimergraph.mainactivity

import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.util.preferences.DarkThemePreference
import com.guglielmoboi.cstimergraph.util.preferences.HomeScreenPreference

class MainActivityViewModel(private val sharedPreferences: SharedPreferences, private val context: Context) : ViewModel()
{
    /* SHARED PREFERENCES METHODS */

    fun setupSharedPreferences() {
        val darkThemePreference = sharedPreferences.getInt(context.getString(R.string.dark_theme_preference_key), DarkThemePreference.DARK_THEME.ordinal)
        val homeScreenPreference = sharedPreferences.getInt(context.getString(R.string.home_screen_preference_key), HomeScreenPreference.IMPORT_SESSION.ordinal)

        with (sharedPreferences.edit()) {
            putInt(context.getString(R.string.dark_theme_preference_key), darkThemePreference)
            putInt(context.getString(R.string.home_screen_preference_key), homeScreenPreference)
            apply()
        }
    }
}