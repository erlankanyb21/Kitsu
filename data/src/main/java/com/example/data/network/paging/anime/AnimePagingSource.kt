package com.example.data.network.paging.anime

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.data.mappers.toDomain
import com.example.data.network.apiservice.AnimeApiService
import com.example.domain.models.AnimeModel

class AnimePagingSource(
    private val animeApiService: AnimeApiService,
    private val category: String
) : PagingSource<Int, AnimeModel.Data>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, AnimeModel.Data> {
        val offset = params.key ?: 0

        return try {
            val response = animeApiService.fetchAnimeList(offset = offset, category = category)

            val data = response?.toDomain()
            val nextKey = if (data?.data!!.isEmpty()) null else offset + 20
            LoadResult.Page(
                data = data.data!!, null, nextKey = nextKey
            )
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, AnimeModel.Data>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(state.config.pageSize)
                ?: anchorPage?.nextKey?.minus(state.config.pageSize)
        }
    }
}