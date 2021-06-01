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

package com.guglielmoboi.cstimergraph.fragments.viewsessions

import android.app.Activity
import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.database.repository.Repository
import com.guglielmoboi.cstimergraph.databinding.FragmentViewSessionsBinding
import com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.SessionAdapter
import com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.SessionListener
import kotlinx.coroutines.*


class ViewSessionsFragment : Fragment()
{
    /* PROPERTIES */

    // Coroutines
    private var fragmentJob = Job()
    private val defaultScope = CoroutineScope(Dispatchers.Default + fragmentJob)

    // Application
    private lateinit var application: Application

    // NavArgs
    private lateinit var navArgs: ViewSessionsFragmentArgs

    // ViewModel
    private lateinit var viewModel: ViewSessionsViewModel
    private lateinit var viewModelFactory: ViewSessionsViewModelFactory

    // Binding Object
    private lateinit var binding: FragmentViewSessionsBinding

    // NavController
    private lateinit var navController: NavController

    // RecyclerView components
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var sessionAdapter: SessionAdapter


    /* COMPANION OBJECT */

    companion object
    {
        const val OPEN_FILE_REQUEST_CODE = 1
    }


    /* LIFECYCLE METHODS */

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        //Application
        application = requireNotNull(this.activity).application

        // NavArgs
        navArgs = ViewSessionsFragmentArgs.fromBundle(requireArguments())

        // ViewModel
        viewModelFactory = ViewSessionsViewModelFactory(Repository(application) ,application)
        viewModel = ViewModelProvider(this, viewModelFactory).get(ViewSessionsViewModel::class.java)

        // Binding Object
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_view_sessions, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        // NavController
        navController = this.findNavController()

        // RecyclerView components
        layoutManager = LinearLayoutManager(activity)
        binding.sessionsList.layoutManager = layoutManager

        sessionAdapter = SessionAdapter(SessionListener { sessionID ->
            onSessionClicked(sessionID)
        })
        binding.sessionsList.adapter = sessionAdapter

        // Observers
        viewModel.sessions.observe(viewLifecycleOwner, {
            it?.let {
                sessionAdapter.submitListWithPadding(it)
            }
        })

        viewModel.refreshSessionsButtonClicked.observe(viewLifecycleOwner, {
            if(it) {
                refreshSessions()

                viewModel.onRefreshSessionsComplete()
            }
        })

        viewModel.loadSessionButtonClicked.observe(viewLifecycleOwner, {
            if(it) {
                viewModel.loadSession(this, OPEN_FILE_REQUEST_CODE)

                viewModel.onLoadSessionComplete()
            }
        })

        // Sessions initialization
        viewModel.createSessions()

        // Trigger load session button in onCreate
        if(navArgs.loadSession) {
            viewModel.onLoadSessionButtonClicked()
        }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()

        // Coroutines
        fragmentJob.cancel()
    }


    /* HELPER METHODS */

    // Refresh Sessions
    private fun refreshSessions() {
        val action = ViewSessionsFragmentDirections.actionViewSessionsFragmentToRefreshSessionsFragment()

        navController.navigate(action)
    }

    // sessionClickListener
    private fun onSessionClicked(id: Long) {
        val action = ViewSessionsFragmentDirections.actionViewSessionsFragmentToDetailSessionFragment(id)

        navController.navigate(action)
    }


    // Activity Result method
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(resultCode == Activity.RESULT_OK) {
            when(requestCode){
                OPEN_FILE_REQUEST_CODE -> {
                    defaultScope.launch {
                        viewModel.saveSession(data, this@ViewSessionsFragment)
                    }
                }

                else -> throw IllegalArgumentException("Unknown Activity Result requestCode!")
            }
        }
    }
}