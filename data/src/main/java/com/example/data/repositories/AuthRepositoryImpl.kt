package com.example.data.repositories

import android.util.Log
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.AuthApiService
import com.example.data.network.models.auth.fromDomainToDto
import com.example.data.network.models.auth.toDomain
import com.example.domain.models.auth.SignModel
import com.example.domain.models.auth.SignResponseModel
import com.example.domain.repositories.AuthRepository
import com.example.domain.resource.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException

class AuthRepositoryImpl(
    private val authApiService: AuthApiService
) : AuthRepository, BaseRepository() {
    override fun signIn(signModel: SignModel): Flow<Resource<SignResponseModel?>> {
        return flow {
            emit(Resource.Loading())
            try {
                val response = authApiService.signIn(signModel.fromDomainToDto())
                if (response.isSuccessful) {
                    emit(
                        Resource.Success(
                            data = response.body()?.toDomain()
                        )
                    )
                    Log.e(
                        "Kitsu", "Sign: ${response.body()}"
                    )
                }
            } catch (e: IOException) {
                emit(Resource.Error(e.localizedMessage as String))
            }
        }
    }
}