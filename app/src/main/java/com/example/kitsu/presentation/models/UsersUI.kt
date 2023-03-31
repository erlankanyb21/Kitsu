package com.example.kitsu.presentation.models

import com.example.domain.models.UsersModel

data class UsersUI(

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
            val about: String? = "",
            val avatar: Avatar? = Avatar(),
            val birthday: Any? = null,
            val commentsCount: Int? = 0,
            val coverImage: CoverImage? = CoverImage(),
            val createdAt: String? = "",
            val favoritesCount: Int? = 0,
            val feedCompleted: Boolean? = false,
            val followersCount: Int? = 0,
            val followingCount: Int? = 0,
            val gender: Any? = null,
            val lifeSpentOnAnime: Int? = 0,
            val likesGivenCount: Int? = 0,
            val likesReceivedCount: Int? = 0,
            val location: String? = "",
            val mediaReactionsCount: Int? = 0,
            val name: String? = "",
            val pastNames: List<Any> = listOf(),
            val permissions: String? = "",
            val postsCount: Int? = 0,
            val proExpiresAt: String? = "",
            val proTier: Any? = null,
            val profileCompleted: Boolean = false,
            val ratingsCount: Int? = 0,
            val reviewsCount: Int? = 0,
            val sfwFilterPreference: String? = "",
            val slug: String? = "",
            val status: String? = "",
            val subscribedToNewsletter: Boolean = false,
            val title: Any? = null,
            val updatedAt: String? = "",
            val waifuOrHusbando: String? = "",
            val website: String? = ""
        ) {
            data class Avatar(
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
                            val height: Any? = null,
                            val width: Any? = null
                        )

                        data class Medium(
                            val height: Any? = null,
                            val width: Any? = null
                        )

                        data class Small(
                            val height: Any? = null,
                            val width: Any? = null
                        )

                        data class Tiny(
                            val height: Any? = null,
                            val width: Any? = null
                        )
                    }
                }
            }

            data class CoverImage(
                val large: String? = "",
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
                        val small: Small? = Small(),
                        val tiny: Tiny? = Tiny()
                    ) {
                        data class Large(
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
        }

        data class Links(
            val self: String? = ""
        )

        data class Relationships(
            val blocks: Blocks? = Blocks(),
            val categoryFavorites: CategoryFavorites? = CategoryFavorites(),
            val favorites: Favorites? = Favorites(),
            val followers: Followers? = Followers(),
            val following: Following? = Following(),
            val libraryEntries: LibraryEntries? = LibraryEntries(),
            val linkedAccounts: LinkedAccounts? = LinkedAccounts(),
            val notificationSettings: NotificationSettings? = NotificationSettings(),
            val oneSignalPlayers: OneSignalPlayers? = OneSignalPlayers(),
            val pinnedPost: PinnedPost? = PinnedPost(),
            val profileLinks: ProfileLinks? = ProfileLinks(),
            val quotes: Quotes? = Quotes(),
            val reviews: Reviews? = Reviews(),
            val stats: Stats? = Stats(),
            val userRoles: UserRoles? = UserRoles(),
            val waifu: Waifu? = Waifu()
        ) {
            data class Blocks(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class CategoryFavorites(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Favorites(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Followers(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",

                    val self: String? = ""
                )
            }

            data class Following(

                val links: Links? = Links()
            ) {
                data class Links(

                    val related: String? = "",

                    val self: String? = ""
                )
            }

            data class LibraryEntries(

                val links: Links? = Links()
            ) {
                data class Links(

                    val related: String? = "",

                    val self: String? = ""
                )
            }

            data class LinkedAccounts(

                val links: Links? = Links()
            ) {
                data class Links(

                    val related: String? = "",

                    val self: String? = ""
                )
            }

            data class NotificationSettings(

                val links: Links? = Links()
            ) {
                data class Links(

                    val related: String? = "",

                    val self: String? = ""
                )
            }

            data class OneSignalPlayers(

                val links: Links? = Links()
            ) {
                data class Links(

                    val related: String? = "",

                    val self: String? = ""
                )
            }

            data class PinnedPost(

                val links: Links? = Links()
            ) {
                data class Links(

                    val related: String? = "",

                    val self: String? = ""
                )
            }

            data class ProfileLinks(

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

            data class Stats(

                val links: Links? = Links()
            ) {
                data class Links(

                    val related: String? = "",

                    val self: String? = ""
                )
            }

            data class UserRoles(

                val links: Links? = Links()
            ) {
                data class Links(

                    val related: String? = "",

                    val self: String? = ""
                )
            }

            data class Waifu(

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

        val next: String? = "",

        val prev: String? = ""
    )

    data class Meta(

        val count: Int? = 0
    )
}

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

fun UsersModel.Data.Attributes.Avatar.Meta.Dimensions.toUI() =
    UsersUI.Data.Attributes.Avatar.Meta.Dimensions(
        large = large?.toUI(),
        medium = medium?.toUI(),
        small = small?.toUI(),
        tiny = tiny?.toUI()
    )

fun UsersModel.Data.Attributes.Avatar.Meta.Dimensions.Large.toUI() =
    UsersUI.Data.Attributes.Avatar.Meta.Dimensions.Large(
        height = height, width = width
    )

fun UsersModel.Data.Attributes.Avatar.Meta.Dimensions.Medium.toUI() =
    UsersUI.Data.Attributes.Avatar.Meta.Dimensions.Medium(
        height = height, width = width
    )

fun UsersModel.Data.Attributes.Avatar.Meta.Dimensions.Small.toUI() =
    UsersUI.Data.Attributes.Avatar.Meta.Dimensions.Small(
        height = height, width = width
    )

fun UsersModel.Data.Attributes.Avatar.Meta.Dimensions.Tiny.toUI() =
    UsersUI.Data.Attributes.Avatar.Meta.Dimensions.Tiny(
        height = height, width = width
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

fun UsersModel.Data.Attributes.CoverImage.Meta.Dimensions.toUI() =
    UsersUI.Data.Attributes.CoverImage.Meta.Dimensions(
        large = large?.toUI(),
        small = small?.toUI(),
        tiny = tiny?.toUI()
    )

fun UsersModel.Data.Attributes.CoverImage.Meta.Dimensions.Large.toUI() =
    UsersUI.Data.Attributes.CoverImage.Meta.Dimensions.Large(
        height = height, width = width
    )

fun UsersModel.Data.Attributes.CoverImage.Meta.Dimensions.Small.toUI() =
    UsersUI.Data.Attributes.CoverImage.Meta.Dimensions.Small(
        height = height, width = width
    )

fun UsersModel.Data.Attributes.CoverImage.Meta.Dimensions.Tiny.toUI() =
    UsersUI.Data.Attributes.CoverImage.Meta.Dimensions.Tiny(
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
