package com.example.kitsu.presentation.models

import com.example.domain.models.MangaModel

data class MangaUI(
    val `data`: List<Data>? = listOf(),
    val links: Links? = Links(),
    val meta: Meta? = Meta()
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
            val ageRating: String? = null,
            val ageRatingGuide: Any? = null,
            val averageRating: String? = null,
            val canonicalTitle: String? = "",
            val chapterCount: Int? = null,
            val coverImage: Any? = null,
            val coverImageTopOffset: Int? = 0,
            val createdAt: String? = "",
            val description: String? = "",
            val endDate: String? = null,
            val favoritesCount: Int? = 0,
            val mangaType: String? = "",
            val nextRelease: Any? = null,
            val popularityRank: Int? = 0,
            val posterImage: PosterImage? = PosterImage(),
            val ratingFrequencies: RatingFrequencies? = RatingFrequencies(),
            val ratingRank: Int? = null,
            val serialization: String? = "",
            val slug: String? = "",
            val startDate: String? = "",
            val status: String? = "",
            val subtype: String? = "",
            val synopsis: String? = "",
            val tba: Any? = null,
            val titles: Titles? = Titles(),
            val updatedAt: String? = "",
            val userCount: Int? = 0,
            val volumeCount: Int? = 0
        ) {
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
                            val height: Int? = 0,
                            val width: Int? = 0
                        )

                        data class Medium(
                            val height: Int? = 0,
                            val width: Int? = 0
                        )

                        data class Small(
                            val height: Int? = 0,
                            val width: Int? = 0
                        )

                        data class Tiny(
                            val height: Int? = 0,
                            val width: Int? = 0
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
                val en_us: String? = "",
                val ja_jp: String? = null
            )
        }

        data class Links(
            val self: String? = ""
        )

        data class Relationships(
            val castings: Castings? = Castings(),
            val categories: Categories? = Categories(),
            val chapters: Chapters? = Chapters(),
            val characters: Characters? = Characters(),
            val genres: Genres? = Genres(),
            val installments: Installments? = Installments(),
            val mangaCharacters: MangaCharacters? = MangaCharacters(),
            val mangaStaff: MangaStaff? = MangaStaff(),
            val mappings: Mappings? = Mappings(),
            val mediaRelationships: MediaRelationships? = MediaRelationships(),
            val productions: Productions? = Productions(),
            val quotes: Quotes? = Quotes(),
            val reviews: Reviews? = Reviews(),
            val staff: Staff? = Staff()
        ) {
            data class Castings(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Categories(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Chapters(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Characters(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Genres(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Installments(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class MangaCharacters(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class MangaStaff(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Mappings(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class MediaRelationships(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Productions(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Quotes(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Reviews(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Staff(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }
        }
    }

    data class Links(
        val first: String? = "",
        val last: String? = "",
        val next: String? = ""
    )

    data class Meta(
        val count: Int? = 0
    )
}

fun MangaModel.toUI() = MangaUI(
    data = data?.map { it.toUI() }, meta = meta?.toUI(), links = links?.toUI()
)

fun MangaModel.Data.toUI() = MangaUI.Data(
    attributes = attributes?.toUI(),
    id = id,
    links = links?.toUI(),
    relationships = relationships?.toUI(),
    type = type
)

fun MangaModel.Meta.toUI() = MangaUI.Meta(
    count = count
)

fun MangaModel.Links.toUI() = MangaUI.Links(
    first = first, last = last, next = next
)

fun MangaModel.Data.Relationships.toUI() = MangaUI.Data.Relationships(
    castings = castings?.toUI(),
    categories = categories?.toUI(),
    chapters = chapters?.toUI(),
    characters = characters?.toUI(),
    genres = genres?.toUI(),
    installments = installments?.toUI(),
    mangaCharacters = mangaCharacters?.toUI(),
    mangaStaff = mangaStaff?.toUI(),
    mappings = mappings?.toUI(),
    mediaRelationships = mediaRelationships?.toUI(),
    productions = productions?.toUI(),
    quotes = quotes?.toUI(),
    reviews = reviews?.toUI(),
    staff = staff?.toUI()
)

fun MangaModel.Data.Relationships.Staff.toUI() = MangaUI.Data.Relationships.Staff(
    links = links?.toUI()
)

fun MangaModel.Data.Relationships.Staff.Links.toUI() = MangaUI.Data.Relationships.Staff.Links(
    related = related, self = self
)

fun MangaModel.Data.Relationships.Reviews.toUI() = MangaUI.Data.Relationships.Reviews(
    links = links?.toUI()
)

fun MangaModel.Data.Relationships.Reviews.Links.toUI() =
    MangaUI.Data.Relationships.Reviews.Links(
        self = self, related = related
    )

fun MangaModel.Data.Relationships.Quotes.toUI() = MangaUI.Data.Relationships.Quotes(
    links = links?.toUI()
)

fun MangaModel.Data.Relationships.Quotes.Links.toUI() =
    MangaUI.Data.Relationships.Quotes.Links(
        self = self, related = related
    )

fun MangaModel.Data.Relationships.Productions.toUI() = MangaUI.Data.Relationships.Productions(
    links = links?.toUI()
)

fun MangaModel.Data.Relationships.Productions.Links.toUI() =
    MangaUI.Data.Relationships.Productions.Links(
        self = self, related = related
    )

fun MangaModel.Data.Relationships.MediaRelationships.toUI() =
    MangaUI.Data.Relationships.MediaRelationships(
        links = links?.toUI()
    )

fun MangaModel.Data.Relationships.MediaRelationships.Links.toUI() =
    MangaUI.Data.Relationships.MediaRelationships.Links(
        self = self, related = related
    )

fun MangaModel.Data.Relationships.Mappings.toUI() = MangaUI.Data.Relationships.Mappings(
    links = links?.toUI()
)

fun MangaModel.Data.Relationships.Mappings.Links.toUI() =
    MangaUI.Data.Relationships.Mappings.Links(
        self = self, related = related
    )

fun MangaModel.Data.Relationships.MangaStaff.toUI() = MangaUI.Data.Relationships.MangaStaff(
    links = links?.toUI()
)

fun MangaModel.Data.Relationships.MangaStaff.Links.toUI() =
    MangaUI.Data.Relationships.MangaStaff.Links(
        self = self, related = related
    )

fun MangaModel.Data.Relationships.Castings.toUI() = MangaUI.Data.Relationships.Castings(
    links = links?.toUI()
)

fun MangaModel.Data.Relationships.Castings.Links.toUI() =
    MangaUI.Data.Relationships.Castings.Links(
        self = self, related = related
    )

fun MangaModel.Data.Relationships.Categories.toUI() = MangaUI.Data.Relationships.Categories(
    links = links?.toUI()
)

fun MangaModel.Data.Relationships.Categories.Links.toUI() =
    MangaUI.Data.Relationships.Categories.Links(
        self = self, related = related
    )

fun MangaModel.Data.Relationships.Chapters.toUI() = MangaUI.Data.Relationships.Chapters(
    links = links?.toUI()
)

fun MangaModel.Data.Relationships.Chapters.Links.toUI() =
    MangaUI.Data.Relationships.Chapters.Links(
        self = self, related = related
    )

fun MangaModel.Data.Relationships.Characters.toUI() = MangaUI.Data.Relationships.Characters(
    links = links?.toUI()
)

fun MangaModel.Data.Relationships.Characters.Links.toUI() =
    MangaUI.Data.Relationships.Characters.Links(
        self = self, related = related
    )

fun MangaModel.Data.Relationships.Genres.toUI() = MangaUI.Data.Relationships.Genres(
    links = links?.toUI()
)

fun MangaModel.Data.Relationships.Genres.Links.toUI() =
    MangaUI.Data.Relationships.Genres.Links(
        self = self, related = related
    )

fun MangaModel.Data.Relationships.Installments.toUI() =
    MangaUI.Data.Relationships.Installments(
        links = links?.toUI()
    )

fun MangaModel.Data.Relationships.Installments.Links.toUI() =
    MangaUI.Data.Relationships.Installments.Links(
        self = self, related = related
    )

fun MangaModel.Data.Relationships.MangaCharacters.toUI() =
    MangaUI.Data.Relationships.MangaCharacters(
        links = links?.toUI()
    )

fun MangaModel.Data.Relationships.MangaCharacters.Links.toUI() =
    MangaUI.Data.Relationships.MangaCharacters.Links(
        self = self, related = related
    )

fun MangaModel.Data.Links.toUI() = MangaUI.Data.Links(
    self = self
)

fun MangaModel.Data.Attributes.toUI() = MangaUI.Data.Attributes(
    abbreviatedTitles = abbreviatedTitles,
    ageRating = ageRating,
    ageRatingGuide = ageRatingGuide,
    averageRating = averageRating,
    canonicalTitle = canonicalTitle,
    chapterCount = chapterCount,
    coverImage = coverImage,
    coverImageTopOffset = coverImageTopOffset,
    createdAt = createdAt,
    description = description,
    endDate = endDate,
    favoritesCount = favoritesCount,
    mangaType = mangaType,
    nextRelease = nextRelease,
    popularityRank = popularityRank,
    posterImage = posterImage?.toUI(),
    ratingFrequencies = ratingFrequencies?.toUI(),
    ratingRank = ratingRank,
    serialization = serialization,
    slug = slug,
    startDate = startDate,
    status = status,
    subtype = subtype,
    synopsis = synopsis,
    tba = tba,
    titles = titles?.toUI(),
    updatedAt = updatedAt,
    userCount = userCount,
    volumeCount = volumeCount
)

fun MangaModel.Data.Attributes.Titles.toUI() = MangaUI.Data.Attributes.Titles(
    en = en,
    en_jp = en_jp,
    en_us = en_us,
    ja_jp = ja_jp
)

fun MangaModel.Data.Attributes.RatingFrequencies.toUI() = MangaUI.Data.Attributes.RatingFrequencies(
    x2 = x2,
    x3 = x3,
    x4 = x4,
    x5 = x5,
    x6 = x6,
    x7 = x7,
    x8 = x8,
    x9 = x9,
    x10 = x10,
    x11 = x11,
    x12 = x12,
    x13 = x13,
    x14 = x14,
    x15 = x15,
    x16 = x16,
    x17 = x17,
    x18 = x18,
    x19 = x19,
    x20 = x20,
)

fun MangaModel.Data.Attributes.PosterImage.toUI() = MangaUI.Data.Attributes.PosterImage(
    large = tiny,
    medium = medium,
    meta = meta?.toUI(),
    small = small,
    original = original,
    tiny = tiny
)

fun MangaModel.Data.Attributes.PosterImage.Meta.toUI() = MangaUI.Data.Attributes.PosterImage.Meta(
    dimensions = dimensions?.toUI()
)

fun MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.toUI() =
    MangaUI.Data.Attributes.PosterImage.Meta.Dimensions(
        large = large?.toUI(),
        medium = medium?.toUI(),
        small = small?.toUI(),
        tiny = tiny?.toUI()
    )

fun MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Large.toUI() =
    MangaUI.Data.Attributes.PosterImage.Meta.Dimensions.Large(
        height = height,
        width = width
    )

fun MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Medium.toUI() =
    MangaUI.Data.Attributes.PosterImage.Meta.Dimensions.Medium(
        height = height,
        width = width
    )

fun MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Small.toUI() =
    MangaUI.Data.Attributes.PosterImage.Meta.Dimensions.Small(
        height = height,
        width = width
    )

fun MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Tiny.toUI() =
    MangaUI.Data.Attributes.PosterImage.Meta.Dimensions.Tiny(
        height = height,
        width = width
    )