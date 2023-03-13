package com.example.kitsu.presentation.models.anime


data class AnimeUI(
    val `data`: List<Data>? = listOf(), val links: Links? = Links(), val meta: Meta? = Meta()
) {

    data class Data(
        val attributes: Attributes? = Attributes(),
        val id: String? = "",
        val links: Links? = Links(),
        val relationships: Relationships? = Relationships(),
        val type: String? = ""
    ) {
        data class Attributes(
            val abbreviatedTitles: List<String>? = listOf(),
            val ageRating: String? = "",
            val ageRatingGuide: String? = "",
            val averageRating: String? = "",
            val canonicalTitle: String? = "",
            val coverImage: CoverImage? = null,
            val coverImageTopOffset: Int? = 0,
            val createdAt: String? = "",
            val description: String? = "",
            val endDate: String? = "",
            val episodeCount: Int? = 0,
            val episodeLength: Int? = null,
            val favoritesCount: Int? = 0,
            val nextRelease: Any? = null,
            val nsfw: Boolean? = false,
            val popularityRank: Int? = 0,
            val posterImage: PosterImage? = PosterImage(),
            val ratingFrequencies: RatingFrequencies? = RatingFrequencies(),
            val ratingRank: Int? = 0,
            val showType: String? = "",
            val slug: String? = "",
            val startDate: String? = "",
            val status: String? = "",
            val subtype: String? = "",
            val synopsis: String? = "",
            val tba: String? = null,
            val titles: Titles? = Titles(),
            val totalLength: Int? = 0,
            val updatedAt: String? = "",
            val userCount: Int? = 0,
            val youtubeVideoId: String? = ""
        ) {
            data class CoverImage(
                val large: String? = "",
                val meta: Meta? = Meta(),
                val original: String? = "",
                val small: String? = "",
                val tiny: String? = ""
            ) {
                data class Meta(
                    val dimensions: Dimensions? = Dimensions()
                ) {
                    data class Dimensions(
                        val large: Large? = Large(),
                        val small: Small? = Small(),
                        val tiny: Tiny? = Tiny()
                    ) {
                        data class Large(
                            val height: Int? = 0, val width: Int? = 0
                        )

                        data class Small(
                            val height: Int? = 0, val width: Int? = 0
                        )

                        data class Tiny(
                            val height: Int? = 0, val width: Int? = 0
                        )
                    }
                }
            }

            data class PosterImage(
                val large: String? = "",
                val medium: String? = "",
                val meta: Meta? = Meta(),
                val original: String? = "",
                val small: String? = "",
                val tiny: String? = ""
            ) {
                data class Meta(
                    val dimensions: Dimensions? = Dimensions()
                ) {
                    data class Dimensions(
                        val large: Large? = Large(),
                        val medium: Medium? = Medium(),
                        val small: Small? = Small(),
                        val tiny: Tiny? = Tiny()
                    ) {
                        data class Large(
                            val height: Int? = 0, val width: Int? = 0
                        )

                        data class Medium(
                            val height: Int? = 0, val width: Int? = 0
                        )

                        data class Small(
                            val height: Int? = 0, val width: Int? = 0
                        )

                        data class Tiny(
                            val height: Int? = 0, val width: Int? = 0
                        )
                    }
                }
            }

            data class RatingFrequencies(
                val x10: String? = "",

                val x11: String? = "",

                val x12: String? = "",

                val x13: String? = "",

                val x14: String? = "",

                val x15: String? = "",

                val x16: String? = "",

                val x17: String? = "",

                val x18: String? = "",

                val x19: String? = "",

                val x2: String? = "",

                val x20: String? = "",

                val x3: String? = "",

                val x4: String? = "",

                val x5: String? = "",

                val x6: String? = "",

                val x7: String? = "",

                val x8: String? = "",

                val x9: String? = ""
            )

            data class Titles(
                val en: String? = null,
                val en_jp: String? = "",
                val en_us: String? = null,
                val ja_jp: String? = ""
            )
        }

        data class Links(
            val self: String? = ""
        )

        data class Relationships(
            val animeCharacters: AnimeCharacters? = AnimeCharacters(),
            val animeProductions: AnimeProductions? = AnimeProductions(),
            val animeStaff: AnimeStaff? = AnimeStaff(),
            val castings: Castings? = Castings(),
            val categories: Categories? = Categories(),
            val characters: Characters? = Characters(),
            val episodes: Episodes? = Episodes(),
            val genres: Genres? = Genres(),
            val installments: Installments? = Installments(),
            val mappings: Mappings? = Mappings(),
            val mediaRelationships: MediaRelationships? = MediaRelationships(),
            val productions: Productions? = Productions(),
            val quotes: Quotes? = Quotes(),
            val reviews: Reviews? = Reviews(),
            val staff: Staff? = Staff(),
            val streamingLinks: StreamingLinks? = StreamingLinks()
        ) {
            data class AnimeCharacters(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }

            data class AnimeProductions(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }

            data class AnimeStaff(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }

            data class Castings(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }

            data class Categories(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }

            data class Characters(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }

            data class Episodes(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }

            data class Genres(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }

            data class Installments(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }

            data class Mappings(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }

            data class MediaRelationships(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }

            data class Productions(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }

            data class Quotes(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }

            data class Reviews(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }

            data class Staff(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }

            data class StreamingLinks(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "", val self: String? = ""
                )
            }
        }
    }

    data class Links(
        val first: String? = "", val last: String? = "", val next: String? = ""
    )

    data class Meta(
        val count: Int? = 0
    )
}