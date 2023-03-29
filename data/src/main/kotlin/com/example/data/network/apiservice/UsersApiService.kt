package com.example.data.network.apiservice

import com.example.data.network.models.UsersDto
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *  Интерфейс для выполнения HTTP-запросов к API users.
 *
 * @author Erlan
 * @since 1.0v
 */
interface UsersApiService {
    /**
     * Получает список пользователей.
     *
     * @param limit Максимальное количество постов в ответе (по умолчанию 20).
     * @param offset Смещение списка (начиная с какого элемента получать список).
     *
     * @return Объект типа [UsersDto] с данными о пользователях.
     */
    @GET("api/edge/users")
    suspend fun fetchUsersList(
        @Query("page[limit]") limit: Int = 20,
        @Query("page[offset]") offset: Int
    ): UsersDto?
}