package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class AnimeEntity(
    @SerializedName("data")
    val `data`: List<com.example.data.network.models.anime.Data>,
    @SerializedName("meta")
    val meta: com.example.data.network.models.anime.MetaXX,
    @SerializedName("links")
    val links: com.example.data.network.models.anime.LinksXXXXXXXXXXXXX
)