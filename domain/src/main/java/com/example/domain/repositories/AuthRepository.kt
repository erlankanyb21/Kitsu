package com.example.domain.repositories

import com.example.domain.models.SignResponseModel
import com.example.domain.resource.Resource
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    fun signIn(username: String, password: String): Flow<Resource<SignResponseModel?>>
}