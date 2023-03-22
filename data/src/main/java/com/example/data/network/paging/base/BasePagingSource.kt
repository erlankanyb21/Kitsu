package com.example.data.network.paging.base

import androidx.paging.PagingSource
import androidx.paging.PagingState

abstract class BasePagingSource<DomainModel : Any>(
    private val request: suspend (offset: Int) -> List<DomainModel>
) : PagingSource<Int, DomainModel>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, DomainModel> {
        val offset = params.key ?: 0
        return try {
            val response = request(offset)
            val nextKey = if (response.isEmpty()) null else offset + 20
            LoadResult.Page(
                data = response, null, nextKey = nextKey
            )
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, DomainModel>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(state.config.pageSize)
                ?: anchorPage?.nextKey?.minus(state.config.pageSize)
        }
    }
}