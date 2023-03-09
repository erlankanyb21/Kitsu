package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class DimensionsXDto(
    @SerializedName("tiny")
    val tinyDto: TinyDto,
    @SerializedName("small")
    val smallDto: SmallDto,
    @SerializedName("large")
    val large: LargeDto
)