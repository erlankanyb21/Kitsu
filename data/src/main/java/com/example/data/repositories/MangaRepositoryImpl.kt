package com.example.data.repositories

import androidx.paging.PagingData
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.MangaApiService
import com.example.data.network.pagingSource.manga.MangaPagingSource
import com.example.domain.models.MangaModel
import com.example.domain.repositories.MangaRepository
import kotlinx.coroutines.flow.Flow
import org.koin.dsl.module

val mangaDataSourceImpl = module {
    single { MangaRepositoryImpl(get()) }
}
class MangaRepositoryImpl(
    private val mangaApiService: MangaApiService
) : MangaRepository, BaseRepository() {
    override fun fetchPagingManga(): Flow<PagingData<MangaModel.Data>> =
        makePagingRequest(MangaPagingSource(mangaApiService))
}