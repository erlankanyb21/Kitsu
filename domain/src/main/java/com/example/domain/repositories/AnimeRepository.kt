package com.example.domain.repositories

import com.example.domain.models.AnimeModel
import com.example.domain.resource.Resource
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchAnimeList(): Flow<Resource<AnimeModel?>>

}