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

package com.guglielmoboi.cstimergraph.solvedata.session

import androidx.appcompat.app.AppCompatDelegate
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle
import com.github.aachartmodel.aainfographics.aatools.AAColor
import com.guglielmoboi.cstimergraph.R

class SessionChart(session: Session)
{
    /* CHART MODEL */

    val chartModel: AAChartModel by lazy {
        AAChartModel()
            .chartType(AAChartType.Line)
            .backgroundColor(R.color.surfaceColor)
            .title("")
            .titleStyle(AAStyle().color((
                    if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
                        AAColor.rgbaColor(255,255, 255)
                    } else {
                        AAColor.rgbaColor(0,0, 0)
                    })))
            .dataLabelsEnabled(true)
            .yAxisTitle("")

            .series(arrayOf(
                // solves
                AASeriesElement().name("Solves").data(session.solves.mapIndexed { index, solve -> arrayOf(index + 1, solve.time.toDouble()) }.toTypedArray()).color(AAColor.rgbaColor(249, 168, 37)).marker(AAMarker().symbol("circle").radius(markerRadius)),

                // avg5
                AASeriesElement().name("Avg5").data(session.averagesFive.mapIndexed { index, solveTime -> arrayOf(index + 5, solveTime.toDouble()) }.toTypedArray()).color(AAColor.rgbaColor(41, 182, 246)).marker(AAMarker().symbol("diamond").radius(markerRadius)),

                // avg12
                AASeriesElement().name("Avg12").data(session.averagesTwelve.mapIndexed { index, solveTime -> arrayOf(index + 12, solveTime.toDouble()) }.toTypedArray()).color(AAColor.Magenta).marker(AAMarker().symbol("square").radius(markerRadius - 1.0f)),
            ))
    }


    /* COMPANION OBJECT */

    companion object
    {
        const val markerRadius: Float = 5.0f
    }
}