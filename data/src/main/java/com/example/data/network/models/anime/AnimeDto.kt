package com.example.data.network.models.anime

data class AnimeDto(
    val `data`: List<Data>,
    val meta: Meta,
    val links: Links
) {
    data class Data(
        val id: String,
        val type: String,
        val links: Links,
        val attributes: Attributes,
        val relationships: Relationships
    ) {
        data class Links(
            val self: String
        )

        data class Attributes(
            val createdAt: String,
            val updatedAt: String,
            val slug: String,
            val synopsis: String,
            val description: String,
            val coverImageTopOffset: Int,
            val titles: Titles,
            val canonicalTitle: String,
            val abbreviatedTitles: List<String>,
            val averageRating: String,
            val ratingFrequencies: RatingFrequencies,
            val userCount: Int,
            val favoritesCount: Int,
            val startDate: String,
            val endDate: String,
            val nextRelease: Any?,
            val popularityRank: Int,
            val ratingRank: Int,
            val ageRating: String,
            val ageRatingGuide: String,
            val subtype: String,
            val status: String,
            val tba: String?,
            val posterImage: PosterImage,
            val coverImage: CoverImage?,
            val episodeCount: Int,
            val episodeLength: Int?,
            val totalLength: Int,
            val youtubeVideoId: String,
            val showType: String,
            val nsfw: Boolean
        ) {
            data class Titles(
                val en: String?,
                val en_jp: String,
                val ja_jp: String,
                val en_us: String?
            )

            data class RatingFrequencies(
                val `2`: String,
                val `3`: String,
                val `4`: String,
                val `5`: String,
                val `6`: String,
                val `7`: String,
                val `8`: String,
                val `9`: String,
                val `10`: String,
                val `11`: String,
                val `12`: String,
                val `13`: String,
                val `14`: String,
                val `15`: String,
                val `16`: String,
                val `17`: String,
                val `18`: String,
                val `19`: String,
                val `20`: String
            )

            data class PosterImage(
                val tiny: String,
                val large: String,
                val small: String,
                val medium: String,
                val original: String,
                val meta: Meta
            ) {
                data class Meta(
                    val dimensions: Dimensions
                ) {
                    data class Dimensions(
                        val tiny: Tiny,
                        val large: Large,
                        val small: Small,
                        val medium: Medium
                    ) {
                        data class Tiny(
                            val width: Int,
                            val height: Int
                        )

                        data class Large(
                            val width: Int,
                            val height: Int
                        )

                        data class Small(
                            val width: Int,
                            val height: Int
                        )

                        data class Medium(
                            val width: Int,
                            val height: Int
                        )
                    }
                }
            }

            data class CoverImage(
                val tiny: String,
                val large: String,
                val small: String,
                val original: String,
                val meta: Meta
            ) {
                data class Meta(
                    val dimensions: Dimensions
                ) {
                    data class Dimensions(
                        val tiny: Tiny,
                        val large: Large,
                        val small: Small
                    ) {
                        data class Tiny(
                            val width: Int,
                            val height: Int
                        )

                        data class Large(
                            val width: Int,
                            val height: Int
                        )

                        data class Small(
                            val width: Int,
                            val height: Int
                        )
                    }
                }
            }
        }

        data class Relationships(
            val genres: Genres,
            val categories: Categories,
            val castings: Castings,
            val installments: Installments,
            val mappings: Mappings,
            val reviews: Reviews,
            val mediaRelationships: MediaRelationships,
            val characters: Characters,
            val staff: Staff,
            val productions: Productions,
            val quotes: Quotes,
            val episodes: Episodes,
            val streamingLinks: StreamingLinks,
            val animeProductions: AnimeProductions,
            val animeCharacters: AnimeCharacters,
            val animeStaff: AnimeStaff
        ) {
            data class Genres(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }

            data class Categories(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }

            data class Castings(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }

            data class Installments(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }

            data class Mappings(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }

            data class Reviews(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }

            data class MediaRelationships(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }

            data class Characters(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }

            data class Staff(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }

            data class Productions(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }

            data class Quotes(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }

            data class Episodes(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }

            data class StreamingLinks(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }

            data class AnimeProductions(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }

            data class AnimeCharacters(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }

            data class AnimeStaff(
                val links: Links
            ) {
                data class Links(
                    val self: String,
                    val related: String
                )
            }
        }
    }

    data class Meta(
        val count: Int
    )

    data class Links(
        val first: String,
        val next: String,
        val last: String
    )
}