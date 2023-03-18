package com.example.kitsu.presentation.fragments.signIn

import android.annotation.SuppressLint
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.data.local.Prefs
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentSignInBinding
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.extensions.activityNavController
import com.example.kitsu.presentation.extensions.navigateSafely
import com.example.kitsu.presentation.models.auth.SignUI
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class SignInFragment :
    BaseFragment<SignInViewModel, FragmentSignInBinding>(R.layout.fragment_sign_in) {

    override val viewModel by viewModel<SignInViewModel>()
    override val binding by viewBinding(FragmentSignInBinding::bind)
    private val preferences by inject<Prefs>()

    override fun initialize() {
        setupAnimation()
        clickSignIn()
    }

    private fun setupAnimation() {
        val animation = AnimationUtils.loadAnimation(requireContext(),R.anim.logo_anim)
        binding.logo.visibility = View.VISIBLE
        binding.logo.startAnimation(animation)
    }

    private fun clickSignIn() {
        binding.btnEnter.setOnClickListener {
            viewModel.signIn(
                SignUI(
                    username = binding.usernameEd.text.toString(),
                    password = binding.passwordEd.text.toString()
                )
            )

        }
        lifecycleScope.launch {
            viewModel.signState.collectStates(
                onLoading = { binding.progress.visibility = View.VISIBLE },
                onError = {
                    Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
                },
                onSuccess = {
                    binding.progress.visibility = View.GONE
                    Toast.makeText(requireContext(), "Success ", Toast.LENGTH_SHORT).show()
                    preferences.saveToken(it?.accessToken.toString())
                    activityNavController().navigateSafely(R.id.action_global_mainFlowFragment)
                }
            )
        }
    }
}