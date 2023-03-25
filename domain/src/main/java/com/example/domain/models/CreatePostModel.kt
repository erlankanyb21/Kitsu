package com.example.domain.models

data class CreatePostModel(
    val `data`: Data? = Data()
) {
    data class Data(
        val attributes: Attributes? = Attributes(),
        val relationships: Relationships? = Relationships(),
        val type: String? = "posts"
    ) {
        data class Attributes(
            val content: String? = "", val nsfw: Boolean? = false, val spoiler: Boolean? = false
        )

        data class Relationships(
            val uploads: Uploads? = Uploads(), val user: User? = User()
        ) {
            data class Uploads(
                val `data`: List<Any>? = listOf()
            )

            data class User(
                val `data`: Data? = Data()
            ) {
                data class Data(
                    val id: String? = "1400104", val type: String? = "users"
                )
            }
        }
    }
}