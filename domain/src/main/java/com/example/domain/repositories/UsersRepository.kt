package com.example.domain.repositories

import androidx.paging.PagingData
import com.example.domain.models.UsersModel
import kotlinx.coroutines.flow.Flow

/**
 * Интерфейс [UsersRepository] содержит функцию [fetchPagingUsers] для получения
 * [PagingData] объектов [UsersModel.Data] с помощью [UsersApiService].
 *
 * @author Erlan
 * @since 1.0v
 */
interface UsersRepository {
    /**
     * Функция [fetchPagingUsers] возвращает [Flow] объект, который представляет собой
     * список [UsersModel.Data], обернутый в [PagingData], полученный из [UsersApiService].
     * @return возвращает [Flow] объект, который содержит [PagingData] с объектами [UsersModel.Data]
     */
    fun fetchPagingUsers(): Flow<PagingData<UsersModel.Data>>
}