package com.example.kitsu.presentation.models

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
