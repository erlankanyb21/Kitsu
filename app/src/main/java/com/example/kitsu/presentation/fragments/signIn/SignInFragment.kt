package com.example.kitsu.presentation.fragments.signIn

import android.view.View
import android.view.animation.AnimationUtils
import androidx.core.view.isVisible
import androidx.lifecycle.viewModelScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.data.local.Prefs
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentSignInBinding
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.custom.CustomToast
import com.example.kitsu.presentation.extensions.activityNavController
import com.example.kitsu.presentation.extensions.navigateSafely
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class SignInFragment :
    BaseFragment<SignInViewModel, FragmentSignInBinding>(R.layout.fragment_sign_in) {

    override val viewModel by viewModel<SignInViewModel>()
    override val binding by viewBinding(FragmentSignInBinding::bind)
    private val preferences by inject<Prefs>()

    override fun initialize() {
        setupAnimationViaSound()
        clickSignIn()
        checkState()
    }

    private fun setupAnimationViaSound() {
        val animation = AnimationUtils.loadAnimation(requireContext(), R.anim.logo_anim)

        binding.logo.apply {
            visibility = View.VISIBLE
            startAnimation(animation)
        }
    }

    private fun clickSignIn() {
        binding.btnEnter.setOnClickListener {
            checkRequest()
        }
    }

    private fun checkState() {
        viewModel.viewModelScope.launch {
            viewModel.signState.spectateUiState(
                error = {
                    CustomToast.show(requireContext(), it)
                    binding.progress.isVisible = false
                    binding.btnEnter.isEnabled = true
                }, success = {
                    binding.progress.isVisible = false
                    binding.btnEnter.isEnabled = true
                    CustomToast.show(requireContext(), "Welcome to Kitsu \uD83D\uDE80")
                    preferences.token = it.accessToken.toString()
                    activityNavController().navigateSafely(R.id.action_global_mainFlowFragment)
                })
        }
    }

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