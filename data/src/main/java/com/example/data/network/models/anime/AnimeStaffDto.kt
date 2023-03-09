package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class AnimeStaffDto(
    @SerializedName("links")
    val links: LinksXDto
)