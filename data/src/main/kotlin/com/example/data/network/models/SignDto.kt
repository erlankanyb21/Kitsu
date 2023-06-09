package com.example.data.network.models


import com.example.domain.models.SignModel
import com.example.domain.models.SignResponseModel
import com.google.gson.annotations.SerializedName

data class SignDto(
    val grant_type: String? = "password",
    val password: String? = "",
    val username: String? = ""
)

fun SignDto.toDomain() = SignModel(
    grant_type = grant_type,
    password = password,
    username = username
)

data class SignResponseDto(
    @SerializedName("access_token")
    val accessToken: String? = "",
    @SerializedName("created_at")
    val createdAt: Int? = 0,
    @SerializedName("expires_in")
    val expiresIn: Int? = 0,
    @SerializedName("refresh_token")
    val refreshToken: String? = "",
    @SerializedName("scope")
    val scope: String? = "",
    @SerializedName("token_type")
    val tokenType: String? = ""
)
fun SignResponseDto.toDomain() = SignResponseModel(
    accessToken = accessToken,
    createdAt = createdAt,
    expiresIn = expiresIn,
    refreshToken = refreshToken,
    scope = scope,
    tokenType = tokenType
)