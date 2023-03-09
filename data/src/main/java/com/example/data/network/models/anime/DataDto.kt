package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class DataDto(
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("links")
    val links: LinksDto,
    @SerializedName("attributes")
    val attributes: AttributesDto,
    @SerializedName("relationships")
    val relationshipsDto: RelationshipsDto
)