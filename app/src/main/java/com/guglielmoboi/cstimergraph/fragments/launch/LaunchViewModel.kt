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
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.ViewModel
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.util.preferences.DarkThemePreference

class LaunchViewModel(private val sharedPreferences: SharedPreferences, private val context: Context) : ViewModel()
{
    /* DARK THEME PREFERENCE METHODS */

    fun setDarkTheme() {
        when(sharedPreferences.getInt(context.getString(R.string.dark_theme_preference_key), DarkThemePreference.LIGHT_THEME.ordinal)) {
            DarkThemePreference.LIGHT_THEME.ordinal -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            DarkThemePreference.DARK_THEME.ordinal -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

            else -> throw IllegalArgumentException("Unknown Dark Theme preference value!")
        }
    }
}
