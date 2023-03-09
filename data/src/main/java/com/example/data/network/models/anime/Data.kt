package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("links")
    val links: Links,
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("relationships")
    val relationships: Relationships
)