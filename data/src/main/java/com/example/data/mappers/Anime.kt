package com.example.data.mappers

import com.example.data.network.models.AnimeDto
import com.example.domain.models.AnimeModel

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

// Relationships

// last 5

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

// last 5/

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