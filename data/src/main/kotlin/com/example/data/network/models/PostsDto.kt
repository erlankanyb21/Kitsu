package com.example.data.network.models

import com.example.domain.models.PostsModel
import com.google.gson.annotations.SerializedName

data class PostsDto(
    @SerializedName("data") val `data`: List<Data>? = listOf(),
    @SerializedName("links") val links: Links? = Links(),
    @SerializedName("meta") val meta: Meta? = Meta()
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
            @SerializedName("embed") val embed: Embed? = null,
            @SerializedName("embedUrl") val embedUrl: Any? = null,
            @SerializedName("lockedAt") val lockedAt: Any? = null,
            @SerializedName("lockedReason") val lockedReason: Any? = null,
            @SerializedName("nsfw") val nsfw: Boolean? = false,
            @SerializedName("postLikesCount") val postLikesCount: Int? = 0,
            @SerializedName("spoiler") val spoiler: Boolean? = false,
            @SerializedName("targetInterest") val targetInterest: Any? = null,
            @SerializedName("topLevelCommentsCount") val topLevelCommentsCount: Int? = 0,
            @SerializedName("updatedAt") val updatedAt: String? = ""
        ) {
            data class Embed(
                @SerializedName("image") val image: Image? = Image(),
                @SerializedName("kind") val kind: String? = "",
                @SerializedName("title") val title: String? = "",
                @SerializedName("url") val url: String? = ""
            ) {
                data class Image(
                    @SerializedName("height") val height: Int? = 0,
                    @SerializedName("type") val type: String? = "",
                    @SerializedName("url") val url: String? = "",
                    @SerializedName("width") val width: Int? = 0
                )
            }
        }

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

    data class Links(
        @SerializedName("first") val first: String? = "",
        @SerializedName("last") val last: String? = "",
        @SerializedName("next") val next: String? = ""
    )

    data class Meta(
        @SerializedName("count") val count: Int? = 0
    )
}

fun PostsDto.toDomain() = PostsModel(
    data = data?.map { it.toDomain() }, meta = meta?.toDomain(), links = links?.toDomain()
)

fun PostsDto.Data.toDomain() = PostsModel.Data(
    attributes = attributes?.toDomain(),
    id = id,
    links = links?.toDomain(),
    relationships = relationships?.toDomain(),
    type = type
)

fun PostsDto.Data.Links.toDomain() = PostsModel.Data.Links(
    self = self
)

fun PostsDto.Data.Relationships.toDomain() = PostsModel.Data.Relationships(
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

fun PostsDto.Data.Relationships.Ama.todDomain() = PostsModel.Data.Relationships.Ama(
    links = links?.todDomain()
)

fun PostsDto.Data.Relationships.Ama.Links.todDomain() = PostsModel.Data.Relationships.Ama.Links(
    related = related, self = self
)

fun PostsDto.Data.Relationships.Comments.toDomain() = PostsModel.Data.Relationships.Comments(
    links = links?.todDomain()
)

fun PostsDto.Data.Relationships.Comments.Links.todDomain() =
    PostsModel.Data.Relationships.Comments.Links(
        related = related, self = self
    )

fun PostsDto.Data.Relationships.LockedBy.toDomain() = PostsModel.Data.Relationships.LockedBy(
    links = links?.todDomain()
)

fun PostsDto.Data.Relationships.LockedBy.Links.todDomain() =
    PostsModel.Data.Relationships.LockedBy.Links(
        related = related, self = self
    )

fun PostsDto.Data.Relationships.Media.toDomain() = PostsModel.Data.Relationships.Media(
    links = links?.todDomain()
)

fun PostsDto.Data.Relationships.Media.Links.todDomain() = PostsModel.Data.Relationships.Media.Links(
    related = related, self = self
)

fun PostsDto.Data.Relationships.PostLikes.toDomain() = PostsModel.Data.Relationships.PostLikes(
    links = links?.todDomain()
)

fun PostsDto.Data.Relationships.PostLikes.Links.todDomain() =
    PostsModel.Data.Relationships.PostLikes.Links(
        related = related, self = self
    )

fun PostsDto.Data.Relationships.SpoiledUnit.toDomain() = PostsModel.Data.Relationships.SpoiledUnit(
    links = links?.todDomain()
)

fun PostsDto.Data.Relationships.SpoiledUnit.Links.todDomain() =
    PostsModel.Data.Relationships.SpoiledUnit.Links(
        related = related, self = self
    )

fun PostsDto.Data.Relationships.TargetGroup.toDomain() = PostsModel.Data.Relationships.TargetGroup(
    links = links?.todDomain()
)

fun PostsDto.Data.Relationships.TargetGroup.Links.todDomain() =
    PostsModel.Data.Relationships.TargetGroup.Links(
        related = related, self = self
    )

fun PostsDto.Data.Relationships.TargetUser.toDomain() = PostsModel.Data.Relationships.TargetUser(
    links = links?.todDomain()
)

fun PostsDto.Data.Relationships.TargetUser.Links.todDomain() =
    PostsModel.Data.Relationships.TargetUser.Links(
        related = related, self = self
    )

fun PostsDto.Data.Relationships.Uploads.toDomain() = PostsModel.Data.Relationships.Uploads(
    links = links?.todDomain()
)

fun PostsDto.Data.Relationships.Uploads.Links.todDomain() =
    PostsModel.Data.Relationships.Uploads.Links(
        related = related, self = self
    )

fun PostsDto.Data.Relationships.User.toDomain() = PostsModel.Data.Relationships.User(
    links = links?.todDomain()
)

fun PostsDto.Data.Relationships.User.Links.todDomain() = PostsModel.Data.Relationships.User.Links(
    related = related, self = self
)

fun PostsDto.Data.Attributes.toDomain() = PostsModel.Data.Attributes(
    blocked = blocked,
    commentsCount = commentsCount,
    content = content,
    contentFormatted = contentFormatted,
    createdAt = createdAt,
    deletedAt = deletedAt,
    editedAt = editedAt,
    embed = embed?.toDomain(),
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

fun PostsDto.Data.Attributes.Embed.toDomain() = PostsModel.Data.Attributes.Embed(
    image = image?.toDomain(),
    kind = kind,
    title = title,
    url = url
)

fun PostsDto.Data.Attributes.Embed.Image.toDomain() = PostsModel.Data.Attributes.Embed.Image(
    height = height,
    type = type,
    url = url,
    width = width
)

fun PostsDto.Meta.toDomain() = PostsModel.Meta(
    count = count
)

fun PostsDto.Links.toDomain() = PostsModel.Links(
    first = first, last = last, next = next
)