package com.example.data.network.apiservice

import com.example.data.network.models.users.UsersDto
import retrofit2.http.GET
import retrofit2.http.Query

interface UsersApiService {
    @GET("api/edge/users")
    suspend fun fetchUsersList(
        @Query("page[limit]") limit: Int = 20,
        @Query("page[offset]") offset: Int
    ): UsersDto?

}