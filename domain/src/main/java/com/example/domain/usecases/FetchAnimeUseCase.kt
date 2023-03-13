package com.example.domain.usecases

import com.example.domain.repositories.AnimeRepository

class FetchAnimeUseCase(
    private val animeRepository: AnimeRepository
) {
    fun fetchAnime(limit:Int,offset:Int) = animeRepository.fetchAnimeList(limit, offset)
}