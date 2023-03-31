package com.example.data.network.paging.posts

import com.example.data.network.apiservice.PostsApiService
import com.example.data.network.models.toDomain
import com.example.data.network.paging.base.BasePagingSource
import com.example.domain.models.PostsModel

class PostsPagingSource(
    private val postsApiService: PostsApiService
) : BasePagingSource<Int, PostsModel.Data>() {
    override val initialKey: Int = 0

    override suspend fun fetchData(params: LoadParams<Int>): List<PostsModel.Data> {
        val response = postsApiService.fetchPosts(
            offset = params.key ?: 0,
        )
        return response?.toDomain()?.data ?: emptyList()
    }

    override fun getKey(item: PostsModel.Data): Int {
        return item.id!!.toInt()
    }

    override fun getNextKey(key: Int, data: List<PostsModel.Data>): Int? {
        return if (data.isEmpty()) null else key + 20
    }
}