package com.example.domain.repositories

import androidx.paging.PagingData
import com.example.domain.models.users.UsersModel
import kotlinx.coroutines.flow.Flow

interface UsersRepository {
    fun fetchPagingUsers(): Flow<PagingData<UsersModel.Data>>
}