package com.example.data.base


import com.example.domain.resource.Resource
import kotlinx.coroutines.flow.flow

abstract class BaseRepository {

    protected fun <T> doRequest(response:T) = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = response))
        }catch (e:Exception){
            emit(Resource.Error(e.localizedMessage as String))
        }
    }

}