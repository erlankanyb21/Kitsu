package com.example.data.base

import com.example.data.network.resource.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

abstract class BaseRepository {

    protected fun <T> doRequest(response:T) = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = response))
        }catch (e:Exception){
            emit(Resource.Error(e.localizedMessage as String))
        }
    }.flowOn(Dispatchers.Default)



}