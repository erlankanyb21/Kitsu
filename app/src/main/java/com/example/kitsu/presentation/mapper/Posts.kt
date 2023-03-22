package com.example.kitsu.presentation.mapper

import com.example.domain.models.PostsModel
import com.example.kitsu.presentation.models.PostsUI


fun PostsModel.toUI() = PostsUI(
    data = data?.map { it.toUI() }, meta = meta?.toUI(), links = links?.toUI()
)

fun PostsModel.Data.toUI() = PostsUI.Data(
    attributes = attributes?.toUI(),
    id = id,
    links = links?.toUI(),
    relationships = relationships?.toUI(),
    type = type
)

fun PostsModel.Data.Links.toUI() = PostsUI.Data.Links(
    self = self
)

fun PostsModel.Data.Relationships.toUI() = PostsUI.Data.Relationships(
    ama = ama?.todDomain(),
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

fun PostsModel.Data.Relationships.Ama.todDomain() = PostsUI.Data.Relationships.Ama(
    links = links?.todDomain()
)

fun PostsModel.Data.Relationships.Ama.Links.todDomain() = PostsUI.Data.Relationships.Ama.Links(
    related = related, self = self
)

fun PostsModel.Data.Relationships.Comments.toUI() = PostsUI.Data.Relationships.Comments(
    links = links?.todDomain()
)

fun PostsModel.Data.Relationships.Comments.Links.todDomain() =
    PostsUI.Data.Relationships.Comments.Links(
        related = related, self = self
    )

fun PostsModel.Data.Relationships.LockedBy.toUI() = PostsUI.Data.Relationships.LockedBy(
    links = links?.todDomain()
)

fun PostsModel.Data.Relationships.LockedBy.Links.todDomain() =
    PostsUI.Data.Relationships.LockedBy.Links(
        related = related, self = self
    )

fun PostsModel.Data.Relationships.Media.toUI() = PostsUI.Data.Relationships.Media(
    links = links?.todDomain()
)

fun PostsModel.Data.Relationships.Media.Links.todDomain() = PostsUI.Data.Relationships.Media.Links(
    related = related, self = self
)

fun PostsModel.Data.Relationships.PostLikes.toUI() = PostsUI.Data.Relationships.PostLikes(
    links = links?.todDomain()
)

fun PostsModel.Data.Relationships.PostLikes.Links.todDomain() =
    PostsUI.Data.Relationships.PostLikes.Links(
        related = related, self = self
    )

fun PostsModel.Data.Relationships.SpoiledUnit.toUI() = PostsUI.Data.Relationships.SpoiledUnit(
    links = links?.todDomain()
)

fun PostsModel.Data.Relationships.SpoiledUnit.Links.todDomain() =
    PostsUI.Data.Relationships.SpoiledUnit.Links(
        related = related, self = self
    )

fun PostsModel.Data.Relationships.TargetGroup.toUI() = PostsUI.Data.Relationships.TargetGroup(
    links = links?.todDomain()
)

fun PostsModel.Data.Relationships.TargetGroup.Links.todDomain() =
    PostsUI.Data.Relationships.TargetGroup.Links(
        related = related, self = self
    )

fun PostsModel.Data.Relationships.TargetUser.toUI() = PostsUI.Data.Relationships.TargetUser(
    links = links?.todDomain()
)

fun PostsModel.Data.Relationships.TargetUser.Links.todDomain() =
    PostsUI.Data.Relationships.TargetUser.Links(
        related = related, self = self
    )

fun PostsModel.Data.Relationships.Uploads.toUI() = PostsUI.Data.Relationships.Uploads(
    links = links?.todDomain()
)

fun PostsModel.Data.Relationships.Uploads.Links.todDomain() =
    PostsUI.Data.Relationships.Uploads.Links(
        related = related, self = self
    )

fun PostsModel.Data.Relationships.User.toUI() = PostsUI.Data.Relationships.User(
    links = links?.todDomain()
)

fun PostsModel.Data.Relationships.User.Links.todDomain() = PostsUI.Data.Relationships.User.Links(
    related = related, self = self
)

fun PostsModel.Data.Attributes.toUI() = PostsUI.Data.Attributes(
    blocked = blocked,
    commentsCount = commentsCount,
    content = content,
    contentFormatted = contentFormatted,
    createdAt = createdAt,
    deletedAt = deletedAt,
    editedAt = editedAt,
    embed = embed?.toUI(),
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

fun PostsModel.Data.Attributes.Embed.toUI() = PostsUI.Data.Attributes.Embed(
    image = image?.toUI(),
    kind = kind,
    title = title,
    url = url
)

fun PostsModel.Data.Attributes.Embed.Image.toUI() = PostsUI.Data.Attributes.Embed.Image(
    height = height,
    type = type,
    url = url,
    width = width
)

fun PostsModel.Meta.toUI() = PostsUI.Meta(
    count = count
)

fun PostsModel.Links.toUI() = PostsUI.Links(
    first = first, last = last, next = next
)