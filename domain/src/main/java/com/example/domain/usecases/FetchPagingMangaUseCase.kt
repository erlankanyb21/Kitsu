package com.example.domain.usecases

import com.example.domain.repositories.MangaRepository
import org.koin.core.annotation.Factory

@Factory
class FetchPagingMangaUseCase(
    private val mangaRepository: MangaRepository
) {
    operator fun invoke(category: String?, text: String?) =
        mangaRepository.fetchPagingManga(category, text)
}