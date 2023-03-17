package com.example.kitsu.presentation.fragments.signIn

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentSignInBinding
import com.example.kitsu.presentation.extensions.activityNavController
import com.example.kitsu.presentation.extensions.navigateSafely

class SignInFragment : Fragment(R.layout.fragment_sign_in) {

    private val binding by viewBinding(FragmentSignInBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupListeners()
    }

    private fun setupListeners() {
        clickSignIn()
    }

    private fun clickSignIn() {
        binding.btnEnter.setOnClickListener {
            activityNavController().navigateSafely(R.id.action_global_mainFlowFragment)
        }
    }
}