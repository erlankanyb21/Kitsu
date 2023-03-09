package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class SmallDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)