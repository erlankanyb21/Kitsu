package com.example.kitsu.presentation.fragments.signIn

import android.view.View
import android.view.animation.AnimationUtils
import androidx.lifecycle.viewModelScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.data.local.Prefs
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentSignInBinding
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.extensions.activityNavController
import com.example.kitsu.presentation.extensions.navigateSafely
import com.example.kitsu.presentation.ui.customView.CustomToast
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Фрагмент для экрана входа в приложение.
 * При инициализации настраивает интерфейс и обрабатывает события нажатия кнопок.
 * @property viewModel ViewModel для SignInFragment.
 * @property binding Связующий класс для фрагмента Sign In.
 * @property preferences Объект для работы с сохранением настроек приложения.
 *
 * @author Erlan
 * @since 1.0v
 */
class SignInFragment :
    BaseFragment<SignInViewModel, FragmentSignInBinding>(R.layout.fragment_sign_in) {

    override val viewModel by viewModel<SignInViewModel>()
    override val binding by viewBinding(FragmentSignInBinding::bind)
    private val preferences by inject<Prefs>()

    /**
     * Инициализация фрагмента.
     * Вызывает методы для настройки интерфейса и обработки событий нажатия кнопок.
     */
    override fun initialize() {
        setupAnimation()
        clickSignIn()
        checkState()
    }

    /**
     * Настраивает анимацию.
     */
    private fun setupAnimation() {
        val animation = AnimationUtils.loadAnimation(requireContext(), R.anim.logo_anim)

        binding.logo.apply {
            visibility = View.VISIBLE
            startAnimation(animation)
        }
    }

    /**
     * Обрабатывает событие нажатия кнопки "Sign In".
     * В зависимости от заполненности полей "Username" и "Password", либо показывает Toast с просьбой заполнить
     * необходимые поля, либо выполняет метод [SignInViewModel.signIn] с передачей значений полей входа.
     */
    private fun clickSignIn() {
        binding.btnEnter.setOnClickListener {
            checkRequest()
        }
    }

    /**
     * Проверяет состояние входа пользователя.
     * В зависимости от состояния пользователя выполняет различные действия: либо показывает ошибку, полученную от
     * сервера, либо сохраняет токен доступа в настройках приложения и переходит на главный экран.
     */
    private fun checkState() {
        viewModel.viewModelScope.launch {
            viewModel.signState.spectateUiState(error = {
                CustomToast.show(requireContext(), it)
                binding.btnEnter.isEnabled = true
            }, success = {
                binding.btnEnter.isEnabled = true
                CustomToast.show(requireContext(), "Welcome to Kitsu \uD83D\uDE80")
                preferences.token = it.accessToken.toString()
                activityNavController().navigateSafely(R.id.action_global_mainFlowFragment)
            })
        }
    }

    /**
     * Проверяет заполненность полей "Username" и "Password".
     * Если оба поля заполнены, то выполняет метод [SignInViewModel.signIn] с передачей значений полей входа.
     * Если хотя бы одно поле пустое, то показывает Toast с просьбой заполнить необходимые поля.
     */
    private fun checkRequest() {
        when {
            binding.usernameEd.text.toString().isEmpty() -> {
                CustomToast.show(requireContext(), "Please fill out your username")
            }
            binding.passwordEd.text.toString().isEmpty() -> {
                CustomToast.show(requireContext(), "Please fill out your password")
            }
            else -> {
                viewModel.signIn(
                    username = binding.usernameEd.text.toString(),
                    password = binding.passwordEd.text.toString()
                )

            }
        }
    }
}