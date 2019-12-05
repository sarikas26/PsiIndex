package com.capgemini.sarikin.psiindex.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Sarika Singh
 */
data class PsiResponse(
    @SerializedName("region_metadata") val region_metadata: List<RegionMetadata>,
    @SerializedName("items") val items: List<Items>
)