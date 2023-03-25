package com.example.data.network.apiservice

import com.example.data.network.models.SignDto
import com.example.data.network.models.SignResponseDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApiService {
    @POST("/api/oauth/token")
    suspend fun signIn(
        @Body signDto: SignDto
    ): SignResponseDto
}