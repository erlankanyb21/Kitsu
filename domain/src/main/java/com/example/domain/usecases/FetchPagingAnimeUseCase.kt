package com.example.domain.usecases

import com.example.domain.repositories.AnimeRepository

class FetchPagingAnimeUseCase(
    private val animeRepository: AnimeRepository
) {
    operator fun invoke() = animeRepository.fetchPagingAnime()
}