package com.example.kitsu.presentation.fragments.signIn

import com.example.domain.usecases.SignInUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.models.SignResponseUI
import com.example.kitsu.presentation.models.toUI
import kotlinx.coroutines.flow.asStateFlow
import org.koin.android.annotation.KoinViewModel

/**
 * ViewModel для фрагмента SignInFragment.
 * @param signInUseCase use case для входа в систему.
 *
 * @author Erlan
 * @since 1.0v
 */
@KoinViewModel
class SignInViewModel(
    private val signInUseCase: SignInUseCase
) : BaseViewModel() {
    private val _signState = mutableUiStateFlow<SignResponseUI>()

    /**
     * Состояние процесса входа в систему.
     */
    val signState = _signState.asStateFlow()

    /**
     * Метод для выполнения входа в систему.
     * @param username имя пользователя.
     * @param password пароль пользователя.
     */
    fun signIn(username: String, password: String) = signInUseCase(
        username,
        password,
    ).gatherRequest(_signState) { it!!.toUI() }

}