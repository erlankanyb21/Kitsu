package com.example.kitsu.presentation.fragments.signIn

import com.example.domain.usecases.SignInUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.models.SignResponseUI
import com.example.kitsu.presentation.models.toUI
import com.example.kitsu.presentation.state.UIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SignInViewModel(
    private val signInUseCase: SignInUseCase
) : BaseViewModel() {

    private val _signState = MutableStateFlow<UIState<SignResponseUI?>>(UIState.Empty())
    val signState = _signState.asStateFlow()
    fun signIn(username: String, password: String) =
        signInUseCase(username, password).collectingStates({
            _signState.value = UIState.Loading()
        }, {
            _signState.value = UIState.Error(it.toString())
        }, {
            _signState.value = UIState.Success(data = it!!.toUI())
        })
}