package com.example.data.network.models

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