package com.example.domain.usecases

import com.example.domain.models.SignModel
import com.example.domain.repositories.AuthRepository

class SignInUseCase(
    private val authRepository: AuthRepository
) {
    operator fun invoke(signModel: SignModel) = authRepository.signIn(signModel)
}