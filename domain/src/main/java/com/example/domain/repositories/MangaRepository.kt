package com.example.domain.repositories

import androidx.paging.PagingData
import com.example.domain.models.manga.MangaModel
import kotlinx.coroutines.flow.Flow

interface MangaRepository {
    fun fetchPagingManga(query:String?): Flow<PagingData<MangaModel.Data>>
}