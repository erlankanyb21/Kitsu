package com.example.kitsu.presentation.mapper


import com.example.domain.models.UsersModel
import com.example.kitsu.presentation.models.users.UsersUI

fun UsersModel.toUI() = UsersUI(
    data = data?.map { it.toUI() }, links = links?.toUI(), meta = meta?.toUI()
)

fun UsersModel.Links.toUI() = UsersUI.Links(
    first = first, last = last, next = next
)

fun UsersModel.Meta.toUI() = UsersUI.Meta(
    count = count
)

fun UsersModel.Data.toUI() = UsersUI.Data(
    attributes = attributes?.toUI(),
    id = id,
    links = links?.toUI(),
    relationships = relationships?.toUI(),
    type = type

)

fun UsersModel.Data.Relationships.toUI() = UsersUI.Data.Relationships(
    blocks = blocks?.toUI(),
    categoryFavorites = categoryFavorites?.toUI(),
    favorites = favorites?.toUI(),
    followers = followers?.toUI(),
    following = following?.toUI(),
    libraryEntries = libraryEntries?.toUI(),
    linkedAccounts = linkedAccounts?.toUI(),
    notificationSettings = notificationSettings?.toUI(),
    oneSignalPlayers = oneSignalPlayers?.toUI(),
    pinnedPost = pinnedPost?.toUI(),
    profileLinks = profileLinks?.toUI(),
    quotes = quotes?.toUI(),
    reviews = reviews?.toUI(),
    stats = stats?.toUI(),
    userRoles = userRoles?.toUI(),
    waifu = waifu?.toUI()
)

fun UsersModel.Data.Relationships.UserRoles.toUI() = UsersUI.Data.Relationships.UserRoles(
    links = links?.toUI()
)

fun UsersModel.Data.Relationships.UserRoles.Links.toUI() =
    UsersUI.Data.Relationships.UserRoles.Links(
        related = related, self = self
    )

fun UsersModel.Data.Relationships.Waifu.toUI() = UsersUI.Data.Relationships.Waifu(
    links = links?.toUI()
)

fun UsersModel.Data.Relationships.Waifu.Links.toUI() = UsersUI.Data.Relationships.Waifu.Links(
    related = related, self = self
)

fun UsersModel.Data.Relationships.Stats.toUI() = UsersUI.Data.Relationships.Stats(
    links = links?.toUI()
)

fun UsersModel.Data.Relationships.Stats.Links.toUI() = UsersUI.Data.Relationships.Stats.Links(
    related = related, self = self
)

fun UsersModel.Data.Relationships.Reviews.toUI() = UsersUI.Data.Relationships.Reviews(
    links = links?.toUI()
)

fun UsersModel.Data.Relationships.Reviews.Links.toUI() =
    UsersUI.Data.Relationships.Reviews.Links(
        related = related, self = self
    )

fun UsersModel.Data.Relationships.Quotes.toUI() = UsersUI.Data.Relationships.Quotes(
    links = links?.toUI()
)

fun UsersModel.Data.Relationships.Quotes.Links.toUI() =
    UsersUI.Data.Relationships.Quotes.Links(
        related = related, self = self
    )


fun UsersModel.Data.Relationships.ProfileLinks.toUI() =
    UsersUI.Data.Relationships.ProfileLinks(
        links = links?.toUI()
    )

fun UsersModel.Data.Relationships.ProfileLinks.Links.toUI() =
    UsersUI.Data.Relationships.ProfileLinks.Links(
        related = related, self = self
    )

fun UsersModel.Data.Relationships.PinnedPost.toUI() = UsersUI.Data.Relationships.PinnedPost(
    links = links?.toUI()
)

fun UsersModel.Data.Relationships.PinnedPost.Links.toUI() =
    UsersUI.Data.Relationships.PinnedPost.Links(
        related = related, self = self
    )

fun UsersModel.Data.Relationships.OneSignalPlayers.toUI() =
    UsersUI.Data.Relationships.OneSignalPlayers(
        links = links?.toUI()
    )

fun UsersModel.Data.Relationships.OneSignalPlayers.Links.toUI() =
    UsersUI.Data.Relationships.OneSignalPlayers.Links(
        related = related, self = self
    )

fun UsersModel.Data.Relationships.NotificationSettings.toUI() =
    UsersUI.Data.Relationships.NotificationSettings(
        links = links?.toUI()
    )

fun UsersModel.Data.Relationships.NotificationSettings.Links.toUI() =
    UsersUI.Data.Relationships.NotificationSettings.Links(
        related = related, self = self
    )

fun UsersModel.Data.Relationships.LinkedAccounts.toUI() =
    UsersUI.Data.Relationships.LinkedAccounts(
        links = links?.toUI()
    )

fun UsersModel.Data.Relationships.LinkedAccounts.Links.toUI() =
    UsersUI.Data.Relationships.LinkedAccounts.Links(
        related = related, self = self
    )

fun UsersModel.Data.Relationships.LibraryEntries.toUI() =
    UsersUI.Data.Relationships.LibraryEntries(
        links = links?.toUI()
    )

