package com.example.domain.repositories

import com.example.domain.either.Either
import com.example.domain.models.SignResponseModel
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    fun signIn(username: String, password: String): Flow<Either<String, SignResponseModel?>>
}