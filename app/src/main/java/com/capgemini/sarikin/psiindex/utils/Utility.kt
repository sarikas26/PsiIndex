package com.capgemini.sarikin.psiindex.utils

import com.capgemini.sarikin.psiindex.constants.PsiAppConstants
import com.capgemini.sarikin.psiindex.model.ReadingDetailsPair
import com.capgemini.sarikin.psiindex.model.Readings

/**
 * Created by Sarika Singh
 */
object Utility {

    /**
     * Split string for delimiter :
     */
    fun getRegionTitle(title : String?) : String? {
        val titleParts = title?.split(":")
        return titleParts?.get(1)?.trim()
    }

    /**
     * Return psi index details for selected region.
     */
    fun getReadingDetails(readings: Readings, identifier: String?): List<ReadingDetailsPair> {
        var readingDetailsPair = emptyList<ReadingDetailsPair>()
        when (identifier) {
            PsiAppConstants.EAST -> {
                readingDetailsPair = getEastReadings(readings)
            }
            PsiAppConstants.WEST -> {
                readingDetailsPair = getWestReadings(readings)
            }
            PsiAppConstants.NORTH -> {
                readingDetailsPair = getNorthReadings(readings)
            }
            PsiAppConstants.SOUTH -> {
                readingDetailsPair = getSouthReadings(readings)
            }
            PsiAppConstants.CENTRAL -> {
                readingDetailsPair = getCentralReadings(readings)
            }
        }
        return readingDetailsPair
    }

    /**
     * Create and return psi index details for west region.
     */
    private fun getWestReadings(readings: Readings): List<ReadingDetailsPair> {
        val readingDetailsPair = ArrayList<ReadingDetailsPair>()
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.co_eight_hour_max,
                readings.co_eight_hour_max.west
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.co_sub_index,
                readings.co_sub_index.west
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.no2_one_hour_max,
                readings.no2_one_hour_max.west
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.o3_eight_hour_max,
                readings.o3_eight_hour_max.west
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.o3_sub_index,
                readings.o3_sub_index.west
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm10_sub_index,
                readings.pm10_sub_index.west
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm10_twenty_four_hourly,
                readings.pm10_twenty_four_hourly.west
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm25_sub_index,
                readings.pm25_sub_index.west
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm25_twenty_four_hourly,
                readings.pm25_twenty_four_hourly.west
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.psi_twenty_four_hourly,
                readings.psi_twenty_four_hourly.west
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.so2_sub_index,
                readings.so2_sub_index.west
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.so2_twenty_four_hourly,
                readings.so2_twenty_four_hourly.west
            )
        )
        return readingDetailsPair
    }

    /**
     * Create and return psi index details for east region.
     */
    private fun getEastReadings(readings: Readings): List<ReadingDetailsPair> {
        val readingDetailsPair = ArrayList<ReadingDetailsPair>()
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.co_eight_hour_max,
                readings.co_eight_hour_max.east
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.co_sub_index,
                readings.co_sub_index.east
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.no2_one_hour_max,
                readings.no2_one_hour_max.east
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.o3_eight_hour_max,
                readings.o3_eight_hour_max.east
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.o3_sub_index,
                readings.o3_sub_index.east
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm10_sub_index,
                readings.pm10_sub_index.east
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm10_twenty_four_hourly,
                readings.pm10_twenty_four_hourly.east
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm25_sub_index,
                readings.pm25_sub_index.east
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm25_twenty_four_hourly,
                readings.pm25_twenty_four_hourly.east
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.psi_twenty_four_hourly,
                readings.psi_twenty_four_hourly.east
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.so2_sub_index,
                readings.so2_sub_index.east
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.so2_twenty_four_hourly,
                readings.so2_twenty_four_hourly.east
            )
        )
        return readingDetailsPair
    }

    /**
     * Create and return psi index details for north region.
     */
    private fun getNorthReadings(readings: Readings): List<ReadingDetailsPair> {
        val readingDetailsPair = ArrayList<ReadingDetailsPair>()
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.co_eight_hour_max,
                readings.co_eight_hour_max.north
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.co_sub_index,
                readings.co_sub_index.north
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.no2_one_hour_max,
                readings.no2_one_hour_max.north
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.o3_eight_hour_max,
                readings.o3_eight_hour_max.north
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.o3_sub_index,
                readings.o3_sub_index.north
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm10_sub_index,
                readings.pm10_sub_index.north
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm10_twenty_four_hourly,
                readings.pm10_twenty_four_hourly.north
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm25_sub_index,
                readings.pm25_sub_index.north
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm25_twenty_four_hourly,
                readings.pm25_twenty_four_hourly.north
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.psi_twenty_four_hourly,
                readings.psi_twenty_four_hourly.north
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.so2_sub_index,
                readings.so2_sub_index.north
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.so2_twenty_four_hourly,
                readings.so2_twenty_four_hourly.north
            )
        )
        return readingDetailsPair
    }

    /**
     * Create and return psi index details for south region.
     */
    private fun getSouthReadings(readings: Readings): List<ReadingDetailsPair> {
        val readingDetailsPair = ArrayList<ReadingDetailsPair>()
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.co_eight_hour_max,
                readings.co_eight_hour_max.south
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.co_sub_index,
                readings.co_sub_index.south
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.no2_one_hour_max,
                readings.no2_one_hour_max.south
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.o3_eight_hour_max,
                readings.o3_eight_hour_max.south
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.o3_sub_index,
                readings.o3_sub_index.south
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm10_sub_index,
                readings.pm10_sub_index.south
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm10_twenty_four_hourly,
                readings.pm10_twenty_four_hourly.south
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm25_sub_index,
                readings.pm25_sub_index.south
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm25_twenty_four_hourly,
                readings.pm25_twenty_four_hourly.south
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.psi_twenty_four_hourly,
                readings.psi_twenty_four_hourly.south
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.so2_sub_index,
                readings.so2_sub_index.south
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.so2_twenty_four_hourly,
                readings.so2_twenty_four_hourly.south
            )
        )
        return readingDetailsPair
    }

    /**
     * Create and return psi index details for central region.
     */
    private fun getCentralReadings(readings: Readings): List<ReadingDetailsPair> {
        val readingDetailsPair = ArrayList<ReadingDetailsPair>()
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.co_eight_hour_max,
                readings.co_eight_hour_max.central
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.co_sub_index,
                readings.co_sub_index.central
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.no2_one_hour_max,
                readings.no2_one_hour_max.central
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.o3_eight_hour_max,
                readings.o3_eight_hour_max.central
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.o3_sub_index,
                readings.o3_sub_index.central
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm10_sub_index,
                readings.pm10_sub_index.central
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm10_twenty_four_hourly,
                readings.pm10_twenty_four_hourly.central
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm25_sub_index,
                readings.pm25_sub_index.central
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.pm25_twenty_four_hourly,
                readings.pm25_twenty_four_hourly.central
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.psi_twenty_four_hourly,
                readings.psi_twenty_four_hourly.central
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.so2_sub_index,
                readings.so2_sub_index.central
            )
        )
        readingDetailsPair.add(
            ReadingDetailsPair(
                PsiAppConstants.so2_twenty_four_hourly,
                readings.so2_twenty_four_hourly.central
            )
        )
        return readingDetailsPair
    }
}