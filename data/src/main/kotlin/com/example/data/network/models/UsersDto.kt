package com.example.data.network.models

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