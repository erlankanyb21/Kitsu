package com.example.kitsu.presentation.fragments.signIn

import com.example.domain.usecases.SignInUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.models.SignResponseUI
import com.example.kitsu.presentation.models.toUI
import kotlinx.coroutines.flow.asStateFlow

class SignInViewModel(
    private val signInUseCase: SignInUseCase
) : BaseViewModel() {

    private val _signState = mutableUiStateFlow<SignResponseUI>()
    val signState = _signState.asStateFlow()

    fun signIn(username: String, password: String) =
        signInUseCase(
            username,
            password,
        ).gatherRequest(_signState) { it!!.toUI() }

}