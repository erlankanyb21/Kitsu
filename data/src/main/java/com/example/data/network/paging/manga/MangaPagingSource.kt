package com.example.data.network.paging.manga

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.data.mappers.toDomain
import com.example.data.network.apiservice.MangaApiService
import com.example.domain.models.manga.MangaModel

class MangaPagingSource(
    private val mangaApiService: MangaApiService,
    private val text:String?
) : PagingSource<Int, MangaModel.Data>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, MangaModel.Data> {
        val offset = params.key ?: 0

        return try {
            val response = mangaApiService.fetchMangaList(offset = offset, text = text)

            val data = response?.toDomain()
            val nextKey = if (data?.data!!.isEmpty()) null else offset + 20
            LoadResult.Page(
                data = data.data!!, null, nextKey = nextKey
            )
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, MangaModel.Data>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(state.config.pageSize)
                ?: anchorPage?.nextKey?.minus(state.config.pageSize)
        }
    }
}