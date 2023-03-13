package com.example.domain.repositories

import androidx.paging.PagingData
import com.example.domain.models.AnimeModel
import com.example.domain.resource.Resource
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchPagingAnime(): Flow<PagingData<AnimeModel.Data>>
}