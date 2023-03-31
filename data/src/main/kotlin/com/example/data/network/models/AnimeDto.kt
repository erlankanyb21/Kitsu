package com.example.data.network.models

import com.example.domain.models.AnimeModel
import com.google.gson.annotations.SerializedName

data class AnimeDto(
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
            @SerializedName("ageRating") val ageRating: String? = "",
            @SerializedName("ageRatingGuide") val ageRatingGuide: String? = "",
            @SerializedName("averageRating") val averageRating: String? = "",
            @SerializedName("canonicalTitle") val canonicalTitle: String? = "",
            @SerializedName("coverImage") val coverImage: CoverImage? = null,
            @SerializedName("coverImageTopOffset") val coverImageTopOffset: Int = 0,
            @SerializedName("createdAt") val createdAt: String? = "",
            @SerializedName("description") val description: String? = "",
            @SerializedName("endDate") val endDate: String? = "",
            @SerializedName("episodeCount") val episodeCount: Int? = 0,
            @SerializedName("episodeLength") val episodeLength: Int? = null,
            @SerializedName("favoritesCount") val favoritesCount: Int? = 0,
            @SerializedName("nextRelease") val nextRelease: Any? = null,
            @SerializedName("nsfw") val nsfw: Boolean = false,
            @SerializedName("popularityRank") val popularityRank: Int? = 0,
            @SerializedName("posterImage") val posterImage: PosterImage? = PosterImage(),
            @SerializedName("ratingFrequencies") val ratingFrequencies: RatingFrequencies? = RatingFrequencies(),
            @SerializedName("ratingRank") val ratingRank: Int? = 0,
            @SerializedName("showType") val showType: String? = "",
            @SerializedName("slug") val slug: String? = "",
            @SerializedName("startDate") val startDate: String? = "",
            @SerializedName("status") val status: String? = "",
            @SerializedName("subtype") val subtype: String? = "",
            @SerializedName("synopsis") val synopsis: String? = "",
            @SerializedName("tba") val tba: String? = null,
            @SerializedName("titles") val titles: Titles? = Titles(),
            @SerializedName("totalLength") val totalLength: Int? = 0,
            @SerializedName("updatedAt") val updatedAt: String? = "",
            @SerializedName("userCount") val userCount: Int? = 0,
            @SerializedName("youtubeVideoId") val youtubeVideoId: String? = ""
        ) {
            data class CoverImage(
                @SerializedName("large") val large: String? = "",
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
                        @SerializedName("small") val small: Small? = Small(),
                        @SerializedName("tiny") val tiny: Tiny? = Tiny()
                    ) {
                        data class Large(
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
                @SerializedName("en_us") val enUs: String? = null,
                @SerializedName("ja_jp") val jaJp: String? = ""
            )
        }

        data class Links(
            @SerializedName("self") val self: String? = ""
        )

        data class Relationships(
            @SerializedName("animeCharacters") val animeCharacters: AnimeCharacters? = AnimeCharacters(),
            @SerializedName("animeProductions") val animeProductions: AnimeProductions? = AnimeProductions(),
            @SerializedName("animeStaff") val animeStaff: AnimeStaff? = AnimeStaff(),
            @SerializedName("castings") val castings: Castings? = Castings(),
            @SerializedName("categories") val categories: Categories? = Categories(),
            @SerializedName("characters") val characters: Characters? = Characters(),
            @SerializedName("episodes") val episodes: Episodes? = Episodes(),
            @SerializedName("genres") val genres: Genres? = Genres(),
            @SerializedName("installments") val installments: Installments? = Installments(),
            @SerializedName("mappings") val mappings: Mappings? = Mappings(),
            @SerializedName("mediaRelationships") val mediaRelationships: MediaRelationships? = MediaRelationships(),
            @SerializedName("productions") val productions: Productions? = Productions(),
            @SerializedName("quotes") val quotes: Quotes? = Quotes(),
            @SerializedName("reviews") val reviews: Reviews? = Reviews(),
            @SerializedName("staff") val staff: Staff? = Staff(),
            @SerializedName("streamingLinks") val streamingLinks: StreamingLinks? = StreamingLinks()
        ) {
            data class AnimeCharacters(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class AnimeProductions(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class AnimeStaff(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

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

            data class Characters(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Episodes(
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

            data class StreamingLinks(
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

fun AnimeDto.toDomain() =
    AnimeModel(
        data = data?.map { it.toDomain() }, meta = meta?.toDomain(), links = links?.toDomain()
    )

fun AnimeDto.Meta.toDomain() = AnimeModel.Meta(
    count = count
)

fun AnimeDto.Data.toDomain() = AnimeModel.Data(
    id = id,
    type = type,
    links = links?.toDomain(),
    attributes = attributes?.toDomain(),
    relationships = relationships?.toDomain()
)

fun AnimeDto.Data.Relationships.toDomain() = AnimeModel.Data.Relationships(
    genres = genres?.toDomain(),
    categories = categories?.toDomain(),
    castings = castings?.toDomain(),
    installments = installments?.toDomain(),
    mappings = mappings?.toDomain(),
    reviews = reviews?.toDomain(),
    mediaRelationships = mediaRelationships?.toDomain(),
    characters = characters?.toDomain(),
    staff = staff?.toDomain(),
    productions = productions?.toDomain(),
    quotes = quotes?.toDomain(),
    episodes = episodes?.toDomain(),
    streamingLinks = streamingLinks?.toDomain(),
    animeProductions = animeProductions?.toDomain(),
    animeCharacters = animeCharacters?.toDomain(),
    animeStaff = animeStaff?.toDomain()

)

fun AnimeDto.Data.Relationships.Episodes.toDomain() = AnimeModel.Data.Relationships.Episodes(
    links = links?.toDomain()
)

fun AnimeDto.Data.Relationships.Episodes.Links.toDomain() =
    AnimeModel.Data.Relationships.Episodes.Links(
        self = self, related = related
    )

fun AnimeDto.Data.Relationships.StreamingLinks.toDomain() =
    AnimeModel.Data.Relationships.StreamingLinks(
        links = links?.toDomain()
    )

fun AnimeDto.Data.Relationships.StreamingLinks.Links.toDomain() =
    AnimeModel.Data.Relationships.StreamingLinks.Links(
        self = self, related = related
    )

fun AnimeDto.Data.Relationships.AnimeProductions.toDomain() =
    AnimeModel.Data.Relationships.AnimeProductions(
        links = links?.toDomain()
    )

fun AnimeDto.Data.Relationships.AnimeProductions.Links.toDomain() =
    AnimeModel.Data.Relationships.AnimeProductions.Links(
        self = self, related = related
    )

fun AnimeDto.Data.Relationships.AnimeCharacters.toDomain() =
    AnimeModel.Data.Relationships.AnimeCharacters(
        links = links?.toDomain()
    )

fun AnimeDto.Data.Relationships.AnimeCharacters.Links.toDomain() =
    AnimeModel.Data.Relationships.AnimeCharacters.Links(
        self = self, related = related
    )

fun AnimeDto.Data.Relationships.AnimeStaff.toDomain() = AnimeModel.Data.Relationships.AnimeStaff(
    links = links?.toDomain()
)

fun AnimeDto.Data.Relationships.AnimeStaff.Links.toDomain() =
    AnimeModel.Data.Relationships.AnimeStaff.Links(
        self = self, related = related
    )

fun AnimeDto.Data.Relationships.Genres.toDomain() = AnimeModel.Data.Relationships.Genres(
    links = links?.toDomain()
)

fun AnimeDto.Data.Relationships.Genres.Links.toDomain() =
    AnimeModel.Data.Relationships.Genres.Links(
        self = self, related = related
    )

fun AnimeDto.Data.Relationships.Quotes.toDomain() = AnimeModel.Data.Relationships.Quotes(
    links = links?.toDomain()
)

fun AnimeDto.Data.Relationships.Quotes.Links.toDomain() =
    AnimeModel.Data.Relationships.Quotes.Links(
        self = self, related = related
    )

fun AnimeDto.Data.Relationships.Productions.toDomain() = AnimeModel.Data.Relationships.Productions(
    links = links?.toDomain()
)

fun AnimeDto.Data.Relationships.Productions.Links.toDomain() =
    AnimeModel.Data.Relationships.Productions.Links(
        self = self, related = related
    )

fun AnimeDto.Data.Relationships.Staff.toDomain() = AnimeModel.Data.Relationships.Staff(
    links = links?.toDomain()
)

fun AnimeDto.Data.Relationships.Staff.Links.toDomain() = AnimeModel.Data.Relationships.Staff.Links(
    self = self, related = related
)

fun AnimeDto.Data.Relationships.Categories.toDomain() = AnimeModel.Data.Relationships.Categories(
    links = links?.toDomain()
)

fun AnimeDto.Data.Relationships.Categories.Links.toDomain() =
    AnimeModel.Data.Relationships.Categories.Links(
        self = self, related = related
    )

fun AnimeDto.Data.Relationships.Castings.toDomain() = AnimeModel.Data.Relationships.Castings(
    links = links?.toDomain()
)

fun AnimeDto.Data.Relationships.Castings.Links.toDomain() =
    AnimeModel.Data.Relationships.Castings.Links(
        self = self, related = related
    )

fun AnimeDto.Data.Relationships.Installments.toDomain() =
    AnimeModel.Data.Relationships.Installments(
        links = links?.toDomain()
    )

fun AnimeDto.Data.Relationships.Installments.Links.toDomain() =
    AnimeModel.Data.Relationships.Installments.Links(
        self = self, related = related
    )

fun AnimeDto.Data.Relationships.Mappings.toDomain() = AnimeModel.Data.Relationships.Mappings(
    links = links?.toDomain()
)

fun AnimeDto.Data.Relationships.Mappings.Links.toDomain() =
    AnimeModel.Data.Relationships.Mappings.Links(
        self = self, related = related
    )

fun AnimeDto.Data.Relationships.Reviews.toDomain() = AnimeModel.Data.Relationships.Reviews(
    links = links?.toDomain()
)

fun AnimeDto.Data.Relationships.Reviews.Links.toDomain() =
    AnimeModel.Data.Relationships.Reviews.Links(
        self = self, related = related
    )

fun AnimeDto.Data.Relationships.MediaRelationships.toDomain() =
    AnimeModel.Data.Relationships.MediaRelationships(
        links = links?.toDomain()
    )

fun AnimeDto.Data.Relationships.MediaRelationships.Links.toDomain() =
    AnimeModel.Data.Relationships.MediaRelationships.Links(
        self = self, related = related
    )

fun AnimeDto.Data.Relationships.Characters.toDomain() = AnimeModel.Data.Relationships.Characters(
    links = links?.toDomain()
)

fun AnimeDto.Data.Relationships.Characters.Links.toDomain() =
    AnimeModel.Data.Relationships.Characters.Links(
        self = self, related = related
    )

// Relationships /

fun AnimeDto.Links.toDomain() = AnimeModel.Links(
    first = first, next = next, last = last
)

fun AnimeDto.Data.Links.toDomain() = AnimeModel.Data.Links(
    self = self
)

fun AnimeDto.Data.Attributes.toDomain() = AnimeModel.Data.Attributes(
    createdAt = createdAt,
    updatedAt = updatedAt,
    slug = slug,
    synopsis = synopsis,
    description = description,
    coverImageTopOffset = coverImageTopOffset,
    titles = titles?.toDomain(),
    canonicalTitle = canonicalTitle,
    abbreviatedTitles = abbreviatedTitles,
    averageRating = averageRating,
    ratingFrequencies = ratingFrequencies?.toDomain(),
    userCount = userCount,
    favoritesCount = favoritesCount,
    startDate = startDate,
    endDate = endDate,
    nextRelease = nextRelease,
    popularityRank = popularityRank,
    ratingRank = ratingRank,
    ageRating = ageRating,
    ageRatingGuide = ageRatingGuide,
    subtype = subtype,
    status = status,
    tba = tba,
    posterImage = posterImage?.toDomain(),
    coverImage = coverImage?.toDomain(),
    episodeCount = episodeCount,
    episodeLength = episodeLength,
    totalLength = totalLength,
    youtubeVideoId = youtubeVideoId,
    showType = showType,
    nsfw = nsfw
)

fun AnimeDto.Data.Attributes.RatingFrequencies.toDomain() =
    AnimeModel.Data.Attributes.RatingFrequencies(
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
        x20 = x20
    )

fun AnimeDto.Data.Attributes.CoverImage.toDomain() = AnimeModel.Data.Attributes.CoverImage(
    tiny = tiny, large = large, small = small, original = original, meta = meta?.toDomain()
)

fun AnimeDto.Data.Attributes.CoverImage.Meta.toDomain() =
    AnimeModel.Data.Attributes.CoverImage.Meta(
        dimensions = dimensions?.toDomain()
    )

fun AnimeDto.Data.Attributes.CoverImage.Meta.Dimensions.toDomain() =
    AnimeModel.Data.Attributes.CoverImage.Meta.Dimensions(
        tiny = tiny?.toDomain(),
        large = large?.toDomain(),
        small = small?.toDomain(),
    )

fun AnimeDto.Data.Attributes.CoverImage.Meta.Dimensions.Tiny.toDomain() =
    AnimeModel.Data.Attributes.CoverImage.Meta.Dimensions.Tiny(
        width = width, height = height
    )

fun AnimeDto.Data.Attributes.CoverImage.Meta.Dimensions.Large.toDomain() =
    AnimeModel.Data.Attributes.CoverImage.Meta.Dimensions.Large(
        width = width, height = height
    )

fun AnimeDto.Data.Attributes.CoverImage.Meta.Dimensions.Small.toDomain() =
    AnimeModel.Data.Attributes.CoverImage.Meta.Dimensions.Small(
        width = width, height = height
    )

fun AnimeDto.Data.Attributes.Titles.toDomain() = AnimeModel.Data.Attributes.Titles(
    en = en, en_jp = enJp, ja_jp = jaJp, en_us = enUs
)

fun AnimeDto.Data.Attributes.PosterImage.toDomain() = AnimeModel.Data.Attributes.PosterImage(
    tiny = tiny,
    large = large,
    small = small,
    medium = medium,
    original = original,
    meta = meta?.toDomain()
)

fun AnimeDto.Data.Attributes.PosterImage.Meta.toDomain() =
    AnimeModel.Data.Attributes.PosterImage.Meta(
        dimensions = dimensions?.toDomain()
    )

fun AnimeDto.Data.Attributes.PosterImage.Meta.Dimensions.toDomain() =
    AnimeModel.Data.Attributes.PosterImage.Meta.Dimensions(
        tiny = tiny?.toDomain(),
        large = large?.toDomain(),
        small = small?.toDomain(),
        medium = medium?.toDomain()
    )

fun AnimeDto.Data.Attributes.PosterImage.Meta.Dimensions.Tiny.toDomain() =
    AnimeModel.Data.Attributes.PosterImage.Meta.Dimensions.Tiny(
        width = width, height = height
    )

fun AnimeDto.Data.Attributes.PosterImage.Meta.Dimensions.Large.toDomain() =
    AnimeModel.Data.Attributes.PosterImage.Meta.Dimensions.Large(
        width = width, height = height
    )

fun AnimeDto.Data.Attributes.PosterImage.Meta.Dimensions.Small.toDomain() =
    AnimeModel.Data.Attributes.PosterImage.Meta.Dimensions.Small(
        width = width, height = height
    )

fun AnimeDto.Data.Attributes.PosterImage.Meta.Dimensions.Medium.toDomain() =
    AnimeModel.Data.Attributes.PosterImage.Meta.Dimensions.Medium(
        width = width, height = height
    )
