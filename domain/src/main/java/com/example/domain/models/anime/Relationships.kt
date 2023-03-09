package com.example.domain.models.anime

data class Relationships(
    val genres: Genres,
    val categories: Categories,
    val castings: Castings,
    val installments: Installments,
    val mappings: Mappings,
    val reviews: Reviews,
    val mediaRelationships: MediaRelationships,
    val episodes: Episodes,
    val streamingLinks: StreamingLinks,
    val animeProductions: AnimeProductions,
    val animeCharacters: AnimeCharacters,
    val animeStaff: AnimeStaff
)