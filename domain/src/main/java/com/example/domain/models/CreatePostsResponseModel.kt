package com.example.domain.models

data class CreatePostsResponseModel(
    val `data`: Data? = Data()
) {
    data class Data(
        val attributes: Attributes? = Attributes(),
        val id: String? = "",
        val links: Links? = Links(),
        val relationships: Relationships? = Relationships(),
        val type: String? = ""
    ) {
        data class Attributes(
            val blocked: Boolean? = false,
            val commentsCount: Int? = 0,
            val content: String? = "",
            val contentFormatted: String? = "",
            val createdAt: String? = "",
            val deletedAt: Any? = null,
            val editedAt: Any? = null,
            val embed: Any? = null,
            val embedUrl: Any? = null,
            val lockedAt: Any? = null,
            val lockedReason: Any? = null,
            val nsfw: Boolean? = false,
            val postLikesCount: Int? = 0,
            val spoiler: Boolean? = false,
            val targetInterest: Any? = null,
            val topLevelCommentsCount: Int? = 0,
            val updatedAt: String? = ""
        )

        data class Links(
            val self: String? = ""
        )

        data class Relationships(
            val ama: Ama? = Ama(),
            val comments: Comments? = Comments(),
            val lockedBy: LockedBy? = LockedBy(),
            val media: Media? = Media(),
            val postLikes: PostLikes? = PostLikes(),
            val spoiledUnit: SpoiledUnit? = SpoiledUnit(),
            val targetGroup: TargetGroup? = TargetGroup(),
            val targetUser: TargetUser? = TargetUser(),
            val uploads: Uploads? = Uploads(),
            val user: User? = User()
        ) {
            data class Ama(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Comments(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class LockedBy(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Media(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class PostLikes(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class SpoiledUnit(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class TargetGroup(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class TargetUser(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Uploads(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class User(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }
        }
    }
}