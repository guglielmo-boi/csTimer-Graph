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

package com.guglielmoboi.cstimergraph.fragments.viewsessions

import android.app.Activity
import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
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
import com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.sessionlistener.SessionClickListener
import com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.sessionlistener.SessionListener
import com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.sessionlistener.SessionLongClickListener
import com.guglielmoboi.cstimergraph.util.SessionClickMode

class ViewSessionsFragment : Fragment()
{
    private lateinit var application: Application

    private lateinit var navArgs: ViewSessionsFragmentArgs

    private lateinit var viewModel: ViewSessionsViewModel
    private lateinit var viewModelFactory: ViewSessionsViewModelFactory

    private lateinit var binding: FragmentViewSessionsBinding

    private lateinit var navController: NavController

    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var sessionListener: SessionListener
    private lateinit var sessionAdapter: SessionAdapter

    private lateinit var importSessionResultLauncher: ActivityResultLauncher<Intent>


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        application = requireNotNull(this.activity).application

        navArgs = ViewSessionsFragmentArgs.fromBundle(requireArguments())

        viewModelFactory = ViewSessionsViewModelFactory(Repository(application) ,application)
        viewModel = ViewModelProvider(this, viewModelFactory)[ViewSessionsViewModel::class.java]

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_view_sessions, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        navController = this.findNavController()

        layoutManager = LinearLayoutManager(activity)
        binding.sessionsList.layoutManager = layoutManager

        sessionListener = SessionListener(
            SessionClickListener { sessionId ->
                viewModel.onSessionClicked(sessionId) },
            SessionLongClickListener { sessionId ->
                viewModel.onSessionLongClicked(sessionId) }
        )

        sessionAdapter = SessionAdapter(sessionListener)

        binding.sessionsList.adapter = sessionAdapter

        importSessionResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if(result.resultCode == Activity.RESULT_OK) {
                viewModel.loadSession(result.data, navController)
            }
        }

        viewModel.sessions.observe(viewLifecycleOwner) {
            it?.let {
                sessionAdapter.submitListWithPadding(it)
            }
        }

        viewModel.sessionClicked.observe(viewLifecycleOwner) {
            it?.let {
                when(viewModel.sessionClickMode.value) {
                    SessionClickMode.DETAIL -> {
                        viewModel.openSessionDetail(navController, it)
                        viewModel.onOpenSessionDetailCompleted()
                    }

                    SessionClickMode.DELETE -> {
                        viewModel.selectSession(it)
                        viewModel.onSelectSessionCompleted()
                    }

                    else -> { }
                }
            }
        }

        viewModel.sessionLongClicked.observe(viewLifecycleOwner) {
            it?.let {
                binding.deleteSessionsButton.visibility = View.VISIBLE
                viewModel.openDeleteSessions(it)
                viewModel.onOpenDeleteSessionsCompleted()
            }
        }

        viewModel.importSessionButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                viewModel.importSession(importSessionResultLauncher)
                viewModel.onImportSessionCompleted()
            }
        }

        viewModel.deleteSessionButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                viewModel.deleteSessions(navController)
                viewModel.onDeleteSessionsCompleted()
                binding.deleteSessionsButton.visibility = View.GONE
            }
        }

        viewModel.setup()

        if(navArgs.importSession) {
            viewModel.onImportSessionButtonClicked()
        }

        return binding.root
    }
}