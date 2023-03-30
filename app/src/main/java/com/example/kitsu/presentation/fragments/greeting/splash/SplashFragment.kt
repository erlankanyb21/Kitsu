package com.example.kitsu.presentation.fragments.greeting.splash

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.data.local.Prefs
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentSplashBinding
import org.koin.android.ext.android.inject


class SplashFragment : Fragment(R.layout.fragment_splash) {
    private val binding by viewBinding(FragmentSplashBinding::bind)
    private val preferences by inject<Prefs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAnimationViaSound()
    }

    private fun setupAnimationViaSound() {
        val mediaPlayer = MediaPlayer.create(requireContext(), R.raw.intro)
        val animation = AnimationUtils.loadAnimation(requireContext(), R.anim.intro_anim)

        // setup anim listener
        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {
                mediaPlayer.start()
            }

            override fun onAnimationEnd(p0: Animation?) {
                mediaPlayer.stop()
                mediaPlayer.release()
                when {
                    preferences.token.isEmpty() -> {
                        findNavController().navigate(R.id.action_global_signFlowFragment)

                    }
                    preferences.token.isNotEmpty() -> {
                        findNavController().navigate(R.id.action_global_mainFlowFragment)
                    }
                }
            }

            override fun onAnimationRepeat(p0: Animation?) {
                //do nothing
            }

        })

        binding.logoIv.apply {
            visibility = View.VISIBLE
            startAnimation(animation)
        }
    }
}