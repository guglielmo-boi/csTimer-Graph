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

package com.guglielmoboi.cstimergraph.mainactivity

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity()
{
    private lateinit var sharedPreferences: SharedPreferences

    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    private lateinit var binding: ActivityMainBinding

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toolbar: Toolbar
    private lateinit var toolbarDrawerToggle: ActionBarDrawerToggle

    private lateinit var navView: NavigationView

    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.settings_preferences_file_key), Context.MODE_PRIVATE)

        viewModelFactory = MainActivityViewModelFactory(sharedPreferences, application)
        viewModel = ViewModelProvider(this, viewModelFactory)[MainActivityViewModel::class.java]

        viewModel.setupSharedPreferences()

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        drawerLayout = binding.drawerLayout
        toolbar = binding.toolbar
        toolbarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open_description, R.string.drawer_close_description)

        drawerLayout.addDrawerListener(toolbarDrawerToggle) // open the drawer when the toggle is clicked

        setSupportActionBar(toolbar) // set the toolbar as the action bar
        supportActionBar?.setDisplayShowTitleEnabled(false) // make toolbar's title invisible

        toolbarDrawerToggle.drawerArrowDrawable.color = ContextCompat.getColor(this, R.color.onPrimaryColor) // set the toggle color to onPrimary

        toolbarDrawerToggle.syncState() // sync the toolbar state

        navView = binding.navView

        navController = this.findNavController(R.id.navHostFragment)

        navController.addOnDestinationChangedListener { _: NavController, navDestination, _: Bundle? ->
            if(navDestination.id == R.id.detailSessionFragment) {
                toolbarDrawerToggle.isDrawerIndicatorEnabled = false
                supportActionBar?.setDisplayHomeAsUpEnabled(true)

                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            } else {
                supportActionBar?.setDisplayHomeAsUpEnabled(false)
                toolbarDrawerToggle.isDrawerIndicatorEnabled = true

                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
            }
        }

        NavigationUI.setupWithNavController(navView, navController)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toolbarDrawerToggle.onOptionsItemSelected(item)) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }
}