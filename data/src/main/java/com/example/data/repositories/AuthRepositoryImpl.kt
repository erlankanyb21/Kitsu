package com.example.data.repositories

import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.AuthApiService
import com.example.data.network.models.SignDto
import com.example.data.network.models.toDomain
import com.example.domain.either.Either
import com.example.domain.models.SignResponseModel
import com.example.domain.repositories.AuthRepository
import kotlinx.coroutines.flow.Flow

class AuthRepositoryImpl(
    private val authApiService: AuthApiService,
) : AuthRepository, BaseRepository() {
    override fun signIn(
        username: String,
        password: String
    ): Flow<Either<String, SignResponseModel?>> =
        makeNetworkRequest(null) {
            authApiService.signIn(SignDto(password = password, username = username))
                .toDomain()
        }
}