package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class AnimeEntityDto(
    @SerializedName("data")
    val `data`: List<DataDto>,
    @SerializedName("meta")
    val meta: MetaXXDto,
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXXDto
)