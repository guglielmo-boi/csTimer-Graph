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

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Date(val date: LocalDate)
    : Comparable<Date>
{
    /* CONSTRUCTORS */

    constructor(dateString: String) : this(LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd")))


    /* PROPERTIES */

    val day: Int
    get() = date.dayOfMonth
    val month: Int
    get() = date.monthValue
    val year: Int
    get() = date.year


    /* UNIVERSAL METHODS & COMPARE */

    override fun toString(): String {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        return formatter.format(date)
    } // yyyy-MM-dd

    override fun equals(other: Any?): Boolean {
        return if(other == null || other !is Date) {
            false
        } else {
            date == other.date
        }
    } // checks whether other is null or not Date

    override fun hashCode(): Int {
        return date.hashCode() * 13
    } // date.hashCode() * 13

    override fun compareTo(other: Date): Int {
        return compareValuesBy(this, other, Date::year, Date::month, Date::day)
    } // compare by: year, month, day


    /* CONVERSION METHODS */

    fun toStringFormatted(): String {
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        return formatter.format(date)
    }
}