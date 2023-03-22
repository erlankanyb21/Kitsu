package com.example.kitsu.presentation.models

import com.example.domain.models.SignModel
import com.example.domain.models.SignResponseModel

data class SignUI(
    val grant_type: String? = "password",
    val password: String? = "",
    val username: String? = ""
)

data class SignResponseUI(
    val accessToken: String? = "",
    val createdAt: Int? = 0,
    val expiresIn: Int? = 0,
    val refreshToken: String? = "",
    val scope: String? = "",
    val tokenType: String? = ""
)

fun SignUI.fromUItoDomain() = SignModel(
    grant_type = grant_type,
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