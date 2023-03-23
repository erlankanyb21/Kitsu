package com.example.kitsu.presentation.models


import com.example.domain.models.CreatePostsResponseModel

data class CreatePostsResponseUI(
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

fun CreatePostsResponseModel.toUI() = CreatePostsResponseUI(
    data = data?.toUI()
)

fun CreatePostsResponseModel.Data.toUI() = CreatePostsResponseUI.Data(
    attributes = attributes?.toUI(),
    id = id,
    links = links?.toUI(),
    relationships = relationships?.toUI(),
    type = type
)

fun CreatePostsResponseModel.Data.Attributes.toUI() = CreatePostsResponseUI.Data.Attributes(
    blocked = blocked,
    commentsCount = commentsCount,
    content = content,
    contentFormatted = contentFormatted,
    createdAt = createdAt,
    deletedAt = deletedAt,
    editedAt = editedAt,
    embed = embed,
    embedUrl = embedUrl,
    lockedAt = lockedAt,
    lockedReason = lockedReason,
    nsfw = nsfw,
    postLikesCount = postLikesCount,
    spoiler = spoiler,
    targetInterest = targetInterest,
    topLevelCommentsCount = topLevelCommentsCount,
    updatedAt = updatedAt
)

fun CreatePostsResponseModel.Data.Links.toUI() = CreatePostsResponseUI.Data.Links(
    self = self
)

fun CreatePostsResponseModel.Data.Relationships.toUI() = CreatePostsResponseUI.Data.Relationships(
    ama = ama?.toUI(),
    comments = comments?.toUI(),
    lockedBy = lockedBy?.toUI(),
    media = media?.toUI(),
    postLikes = postLikes?.toUI(),
    spoiledUnit = spoiledUnit?.toUI(),
    targetGroup = targetGroup?.toUI(),
    targetUser = targetUser?.toUI(),
    uploads = uploads?.toUI(),
    user = user?.toUI()
)

fun CreatePostsResponseModel.Data.Relationships.Ama.toUI() =
    CreatePostsResponseUI.Data.Relationships.Ama(
        links = links?.toUI()
    )

fun CreatePostsResponseModel.Data.Relationships.Ama.Links.toUI() =
    CreatePostsResponseUI.Data.Relationships.Ama.Links(
        related = related, self = self
    )

fun CreatePostsResponseModel.Data.Relationships.Comments.toUI() =
    CreatePostsResponseUI.Data.Relationships.Comments(
        links = links?.toUI()
    )

fun CreatePostsResponseModel.Data.Relationships.Comments.Links.toUI() =
    CreatePostsResponseUI.Data.Relationships.Comments.Links(
        related = related, self = self
    )

fun CreatePostsResponseModel.Data.Relationships.LockedBy.toUI() =
    CreatePostsResponseUI.Data.Relationships.LockedBy(
        links = links?.toUI()
    )

fun CreatePostsResponseModel.Data.Relationships.LockedBy.Links.toUI() =
    CreatePostsResponseUI.Data.Relationships.LockedBy.Links(
        related = related, self = self
    )

fun CreatePostsResponseModel.Data.Relationships.Media.toUI() =
    CreatePostsResponseUI.Data.Relationships.Media(
        links = links?.toUI()
    )

fun CreatePostsResponseModel.Data.Relationships.Media.Links.toUI() =
    CreatePostsResponseUI.Data.Relationships.Media.Links(
        related = related, self = self
    )

fun CreatePostsResponseModel.Data.Relationships.PostLikes.toUI() =
    CreatePostsResponseUI.Data.Relationships.PostLikes(
        links = links?.toUI()
    )

fun CreatePostsResponseModel.Data.Relationships.PostLikes.Links.toUI() =
    CreatePostsResponseUI.Data.Relationships.PostLikes.Links(
        related = related, self = self
    )

fun CreatePostsResponseModel.Data.Relationships.SpoiledUnit.toUI() =
    CreatePostsResponseUI.Data.Relationships.SpoiledUnit(
        links = links?.toUI()
    )

fun CreatePostsResponseModel.Data.Relationships.SpoiledUnit.Links.toUI() =
    CreatePostsResponseUI.Data.Relationships.SpoiledUnit.Links(
        related = related, self = self
    )

fun CreatePostsResponseModel.Data.Relationships.TargetGroup.toUI() =
    CreatePostsResponseUI.Data.Relationships.TargetGroup(
        links = links?.toUI()
    )

fun CreatePostsResponseModel.Data.Relationships.TargetGroup.Links.toUI() =
    CreatePostsResponseUI.Data.Relationships.TargetGroup.Links(
        related = related, self = self
    )

fun CreatePostsResponseModel.Data.Relationships.TargetUser.toUI() =
    CreatePostsResponseUI.Data.Relationships.TargetUser(
        links = links?.toUI()
    )

fun CreatePostsResponseModel.Data.Relationships.TargetUser.Links.toUI() =
    CreatePostsResponseUI.Data.Relationships.TargetUser.Links(
        related = related, self = self
    )

fun CreatePostsResponseModel.Data.Relationships.Uploads.toUI() =
    CreatePostsResponseUI.Data.Relationships.Uploads(
        links = links?.toUI()
    )

fun CreatePostsResponseModel.Data.Relationships.Uploads.Links.toUI() =
    CreatePostsResponseUI.Data.Relationships.Uploads.Links(
        related = related, self = self
    )

fun CreatePostsResponseModel.Data.Relationships.User.toUI() =
    CreatePostsResponseUI.Data.Relationships.User(
        links = links?.toUI()
    )

fun CreatePostsResponseModel.Data.Relationships.User.Links.toUI() =
    CreatePostsResponseUI.Data.Relationships.User.Links(
        related = related, self = self
    )