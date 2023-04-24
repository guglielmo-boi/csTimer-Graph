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

package com.guglielmoboi.cstimergraph.solvedata.solve

import java.time.Duration

class SolveTime(private val time: Duration) : Comparable<SolveTime>
{
    private val timeString: String = buildTimeString(time)


    constructor(timeStr: String = "00.00") : this(timeStr.toDuration())


    companion object
    {
        fun String.toDuration(): Duration {

            val durationStr = StringBuilder("PT")

            val colonsCount =
                this.count { it == ':' } // counts the number of colons in the input string

            colonsCount.let {
                when {
                    it == 2 -> durationStr.append(substringBefore(":") + "H")

                    it >= 1 -> {
                        durationStr.append(substringBeforeLast(":") + "M")
                    }

                    it >= 0 -> {
                        durationStr.append(substringBefore(".") + "." + substringAfter(".") + "S")
                    }

                    else -> throw IllegalArgumentException("SolveTime format is not correct!")
                }
            }

            return Duration.parse(durationStr)
        } //  "HH:MM:SS.CC" -> PTnHnMnS (7:10:24.48 -> PT7H10M24.48S)

        fun buildTimeString(time: Duration): String {
            var timeStr = time.toString().replace("PT", "").replace("H", "").replace("M", "").replace("S", "")

            var decimalsStr =
                if(timeStr.contains( ".")){
                    timeStr.substringAfterLast(".")
                } else {
                    ""
                }

            decimalsStr.length.let {
                when {
                    it > 2-> {
                        decimalsStr = decimalsStr.substring(0, 3)

                        val decimals: Int =
                            if(decimalsStr.last().toString().toInt() >= 5) {
                                decimalsStr.substring(0, 2).toInt() + 1
                            } else {
                                decimalsStr.substring(0, 2).toInt()
                            }

                        timeStr = if(decimalsStr[0] == '0') {
                            timeStr.replaceAfterLast(".", "0$decimals")
                        } else {
                            timeStr.replaceAfterLast( ".", decimals.toString())
                        }
                    }

                    it == 1 -> timeStr += "0"

                    it == 0 -> timeStr += ".00"

                    else -> { }
                }
            }

            return timeStr
        }
    }


    override fun toString(): String {
        return timeString
    } // hh:mm:ss.cc

    override fun equals(other: Any?): Boolean {
        return if(other == null || other !is SolveTime) {
            false
        } else {
            time == other.time
        }
    }

    override fun hashCode(): Int {
        return time.hashCode() * 13
    }
    override fun compareTo(other: SolveTime): Int {
        return compareValuesBy(this, other, SolveTime::time)
    }


    operator fun plus(other: SolveTime): SolveTime {
        return SolveTime(time + other.time)
    }
    operator fun minus(other: SolveTime): SolveTime {
        return SolveTime(time - other.time)
    }

    operator fun div(other: Int): SolveTime {
        return SolveTime(time.dividedBy(other.toLong()))
    }


    fun toDouble() = toString().toDouble()
}


fun getMeanFromSolvesTimes(times: List<SolveTime>): SolveTime? {
    if(times.isEmpty()) return null

    var time = SolveTime()
    times.forEach { time += it }

    return (time / times.size)
}