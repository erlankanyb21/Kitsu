package com.example.data.network.paging.users

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.data.mappers.toDomain
import com.example.data.network.apiservice.UsersApiService
import com.example.domain.models.UsersModel

class UsersPagingSource(
    private val usersApiService: UsersApiService
) : PagingSource<Int, UsersModel.Data>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, UsersModel.Data> {
        val offset = params.key ?: 0

        return try {
            val response = usersApiService.fetchUsersList(offset = offset)

            val data = response?.toDomain()
            val nextKey = if (data?.data!!.isEmpty()) null else offset + 20
            LoadResult.Page(
                data = data.data!!, null, nextKey = nextKey
            )
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, UsersModel.Data>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(state.config.pageSize)
                ?: anchorPage?.nextKey?.minus(state.config.pageSize)
        }
    }
}