package com.example.data.network.apiservice

import com.example.data.network.models.PostsDto
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface PostsApiService {
    @GET("/api/edge/posts")
    suspend fun fetchPosts(
        @Query("page[limit]") limit: Int = 20,
        @Query("page[offset]") offset: Int,
    ): PostsDto?

    @POST("/api/edge/posts")
    suspend fun createPost()

}