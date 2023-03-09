package com.example.data.network.models.anime


import com.google.gson.annotations.SerializedName

data class RelationshipsDto(
    @SerializedName("genres")
    val genres: GenresDto,
    @SerializedName("categories")
    val categories: CategoriesDto,
    @SerializedName("castings")
    val castings: CastingsDto,
    @SerializedName("installments")
    val installments: InstallmentsDto,
    @SerializedName("mappings")
    val mappings: MappingsDto,
    @SerializedName("reviews")
    val reviewsDto: ReviewsDto,
    @SerializedName("mediaRelationships")
    val mediaRelationships: MediaRelationshipsDto,
    @SerializedName("episodes")
    val episodes: EpisodesDto,
    @SerializedName("streamingLinks")
    val streamingLinksDto: StreamingLinksDto,
    @SerializedName("animeProductions")
    val animeProductions: AnimeProductionsDto,
    @SerializedName("animeCharacters")
    val animeCharacters: AnimeCharactersDto,
    @SerializedName("animeStaff")
    val animeStaff: AnimeStaffDto
)