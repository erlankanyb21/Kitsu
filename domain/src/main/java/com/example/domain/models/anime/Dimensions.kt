package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class Dimensions(
    @SerializedName("tiny")
    val tiny: com.example.data.network.models.anime.Tiny,
    @SerializedName("small")
    val small: com.example.data.network.models.anime.Small,
    @SerializedName("medium")
    val medium: com.example.data.network.models.anime.Medium,
    @SerializedName("large")
    val large: com.example.data.network.models.anime.Large
)