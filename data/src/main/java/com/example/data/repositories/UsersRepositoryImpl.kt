package com.example.data.repositories

import androidx.paging.PagingData
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.UsersApiService
import com.example.data.network.paging.users.UsersPagingSource
import com.example.domain.models.users.UsersModel
import com.example.domain.repositories.UsersRepository
import kotlinx.coroutines.flow.Flow


class UsersRepositoryImpl(
    private val usersApiService: UsersApiService
) : UsersRepository, BaseRepository() {
    override fun fetchPagingUsers(): Flow<PagingData<UsersModel.Data>> =
        makePagingRequest(UsersPagingSource(usersApiService))
}