package com.example.data.network.models.categories

import com.google.gson.annotations.SerializedName

data class CategoriesDto(
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
            @SerializedName("childCount") val childCount: Int? = 0,
            @SerializedName("createdAt") val createdAt: String? = "",
            @SerializedName("description") val description: String? = "",
            @SerializedName("nsfw") val nsfw: Boolean? = false,
            @SerializedName("slug") val slug: String? = "",
            @SerializedName("title") val title: String? = "",
            @SerializedName("totalMediaCount") val totalMediaCount: Int? = 0,
            @SerializedName("updatedAt") val updatedAt: String? = ""
        )

        data class Links(
            @SerializedName("self") val self: String? = ""
        )

        data class Relationships(
            @SerializedName("anime") val anime: Anime? = Anime(),
            @SerializedName("drama") val drama: Drama? = Drama(),
            @SerializedName("manga") val manga: Manga? = Manga(),
            @SerializedName("parent") val parent: Parent? = Parent()
        ) {
            data class Anime(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Drama(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Manga(
                @SerializedName("links") val links: Links? = Links()
            ) {
                data class Links(
                    @SerializedName("related") val related: String? = "",
                    @SerializedName("self") val self: String? = ""
                )
            }

            data class Parent(
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