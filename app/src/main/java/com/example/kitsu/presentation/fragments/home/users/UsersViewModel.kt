package com.example.kitsu.presentation.fragments.home.users

import androidx.paging.map
import com.example.domain.usecases.FetchPagingUsersUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.mapper.toUI
import kotlinx.coroutines.flow.map

class UsersViewModel(
    private val fetchPagingUsersUseCase: FetchPagingUsersUseCase
) : BaseViewModel() {
    fun pagingUsers() = fetchPagingUsersUseCase().map { pagingData -> pagingData.map { it.toUI() } }

}