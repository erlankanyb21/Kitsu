package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class AnimeCharactersDto(
    @SerializedName("links")
    val links: LinksXDto
)