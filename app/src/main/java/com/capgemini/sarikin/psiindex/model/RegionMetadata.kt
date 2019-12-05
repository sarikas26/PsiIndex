package com.capgemini.sarikin.psiindex.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Sarika Singh
 */
data class RegionMetadata (
        @SerializedName("name") val name : String,
        @SerializedName("label_location") val label_location : LabelLocation
)