package com.example.data.base


import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingSource

abstract class BaseRepository {

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