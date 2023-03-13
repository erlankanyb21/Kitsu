package com.example.data.repositories

import androidx.paging.PagingData
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.AnimeApiService
import com.example.data.network.paging.anime.AnimePagingSource
import com.example.domain.models.AnimeModel
import com.example.domain.repositories.AnimeRepository
import kotlinx.coroutines.flow.Flow
import org.koin.dsl.module

val dataSourceImpl = module {
    factory { AnimeRepositoryImpl(get()) }
}

class AnimeRepositoryImpl(
    private val animeApiService: AnimeApiService
) : AnimeRepository, BaseRepository() {

    override fun fetchPagingAnime(): Flow<PagingData<AnimeModel.Data>> =
        makePagingRequest(AnimePagingSource(animeApiService))
}