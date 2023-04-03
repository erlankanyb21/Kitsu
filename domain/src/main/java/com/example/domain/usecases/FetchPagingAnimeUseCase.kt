package com.example.domain.usecases

import com.example.domain.repositories.AnimeRepository
import org.koin.core.annotation.Factory

@Factory
class FetchPagingAnimeUseCase(
    private val animeRepository: AnimeRepository
) {
    operator fun invoke(category: String?, text: String?) =
        animeRepository.fetchPagingAnime(category, text)
}