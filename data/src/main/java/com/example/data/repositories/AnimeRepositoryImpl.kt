package com.example.data.repositories

import androidx.paging.PagingData
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.AnimeApiService
import com.example.data.network.pagingSource.anime.AnimePagingSource
import com.example.domain.models.AnimeModel
import com.example.domain.repositories.AnimeRepository
import kotlinx.coroutines.flow.Flow
import org.koin.dsl.module

val animeDataSourceImpl = module {
    single { AnimeRepositoryImpl(get()) }
}
class AnimeRepositoryImpl(
    private val animeApiService: AnimeApiService
) : AnimeRepository, BaseRepository() {
    override fun fetchPagingAnime(text:String): Flow<PagingData<AnimeModel.Data>> =
        makePagingRequest(AnimePagingSource(
                animeApiService = animeApiService,
                text = text))
}
