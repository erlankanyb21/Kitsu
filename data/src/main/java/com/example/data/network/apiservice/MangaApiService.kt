package com.example.data.network.apiservice

import com.example.data.network.models.manga.MangaDto
import retrofit2.http.GET
import retrofit2.http.Query

interface MangaApiService {

    @GET("api/edge/manga")
    suspend fun fetchMangaList(
        @Query("page[limit]") limit: Int = 20,
        @Query("page[offset]") offset: Int
    ): MangaDto?
}