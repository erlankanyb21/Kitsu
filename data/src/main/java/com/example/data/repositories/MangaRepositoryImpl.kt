package com.example.data.repositories

import androidx.paging.PagingData
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.MangaApiService
import com.example.data.network.paging.manga.MangaPagingSource
import com.example.domain.models.MangaModel
import com.example.domain.repositories.MangaRepository
import kotlinx.coroutines.flow.Flow

class MangaRepositoryImpl(
    private val mangaApiService: MangaApiService
) : MangaRepository, BaseRepository() {
    override fun fetchPagingManga(query: String?): Flow<PagingData<MangaModel.Data>> =
        makePagingRequest(MangaPagingSource(mangaApiService = mangaApiService, text = query))
}