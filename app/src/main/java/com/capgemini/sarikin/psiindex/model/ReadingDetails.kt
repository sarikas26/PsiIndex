package com.capgemini.sarikin.psiindex.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Sarika Singh
 */
data class ReadingDetails (
    @SerializedName("west") val west : String,
    @SerializedName("national") val national : String,
    @SerializedName("east") val east : String,
    @SerializedName("central") val central : String,
    @SerializedName("south") val south : String,
    @SerializedName("north") val north : String
)