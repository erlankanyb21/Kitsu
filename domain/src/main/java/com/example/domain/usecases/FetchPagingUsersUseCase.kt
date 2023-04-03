package com.example.domain.usecases

import com.example.domain.repositories.UsersRepository
import org.koin.core.annotation.Factory

@Factory
class FetchPagingUsersUseCase(
    private val usersRepository: UsersRepository
) {
    operator fun invoke() = usersRepository.fetchPagingUsers()
}