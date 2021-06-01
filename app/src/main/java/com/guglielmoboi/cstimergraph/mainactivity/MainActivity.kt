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
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
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
    /* PROPERTIES */

    // Shared Preferences
    private lateinit var sharedPreferences: SharedPreferences

    // ViewModel
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    // Binding Objects
    private lateinit var binding: ActivityMainBinding

    // Drawer Layout, Toolbar and Toolbar Drawer Toggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toolbar: Toolbar
    private lateinit var toolbarDrawerToggle: ActionBarDrawerToggle

    // Nav View
    private lateinit var navView: NavigationView

    // NavController
    private lateinit var navController: NavController


    /* LIFECYCLE METHODS */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Shared Preferences
        sharedPreferences = getSharedPreferences(getString(R.string.settings_preferences_file_key), Context.MODE_PRIVATE)

        // ViewModel
        viewModelFactory = MainActivityViewModelFactory(sharedPreferences, this)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)

        // Shared Preferences setup
        viewModel.setupSharedPreferences()

        // Binding Object
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        // Drawer Layout, Toolbar and Toolbar Drawer Toggle
        drawerLayout = binding.drawerLayout
        toolbar = binding.toolbar
        toolbarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open_description, R.string.drawer_close_description)

        // Drawer Layout, Toolbar and Toolbar Drawer Toggle setup
        drawerLayout.addDrawerListener(toolbarDrawerToggle) // open the drawer when the toggle is clicked

        setSupportActionBar(toolbar) // set the toolbar as the action bar
        supportActionBar?.setDisplayShowTitleEnabled(false) // make toolbar's title invisible

        toolbarDrawerToggle.drawerArrowDrawable.color = getColor(R.color.onPrimaryColor) // set the toggle color to onPrimary

        toolbarDrawerToggle.syncState() // sync the toolbar state

        // Nav View
        navView = binding.navView

        // NavController
        navController = this.findNavController(R.id.navHostFragment)

        // Set the toolbarDrawerToggle to up indicator and hide the navDrawer in the detailSessionFragment
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

        // Navigation setup
        NavigationUI.setupWithNavController(navView, navController)
    }


    /* NAVIGATION METHODS */

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toolbarDrawerToggle.onOptionsItemSelected(item)) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }

    override fun onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}