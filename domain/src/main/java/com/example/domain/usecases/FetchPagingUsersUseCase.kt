package com.example.domain.usecases

import com.example.domain.repositories.UsersRepository

class FetchPagingUsersUseCase(
    private val usersRepository: UsersRepository
) {
    operator fun invoke() = usersRepository.fetchPagingUsers()
}