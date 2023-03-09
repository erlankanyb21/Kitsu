package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class MediumDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)