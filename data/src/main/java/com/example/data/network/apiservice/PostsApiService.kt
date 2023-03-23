package com.example.data.network.apiservice

import com.example.data.network.models.CreatePostsDto
import com.example.data.network.models.CreatePostsResponseDto
import com.example.data.network.models.PostsDto
import retrofit2.Response
import retrofit2.http.*

interface PostsApiService {
    @GET("/api/edge/posts")
    suspend fun fetchPosts(
        @Query("page[limit]") limit: Int = 20,
        @Query("page[offset]") offset: Int,
    ): PostsDto?

    @POST("/api/edge/posts")
    suspend fun createPost(
        @Body createPostsDto: CreatePostsDto,
        @Header("Content-Type") contentType: String = "application/vnd.api+json"
    ): Response<CreatePostsResponseDto>
}