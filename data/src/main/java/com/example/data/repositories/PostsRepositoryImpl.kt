package com.example.data.repositories

import androidx.paging.PagingData
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.PostsApiService
import com.example.data.network.paging.posts.PostsPagingSource
import com.example.domain.models.PostsModel
import com.example.domain.repositories.PostsRepository
import kotlinx.coroutines.flow.Flow

class PostsRepositoryImpl(
    private val postsApiService: PostsApiService
) : PostsRepository, BaseRepository() {

    override fun fetchPosts(): Flow<PagingData<PostsModel.Data>> =
        makePagingRequest(
            PostsPagingSource(
                postsApiService = postsApiService
            )
        )
}