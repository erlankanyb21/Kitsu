package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class AnimeEntity(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("meta")
    val meta: MetaXX,
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXX
)