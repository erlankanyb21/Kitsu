package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class TinyDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)