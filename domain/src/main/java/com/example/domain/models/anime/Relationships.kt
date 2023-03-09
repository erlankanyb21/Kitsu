package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("genres")
    val genres: com.example.data.network.models.anime.Genres,
    @SerializedName("categories")
    val categories: com.example.data.network.models.anime.Categories,
    @SerializedName("castings")
    val castings: com.example.data.network.models.anime.Castings,
    @SerializedName("installments")
    val installments: com.example.data.network.models.anime.Installments,
    @SerializedName("mappings")
    val mappings: com.example.data.network.models.anime.Mappings,
    @SerializedName("reviews")
    val reviews: com.example.data.network.models.anime.Reviews,
    @SerializedName("mediaRelationships")
    val mediaRelationships: com.example.data.network.models.anime.MediaRelationships,
    @SerializedName("episodes")
    val episodes: com.example.data.network.models.anime.Episodes,
    @SerializedName("streamingLinks")
    val streamingLinks: com.example.data.network.models.anime.StreamingLinks,
    @SerializedName("animeProductions")
    val animeProductions: com.example.data.network.models.anime.AnimeProductions,
    @SerializedName("animeCharacters")
    val animeCharacters: com.example.data.network.models.anime.AnimeCharacters,
    @SerializedName("animeStaff")
    val animeStaff: com.example.data.network.models.anime.AnimeStaff
)