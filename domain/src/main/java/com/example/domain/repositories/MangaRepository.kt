package com.example.domain.repositories

import androidx.paging.PagingData
import com.example.domain.models.MangaModel
import kotlinx.coroutines.flow.Flow

interface MangaRepository {
    fun fetchPagingManga(query: String?, text: String?): Flow<PagingData<MangaModel.Data>>
}