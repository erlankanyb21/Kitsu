package com.example.data.repositories

import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.AuthApiService
import com.example.data.network.models.SignDto
import com.example.data.network.models.toDomain
import com.example.domain.either.Either
import com.example.domain.models.SignResponseModel
import com.example.domain.repositories.AuthRepository
import kotlinx.coroutines.flow.Flow
import org.koin.core.annotation.Single

/**
 * Реализация репозитория аутентификации.
 *
 * @property authApiService API сервис для аутентификации пользователя в приложении.
 *
 * @author Erlan
 * @since 1.0v
 */
@Single
class AuthRepositoryImpl(
    private val authApiService: AuthApiService,
) : AuthRepository, BaseRepository() {

    /**
     * Выполняет вход в систему с заданными учетными данными.
     *
     * @param username Имя пользователя.
     * @param password Пароль пользователя.
     * @return Результат операции входа в систему.
     */
    override fun signIn(
        username: String, password: String
    ): Flow<Either<String, SignResponseModel?>> = makeNetworkRequest(null) {
        authApiService.signIn(SignDto(password = password, username = username)).toDomain()
    }
}