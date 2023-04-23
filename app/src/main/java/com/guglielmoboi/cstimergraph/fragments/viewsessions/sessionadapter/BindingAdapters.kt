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

package com.guglielmoboi.cstimergraph.fragments.viewsessions.sessionadapter

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.guglielmoboi.cstimergraph.solvedata.session.Session

private const val NULL_VALUE_STRING: String = ""

@BindingAdapter("sessionName")
fun TextView.setSessionName(item: Session?) {
    item?.let {
        text = it.name
    }
}

@BindingAdapter("sessionStartDateTime")
fun TextView.setSessionStartDateTime(item: Session?) {
    item?.let {
        text =
            if(it.startDateTime == null) {
                NULL_VALUE_STRING
            } else {
                it.startDateTime.toStringFormatted().substringBeforeLast( ":")
            }
    }
}

@BindingAdapter("sessionEndDateTime")
fun TextView.setSessionEndDateTime(item: Session?) {
    item?.let {
        text =
            if(it.endDateTime == null) {
                NULL_VALUE_STRING
            }
            else {
                it.endDateTime.toStringFormatted().substringBeforeLast( ":")
            }
    }
}

@BindingAdapter("sessionSolvesCount")
fun TextView.setSolvesCount(item: Session?) {
    item?.let {
        text = "(${it.size.toString()})"
    }
}

@BindingAdapter("sessionMean")
fun TextView.setSessionMean(item: Session?) {
    item?.let {
        text =
            if(it.mean == null) {
                NULL_VALUE_STRING
            }
            else {
                it.mean.toString()
            }
    }
}

@BindingAdapter("sessionBestSolveTime")
fun TextView.setSessionBestSolve(item: Session?) {
    item?.let {
        text =
            if(it.bestSolve == null) {
                NULL_VALUE_STRING
            }
            else {
                it.bestSolve.timeStr
            }
    }
}

@BindingAdapter("sessionWorstSolveTime")
fun TextView.setSessionWorstSolve(item: Session?) {
    item?.let {
        text =
            if(it.worstSolve == null) {
                NULL_VALUE_STRING
            }
            else {
                it.worstSolve.timeStr
            }
    }
}

@BindingAdapter("sessionBestAverageFive")
fun TextView.setSessionBestAverageFive(item: Session?) {
    item?.let {
        text =
            if(it.bestAverageFive == null) {
                NULL_VALUE_STRING
            }
            else {
                it.bestAverageFive.toString()
            }
    }
}

@BindingAdapter("sessionWorstAverageFive")
fun TextView.setSessionWorstAverageFive(item: Session?) {
    item?.let {
        text =
            if(it.worstAverageFive == null) {
                NULL_VALUE_STRING
            }
            else {
                it.worstAverageFive.toString()
            }
    }
}

@BindingAdapter("sessionBestAverageTwelve")
fun TextView.setSessionBestAverageTwelve(item: Session?) {
    item?.let {
        text =
            if(it.bestAverageTwelve == null) {
                NULL_VALUE_STRING
            }
            else {
                it.bestAverageTwelve.toString()
            }
    }
}

@BindingAdapter("sessionWorstAverageTwelve")
fun TextView.setSessionWorstAverageTwelve(item: Session?) {
    item?.let {
        text =
            if(it.worstAverageTwelve == null) {
                NULL_VALUE_STRING
            }
            else {
                it.worstAverageTwelve.toString()
            }
    }
}