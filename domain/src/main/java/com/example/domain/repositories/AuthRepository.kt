package com.example.domain.repositories

import com.example.domain.either.Either
import com.example.domain.models.SignResponseModel
import kotlinx.coroutines.flow.Flow

/**
 * Интерфейс [AuthRepository] содержит функцию [signIn] для аутентификации
 *
 * @author Erlan
 * @since 1.0v
 */
interface AuthRepository {
    fun signIn(username: String, password: String): Flow<Either<String, SignResponseModel?>>
}