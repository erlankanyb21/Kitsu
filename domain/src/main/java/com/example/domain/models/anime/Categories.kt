package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class Categories(
    @SerializedName("links")
    val links: com.example.data.network.models.anime.LinksX
)