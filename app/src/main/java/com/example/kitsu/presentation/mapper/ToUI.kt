package com.example.kitsu.presentation.mapper

import com.example.domain.models.AnimeModel
import com.example.kitsu.presentation.models.anime.AnimeUI

fun AnimeModel.toUI() = AnimeUI(
    data = data.map { it.toUI() }, meta = meta.toUI(), links = links.toUI()
)

fun AnimeModel.Meta.toUI() = AnimeUI.Meta(
    count = count
)

fun AnimeModel.Data.toUI() = AnimeUI.Data(
    id = id,
    type = type,
    links = links.toUI(),
    attributes = attributes.toUI(),
    relationships = relationships.toUI()
)

fun AnimeModel.Data.Relationships.toUI() = AnimeUI.Data.Relationships(
    genres = genres.toUI(),
    categories = categories.toUI(),
    castings = castings.toUI(),
    installments = installments.toUI(),
    mappings = mappings.toUI(),
    reviews = reviews.toUI(),
    mediaRelationships = mediaRelationships.toUI(),
    characters = characters.toUI(),
    staff = staff.toUI(),
    productions = productions.toUI(),
    quotes = quotes.toUI(),
    episodes = episodes.toUI(),
    streamingLinks = streamingLinks.toUI(),
    animeProductions = animeProductions.toUI(),
    animeCharacters = animeCharacters.toUI(),
    animeStaff = animeStaff.toUI()

)

// Relationships

// last 5

fun AnimeModel.Data.Relationships.Episodes.toUI() = AnimeUI.Data.Relationships.Episodes(
    links = links.toUI()
)

fun AnimeModel.Data.Relationships.Episodes.Links.toUI() =
    AnimeUI.Data.Relationships.Episodes.Links(
        self = self, related = related
    )

fun AnimeModel.Data.Relationships.StreamingLinks.toUI() =
    AnimeUI.Data.Relationships.StreamingLinks(
        links = links.toUI()
    )

fun AnimeModel.Data.Relationships.StreamingLinks.Links.toUI() =
    AnimeUI.Data.Relationships.StreamingLinks.Links(
        self = self, related = related
    )

fun AnimeModel.Data.Relationships.AnimeProductions.toUI() =
    AnimeUI.Data.Relationships.AnimeProductions(
        links = links.toUI()
    )

fun AnimeModel.Data.Relationships.AnimeProductions.Links.toUI() =
    AnimeUI.Data.Relationships.AnimeProductions.Links(
        self = self, related = related
    )

fun AnimeModel.Data.Relationships.AnimeCharacters.toUI() =
    AnimeUI.Data.Relationships.AnimeCharacters(
        links = links.toUI()
    )

fun AnimeModel.Data.Relationships.AnimeCharacters.Links.toUI() =
    AnimeUI.Data.Relationships.AnimeCharacters.Links(
        self = self, related = related
    )

fun AnimeModel.Data.Relationships.AnimeStaff.toUI() =
    AnimeUI.Data.Relationships.AnimeStaff(
    links = links.toUI()
)

fun AnimeModel.Data.Relationships.AnimeStaff.Links.toUI() =
    AnimeUI.Data.Relationships.AnimeStaff.Links(
        self = self, related = related
    )

// last 5/

fun AnimeModel.Data.Relationships.Genres.toUI() =
    AnimeUI.Data.Relationships.Genres(
    links = links.toUI()
)

fun AnimeModel.Data.Relationships.Genres.Links.toUI() =
    AnimeUI.Data.Relationships.Genres.Links(
        self = self, related = related
    )

fun AnimeModel.Data.Relationships.Quotes.toUI() =
    AnimeUI.Data.Relationships.Quotes(
    links = links.toUI()
)

fun AnimeModel.Data.Relationships.Quotes.Links.toUI() =
    AnimeUI.Data.Relationships.Quotes.Links(
        self = self, related = related
    )

fun AnimeModel.Data.Relationships.Productions.toUI() =
    AnimeUI.Data.Relationships.Productions(
    links = links.toUI()
)

fun AnimeModel.Data.Relationships.Productions.Links.toUI() =
    AnimeUI.Data.Relationships.Productions.Links(
        self = self, related = related
    )

fun AnimeModel.Data.Relationships.Staff.toUI() =
    AnimeUI.Data.Relationships.Staff(
    links = links.toUI()
)

fun AnimeModel.Data.Relationships.Staff.Links.toUI() =
    AnimeUI.Data.Relationships.Staff.Links(
    self = self, related = related
)

fun AnimeModel.Data.Relationships.Categories.toUI() =
    AnimeUI.Data.Relationships.Categories(
    links = links.toUI()
)

fun AnimeModel.Data.Relationships.Categories.Links.toUI() =
    AnimeUI.Data.Relationships.Categories.Links(
        self = self, related = related
    )

fun AnimeModel.Data.Relationships.Castings.toUI() =
    AnimeUI.Data.Relationships.Castings(
    links = links.toUI()
)

fun AnimeModel.Data.Relationships.Castings.Links.toUI() =
    AnimeUI.Data.Relationships.Castings.Links(
        self = self, related = related
    )

fun AnimeModel.Data.Relationships.Installments.toUI() =
    AnimeUI.Data.Relationships.Installments(
        links = links.toUI()
    )

fun AnimeModel.Data.Relationships.Installments.Links.toUI() =
    AnimeUI.Data.Relationships.Installments.Links(
        self = self, related = related
    )

fun AnimeModel.Data.Relationships.Mappings.toUI() =
    AnimeUI.Data.Relationships.Mappings(
    links = links.toUI()
)

