package com.capgemini.sarikin.psiindex.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Sarika Singh
 */
data class Items(
        @SerializedName("timestamp") val timestamp: String,
        @SerializedName("update_timestamp") val update_timestamp: String,
        @SerializedName("readings") val readings : Readings
)