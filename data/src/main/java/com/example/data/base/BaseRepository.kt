package com.example.data.base


import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingSource
import com.example.domain.resource.Resource
import kotlinx.coroutines.flow.flow

abstract class BaseRepository {

    protected fun <T> doRequest(response: T) = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = response))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage as String))
        }
    }

    protected fun <Value : Any> makePagingRequest(
        pagingSource: PagingSource<Int, Value>,
        pageSize: Int = 20,
        prefetchDistance: Int = pageSize,
        enablePlaceholders: Boolean = true,
        initialLoadSize: Int = pageSize * 3,
        maxSize: Int = Int.MAX_VALUE,
        jumpThreshold: Int = Int.MIN_VALUE,
    ) =
        Pager(
            config = PagingConfig(
                pageSize,
                prefetchDistance,
                enablePlaceholders,
                initialLoadSize,
                maxSize,
                jumpThreshold
            ),
            pagingSourceFactory = {
                pagingSource
            }
        ).flow

}