package com.example.domain.models.auth

data class SignModel(
    val grant_type: String? = "",
    val password: String? = "",
    val username: String? = ""
)
data class SignResponseModel(
    val accessToken: String? = "",
    val createdAt: Int? = 0,
    val expiresIn: Int? = 0,
    val refreshToken: String? = "",
    val scope: String? = "",
    val tokenType: String? = ""
)