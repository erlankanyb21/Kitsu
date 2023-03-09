package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class TitlesDto(
    @SerializedName("en")
    val en: String,
    @SerializedName("en_jp")
    val enJp: String,
    @SerializedName("ja_jp")
    val jaJp: String
)