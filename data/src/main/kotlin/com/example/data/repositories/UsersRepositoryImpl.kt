package com.example.data.repositories

import androidx.paging.PagingData
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.UsersApiService
import com.example.data.network.paging.users.UsersPagingSource
import com.example.domain.models.UsersModel
import com.example.domain.repositories.UsersRepository
import kotlinx.coroutines.flow.Flow

/**
 * Реализация интерфейса [UsersRepository], предоставляющего доступ к данным пользователей.
 * @property usersApiService сервис API для получения данных о пользователях.
 *
 * @author Erlan
 * @since 1.0v
 */
class UsersRepositoryImpl(
    private val usersApiService: UsersApiService
) : UsersRepository, BaseRepository() {
    /**
     * Получение пользователей в виде [Flow] с использованием [makePagingRequest].
     * @return [Flow] объект, возвращающий [PagingData] с данными о пользователях.
     */
    override fun fetchPagingUsers(): Flow<PagingData<UsersModel.Data>> =
        makePagingRequest(UsersPagingSource(usersApiService))
}