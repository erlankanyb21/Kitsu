package com.example.domain.usecases

import com.example.domain.repositories.AuthRepository

class SignInUseCase(
    private val authRepository: AuthRepository
) {
    operator fun invoke(username: String, password: String) =
        authRepository.signIn(username, password)
}