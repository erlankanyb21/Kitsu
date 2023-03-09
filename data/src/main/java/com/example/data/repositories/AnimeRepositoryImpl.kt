package com.example.data.repositories

import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.AnimeApiService
import com.example.domain.repositories.AnimeRepository

class AnimeRepositoryImpl (
    private val animeApiService : AnimeApiService
    ) : AnimeRepository, BaseRepository()
{

}