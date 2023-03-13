package com.example.data.network.models.manga


import com.google.gson.annotations.SerializedName

data class MangaDto(
    @SerializedName("data")
    val `data`: List<Data> = listOf(),
    @SerializedName("links")
    val links: Links = Links(),
    @SerializedName("meta")
    val meta: Meta = Meta()
) {
    data class Data(
        @SerializedName("attributes")
        val attributes: Attributes = Attributes(),
        @SerializedName("id")
        val id: String = "",
        @SerializedName("links")
        val links: Links = Links(),
        @SerializedName("relationships")
        val relationships: Relationships = Relationships(),
        @SerializedName("type")
        val type: String = ""
    ) {
        data class Attributes(
            @SerializedName("abbreviatedTitles")
            val abbreviatedTitles: List<String> = listOf(),
            @SerializedName("ageRating")
            val ageRating: String? = null,
            @SerializedName("ageRatingGuide")
            val ageRatingGuide: Any? = null,
            @SerializedName("averageRating")
            val averageRating: String? = null,
            @SerializedName("canonicalTitle")
            val canonicalTitle: String = "",
            @SerializedName("chapterCount")
            val chapterCount: Int? = null,
            @SerializedName("coverImage")
            val coverImage: Any? = null,
            @SerializedName("coverImageTopOffset")
            val coverImageTopOffset: Int = 0,
            @SerializedName("createdAt")
            val createdAt: String = "",
            @SerializedName("description")
            val description: String = "",
            @SerializedName("endDate")
            val endDate: String? = null,
            @SerializedName("favoritesCount")
            val favoritesCount: Int = 0,
            @SerializedName("mangaType")
            val mangaType: String = "",
            @SerializedName("nextRelease")
            val nextRelease: Any? = null,
            @SerializedName("popularityRank")
            val popularityRank: Int = 0,
            @SerializedName("posterImage")
            val posterImage: PosterImage = PosterImage(),
            @SerializedName("ratingFrequencies")
            val ratingFrequencies: RatingFrequencies = RatingFrequencies(),
            @SerializedName("ratingRank")
            val ratingRank: Int? = null,
            @SerializedName("serialization")
            val serialization: String = "",
            @SerializedName("slug")
            val slug: String = "",
            @SerializedName("startDate")
            val startDate: String = "",
            @SerializedName("status")
            val status: String = "",
            @SerializedName("subtype")
            val subtype: String = "",
            @SerializedName("synopsis")
            val synopsis: String = "",
            @SerializedName("tba")
            val tba: Any? = null,
            @SerializedName("titles")
            val titles: Titles = Titles(),
            @SerializedName("updatedAt")
            val updatedAt: String = "",
            @SerializedName("userCount")
            val userCount: Int = 0,
            @SerializedName("volumeCount")
            val volumeCount: Int = 0
        ) {
            data class PosterImage(
                @SerializedName("large")
                val large: String = "",
                @SerializedName("medium")
                val medium: String = "",
                @SerializedName("meta")
                val meta: Meta = Meta(),
                @SerializedName("original")
                val original: String = "",
                @SerializedName("small")
                val small: String = "",
                @SerializedName("tiny")
                val tiny: String = ""
            ) {
                data class Meta(
                    @SerializedName("dimensions")
                    val dimensions: Dimensions = Dimensions()
                ) {
                    data class Dimensions(
                        @SerializedName("large")
                        val large: Large = Large(),
                        @SerializedName("medium")
                        val medium: Medium = Medium(),
                        @SerializedName("small")
                        val small: Small = Small(),
                        @SerializedName("tiny")
                        val tiny: Tiny = Tiny()
                    ) {
                        data class Large(
                            @SerializedName("height")
                            val height: Int = 0,
                            @SerializedName("width")
                            val width: Int = 0
                        )

                        data class Medium(
                            @SerializedName("height")
                            val height: Int = 0,
                            @SerializedName("width")
                            val width: Int = 0
                        )

                        data class Small(
                            @SerializedName("height")
                            val height: Int = 0,
                            @SerializedName("width")
                            val width: Int = 0
                        )

                        data class Tiny(
                            @SerializedName("height")
                            val height: Int = 0,
                            @SerializedName("width")
                            val width: Int = 0
                        )
                    }
                }
            }

            data class RatingFrequencies(
                @SerializedName("10")
                val x10: String = "",
                @SerializedName("11")
                val x11: String = "",
                @SerializedName("12")
                val x12: String = "",
                @SerializedName("13")
                val x13: String = "",
                @SerializedName("14")
                val x14: String = "",
                @SerializedName("15")
                val x15: String = "",
                @SerializedName("16")
                val x16: String = "",
                @SerializedName("17")
                val x17: String = "",
                @SerializedName("18")
                val x18: String = "",
                @SerializedName("19")
                val x19: String = "",
                @SerializedName("2")
                val x2: String = "",
                @SerializedName("20")
                val x20: String = "",
                @SerializedName("3")
                val x3: String = "",
                @SerializedName("4")
                val x4: String = "",
                @SerializedName("5")
                val x5: String = "",
                @SerializedName("6")
                val x6: String = "",
                @SerializedName("7")
                val x7: String = "",
                @SerializedName("8")
                val x8: String = "",
                @SerializedName("9")
                val x9: String = ""
            )

            data class Titles(
                @SerializedName("en")
                val en: String? = null,
                @SerializedName("en_jp")
                val enJp: String = "",
                @SerializedName("en_us")
                val enUs: String = "",
                @SerializedName("ja_jp")
                val jaJp: String? = null
            )
        }

        data class Links(
            @SerializedName("self")
            val self: String = ""
        )

        data class Relationships(
            @SerializedName("castings")
            val castings: Castings = Castings(),
            @SerializedName("categories")
            val categories: Categories = Categories(),
            @SerializedName("chapters")
            val chapters: Chapters = Chapters(),
            @SerializedName("characters")
            val characters: Characters = Characters(),
            @SerializedName("genres")
            val genres: Genres = Genres(),
            @SerializedName("installments")
            val installments: Installments = Installments(),
            @SerializedName("mangaCharacters")
            val mangaCharacters: MangaCharacters = MangaCharacters(),
            @SerializedName("mangaStaff")
            val mangaStaff: MangaStaff = MangaStaff(),
            @SerializedName("mappings")
            val mappings: Mappings = Mappings(),
            @SerializedName("mediaRelationships")
            val mediaRelationships: MediaRelationships = MediaRelationships(),
            @SerializedName("productions")
            val productions: Productions = Productions(),
            @SerializedName("quotes")
            val quotes: Quotes = Quotes(),
            @SerializedName("reviews")
            val reviews: Reviews = Reviews(),
            @SerializedName("staff")
            val staff: Staff = Staff()
        ) {
            data class Castings(
                @SerializedName("links")
                val links: Links = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String = "",
                    @SerializedName("self")
                    val self: String = ""
                )
            }

            data class Categories(
                @SerializedName("links")
                val links: Links = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String = "",
                    @SerializedName("self")
                    val self: String = ""
                )
            }

            data class Chapters(
                @SerializedName("links")
                val links: Links = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String = "",
                    @SerializedName("self")
                    val self: String = ""
                )
            }

            data class Characters(
                @SerializedName("links")
                val links: Links = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String = "",
                    @SerializedName("self")
                    val self: String = ""
                )
            }

            data class Genres(
                @SerializedName("links")
                val links: Links = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String = "",
                    @SerializedName("self")
                    val self: String = ""
                )
            }

            data class Installments(
                @SerializedName("links")
                val links: Links = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String = "",
                    @SerializedName("self")
                    val self: String = ""
                )
            }

            data class MangaCharacters(
                @SerializedName("links")
                val links: Links = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String = "",
                    @SerializedName("self")
                    val self: String = ""
                )
            }

            data class MangaStaff(
                @SerializedName("links")
                val links: Links = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String = "",
                    @SerializedName("self")
                    val self: String = ""
                )
            }

            data class Mappings(
                @SerializedName("links")
                val links: Links = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String = "",
                    @SerializedName("self")
                    val self: String = ""
                )
            }

            data class MediaRelationships(
                @SerializedName("links")
                val links: Links = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String = "",
                    @SerializedName("self")
                    val self: String = ""
                )
            }

            data class Productions(
                @SerializedName("links")
                val links: Links = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String = "",
                    @SerializedName("self")
                    val self: String = ""
                )
            }

            data class Quotes(
                @SerializedName("links")
                val links: Links = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String = "",
                    @SerializedName("self")
                    val self: String = ""
                )
            }

            data class Reviews(
                @SerializedName("links")
                val links: Links = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String = "",
                    @SerializedName("self")
                    val self: String = ""
                )
            }

            data class Staff(
                @SerializedName("links")
                val links: Links = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String = "",
                    @SerializedName("self")
                    val self: String = ""
                )
            }
        }
    }

    data class Links(
        @SerializedName("first")
        val first: String = "",
        @SerializedName("last")
        val last: String = "",
        @SerializedName("next")
        val next: String = ""
    )

    data class Meta(
        @SerializedName("count")
        val count: Int = 0
    )
}