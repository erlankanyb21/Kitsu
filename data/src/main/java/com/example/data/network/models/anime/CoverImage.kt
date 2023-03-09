package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class CoverImage(
    @SerializedName("tiny")
    val tiny: String,
    @SerializedName("small")
    val small: String,
    @SerializedName("large")
    val large: String,
    @SerializedName("original")
    val original: String,
    @SerializedName("meta")
    val meta: MetaX
)