package com.example.data.mappers

import com.example.data.network.models.UsersDto
import com.example.domain.models.UsersModel

fun UsersDto.toDomain() = UsersModel(
    data = data?.map { it.toDomain() }, links = links?.toDomain(), meta = meta?.toDomain()
)

fun UsersDto.Links.toDomain() = UsersModel.Links(
    first = first, last = last, next = next
)

fun UsersDto.Meta.toDomain() = UsersModel.Meta(
    count = count
)

fun UsersDto.Data.toDomain() = UsersModel.Data(
    attributes = attributes?.toDomain(),
    id = id,
    links = links?.toDomain(),
    relationships = relationships?.toDomain(),
    type = type

)

fun UsersDto.Data.Relationships.toDomain() = UsersModel.Data.Relationships(
    blocks = blocks.toDomain(),
    categoryFavorites = categoryFavorites?.toDomain(),
    favorites = favorites?.toDomain(),
    followers = followers?.toDomain(),
    following = following?.toDomain(),
    libraryEntries = libraryEntries?.toDomain(),
    linkedAccounts = linkedAccounts?.toDomain(),
    notificationSettings = notificationSettings?.toDomain(),
    oneSignalPlayers = oneSignalPlayers?.toDomain(),
    pinnedPost = pinnedPost?.toDomain(),
    profileLinks = profileLinks?.toDomain(),
    quotes = quotes?.toDomain(),
    reviews = reviews?.toDomain(),
    stats = stats?.toDomain(),
    userRoles = userRoles?.toDomain(),
    waifu = waifu?.toDomain()
)

fun UsersDto.Data.Relationships.UserRoles.toDomain() = UsersModel.Data.Relationships.UserRoles(
    links = links?.toDomain()
)

fun UsersDto.Data.Relationships.UserRoles.Links.toDomain() =
    UsersModel.Data.Relationships.UserRoles.Links(
        related = related, self = self
    )

fun UsersDto.Data.Relationships.Waifu.toDomain() = UsersModel.Data.Relationships.Waifu(
    links = links?.toDomain()
)

fun UsersDto.Data.Relationships.Waifu.Links.toDomain() = UsersModel.Data.Relationships.Waifu.Links(
    related = related, self = self
)

fun UsersDto.Data.Relationships.Stats.toDomain() = UsersModel.Data.Relationships.Stats(
    links = links?.toDomain()
)

fun UsersDto.Data.Relationships.Stats.Links.toDomain() = UsersModel.Data.Relationships.Stats.Links(
    related = related, self = self
)

fun UsersDto.Data.Relationships.Reviews.toDomain() = UsersModel.Data.Relationships.Reviews(
    links = links?.toDomain()
)

fun UsersDto.Data.Relationships.Reviews.Links.toDomain() =
    UsersModel.Data.Relationships.Reviews.Links(
        related = related, self = self
    )

fun UsersDto.Data.Relationships.Quotes.toDomain() = UsersModel.Data.Relationships.Quotes(
    links = links?.toDomain()
)

fun UsersDto.Data.Relationships.Quotes.Links.toDomain() =
    UsersModel.Data.Relationships.Quotes.Links(
        related = related, self = self
    )


fun UsersDto.Data.Relationships.ProfileLinks.toDomain() =
    UsersModel.Data.Relationships.ProfileLinks(
        links = links?.toDomain()
    )

fun UsersDto.Data.Relationships.ProfileLinks.Links.toDomain() =
    UsersModel.Data.Relationships.ProfileLinks.Links(
        related = related, self = self
    )

fun UsersDto.Data.Relationships.PinnedPost.toDomain() = UsersModel.Data.Relationships.PinnedPost(
    links = links?.toDomain()
)

fun UsersDto.Data.Relationships.PinnedPost.Links.toDomain() =
    UsersModel.Data.Relationships.PinnedPost.Links(
        related = related, self = self
    )

fun UsersDto.Data.Relationships.OneSignalPlayers.toDomain() =
    UsersModel.Data.Relationships.OneSignalPlayers(
        links = links?.toDomain()
    )

fun UsersDto.Data.Relationships.OneSignalPlayers.Links.toDomain() =
    UsersModel.Data.Relationships.OneSignalPlayers.Links(
        related = related, self = self
    )

fun UsersDto.Data.Relationships.NotificationSettings.toDomain() =
    UsersModel.Data.Relationships.NotificationSettings(
        links = links?.toDomain()
    )

fun UsersDto.Data.Relationships.NotificationSettings.Links.toDomain() =
    UsersModel.Data.Relationships.NotificationSettings.Links(
        related = related, self = self
    )

fun UsersDto.Data.Relationships.LinkedAccounts.toDomain() =
    UsersModel.Data.Relationships.LinkedAccounts(
        links = links?.toDomain()
    )

fun UsersDto.Data.Relationships.LinkedAccounts.Links.toDomain() =
    UsersModel.Data.Relationships.LinkedAccounts.Links(
        related = related, self = self
    )

fun UsersDto.Data.Relationships.LibraryEntries.toDomain() =
    UsersModel.Data.Relationships.LibraryEntries(
        links = links?.toDomain()
    )

fun UsersDto.Data.Relationships.LibraryEntries.Links.toDomain() =
    UsersModel.Data.Relationships.LibraryEntries.Links(
        related = related, self = self
    )

fun UsersDto.Data.Relationships.Following.toDomain() = UsersModel.Data.Relationships.Following(
    links = links?.toDomain()
)

fun UsersDto.Data.Relationships.Following.Links.toDomain() =
    UsersModel.Data.Relationships.Following.Links(
        related = related, self = self
    )

