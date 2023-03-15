package com.example.kitsu.presentation.mapper

import com.example.domain.models.CategoriesModel
import com.example.kitsu.presentation.models.categories.CategoriesUI

fun CategoriesModel.toUI() = CategoriesUI(
    data = data?.map { it.toUI() }, meta = meta?.toUI(), links = links?.toUI()
)

fun CategoriesModel.Meta.toUI() = CategoriesUI.Meta(
    count = count
)

fun CategoriesModel.Links.toUI() = CategoriesUI.Links(
    first = first, last = last, next = next
)

fun CategoriesModel.Data.toUI() = CategoriesUI.Data(
    id = id,
    type = type,
    links = links?.toUI(),
    attributes = attributes?.toUI(),
    relationships = relationships?.toUI()
)

fun CategoriesModel.Data.Relationships.toUI() = CategoriesUI.Data.Relationships(
    anime = anime?.toUI(),
    drama = drama?.toUI(),
    manga = manga?.toUI(),
    parent = parent?.toUI()
)
fun CategoriesModel.Data.Relationships.Parent.toUI() = CategoriesUI.Data.Relationships.Parent(
    links = links?.toUI()
)

fun CategoriesModel.Data.Relationships.Parent.Links.toUI() = CategoriesUI.Data.Relationships.Parent.Links(
    related = related, self = self
)

fun CategoriesModel.Data.Relationships.Manga.toUI() = CategoriesUI.Data.Relationships.Manga(
    links = links?.toUI()
)

fun CategoriesModel.Data.Relationships.Manga.Links.toUI() = CategoriesUI.Data.Relationships.Manga.Links(
    related = related, self = self
)

fun CategoriesModel.Data.Relationships.Drama.toUI()= CategoriesUI.Data.Relationships.Drama(
    links = links?.toUI()
)

fun CategoriesModel.Data.Relationships.Drama.Links.toUI()= CategoriesUI.Data.Relationships.Drama.Links(
    related = related, self = self
)

fun CategoriesModel.Data.Relationships.Anime.toUI() = CategoriesUI.Data.Relationships.Anime(
    links = links?.toUI()
)

fun CategoriesModel.Data.Relationships.Anime.Links.toUI() = CategoriesUI.Data.Relationships.Anime.Links(
    related = related, self = self
)

fun CategoriesModel.Data.Attributes.toUI() = CategoriesUI.Data.Attributes(
    childCount = childCount,
    createdAt = createdAt,
    description = description,
    nsfw = nsfw,
    slug = slug,
    title = title,
    totalMediaCount = totalMediaCount,
    updatedAt = updatedAt
)

fun CategoriesModel.Data.Links.toUI() = CategoriesUI.Data.Links(
    self = self
)
