package com.example.data.network.apiservice

import com.example.data.network.models.AnimeDto
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeApiService {
    @GET("/api/edge/anime")
    suspend fun fetchAnimeList(
        @Query("page[limit]") limit: Int = 20,
        @Query("page[offset]") offset: Int,
        @Query("filter[categories]") category: String? = null,
        @Query("filter[text]") text: String? = null,
    ): AnimeDto?
}