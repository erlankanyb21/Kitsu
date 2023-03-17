package com.example.domain.usecases

import com.example.domain.repositories.AnimeRepository

class FetchCategoryAnimeUseCase(
    private val animeRepository: AnimeRepository
) {
    operator fun invoke(category:String?) = animeRepository.fetchPagingAnime(category)
}