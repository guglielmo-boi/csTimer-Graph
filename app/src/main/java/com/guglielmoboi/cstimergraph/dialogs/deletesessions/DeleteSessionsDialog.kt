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

package com.guglielmoboi.cstimergraph.dialogs.deletesessions

import android.app.Application
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getColor
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.databinding.DialogDeleteSessionsBinding
import com.guglielmoboi.cstimergraph.util.DeleteSessionsResult

class DeleteSessionsDialog(private val result: MutableLiveData<DeleteSessionsResult>) : DialogFragment()
{
    private lateinit var viewModel: DeleteSessionsViewModel
    private lateinit var viewModelFactory: DeleteSessionsViewModelFactory

    private lateinit var binding: DialogDeleteSessionsBinding


    companion object
    {
        const val TAG = "DeleteSessionsDialog"
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewModelFactory = DeleteSessionsViewModelFactory(result)
        viewModel = ViewModelProvider(this, viewModelFactory)[DeleteSessionsViewModel::class.java]

        binding = DataBindingUtil.inflate(inflater, R.layout.dialog_delete_sessions, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        dialog?.window?.setBackgroundDrawable(ColorDrawable(getColor(requireContext(), R.color.transparent)))

        viewModel.deleteButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                dismiss()
                viewModel.deleteSessions()
                viewModel.onDeleteSessionsCompleted()

            }
        }

        viewModel.cancelButtonClicked.observe(viewLifecycleOwner) {
            if(it) {
                dismiss()
                viewModel.cancelDeleteSessions()
                viewModel.onCancelCompleted()
            }
        }

        return binding.root
    }
}