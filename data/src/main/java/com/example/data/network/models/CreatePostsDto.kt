package com.example.data.network.models

import com.example.domain.models.CreatePostModel

data class CreatePostsDto(
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

fun CreatePostsDto.toDomain() = CreatePostModel(
    data = data?.toDomain()
)

fun CreatePostsDto.Data.toDomain() = CreatePostModel.Data(
    attributes?.toDomain(),
    relationships?.toDomain(),
    type = type
)

fun CreatePostsDto.Data.Attributes.toDomain() = CreatePostModel.Data.Attributes(
    content = content, nsfw = nsfw, spoiler = spoiler
)

fun CreatePostsDto.Data.Relationships.toDomain() = CreatePostModel.Data.Relationships(
    uploads?.toDomain(), user?.toDomain()
)

fun CreatePostsDto.Data.Relationships.Uploads.toDomain() =
    CreatePostModel.Data.Relationships.Uploads(
        data = data
    )

fun CreatePostsDto.Data.Relationships.User.toDomain() = CreatePostModel.Data.Relationships.User(
    data = data?.toDomain()
)

fun CreatePostsDto.Data.Relationships.User.Data.toDomain() =
    CreatePostModel.Data.Relationships.User.Data(
        id = id, type = type
    )
