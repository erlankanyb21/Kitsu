package com.example.data.network.apiservice

import com.example.data.network.models.SignDto
import com.example.data.network.models.SignResponseDto
import retrofit2.http.Body
import retrofit2.http.POST

/**
 *  Интерфейс для выполнения HTTP-запросов к API аутентификации.
 *
 * @author Erlan
 * @since 1.0v
 */
interface AuthApiService {
    /**
     * Выполняет запрос на аутентификацию пользователя.
     *
     * @param signDto DTO с данными для аутентификации пользователя.
     * @return DTO с токеном доступа или с ошибкой, если произошла ошибка при выполнении запроса.
     */
    @POST("/api/oauth/token")
    suspend fun signIn(
        @Body signDto: SignDto
    ): SignResponseDto
}