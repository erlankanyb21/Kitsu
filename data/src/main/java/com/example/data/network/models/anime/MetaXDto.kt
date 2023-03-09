package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class MetaXDto(
    @SerializedName("dimensions")
    val dimensions: DimensionsXDto
)