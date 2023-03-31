package com.example.data.network.models

import com.example.domain.models.UsersModel
import com.google.gson.annotations.SerializedName

data class UsersDto(
    @SerializedName("data")
    val `data`: List<Data>? = listOf(),
    @SerializedName("links")
    val links: Links? = Links(),
    @SerializedName("meta")
    val meta: Meta? = Meta()
) {
    data class Data(
        @SerializedName("attributes")
        val attributes: Attributes? = Attributes(),
        @SerializedName("id")
        val id: String? = "",
        @SerializedName("links")
        val links: Links? = Links(),
        @SerializedName("relationships")
        val relationships: Relationships? = Relationships(),
        @SerializedName("type")
        val type: String? = ""
    ) {
        data class Attributes(
            @SerializedName("about")
            val about: String? = "",
            @SerializedName("avatar")
            val avatar: Avatar? = Avatar(),
            @SerializedName("birthday")
            val birthday: Any? = null,
            @SerializedName("commentsCount")
            val commentsCount: Int? = 0,
            @SerializedName("coverImage")
            val coverImage: CoverImage? = CoverImage(),
            @SerializedName("createdAt")
            val createdAt: String? = "",
            @SerializedName("favoritesCount")
            val favoritesCount: Int? = 0,
            @SerializedName("feedCompleted")
            val feedCompleted: Boolean? = false,
            @SerializedName("followersCount")
            val followersCount: Int? = 0,
            @SerializedName("followingCount")
            val followingCount: Int? = 0,
            @SerializedName("gender")
            val gender: Any? = null,
            @SerializedName("lifeSpentOnAnime")
            val lifeSpentOnAnime: Int? = 0,
            @SerializedName("likesGivenCount")
            val likesGivenCount: Int? = 0,
            @SerializedName("likesReceivedCount")
            val likesReceivedCount: Int? = 0,
            @SerializedName("location")
            val location: String? = "",
            @SerializedName("mediaReactionsCount")
            val mediaReactionsCount: Int? = 0,
            @SerializedName("name")
            val name: String? = "",
            @SerializedName("pastNames")
            val pastNames: List<Any> = listOf(),
            @SerializedName("permissions")
            val permissions: String? = "",
            @SerializedName("postsCount")
            val postsCount: Int? = 0,
            @SerializedName("proExpiresAt")
            val proExpiresAt: String? = "",
            @SerializedName("proTier")
            val proTier: Any? = null,
            @SerializedName("profileCompleted")
            val profileCompleted: Boolean = false,
            @SerializedName("ratingsCount")
            val ratingsCount: Int? = 0,
            @SerializedName("reviewsCount")
            val reviewsCount: Int? = 0,
            @SerializedName("sfwFilterPreference")
            val sfwFilterPreference: String? = "",
            @SerializedName("slug")
            val slug: String? = "",
            @SerializedName("status")
            val status: String? = "",
            @SerializedName("subscribedToNewsletter")
            val subscribedToNewsletter: Boolean = false,
            @SerializedName("title")
            val title: Any? = null,
            @SerializedName("updatedAt")
            val updatedAt: String? = "",
            @SerializedName("waifuOrHusbando")
            val waifuOrHusbando: String? = "",
            @SerializedName("website")
            val website: String? = ""
        ) {
            data class Avatar(
                @SerializedName("large")
                val large: String? = "",
                @SerializedName("medium")
                val medium: String? = "",
                @SerializedName("meta")
                val meta: Meta? = Meta(),
                @SerializedName("original")
                val original: String? = "",
                @SerializedName("small")
                val small: String? = "",
                @SerializedName("tiny")
                val tiny: String? = ""
            ) {
                data class Meta(
                    @SerializedName("dimensions")
                    val dimensions: Dimensions? = Dimensions()
                ) {
                    data class Dimensions(
                        @SerializedName("large")
                        val large: Large? = Large(),
                        @SerializedName("medium")
                        val medium: Medium? = Medium(),
                        @SerializedName("small")
                        val small: Small? = Small(),
                        @SerializedName("tiny")
                        val tiny: Tiny? = Tiny()
                    ) {
                        data class Large(
                            @SerializedName("height")
                            val height: Any? = null,
                            @SerializedName("width")
                            val width: Any? = null
                        )

                        data class Medium(
                            @SerializedName("height")
                            val height: Any? = null,
                            @SerializedName("width")
                            val width: Any? = null
                        )

                        data class Small(
                            @SerializedName("height")
                            val height: Any? = null,
                            @SerializedName("width")
                            val width: Any? = null
                        )

                        data class Tiny(
                            @SerializedName("height")
                            val height: Any? = null,
                            @SerializedName("width")
                            val width: Any? = null
                        )
                    }
                }
            }

            data class CoverImage(
                @SerializedName("large")
                val large: String? = "",
                @SerializedName("meta")
                val meta: Meta? = Meta(),
                @SerializedName("original")
                val original: String? = "",
                @SerializedName("small")
                val small: String? = "",
                @SerializedName("tiny")
                val tiny: String? = ""
            ) {
                data class Meta(
                    @SerializedName("dimensions")
                    val dimensions: Dimensions? = Dimensions()
                ) {
                    data class Dimensions(
                        @SerializedName("large")
                        val large: Large? = Large(),
                        @SerializedName("small")
                        val small: Small? = Small(),
                        @SerializedName("tiny")
                        val tiny: Tiny? = Tiny()
                    ) {
                        data class Large(
                            @SerializedName("height")
                            val height: Int? = 0,
                            @SerializedName("width")
                            val width: Int? = 0
                        )

                        data class Small(
                            @SerializedName("height")
                            val height: Int? = 0,
                            @SerializedName("width")
                            val width: Int? = 0
                        )

                        data class Tiny(
                            @SerializedName("height")
                            val height: Int? = 0,
                            @SerializedName("width")
                            val width: Int? = 0
                        )
                    }
                }
            }
        }

        data class Links(
            @SerializedName("self")
            val self: String? = ""
        )

        data class Relationships(
            @SerializedName("blocks")
            val blocks: Blocks = Blocks(),
            @SerializedName("categoryFavorites")
            val categoryFavorites: CategoryFavorites? = CategoryFavorites(),
            @SerializedName("favorites")
            val favorites: Favorites? = Favorites(),
            @SerializedName("followers")
            val followers: Followers? = Followers(),
            @SerializedName("following")
            val following: Following? = Following(),
            @SerializedName("libraryEntries")
            val libraryEntries: LibraryEntries? = LibraryEntries(),
            @SerializedName("linkedAccounts")
            val linkedAccounts: LinkedAccounts? = LinkedAccounts(),
            @SerializedName("notificationSettings")
            val notificationSettings: NotificationSettings? = NotificationSettings(),
            @SerializedName("oneSignalPlayers")
            val oneSignalPlayers: OneSignalPlayers? = OneSignalPlayers(),
            @SerializedName("pinnedPost")
            val pinnedPost: PinnedPost? = PinnedPost(),
            @SerializedName("profileLinks")
            val profileLinks: ProfileLinks? = ProfileLinks(),
            @SerializedName("quotes")
            val quotes: Quotes? = Quotes(),
            @SerializedName("reviews")
            val reviews: Reviews? = Reviews(),
            @SerializedName("stats")
            val stats: Stats? = Stats(),
            @SerializedName("userRoles")
            val userRoles: UserRoles? = UserRoles(),
            @SerializedName("waifu")
            val waifu: Waifu? = Waifu()
        ) {
            data class Blocks(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }

            data class CategoryFavorites(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }

            data class Favorites(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }

            data class Followers(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }

            data class Following(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }

            data class LibraryEntries(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }

            data class LinkedAccounts(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }

            data class NotificationSettings(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }

            data class OneSignalPlayers(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }

            data class PinnedPost(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }

            data class ProfileLinks(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }

            data class Quotes(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }

            data class Reviews(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }

            data class Stats(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }

            data class UserRoles(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }

            data class Waifu(
                @SerializedName("links")
                val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related")
                    val related: String? = "",
                    @SerializedName("self")
                    val self: String? = ""
                )
            }
        }
    }

    data class Links(
        @SerializedName("first")
        val first: String? = "",
        @SerializedName("last")
        val last: String? = "",
        @SerializedName("next")
        val next: String? = "",
        @SerializedName("prev")
        val prev: String? = ""
    )

    data class Meta(
        @SerializedName("count")
        val count: Int? = 0
    )
}

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