fun UsersDto.Data.Relationships.Followers.toDomain() = UsersModel.Data.Relationships.Followers(
    links = links?.toDomain()
)

fun UsersDto.Data.Relationships.Followers.Links.toDomain() =
    UsersModel.Data.Relationships.Followers.Links(
        related = related, self = self
    )


fun UsersDto.Data.Relationships.Favorites.toDomain() = UsersModel.Data.Relationships.Favorites(
    links = links?.toDomain()
)

fun UsersDto.Data.Relationships.Favorites.Links.toDomain() =
    UsersModel.Data.Relationships.Favorites.Links(
        related = related, self = self
    )

fun UsersDto.Data.Relationships.CategoryFavorites.toDomain() =
    UsersModel.Data.Relationships.CategoryFavorites(
        links = links?.toDomain()
    )

fun UsersDto.Data.Relationships.CategoryFavorites.Links.toDomain() =
    UsersModel.Data.Relationships.CategoryFavorites.Links(
        related = related, self = self
    )

fun UsersDto.Data.Relationships.Blocks.toDomain() = UsersModel.Data.Relationships.Blocks(
    links = links?.toDomain()
)

fun UsersDto.Data.Relationships.Blocks.Links.toDomain() =
    UsersModel.Data.Relationships.Blocks.Links(
        related = related, self = self
    )

fun UsersDto.Data.Links.toDomain() = UsersModel.Data.Links(
    self = self
)

fun UsersDto.Data.Attributes.Avatar.toDomain() = UsersModel.Data.Attributes.Avatar(
    large = large,
    medium = medium,
    meta = meta?.toDomain(),
    original = original,
    small = small,
    tiny = tiny
)

fun UsersDto.Data.Attributes.Avatar.Meta.toDomain() = UsersModel.Data.Attributes.Avatar.Meta(
    dimensions = dimensions?.toDomain()
)

fun UsersDto.Data.Attributes.Avatar.Meta.Dimensions.toDomain() =
    UsersModel.Data.Attributes.Avatar.Meta.Dimensions(
        large = large?.toDomain(),
        medium = medium?.toDomain(),
        small = small?.toDomain(),
        tiny = tiny?.toDomain()
    )

fun UsersDto.Data.Attributes.Avatar.Meta.Dimensions.Large.toDomain() =
    UsersModel.Data.Attributes.Avatar.Meta.Dimensions.Large(
        height = height, width = width
    )

fun UsersDto.Data.Attributes.Avatar.Meta.Dimensions.Medium.toDomain() =
    UsersModel.Data.Attributes.Avatar.Meta.Dimensions.Medium(
        height = height, width = width
    )

fun UsersDto.Data.Attributes.Avatar.Meta.Dimensions.Small.toDomain() =
    UsersModel.Data.Attributes.Avatar.Meta.Dimensions.Small(
        height = height, width = width
    )

fun UsersDto.Data.Attributes.Avatar.Meta.Dimensions.Tiny.toDomain() =
    UsersModel.Data.Attributes.Avatar.Meta.Dimensions.Tiny(
        height = height, width = width
    )

fun UsersDto.Data.Attributes.CoverImage.toDomain() = UsersModel.Data.Attributes.CoverImage(
    large = large,
    meta = meta?.toDomain(),
    original = original,
    small = small,
    tiny = tiny
)


fun UsersDto.Data.Attributes.CoverImage.Meta.toDomain() =
    UsersModel.Data.Attributes.CoverImage.Meta(
        dimensions = dimensions?.toDomain()
    )

fun UsersDto.Data.Attributes.CoverImage.Meta.Dimensions.toDomain() =
    UsersModel.Data.Attributes.CoverImage.Meta.Dimensions(
        large = large?.toDomain(),
        small = small?.toDomain(),
        tiny = tiny?.toDomain()
    )

fun UsersDto.Data.Attributes.CoverImage.Meta.Dimensions.Large.toDomain() =
    UsersModel.Data.Attributes.CoverImage.Meta.Dimensions.Large(
        height = height, width = width
    )

fun UsersDto.Data.Attributes.CoverImage.Meta.Dimensions.Small.toDomain() =
    UsersModel.Data.Attributes.CoverImage.Meta.Dimensions.Small(
        height = height, width = width
    )

fun UsersDto.Data.Attributes.CoverImage.Meta.Dimensions.Tiny.toDomain() =
    UsersModel.Data.Attributes.CoverImage.Meta.Dimensions.Tiny(
        height = height, width = width
    )

fun UsersDto.Data.Attributes.toDomain() = UsersModel.Data.Attributes(
    about = about,
    avatar = avatar?.toDomain(),
    birthday = birthday,
    commentsCount = commentsCount,
    coverImage = coverImage?.toDomain(),
    createdAt = createdAt,
    favoritesCount = favoritesCount,
    feedCompleted = feedCompleted,
    followersCount = followersCount,
    followingCount = followingCount,
    gender = gender,
    lifeSpentOnAnime = lifeSpentOnAnime,
    likesGivenCount = likesGivenCount,
    likesReceivedCount = likesReceivedCount,
    location = location,
    mediaReactionsCount = mediaReactionsCount,
    name = name,
    pastNames = pastNames,
    permissions = permissions,
    postsCount = postsCount,
    proExpiresAt = proExpiresAt,
    proTier = proTier,
    profileCompleted = profileCompleted,
    ratingsCount = ratingsCount,
    reviewsCount = reviewsCount,
    sfwFilterPreference = sfwFilterPreference,
    slug = slug,
    status = status,
    subscribedToNewsletter = subscribedToNewsletter,
    title = title,
    updatedAt = updatedAt,
    waifuOrHusbando = waifuOrHusbando,
    website = website,
)
