//    This file is part of csTimer Graph.

//    Copyright © 2021-2024 Guglielmo Boi

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

package com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.getColor
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.guglielmoboi.cstimergraph.R
import com.guglielmoboi.cstimergraph.databinding.ListItemSessionBinding
import com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter.sessionlistener.SessionListener
import com.guglielmoboi.cstimergraph.solvedata.session.Session
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SessionAdapter(private val context: Context, private val sessionListener: SessionListener) : ListAdapter<DataItem, RecyclerView.ViewHolder>(SessionsDiffCallback())
{
    private val adapterScope = CoroutineScope(Dispatchers.Default)


    companion object
    {
        private const val ITEM_TYPE_PADDING = 0
        private const val ITEM_TYPE_SESSION = 1
    }

    private fun getSessionItemIndexed(id: Long): Pair<Int, DataItem.SessionItem>? {
        currentList.forEachIndexed { index, item ->
            if(getItemViewType(index) == ITEM_TYPE_SESSION && item.id == id) return Pair(index, item as DataItem.SessionItem)
        }

        return null
    }

    fun changeSessionItemSelected(id: Long) {
        getSessionItemIndexed(id)?.apply {
            second.isSelected = !second.isSelected
            notifyItemChanged(first)
        }
    }


    fun submitListWithPadding(list: List<Session>?) {
        adapterScope.launch {
            val items = when(list) {
                null -> listOf(DataItem.PaddingItem)
                else -> list.map { DataItem.SessionItem(it, false) } + listOf(DataItem.PaddingItem)
            }

            withContext(Dispatchers.Main) {
                submitList(items)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            ITEM_TYPE_PADDING -> TextViewHolder.from(parent)
            ITEM_TYPE_SESSION -> ViewHolder.from(parent)

            else -> throw ClassCastException("Unknown viewType $viewType")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is ViewHolder -> {
                val sessionItem = getItem(position) as DataItem.SessionItem
                holder.bind(sessionItem.session, sessionListener)

                if(sessionItem.isSelected) {
                    holder.binding.sessionItem.setBackgroundColor(getColor(context, R.color.primaryTransparentColor))
                    holder.binding.sessionItemPadding.setBackgroundColor(getColor(context, R.color.primaryTransparentColor))
                } else {
                    holder.binding.sessionItem.setBackgroundColor(getColor(context, R.color.transparent))
                    holder.binding.sessionItemPadding.setBackgroundColor(getColor(context, R.color.transparent))
                }
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(getItem(position)) {
            is DataItem.PaddingItem -> ITEM_TYPE_PADDING
            is DataItem.SessionItem -> ITEM_TYPE_SESSION
        }
    }


    class ViewHolder private constructor(val binding: ListItemSessionBinding) : RecyclerView.ViewHolder(binding.root)
    {
        fun bind(item: Session, sessionListener: SessionListener) {
            binding.session = item
            binding.sessionListener = sessionListener
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ListItemSessionBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }
    }


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
