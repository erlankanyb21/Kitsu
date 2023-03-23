package com.example.data.repositories

import android.util.Log
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.AuthApiService
import com.example.data.network.models.SignDto
import com.example.data.network.models.toDomain
import com.example.domain.models.SignResponseModel
import com.example.domain.repositories.AuthRepository
import com.example.domain.resource.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException

class AuthRepositoryImpl(
    private val authApiService: AuthApiService
) : AuthRepository, BaseRepository() {
    override fun signIn(username: String, password: String): Flow<Resource<SignResponseModel?>> {
        return flow {
            emit(Resource.Loading())
            try {
                val response =
                    authApiService.signIn(SignDto(username = username, password = password))
                if (response.isSuccessful) {
                    emit(
                        Resource.Success(
                            data = response.body()?.toDomain()
                        )
                    )
                    Log.e(
                        "Kitsu", "Sign: ${response.body()}"
                    )
                } else {
                    emit(
                        Resource.Error("Invalid authentication credentials`")
                    )
                }
            } catch (e: IOException) {
                emit(Resource.Error(e.localizedMessage as String))
            }
        }
    }
}