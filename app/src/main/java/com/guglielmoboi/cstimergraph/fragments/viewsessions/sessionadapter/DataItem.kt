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

import com.guglielmoboi.cstimergraph.solvedata.session.Session

sealed class DataItem
{
    abstract val id: Long

    data class SessionItem(val session: Session, var isSelected: Boolean) : DataItem()
    {
        override val id = session.id
    }

    object PaddingItem : DataItem()
    {
        override val id = Long.MIN_VALUE
    }
}