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

package com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.databinding.ListItemSessionBinding
import com.guglielmoboi.cstimergraph.solvedata.session.Session
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.ClassCastException

class SessionAdapter(private val clickListener: SessionListener) : ListAdapter<DataItem, RecyclerView.ViewHolder>(SessionsDiffCallback())
{
    /* PROPERTIES */

    // Coroutines
    private val adapterScope = CoroutineScope(Dispatchers.Default)


    /* COMPANION OBJECT */

    companion object
    {
        private const val ITEM_VIEW_TYPE_PADDING = 0
        private const val ITEM_VIEW_TYPE_SESSION = 1
    }


    /* ADAPTER METHODS */

    fun submitListWithPadding(list: List<Session>?) {
        adapterScope.launch {
            val items = when(list) {
                null -> listOf(DataItem.PaddingItem)
                else -> list.map { DataItem.SessionItem(it) } + listOf(DataItem.PaddingItem)
            }
            withContext(Dispatchers.Main) {
                submitList(items)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            ITEM_VIEW_TYPE_PADDING -> TextViewHolder.from(parent)
            ITEM_VIEW_TYPE_SESSION -> ViewHolder.from(parent)

            else -> throw ClassCastException("Unknown viewType $viewType")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is ViewHolder -> {
                val sessionItem = getItem(position) as DataItem.SessionItem
                holder.bind(clickListener, sessionItem.session)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(getItem(position)) {
            is DataItem.PaddingItem -> ITEM_VIEW_TYPE_PADDING
            is DataItem.SessionItem -> ITEM_VIEW_TYPE_SESSION
        }
    }


    /* VIEW HOLDER FOR SESSION ITEMS */

    class ViewHolder private constructor(val binding: ListItemSessionBinding) : RecyclerView.ViewHolder(binding.root)
    {
        fun bind(clickListener: SessionListener, item: Session) {
            binding.session = item
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ListItemSessionBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }
    }


    /* TEXT VIEW HOLDER FOR PADDING ITEM */

    class TextViewHolder(view: View) : RecyclerView.ViewHolder(view)
    {
        companion object
        {
            fun from(parent: ViewGroup): TextViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater.inflate(R.layout.list_item_padding, parent, false)

                return TextViewHolder(view)
            }
        }
    }
}
