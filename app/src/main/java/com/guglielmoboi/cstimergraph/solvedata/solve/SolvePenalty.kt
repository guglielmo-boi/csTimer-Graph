package com.guglielmoboi.cstimergraph.solvedata.solve

enum class SolvePenalty
{
    DNF, PLUS2;

    companion object
    {
        fun timeStringToSolvePenalty(timeStr: String): SolvePenalty? {
            return when {
                timeStr.contains("DNF") -> DNF

                timeStr.contains("+") -> PLUS2

                else -> null
            }
        }
    }
}