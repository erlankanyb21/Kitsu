package com.example.data.network.models


import com.example.domain.models.CreatePostsResponseModel
import com.google.gson.annotations.SerializedName

data class CreatePostsResponseDto(
    @SerializedName("data") val `data`: Data? = Data()
) {
    data class Data(
        @SerializedName("attributes") val attributes: Attributes? = Attributes(),
        @SerializedName("id") val id: String? = "",
        @SerializedName("links") val links: Links? = Links(),
        @SerializedName("relationships") val relationships: Relationships? = Relationships(),
        @SerializedName("type") val type: String? = ""
    ) {
        data class Attributes(
            @SerializedName("blocked") val blocked: Boolean? = false,
            @SerializedName("commentsCount") val commentsCount: Int? = 0,
            @SerializedName("content") val content: String? = "",
            @SerializedName("contentFormatted") val contentFormatted: String? = "",
            @SerializedName("createdAt") val createdAt: String? = "",
            @SerializedName("deletedAt") val deletedAt: Any? = null,
            @SerializedName("editedAt") val editedAt: Any? = null,
            @SerializedName("embed") val embed: Any? = null,
            @SerializedName("embedUrl") val embedUrl: Any? = null,
            @SerializedName("lockedAt") val lockedAt: Any? = null,
            @SerializedName("lockedReason") val lockedReason: Any? = null,
            @SerializedName("nsfw") val nsfw: Boolean? = false,
            @SerializedName("postLikesCount") val postLikesCount: Int? = 0,
            @SerializedName("spoiler") val spoiler: Boolean? = false,
            @SerializedName("targetInterest") val targetInterest: Any? = null,
            @SerializedName("topLevelCommentsCount") val topLevelCommentsCount: Int? = 0,
            @SerializedName("updatedAt") val updatedAt: String? = ""
        )

        data class Links(
            @SerializedName("self") val self: String? = ""
        )

        data class Relationships(
            @SerializedName("ama") val ama: Ama? = Ama(),
            @SerializedName("comments") val comments: Comments? = Comments(),
            @SerializedName("lockedBy") val lockedBy: LockedBy? = LockedBy(),
            @SerializedName("media") val media: Media? = Media(),
            @SerializedName("postLikes") val postLikes: PostLikes? = PostLikes(),
            @SerializedName("spoiledUnit") val spoiledUnit: SpoiledUnit? = SpoiledUnit(),
            @SerializedName("targetGroup") val targetGroup: TargetGroup? = TargetGroup(),
            @SerializedName("targetUser") val targetUser: TargetUser? = TargetUser(),
            @SerializedName("uploads") val uploads: Uploads? = Uploads(),
            @SerializedName("user") val user: User? = User()
        ) {
            data class Ama(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Comments(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class LockedBy(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Media(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class PostLikes(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class SpoiledUnit(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class TargetGroup(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class TargetUser(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Uploads(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class User(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }
        }
    }
}

fun CreatePostsResponseDto.toDomain() = CreatePostsResponseModel(
    data = data?.toDomain()
)

fun CreatePostsResponseDto.Data.toDomain() = CreatePostsResponseModel.Data(
    attributes = attributes?.toDomain(),
    id = id,
    links = links?.toDomain(),
    relationships = relationships?.toDomain(),
    type = type
)

fun CreatePostsResponseDto.Data.Attributes.toDomain() = CreatePostsResponseModel.Data.Attributes(
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

fun CreatePostsResponseDto.Data.Links.toDomain() = CreatePostsResponseModel.Data.Links(
    self = self
)

fun CreatePostsResponseDto.Data.Relationships.toDomain() =
    CreatePostsResponseModel.Data.Relationships(
        ama = ama?.todDomain(),
        comments = comments?.toDomain(),
        lockedBy = lockedBy?.toDomain(),
        media = media?.toDomain(),
        postLikes = postLikes?.toDomain(),
        spoiledUnit = spoiledUnit?.toDomain(),
        targetGroup = targetGroup?.toDomain(),
        targetUser = targetUser?.toDomain(),
        uploads = uploads?.toDomain(),
        user = user?.toDomain()
    )

fun CreatePostsResponseDto.Data.Relationships.Ama.todDomain() =
    CreatePostsResponseModel.Data.Relationships.Ama(
        links = links?.todDomain()
    )

fun CreatePostsResponseDto.Data.Relationships.Ama.Links.todDomain() =
    CreatePostsResponseModel.Data.Relationships.Ama.Links(
        related = related, self = self
    )

fun CreatePostsResponseDto.Data.Relationships.Comments.toDomain() =
    CreatePostsResponseModel.Data.Relationships.Comments(
        links = links?.todDomain()
    )

fun CreatePostsResponseDto.Data.Relationships.Comments.Links.todDomain() =
    CreatePostsResponseModel.Data.Relationships.Comments.Links(
        related = related, self = self
    )

fun CreatePostsResponseDto.Data.Relationships.LockedBy.toDomain() =
    CreatePostsResponseModel.Data.Relationships.LockedBy(
        links = links?.todDomain()
    )

fun CreatePostsResponseDto.Data.Relationships.LockedBy.Links.todDomain() =
    CreatePostsResponseModel.Data.Relationships.LockedBy.Links(
        related = related, self = self
    )

fun CreatePostsResponseDto.Data.Relationships.Media.toDomain() =
    CreatePostsResponseModel.Data.Relationships.Media(
        links = links?.todDomain()
    )

fun CreatePostsResponseDto.Data.Relationships.Media.Links.todDomain() =
    CreatePostsResponseModel.Data.Relationships.Media.Links(
        related = related, self = self
    )

fun CreatePostsResponseDto.Data.Relationships.PostLikes.toDomain() =
    CreatePostsResponseModel.Data.Relationships.PostLikes(
        links = links?.todDomain()
    )

fun CreatePostsResponseDto.Data.Relationships.PostLikes.Links.todDomain() =
    CreatePostsResponseModel.Data.Relationships.PostLikes.Links(
        related = related, self = self
    )

fun CreatePostsResponseDto.Data.Relationships.SpoiledUnit.toDomain() =
    CreatePostsResponseModel.Data.Relationships.SpoiledUnit(
        links = links?.todDomain()
    )

fun CreatePostsResponseDto.Data.Relationships.SpoiledUnit.Links.todDomain() =
    CreatePostsResponseModel.Data.Relationships.SpoiledUnit.Links(
        related = related, self = self
    )

fun CreatePostsResponseDto.Data.Relationships.TargetGroup.toDomain() =
    CreatePostsResponseModel.Data.Relationships.TargetGroup(
        links = links?.todDomain()
    )

fun CreatePostsResponseDto.Data.Relationships.TargetGroup.Links.todDomain() =
    CreatePostsResponseModel.Data.Relationships.TargetGroup.Links(
        related = related, self = self
    )

fun CreatePostsResponseDto.Data.Relationships.TargetUser.toDomain() =
    CreatePostsResponseModel.Data.Relationships.TargetUser(
        links = links?.todDomain()
    )

fun CreatePostsResponseDto.Data.Relationships.TargetUser.Links.todDomain() =
    CreatePostsResponseModel.Data.Relationships.TargetUser.Links(
        related = related, self = self
    )

fun CreatePostsResponseDto.Data.Relationships.Uploads.toDomain() =
    CreatePostsResponseModel.Data.Relationships.Uploads(
        links = links?.todDomain()
    )

fun CreatePostsResponseDto.Data.Relationships.Uploads.Links.todDomain() =
    CreatePostsResponseModel.Data.Relationships.Uploads.Links(
        related = related, self = self
    )

fun CreatePostsResponseDto.Data.Relationships.User.toDomain() =
    CreatePostsResponseModel.Data.Relationships.User(
        links = links?.todDomain()
    )

fun CreatePostsResponseDto.Data.Relationships.User.Links.todDomain() =
    CreatePostsResponseModel.Data.Relationships.User.Links(
        related = related, self = self
    )