fun AnimeModel.Data.Relationships.Mappings.Links.toUI() =
    AnimeUI.Data.Relationships.Mappings.Links(
        self = self, related = related
    )

fun AnimeModel.Data.Relationships.Reviews.toUI() =
    AnimeUI.Data.Relationships.Reviews(
    links = links.toUI()
)

fun AnimeModel.Data.Relationships.Reviews.Links.toUI() =
    AnimeUI.Data.Relationships.Reviews.Links(
        self = self, related = related
    )

fun AnimeModel.Data.Relationships.MediaRelationships.toUI() =
    AnimeUI.Data.Relationships.MediaRelationships(
        links = links.toUI()
    )

fun AnimeModel.Data.Relationships.MediaRelationships.Links.toUI() =
    AnimeUI.Data.Relationships.MediaRelationships.Links(
        self = self, related = related
    )

fun AnimeModel.Data.Relationships.Characters.toUI() =
    AnimeUI.Data.Relationships.Characters(
    links = links.toUI()
)

fun AnimeModel.Data.Relationships.Characters.Links.toUI() =
    AnimeUI.Data.Relationships.Characters.Links(
        self = self, related = related
    )

// Relationships /

fun AnimeModel.Links.toUI() =
    AnimeUI.Links(
    first = first, next = next, last = last
)

fun AnimeModel.Data.Links.toUI() =
    AnimeUI.Data.Links(
    self = self
)

fun AnimeModel.Data.Attributes.toUI() =
    AnimeUI.Data.Attributes(
    createdAt = createdAt,
    updatedAt = updatedAt,
    slug = slug,
    synopsis = synopsis,
    description = description,
    coverImageTopOffset = coverImageTopOffset,
    titles = titles.toUI(),
    canonicalTitle = canonicalTitle,
    abbreviatedTitles = abbreviatedTitles,
    averageRating = averageRating,
    ratingFrequencies = ratingFrequencies.toUI(),
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
    posterImage = posterImage.toUI(),
    coverImage = coverImage?.toUI(),
    episodeCount = episodeCount,
    episodeLength = episodeLength,
    totalLength = totalLength,
    youtubeVideoId = youtubeVideoId,
    showType = showType,
    nsfw = nsfw
)

fun AnimeModel.Data.Attributes.RatingFrequencies.toUI() =
    AnimeUI.Data.Attributes.RatingFrequencies(
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

fun AnimeModel.Data.Attributes.CoverImage.toUI() =
    AnimeUI.Data.Attributes.CoverImage(
    tiny = tiny, large = large, small = small, original = original, meta = meta.toUI()
)

fun AnimeModel.Data.Attributes.CoverImage.Meta.toUI() =
    AnimeUI.Data.Attributes.CoverImage.Meta(
        dimensions = dimensions.toUI()
    )

fun AnimeModel.Data.Attributes.CoverImage.Meta.Dimensions.toUI() =
    AnimeUI.Data.Attributes.CoverImage.Meta.Dimensions(
        tiny = tiny.toUI(),
        large = large.toUI(),
        small = small.toUI(),
    )

fun AnimeModel.Data.Attributes.CoverImage.Meta.Dimensions.Tiny.toUI() =
    AnimeUI.Data.Attributes.CoverImage.Meta.Dimensions.Tiny(
        width = width, height = height
    )

fun AnimeModel.Data.Attributes.CoverImage.Meta.Dimensions.Large.toUI() =
    AnimeUI.Data.Attributes.CoverImage.Meta.Dimensions.Large(
        width = width, height = height
    )

fun AnimeModel.Data.Attributes.CoverImage.Meta.Dimensions.Small.toUI() =
    AnimeUI.Data.Attributes.CoverImage.Meta.Dimensions.Small(
        width = width, height = height
    )

fun AnimeModel.Data.Attributes.Titles.toUI() =
    AnimeUI.Data.Attributes.Titles(
        en = en,
        en_jp = en_jp,
        ja_jp = ja_jp,
        en_us = en_us

    )

fun AnimeModel.Data.Attributes.PosterImage.toUI() =
    AnimeUI.Data.Attributes.PosterImage(
    tiny = tiny,
    large = large,
    small = small,
    medium = medium,
    original = original,
    meta = meta.toUI()
)

fun AnimeModel.Data.Attributes.PosterImage.Meta.toUI() =
    AnimeUI.Data.Attributes.PosterImage.Meta(
        dimensions = dimensions.toUI()
    )

fun AnimeModel.Data.Attributes.PosterImage.Meta.Dimensions.toUI() =
    AnimeUI.Data.Attributes.PosterImage.Meta.Dimensions(
        tiny = tiny.toUI(),
        large = large.toUI(),
        small = small.toUI(),
        medium = medium.toUI()
    )

fun AnimeModel.Data.Attributes.PosterImage.Meta.Dimensions.Tiny.toUI() =
    AnimeUI.Data.Attributes.PosterImage.Meta.Dimensions.Tiny(
        width = width, height = height
    )

fun AnimeModel.Data.Attributes.PosterImage.Meta.Dimensions.Large.toUI() =
    AnimeUI.Data.Attributes.PosterImage.Meta.Dimensions.Large(
        width = width, height = height
    )

fun AnimeModel.Data.Attributes.PosterImage.Meta.Dimensions.Small.toUI() =
    AnimeUI.Data.Attributes.PosterImage.Meta.Dimensions.Small(
        width = width, height = height
    )

fun AnimeModel.Data.Attributes.PosterImage.Meta.Dimensions.Medium.toUI() =
    AnimeUI.Data.Attributes.PosterImage.Meta.Dimensions.Medium(
        width = width, height = height
    )

