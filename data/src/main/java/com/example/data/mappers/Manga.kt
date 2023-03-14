package com.example.data.mappers

import com.example.data.network.models.manga.MangaDto
import com.example.domain.models.MangaModel

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

fun MangaDto.Data.Attributes.RatingFrequencies.toDomain() = MangaModel.Data.Attributes.RatingFrequencies(
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
    original= original,
    tiny = tiny
)

fun MangaDto.Data.Attributes.PosterImage.Meta.toDomain() = MangaModel.Data.Attributes.PosterImage.Meta(
    dimensions = dimensions?.toDomain()
)

fun MangaDto.Data.Attributes.PosterImage.Meta.Dimensions.toDomain() = MangaModel.Data.Attributes.PosterImage.Meta.Dimensions(
    large = large?.toDomain(),
    medium = medium?.toDomain(),
    small = small?.toDomain(),
    tiny = tiny?.toDomain()
)

fun MangaDto.Data.Attributes.PosterImage.Meta.Dimensions.Large.toDomain() = MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Large(
    height = height,
    width = width
)
fun MangaDto.Data.Attributes.PosterImage.Meta.Dimensions.Medium.toDomain() = MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Medium(
    height = height,
    width = width
)
fun MangaDto.Data.Attributes.PosterImage.Meta.Dimensions.Small.toDomain() = MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Small(
    height = height,
    width = width
)

fun MangaDto.Data.Attributes.PosterImage.Meta.Dimensions.Tiny.toDomain() = MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Tiny(
    height = height,
    width = width
)