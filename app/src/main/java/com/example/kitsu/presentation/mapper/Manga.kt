package com.example.kitsu.presentation.mapper

import com.example.data.mappers.toDomain
import com.example.data.network.models.manga.MangaDto
import com.example.domain.models.MangaModel
import com.example.kitsu.presentation.models.manga.MangaUI

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
    original= original,
    tiny = tiny
)

fun MangaModel.Data.Attributes.PosterImage.Meta.toUI() = MangaUI.Data.Attributes.PosterImage.Meta(
    dimensions = dimensions?.toUI()
)

fun MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.toUI() = MangaUI.Data.Attributes.PosterImage.Meta.Dimensions(
    large = large?.toUI(),
    medium = medium?.toUI(),
    small = small?.toUI(),
    tiny = tiny?.toUI()
)

fun MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Large.toUI() = MangaUI.Data.Attributes.PosterImage.Meta.Dimensions.Large(
    height = height,
    width = width
)
fun MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Medium.toUI() = MangaUI.Data.Attributes.PosterImage.Meta.Dimensions.Medium(
    height = height,
    width = width
)
fun MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Small.toUI() = MangaUI.Data.Attributes.PosterImage.Meta.Dimensions.Small(
    height = height,
    width = width
)

fun MangaModel.Data.Attributes.PosterImage.Meta.Dimensions.Tiny.toUI() = MangaUI.Data.Attributes.PosterImage.Meta.Dimensions.Tiny(
    height = height,
    width = width
)


