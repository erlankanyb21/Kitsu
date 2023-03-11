package com.example.domain.usecases

import com.example.domain.repositories.AnimeRepository

class FetchAnimeUseCase(
    private val animeRepository: AnimeRepository
) {
    fun fetchAnime() = animeRepository.fetchAnimeList()
}