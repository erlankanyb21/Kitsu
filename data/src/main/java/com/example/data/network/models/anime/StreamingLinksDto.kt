package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class StreamingLinksDto(
    @SerializedName("links")
    val links: LinksXDto
)