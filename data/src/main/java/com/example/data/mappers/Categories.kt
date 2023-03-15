package com.example.data.mappers

import com.example.data.network.models.categories.CategoriesDto
import com.example.domain.models.CategoriesModel

fun CategoriesDto.toDomain() = CategoriesModel(
    data = data?.map { it.toDomain() }, meta = meta?.toDomain(), links = links?.toDomain()
)

fun CategoriesDto.Meta.toDomain() = CategoriesModel.Meta(
    count = count
)

fun CategoriesDto.Links.toDomain() = CategoriesModel.Links(
    first = first, last = last, next = next
)

fun CategoriesDto.Data.toDomain() = CategoriesModel.Data(
    id = id,
    type = type,
    links = links?.toDomain(),
    attributes = attributes?.toDomain(),
    relationships = relationships?.toDomain()
)

fun CategoriesDto.Data.Relationships.toDomain() = CategoriesModel.Data.Relationships(
    anime = anime?.toDomain(),
    drama = drama?.toDomain(),
    manga = manga?.toDomain(),
    parent = parent?.toDomain()
)
fun CategoriesDto.Data.Relationships.Parent.toDomain() = CategoriesModel.Data.Relationships.Parent(
    links = links?.toDomain()
)

fun CategoriesDto.Data.Relationships.Parent.Links.toDomain() = CategoriesModel.Data.Relationships.Parent.Links(
   related = related, self = self
)

fun CategoriesDto.Data.Relationships.Manga.toDomain() = CategoriesModel.Data.Relationships.Manga(
    links = links?.toDomain()
)


fun CategoriesDto.Data.Relationships.Manga.Links.toDomain() = CategoriesModel.Data.Relationships.Manga.Links(
    related = related, self = self
)

fun CategoriesDto.Data.Relationships.Drama.toDomain()= CategoriesModel.Data.Relationships.Drama(
    links = links?.toDomain()
)

fun CategoriesDto.Data.Relationships.Drama.Links.toDomain()= CategoriesModel.Data.Relationships.Drama.Links(
    related = related, self = self
)

fun CategoriesDto.Data.Relationships.Anime.toDomain() = CategoriesModel.Data.Relationships.Anime(
    links = links?.toDomain()
)

fun CategoriesDto.Data.Relationships.Anime.Links.toDomain() = CategoriesModel.Data.Relationships.Anime.Links(
    related = related, self = self
)

fun CategoriesDto.Data.Attributes.toDomain() = CategoriesModel.Data.Attributes(
    childCount = childCount,
    createdAt = createdAt,
    description = description,
    nsfw = nsfw,
    slug = slug,
    title = title,
    totalMediaCount = totalMediaCount,
    updatedAt = updatedAt
)

fun CategoriesDto.Data.Links.toDomain() = CategoriesModel.Data.Links(
    self = self
)

