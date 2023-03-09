package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class LinksXDto(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)