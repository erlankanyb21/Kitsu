package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class DimensionsDto(
    @SerializedName("tiny")
    val tinyDto: TinyDto,
    @SerializedName("small")
    val smallDto: SmallDto,
    @SerializedName("medium")
    val medium: MediumDto,
    @SerializedName("large")
    val large: LargeDto
)