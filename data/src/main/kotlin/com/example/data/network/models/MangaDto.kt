package com.example.data.network.models


import com.example.domain.models.MangaModel
import com.google.gson.annotations.SerializedName

data class MangaDto(
    @SerializedName("data") val `data`: List<Data>? = listOf(),
    @SerializedName("links") val links: Links? = Links(),
    @SerializedName("meta") val meta: Meta? = Meta()
) {
    data class Data(
        @SerializedName("attributes") val attributes: Attributes? = Attributes(),
        @SerializedName("id") val id: String? = "",
        @SerializedName("links") val links: Links? = Links(),
        @SerializedName("relationships") val relationships: Relationships? = Relationships(),
        @SerializedName("type") val type: String? = ""
    ) {
        data class Attributes(
            @SerializedName("abbreviatedTitles") val abbreviatedTitles: List<String>? = listOf(),
            @SerializedName("ageRating") val ageRating: String? = null,
            @SerializedName("ageRatingGuide") val ageRatingGuide: Any? = null,
            @SerializedName("averageRating") val averageRating: String? = null,
            @SerializedName("canonicalTitle") val canonicalTitle: String? = "",
            @SerializedName("chapterCount") val chapterCount: Int? = null,
            @SerializedName("coverImage") val coverImage: Any? = null,
            @SerializedName("coverImageTopOffset") val coverImageTopOffset: Int? = 0,
            @SerializedName("createdAt") val createdAt: String? = "",
            @SerializedName("description") val description: String? = "",
            @SerializedName("endDate") val endDate: String? = null,
            @SerializedName("favoritesCount") val favoritesCount: Int? = 0,
            @SerializedName("mangaType") val mangaType: String = "",
            @SerializedName("nextRelease") val nextRelease: Any? = null,
            @SerializedName("popularityRank") val popularityRank: Int? = 0,
            @SerializedName("posterImage") val posterImage: PosterImage? = PosterImage(),
            @SerializedName("ratingFrequencies") val ratingFrequencies: RatingFrequencies? = RatingFrequencies(),
            @SerializedName("ratingRank") val ratingRank: Int? = null,
            @SerializedName("serialization") val serialization: String? = "",
            @SerializedName("slug") val slug: String? = "",
            @SerializedName("startDate") val startDate: String? = "",
            @SerializedName("status") val status: String? = "",
            @SerializedName("subtype") val subtype: String? = "",
            @SerializedName("synopsis") val synopsis: String? = "",
            @SerializedName("tba") val tba: Any? = null,
            @SerializedName("titles") val titles: Titles? = Titles(),
            @SerializedName("updatedAt") val updatedAt: String? = "",
            @SerializedName("userCount") val userCount: Int? = 0,
            @SerializedName("volumeCount") val volumeCount: Int? = 0
        ) {
            data class PosterImage(
                @SerializedName("large") val large: String? = "",
                @SerializedName("medium") val medium: String? = "",
                @SerializedName("meta") val meta: Meta? = Meta(),
                @SerializedName("original") val original: String? = "",
                @SerializedName("small") val small: String? = "",
                @SerializedName("tiny") val tiny: String? = ""
            ) {
                data class Meta(
                    @SerializedName("dimensions") val dimensions: Dimensions? = Dimensions()
                ) {
                    data class Dimensions(
                        @SerializedName("large") val large: Large? = Large(),
                        @SerializedName("medium") val medium: Medium? = Medium(),
                        @SerializedName("small") val small: Small? = Small(),
                        @SerializedName("tiny") val tiny: Tiny? = Tiny()
                    ) {
                        data class Large(
                            @SerializedName("height") val height: Int? = 0,
                            @SerializedName("width") val width: Int? = 0
                        )

                        data class Medium(
                            @SerializedName("height") val height: Int? = 0,
                            @SerializedName("width") val width: Int? = 0
                        )

                        data class Small(
                            @SerializedName("height") val height: Int? = 0,
                            @SerializedName("width") val width: Int? = 0
                        )

                        data class Tiny(
                            @SerializedName("height") val height: Int? = 0,
                            @SerializedName("width") val width: Int? = 0
                        )
                    }
                }
            }

            data class RatingFrequencies(
                @SerializedName("10") val x10: String? = "",
                @SerializedName("11") val x11: String? = "",
                @SerializedName("12") val x12: String? = "",
                @SerializedName("13") val x13: String? = "",
                @SerializedName("14") val x14: String? = "",
                @SerializedName("15") val x15: String? = "",
                @SerializedName("16") val x16: String? = "",
                @SerializedName("17") val x17: String? = "",
                @SerializedName("18") val x18: String? = "",
                @SerializedName("19") val x19: String? = "",
                @SerializedName("2") val x2: String? = "",
                @SerializedName("20") val x20: String? = "",
                @SerializedName("3") val x3: String? = "",
                @SerializedName("4") val x4: String? = "",
                @SerializedName("5") val x5: String? = "",
                @SerializedName("6") val x6: String? = "",
                @SerializedName("7") val x7: String? = "",
                @SerializedName("8") val x8: String? = "",
                @SerializedName("9") val x9: String? = ""
            )

            data class Titles(
                @SerializedName("en") val en: String? = null,
                @SerializedName("en_jp") val enJp: String? = "",
                @SerializedName("en_us") val enUs: String? = "",
                @SerializedName("ja_jp") val jaJp: String? = null
            )
        }

        data class Links(
            @SerializedName("self") val self: String? = ""
        )

        data class Relationships(
            @SerializedName("castings") val castings: Castings? = Castings(),
            @SerializedName("categories") val categories: Categories? = Categories(),
            @SerializedName("chapters") val chapters: Chapters? = Chapters(),
            @SerializedName("characters") val characters: Characters? = Characters(),
            @SerializedName("genres") val genres: Genres? = Genres(),
            @SerializedName("installments") val installments: Installments? = Installments(),
            @SerializedName("mangaCharacters") val mangaCharacters: MangaCharacters? = MangaCharacters(),
            @SerializedName("mangaStaff") val mangaStaff: MangaStaff? = MangaStaff(),
            @SerializedName("mappings") val mappings: Mappings? = Mappings(),
            @SerializedName("mediaRelationships") val mediaRelationships: MediaRelationships? = MediaRelationships(),
            @SerializedName("productions") val productions: Productions? = Productions(),
            @SerializedName("quotes") val quotes: Quotes? = Quotes(),
            @SerializedName("reviews") val reviews: Reviews? = Reviews(),
            @SerializedName("staff") val staff: Staff? = Staff()
        ) {
            data class Castings(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Categories(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Chapters(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Characters(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Genres(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Installments(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class MangaCharacters(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class MangaStaff(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Mappings(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class MediaRelationships(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Productions(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Quotes(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Reviews(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Staff(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }
        }
    }

    data class Links(
        @SerializedName("first") val first: String? = "",
        @SerializedName("last") val last: String? = "",
        @SerializedName("next") val next: String? = ""
    )

    data class Meta(
        @SerializedName("count") val count: Int? = 0
    )
}

fun MangaDto.toDomain() = MangaModel(
    data = data?.map { it.toDomain() }, meta = meta?.toDomain(), links = links?.toDomain()
)

fun MangaDto.Data.toDomain() = MangaModel.Data(
    attributes = attributes?.toDomain(),
    id = id,
    links = links?.toDomain(),
    relationships = relationships?.toDomain(),
    type = type
)

fun MangaDto.Meta.toDomain() = MangaModel.Meta(
    count = count
)

fun MangaDto.Links.toDomain() = MangaModel.Links(
    first = first, last = last, next = next
)

fun MangaDto.Data.Relationships.toDomain() = MangaModel.Data.Relationships(
    castings = castings?.toDomain(),
    categories = categories?.toDomain(),
    chapters = chapters?.toDomain(),
    characters = characters?.toDomain(),
    genres = genres?.toDomain(),
    installments = installments?.toDomain(),
    mangaCharacters = mangaCharacters?.toDomain(),
    mangaStaff = mangaStaff?.toDomain(),
    mappings = mappings?.toDomain(),
    mediaRelationships = mediaRelationships?.toDomain(),
    productions = productions?.toDomain(),
    quotes = quotes?.toDomain(),
    reviews = reviews?.toDomain(),
    staff = staff?.toDomain()
)

fun MangaDto.Data.Relationships.Staff.toDomain() = MangaModel.Data.Relationships.Staff(
    links = links?.toDomain()
)

fun MangaDto.Data.Relationships.Staff.Links.toDomain() = MangaModel.Data.Relationships.Staff.Links(
    related = related, self = self
)

fun MangaDto.Data.Relationships.Reviews.toDomain() = MangaModel.Data.Relationships.Reviews(
    links = links?.toDomain()
)

fun MangaDto.Data.Relationships.Reviews.Links.toDomain() =
    MangaModel.Data.Relationships.Reviews.Links(
        self = self, related = related
    )

fun MangaDto.Data.Relationships.Quotes.toDomain() = MangaModel.Data.Relationships.Quotes(
    links = links?.toDomain()
)

fun MangaDto.Data.Relationships.Quotes.Links.toDomain() =
    MangaModel.Data.Relationships.Quotes.Links(
        self = self, related = related
    )

fun MangaDto.Data.Relationships.Productions.toDomain() = MangaModel.Data.Relationships.Productions(
    links = links?.toDomain()
)

fun MangaDto.Data.Relationships.Productions.Links.toDomain() =
    MangaModel.Data.Relationships.Productions.Links(
        self = self, related = related
    )

fun MangaDto.Data.Relationships.MediaRelationships.toDomain() =
    MangaModel.Data.Relationships.MediaRelationships(
        links = links?.toDomain()
    )

fun MangaDto.Data.Relationships.MediaRelationships.Links.toDomain() =
    MangaModel.Data.Relationships.MediaRelationships.Links(
        self = self, related = related
    )

fun MangaDto.Data.Relationships.Mappings.toDomain() = MangaModel.Data.Relationships.Mappings(
    links = links?.toDomain()
)

fun MangaDto.Data.Relationships.Mappings.Links.toDomain() =
    MangaModel.Data.Relationships.Mappings.Links(
        self = self, related = related
    )

fun MangaDto.Data.Relationships.MangaStaff.toDomain() = MangaModel.Data.Relationships.MangaStaff(
    links = links?.toDomain()
)

fun MangaDto.Data.Relationships.MangaStaff.Links.toDomain() =
    MangaModel.Data.Relationships.MangaStaff.Links(
        self = self, related = related
    )

fun MangaDto.Data.Relationships.Castings.toDomain() = MangaModel.Data.Relationships.Castings(
    links = links?.toDomain()
)

fun MangaDto.Data.Relationships.Castings.Links.toDomain() =
    MangaModel.Data.Relationships.Castings.Links(
        self = self, related = related
    )

fun MangaDto.Data.Relationships.Categories.toDomain() = MangaModel.Data.Relationships.Categories(
    links = links?.toDomain()
)

fun MangaDto.Data.Relationships.Categories.Links.toDomain() =
    MangaModel.Data.Relationships.Categories.Links(
        self = self, related = related
    )

fun MangaDto.Data.Relationships.Chapters.toDomain() = MangaModel.Data.Relationships.Chapters(
    links = links?.toDomain()
)

fun MangaDto.Data.Relationships.Chapters.Links.toDomain() =
    MangaModel.Data.Relationships.Chapters.Links(
        self = self, related = related
    )

fun MangaDto.Data.Relationships.Characters.toDomain() = MangaModel.Data.Relationships.Characters(
    links = links?.toDomain()
)

fun MangaDto.Data.Relationships.Characters.Links.toDomain() =
    MangaModel.Data.Relationships.Characters.Links(
        self = self, related = related
    )

fun MangaDto.Data.Relationships.Genres.toDomain() = MangaModel.Data.Relationships.Genres(
    links = links?.toDomain()
)

fun MangaDto.Data.Relationships.Genres.Links.toDomain() =
    MangaModel.Data.Relationships.Genres.Links(
        self = self, related = related
    )

fun MangaDto.Data.Relationships.Installments.toDomain() =
    MangaModel.Data.Relationships.Installments(
        links = links?.toDomain()
    )

fun MangaDto.Data.Relationships.Installments.Links.toDomain() =
    MangaModel.Data.Relationships.Installments.Links(
        self = self, related = related
    )

fun MangaDto.Data.Relationships.MangaCharacters.toDomain() =
    MangaModel.Data.Relationships.MangaCharacters(
        links = links?.toDomain()
    )

fun MangaDto.Data.Relationships.MangaCharacters.Links.toDomain() =
    MangaModel.Data.Relationships.MangaCharacters.Links(
        self = self, related = related
    )

fun MangaDto.Data.Links.toDomain() = MangaModel.Data.Links(
    self = self
)

fun MangaDto.Data.Attributes.toDomain() = MangaModel.Data.Attributes(
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
    posterImage = posterImage?.toDomain(),
    ratingFrequencies = ratingFrequencies?.toDomain(),
    ratingRank = ratingRank,
    serialization = serialization,
    slug = slug,
    startDate = startDate,
    status = status,
    subtype = subtype,
    synopsis = synopsis,
    tba = tba,
    titles = titles?.toDomain(),
    updatedAt = updatedAt,
    userCount = userCount,
    volumeCount = volumeCount
)

fun MangaDto.Data.Attributes.Titles.toDomain() = MangaModel.Data.Attributes.Titles(
    en = en,
    en_jp = enJp,
    en_us = enUs,
    ja_jp = jaJp
)

fun MangaDto.Data.Attributes.RatingFrequencies.toDomain() =
    MangaModel.Data.Attributes.RatingFrequencies(
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

fun MangaDto.Data.Attributes.PosterImage.toDomain() = MangaModel.Data.Attributes.PosterImage(
    large = tiny,
    medium = medium,
    meta = meta?.toDomain(),
    small = small,
    original = original,
    tiny = tiny
)

fun MangaDto.Data.Attributes.PosterImage.Meta.toDomain() =
    MangaModel.Data.Attributes.PosterImage.Meta(
        dimensions = dimensions?.toDomain()
    )

fun MangaDto.Data.Attributes.PosterImage.Meta.Dimensions.toDomain() =
    MangaModel.Data.Attributes.PosterImage.Meta.Dimensions(
        large = large?.toDomain(),
        medium = medium?.toDomain(),
        small = small?.toDomain(),
        tiny = tiny?.toDomain()
    )

fun MangaDto.Data.Attributes.PosterImage.Meta.Dimensions.Large.toDomain() =
    MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Large(
        height = height,
        width = width
    )

fun MangaDto.Data.Attributes.PosterImage.Meta.Dimensions.Medium.toDomain() =
    MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Medium(
        height = height,
        width = width
    )

fun MangaDto.Data.Attributes.PosterImage.Meta.Dimensions.Small.toDomain() =
    MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Small(
        height = height,
        width = width
    )

fun MangaDto.Data.Attributes.PosterImage.Meta.Dimensions.Tiny.toDomain() =
    MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Tiny(
        height = height,
        width = width
    )