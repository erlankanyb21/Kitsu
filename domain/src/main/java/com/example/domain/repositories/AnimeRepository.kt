package com.example.domain.repositories

import androidx.paging.PagingData
import com.example.domain.models.anime.AnimeModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchPagingAnime(category:String?): Flow<PagingData<AnimeModel.Data>>
}