package com.example.data.network.apiservice

import com.example.data.network.models.anime.AnimeEntity
import retrofit2.Response
import retrofit2.http.GET

interface AnimeApiService {

    @GET("https://kitsu.io/api/edge/anime")
    suspend fun fetchAnimeList(
    ):Response<List<AnimeEntity>>

}