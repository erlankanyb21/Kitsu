package com.example.domain.models

data class CategoriesModel(
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
            val childCount: Int? = 0,
            val createdAt: String? = "",
            val description: String? = "",
            val nsfw: Boolean? = false,
            val slug: String? = "",
            val title: String? = "",
            val totalMediaCount: Int? = 0,
            val updatedAt: String? = ""
        )

        data class Links(
            val self: String? = ""
        )

        data class Relationships(
            val anime: Anime? = Anime(),
            val drama: Drama? = Drama(),
            val manga: Manga? = Manga(),
            val parent: Parent? = Parent()
        ) {
            data class Anime(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Drama(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Manga(
                val links: Links? = Links()
            ) {
                data class Links(
                    val related: String? = "",
                    val self: String? = ""
                )
            }

            data class Parent(
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
        val next: String? = ""
    )

    data class Meta(
        val count: Int? = 0
    )
}