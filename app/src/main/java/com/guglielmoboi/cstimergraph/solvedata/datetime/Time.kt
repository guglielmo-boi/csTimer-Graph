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

package com.guglielmoboi.cstimergraph.solvedata.datetime

import java.time.LocalTime

class Time(val time: LocalTime) : Comparable<Time>
{
    val hour: Int
        get() = time.hour
    val minute: Int
        get() = time.minute
    val second: Int
        get() = time.second


    constructor(timeString: String) : this(LocalTime.parse(timeString))


    override fun toString(): String {
        return time.toString()
    } // hh:mm:ss

    override fun equals(other: Any?): Boolean {
        return if(other == null || other !is Time) {
            false
        } else {
            time == other.time
        }
    }

    override fun hashCode(): Int {
        return time.hashCode() * 17
    }

    override fun compareTo(other: Time): Int {
        return compareValuesBy(this, other, Time::hour, Time::minute, Time::second)
    }
}