fun UsersModel.Data.Relationships.LibraryEntries.Links.toUI() =
    UsersUI.Data.Relationships.LibraryEntries.Links(
        related = related, self = self
    )

fun UsersModel.Data.Relationships.Following.toUI() = UsersUI.Data.Relationships.Following(
    links = links?.toUI()
)

fun UsersModel.Data.Relationships.Following.Links.toUI() =
    UsersUI.Data.Relationships.Following.Links(
        related = related, self = self
    )

fun UsersModel.Data.Relationships.Followers.toUI() = UsersUI.Data.Relationships.Followers(
    links = links?.toUI()
)

fun UsersModel.Data.Relationships.Followers.Links.toUI() =
    UsersUI.Data.Relationships.Followers.Links(
        related = related, self = self
    )


fun UsersModel.Data.Relationships.Favorites.toUI() = UsersUI.Data.Relationships.Favorites(
    links = links?.toUI()
)

fun UsersModel.Data.Relationships.Favorites.Links.toUI() =
    UsersUI.Data.Relationships.Favorites.Links(
        related = related, self = self
    )

fun UsersModel.Data.Relationships.CategoryFavorites.toUI() =
    UsersUI.Data.Relationships.CategoryFavorites(
        links = links?.toUI()
    )

fun UsersModel.Data.Relationships.CategoryFavorites.Links.toUI() =
    UsersUI.Data.Relationships.CategoryFavorites.Links(
        related = related, self = self
    )

fun UsersModel.Data.Relationships.Blocks.toUI() = UsersUI.Data.Relationships.Blocks(
    links = links?.toUI()
)

fun UsersModel.Data.Relationships.Blocks.Links.toUI() =
    UsersUI.Data.Relationships.Blocks.Links(
        related = related, self = self
    )

fun UsersModel.Data.Links.toUI() = UsersUI.Data.Links(
    self = self
)

fun UsersModel.Data.Attributes.Avatar.toUI() = UsersUI.Data.Attributes.Avatar(
    large = large,
    medium = medium,
    meta = meta?.toUI(),
    original = original,
    small = small,
    tiny = tiny,

)

fun UsersModel.Data.Attributes.Avatar.Meta.toUI() = UsersUI.Data.Attributes.Avatar.Meta(
    dimensions = dimensions?.toUI()
)

fun UsersModel.Data.Attributes.Avatar.Meta.Dimensions.toUI() = UsersUI.Data.Attributes.Avatar.Meta.Dimensions(
    large = large?.toUI(),
    medium = medium?.toUI(),
    small = small?.toUI(),
    tiny = tiny?.toUI()
)

fun UsersModel.Data.Attributes.Avatar.Meta.Dimensions.Large.toUI() = UsersUI.Data.Attributes.Avatar.Meta.Dimensions.Large(
    height= height, width = width
)
fun UsersModel.Data.Attributes.Avatar.Meta.Dimensions.Medium.toUI() = UsersUI.Data.Attributes.Avatar.Meta.Dimensions.Medium(
    height= height, width = width
)
fun UsersModel.Data.Attributes.Avatar.Meta.Dimensions.Small.toUI() = UsersUI.Data.Attributes.Avatar.Meta.Dimensions.Small(
    height= height, width = width
)
fun UsersModel.Data.Attributes.Avatar.Meta.Dimensions.Tiny.toUI() = UsersUI.Data.Attributes.Avatar.Meta.Dimensions.Tiny(
    height= height, width = width
)

fun UsersModel.Data.Attributes.CoverImage.toUI() = UsersUI.Data.Attributes.CoverImage(
    large = large,
    meta = meta?.toUI(),
    original = original,
    small = small,
    tiny = tiny
)


fun UsersModel.Data.Attributes.CoverImage.Meta.toUI() = UsersUI.Data.Attributes.CoverImage.Meta(
    dimensions = dimensions?.toUI()
)

fun UsersModel.Data.Attributes.CoverImage.Meta.Dimensions.toUI() = UsersUI.Data.Attributes.CoverImage.Meta.Dimensions(
    large = large?.toUI(),
    small = small?.toUI(),
    tiny = tiny?.toUI()
)

fun UsersModel.Data.Attributes.CoverImage.Meta.Dimensions.Large.toUI() = UsersUI.Data.Attributes.CoverImage.Meta.Dimensions.Large(
    height = height, width = width
)

fun UsersModel.Data.Attributes.CoverImage.Meta.Dimensions.Small.toUI() = UsersUI.Data.Attributes.CoverImage.Meta.Dimensions.Small(
    height = height, width = width
)

fun UsersModel.Data.Attributes.CoverImage.Meta.Dimensions.Tiny.toUI() = UsersUI.Data.Attributes.CoverImage.Meta.Dimensions.Tiny(
    height = height, width = width
)

fun UsersModel.Data.Attributes.toUI() = UsersUI.Data.Attributes(
    about = about,
    avatar = avatar?.toUI(),
    birthday = birthday,
    commentsCount = commentsCount,
    coverImage = coverImage?.toUI(),
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
    website = website
)