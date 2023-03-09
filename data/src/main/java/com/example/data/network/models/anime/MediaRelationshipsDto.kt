package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class MediaRelationshipsDto(
    @SerializedName("links")
    val links: LinksXDto
)