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

class DateTime(val date: Date, val time: Time) : Comparable<DateTime>
{
    private val day: Int
        get() = date.day
    private val month: Int
        get() = date.month
    private val year: Int
        get() = date.year
    private val hour: Int
        get() = time.hour
    private val minute: Int
        get() = time.minute
    private val second: Int
        get() = time.second


    constructor(dateString: String, timeString: String) : this(Date(dateString), Time(timeString))
    constructor(dateTimeString: String) : this(dateTimeString.substringBeforeLast(" "), dateTimeString.substringAfterLast(" "))


    fun toStringFormatted(): String = "${date.toStringFormatted()}, $time"


    override fun toString(): String =
        "$date $time"

    override fun equals(other: Any?): Boolean {
        return if(other == null || other !is DateTime) {
            false
        } else {
            date == other.date && time == other.time
        }
    }

    override fun hashCode(): Int {
        return(date.hashCode() * 7 + time.hashCode() * 11)
    }

    override fun compareTo(other: DateTime): Int {
        return compareValuesBy(this, other, DateTime::year, DateTime::month, DateTime::day, DateTime::hour, DateTime::minute, DateTime::second)
    }
}