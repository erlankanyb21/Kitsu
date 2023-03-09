package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("links")
    val links: com.example.data.network.models.anime.Links,
    @SerializedName("attributes")
    val attributes: com.example.data.network.models.anime.Attributes,
    @SerializedName("relationships")
    val relationships: com.example.data.network.models.anime.Relationships
)