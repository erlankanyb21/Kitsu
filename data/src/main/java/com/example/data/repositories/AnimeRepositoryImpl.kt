package com.example.data.repositories

import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.AnimeApiService
import com.example.domain.models.anime.AnimeModel
import com.example.domain.repositories.AnimeRepository
import com.example.domain.resource.Resource
import kotlinx.coroutines.flow.Flow

class AnimeRepositoryImpl (
    private val animeApiService : AnimeApiService
    ) : AnimeRepository, BaseRepository()
{
    override fun fetchAnimeList(): Flow<Resource<List<AnimeModel>>> {
        TODO("Not yet implemented")
    }
}