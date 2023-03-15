package com.example.data.repositories

import androidx.paging.PagingData
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.UsersApiService
import com.example.data.network.pagingSource.users.UsersPagingSource
import com.example.domain.models.UsersModel
import com.example.domain.repositories.UsersRepository
import kotlinx.coroutines.flow.Flow
import org.koin.dsl.module

val usersDataSourceImpl = module {
    single { CategoriesRepositoryImpl(get()) }
}
class UsersRepositoryImpl(
    private val usersApiService: UsersApiService
) : UsersRepository, BaseRepository() {
    override fun fetchPagingUsers(): Flow<PagingData<UsersModel.Data>> =
        makePagingRequest(UsersPagingSource(usersApiService))
}