package com.example.data.network.apiservice

import com.example.data.network.models.anime.AnimeDto
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeApiService {

    @GET("/api/edge/anime")
    suspend fun fetchAnimeList(
        @Query("page[limit]") limit: Int = 20,
        @Query("page[offset]") offset: Int
    ): AnimeDto?
}