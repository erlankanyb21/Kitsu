package com.example.domain.models

data class SignModel(
    val grant_type: String? = "password",
    val password: String? = "",
    val username: String? = ""
)