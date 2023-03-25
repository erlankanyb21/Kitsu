package com.example.domain.repositories

import androidx.paging.PagingData
import com.example.domain.either.Either
import com.example.domain.models.CreatePostsResponseModel
import com.example.domain.models.PostsModel
import kotlinx.coroutines.flow.Flow

interface PostsRepository {
    fun fetchPosts(): Flow<PagingData<PostsModel.Data>>
    fun createPosts(
        content: String,
        nsfw: Boolean,
        spoiler: Boolean
    ): Flow<Either<String, CreatePostsResponseModel?>>
}