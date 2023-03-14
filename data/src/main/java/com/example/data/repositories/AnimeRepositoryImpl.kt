package com.example.data.repositories

import androidx.paging.PagingData
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.AnimeApiService
import com.example.data.network.apiservice.MangaApiService
import com.example.data.network.paging.anime.AnimePagingSource
import com.example.data.network.paging.manga.MangaPagingSource
import com.example.domain.models.AnimeModel
import com.example.domain.models.MangaModel
import com.example.domain.repositories.AnimeRepository
import com.example.domain.repositories.MangaRepository
import kotlinx.coroutines.flow.Flow
import org.koin.dsl.module

val animeDataSourceImpl = module {
    single { AnimeRepositoryImpl(get()) }
    single { MangaRepositoryImpl(get()) }
}

class AnimeRepositoryImpl(
    private val animeApiService: AnimeApiService
) : AnimeRepository, BaseRepository() {
    override fun fetchPagingAnime(): Flow<PagingData<AnimeModel.Data>> =
        makePagingRequest(AnimePagingSource(animeApiService))

}

class MangaRepositoryImpl(
    private val mangaApiService: MangaApiService
) : MangaRepository, BaseRepository() {
    override fun fetchPagingManga(): Flow<PagingData<MangaModel.Data>> =
        makePagingRequest(MangaPagingSource(mangaApiService))
}