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

package com.guglielmoboi.cstimergraph.util.datetime

import java.time.LocalTime

class Time(val time: LocalTime)
    : Comparable<Time>
{
    /* CONSTRUCTORS */

    constructor(timeString: String) : this(LocalTime.parse(timeString, /* DateTimeFormatter.ofPattern("HH:mm:ss") */))


    /* PROPERTIES */

    val hour: Int
        get() = time.hour
    val minute: Int
        get() = time.minute
    val second: Int
        get() = time.second


    /* UNIVERSAL METHODS & COMPARE */

    override fun toString(): String {
        return time.toString()
    } // hh:mm:ss

    override fun equals(other: Any?): Boolean {
        return if(other == null || other !is Time) {
            false
        } else {
            time == other.time
        }
    } // checks whether other is null or not Time

    override fun hashCode(): Int {
        return time.hashCode() * 17
    } // time.hashCode() * 17

    override fun compareTo(other: Time): Int {
        return compareValuesBy(this, other, Time::hour, Time::minute, Time::second)
    } // compare by: hour, minute, second
}