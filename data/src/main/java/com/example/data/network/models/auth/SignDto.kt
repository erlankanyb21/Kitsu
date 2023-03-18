package com.example.data.network.models.auth


import com.example.domain.models.auth.SignModel
import com.example.domain.models.auth.SignResponseModel
import com.google.gson.annotations.SerializedName

data class SignDto(
    @SerializedName("grant_type")
    val grantType: String = "password",
    @SerializedName("password")
    val password: String = "",
    @SerializedName("username")
    val username: String = ""
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

fun SignModel.fromDomainToDto() = SignDto(
    grantType = grantType,
    password = password,
    username = username
)

fun SignResponseModel.fromDomainToDto() = SignResponseDto(
    accessToken = accessToken,
    createdAt = createdAt,
    expiresIn = expiresIn,
    refreshToken = refreshToken,
    scope = scope,
    tokenType = tokenType
)
/*------------------------------------------*/
fun SignDto.toDomain() = SignModel(
    grantType = grantType,
    password = password,
    username = username
)

fun SignResponseDto.toDomain() = SignResponseModel(
    accessToken = accessToken,
    createdAt = createdAt,
    expiresIn = expiresIn,
    refreshToken = refreshToken,
    scope = scope,
    tokenType = tokenType
)