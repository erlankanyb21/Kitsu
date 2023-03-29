package com.example.kitsu.presentation.fragments.home.users

import androidx.paging.map
import com.example.domain.usecases.FetchPagingUsersUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.mapper.toUI
import kotlinx.coroutines.flow.map

/**
 * ViewModel для экрана "Пользователи".
 * @param fetchPagingUsersUseCase use-case для получения списка пользователей с помощью Paging3 библиотеки.
 *
 * @author Erlan
 * @since 1.0v
 */
class UsersViewModel(
    private val fetchPagingUsersUseCase: FetchPagingUsersUseCase
) : BaseViewModel() {
    /**
     * Запрашивает список пользователей с помощью [fetchPagingUsersUseCase] и преобразует его в UI модель.
     * @return Flow<PagingData<UsersUI>>, представляющий список пользователей в UI модели.
     */
    fun pagingUsers() = fetchPagingUsersUseCase().map { pagingData -> pagingData.map { it.toUI() } }
}