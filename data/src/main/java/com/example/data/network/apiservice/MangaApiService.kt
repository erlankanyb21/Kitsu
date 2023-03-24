package com.example.data.network.apiservice

import com.example.data.network.models.MangaDto
import retrofit2.http.GET
import retrofit2.http.Query

interface MangaApiService {
    @GET("api/edge/manga")
    suspend fun fetchMangaList(
        @Query("page[limit]") limit: Int = 20,
        @Query("page[offset]") offset: Int,
        @Query("filter[categories]") category: String? = null,
        @Query("filter[text]") text: String? = null,
    ): MangaDto?
}