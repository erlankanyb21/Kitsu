package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("synopsis")
    val synopsis: String,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int,
    @SerializedName("titles")
    val titles: com.example.data.network.models.anime.Titles,
    @SerializedName("canonicalTitle")
    val canonicalTitle: String,
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: List<String>,
    @SerializedName("averageRating")
    val averageRating: String,
    @SerializedName("ratingFrequencies")
    val ratingFrequencies: com.example.data.network.models.anime.RatingFrequencies,
    @SerializedName("userCount")
    val userCount: Int,
    @SerializedName("favoritesCount")
    val favoritesCount: Int,
    @SerializedName("startDate")
    val startDate: String,
    @SerializedName("endDate")
    val endDate: String,
    @SerializedName("popularityRank")
    val popularityRank: Int,
    @SerializedName("ratingRank")
    val ratingRank: Int,
    @SerializedName("ageRating")
    val ageRating: String,
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String,
    @SerializedName("subtype")
    val subtype: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("tba")
    val tba: String,
    @SerializedName("posterImage")
    val posterImage: com.example.data.network.models.anime.PosterImage,
    @SerializedName("coverImage")
    val coverImage: com.example.data.network.models.anime.CoverImage,
    @SerializedName("episodeCount")
    val episodeCount: Int,
    @SerializedName("episodeLength")
    val episodeLength: Int,
    @SerializedName("youtubeVideoId")
    val youtubeVideoId: String,
    @SerializedName("showType")
    val showType: String,
    @SerializedName("nsfw")
    val nsfw: Boolean
)