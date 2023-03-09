package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class MetaDto(
    @SerializedName("dimensions")
    val dimensions: DimensionsDto
)