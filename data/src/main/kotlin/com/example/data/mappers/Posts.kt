package com.example.data.mappers


import com.example.data.network.models.PostsDto
import com.example.domain.models.PostsModel

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