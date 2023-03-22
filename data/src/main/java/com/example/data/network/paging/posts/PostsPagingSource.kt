package com.example.data.network.paging.posts

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.data.mappers.toDomain
import com.example.data.network.apiservice.PostsApiService
import com.example.domain.models.PostsModel

class PostsPagingSource(
    private val postsApiService: PostsApiService
) : PagingSource<Int, PostsModel.Data>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PostsModel.Data> {
        val offset = params.key ?: 0

        return try {
            val response = postsApiService.fetchPosts(offset = offset)

            val data = response?.toDomain()
            val nextKey = if (data?.data!!.isEmpty()) null else offset + 20
            LoadResult.Page(
                data = data.data!!, null, nextKey = nextKey
            )
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, PostsModel.Data>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(state.config.pageSize)
                ?: anchorPage?.nextKey?.minus(state.config.pageSize)
        }
    }
}