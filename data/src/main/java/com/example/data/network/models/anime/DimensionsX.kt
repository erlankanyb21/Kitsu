package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class DimensionsX(
    @SerializedName("tiny")
    val tiny: com.example.data.network.models.anime.Tiny,
    @SerializedName("small")
    val small: com.example.data.network.models.anime.Small,
    @SerializedName("large")
    val large: com.example.data.network.models.anime.Large
)