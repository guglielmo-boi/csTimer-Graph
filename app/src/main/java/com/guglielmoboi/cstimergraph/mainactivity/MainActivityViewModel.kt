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

package com.guglielmoboi.cstimergraph.mainactivity

import android.app.Application
import android.content.SharedPreferences
import androidx.lifecycle.AndroidViewModel
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.util.preferences.DarkThemePreference
import com.guglielmoboi.cstimergraph.util.preferences.HomeScreenPreference

class MainActivityViewModel(private val sharedPreferences: SharedPreferences, application: Application) : AndroidViewModel(application)
{
    fun setupSharedPreferences() {
        val darkThemePreference = sharedPreferences.getInt(getApplication<Application?>().applicationContext.getString(R.string.dark_theme_preference_key), DarkThemePreference.DARK_THEME.ordinal)
        val homeScreenPreference = sharedPreferences.getInt(getApplication<Application?>().applicationContext.getString(R.string.home_screen_preference_key), HomeScreenPreference.IMPORT_SESSION.ordinal)

        with (sharedPreferences.edit()) {
            putInt(getApplication<Application?>().applicationContext.getString(R.string.dark_theme_preference_key), darkThemePreference)
            putInt(getApplication<Application?>().applicationContext.getString(R.string.home_screen_preference_key), homeScreenPreference)
            apply()
        }
    }
}