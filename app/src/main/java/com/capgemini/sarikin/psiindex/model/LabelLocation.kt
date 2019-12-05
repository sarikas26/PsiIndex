package com.capgemini.sarikin.psiindex.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Sarika Singh
 */
data class LabelLocation (
        @SerializedName("latitude") val latitude : Double,
        @SerializedName("longitude") val longitude : Double
)