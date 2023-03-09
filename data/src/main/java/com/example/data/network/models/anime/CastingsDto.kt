package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class CastingsDto(
    @SerializedName("links")
    val links: LinksXDto
)