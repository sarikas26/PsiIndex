package com.capgemini.sarikin.psiindex.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Sarika Singh
 */
data class Readings(
    @SerializedName("o3_sub_index") val o3_sub_index: ReadingDetails,
    @SerializedName("pm10_twenty_four_hourly") val pm10_twenty_four_hourly: ReadingDetails,
    @SerializedName("pm10_sub_index") val pm10_sub_index: ReadingDetails,
    @SerializedName("co_sub_index") val co_sub_index: ReadingDetails,
    @SerializedName("pm25_twenty_four_hourly") val pm25_twenty_four_hourly: ReadingDetails,
    @SerializedName("so2_sub_index") val so2_sub_index: ReadingDetails,
    @SerializedName("co_eight_hour_max") val co_eight_hour_max: ReadingDetails,
    @SerializedName("no2_one_hour_max") val no2_one_hour_max: ReadingDetails,
    @SerializedName("so2_twenty_four_hourly") val so2_twenty_four_hourly: ReadingDetails,
    @SerializedName("pm25_sub_index") val pm25_sub_index: ReadingDetails,
    @SerializedName("psi_twenty_four_hourly") val psi_twenty_four_hourly: ReadingDetails,
    @SerializedName("o3_eight_hour_max") val o3_eight_hour_max: ReadingDetails
)