package com.example.domain.usecases

import com.example.domain.repositories.MangaRepository

class FetchPagingMangaUseCase(
    private val mangaRepository: MangaRepository
) {
    operator fun invoke(query:String) = mangaRepository.fetchPagingManga(query)
}