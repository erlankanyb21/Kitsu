package com.example.kitsu.presentation.models.auth

import com.example.data.network.models.auth.SignDto
import com.example.data.network.models.auth.SignResponseDto
import com.example.domain.models.auth.SignModel
import com.example.domain.models.auth.SignResponseModel

data class SignUI(
    val grantType: String = "password",
    val password: String = "",
    val username: String = ""
)
data class SignResponseUI(
    val accessToken: String? = "",
    val createdAt: Int? = 0,
    val expiresIn: Int? = 0,
    val refreshToken: String? = "",
    val scope: String? = "",
    val tokenType: String? = ""
)

fun SignModel.fromUItoDomain() = SignModel(
    grantType = grantType,
    password = password,
    username = username
)

fun SignResponseModel.fromUItoDomain() = SignResponseModel(
    accessToken = accessToken,
    createdAt = createdAt,
    expiresIn = expiresIn,
    refreshToken = refreshToken,
    scope = scope,
    tokenType = tokenType
)

/*------------------------------------------------*/
fun SignModel.toUI() = SignUI(
    grantType = grantType,
    password = password,
    username = username
)

fun SignResponseModel.toUI() = SignResponseUI(
    accessToken = accessToken,
    createdAt = createdAt,
    expiresIn = expiresIn,
    refreshToken = refreshToken,
    scope = scope,
    tokenType = tokenType
)