package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXXX(
    @SerializedName("first")
    val first: String,
    @SerializedName("prev")
    val prev: String,
    @SerializedName("next")
    val next: String,
    @SerializedName("last")
    val last: String
)