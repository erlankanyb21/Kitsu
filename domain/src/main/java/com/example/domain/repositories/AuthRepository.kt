package com.example.domain.repositories

import com.example.domain.models.auth.SignModel
import com.example.domain.models.auth.SignResponseModel
import com.example.domain.resource.Resource
import kotlinx.coroutines.flow.Flow

interface AuthRepository {

    fun signIn(signModel: SignModel): Flow<Resource<SignResponseModel?>>
}