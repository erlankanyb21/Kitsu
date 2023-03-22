package com.example.data.repositories

import androidx.paging.PagingData
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.AnimeApiService
import com.example.data.network.paging.anime.AnimePagingSource
import com.example.domain.models.AnimeModel
import com.example.domain.repositories.AnimeRepository
import kotlinx.coroutines.flow.Flow

class AnimeRepositoryImpl(
    private val animeApiService: AnimeApiService
) : AnimeRepository, BaseRepository() {
    override fun fetchPagingAnime(category: String?): Flow<PagingData<AnimeModel.Data>> =
        makePagingRequest(
            AnimePagingSource(
                animeApiService = animeApiService, category
            )
        )
}
