package com.example.data.network.apiservice

import com.example.data.network.models.auth.SignDto
import com.example.data.network.models.auth.SignResponseDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApiService {

    @POST("/api/oauth/token")
    fun signIn(
        @Body signDto: SignDto
    ): SignResponseDto

}