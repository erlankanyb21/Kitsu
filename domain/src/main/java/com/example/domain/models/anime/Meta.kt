package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("dimensions")
    val dimensions: com.example.data.network.models.anime.Dimensions
)