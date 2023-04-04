package com.example.kitsu.presentation.fragments.greeting.board

import android.os.Bundle
import android.view.View
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.data.local.Prefs
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentBoardBinding
import com.example.kitsu.presentation.ui.adapters.BoardAdapter
import org.koin.android.ext.android.inject

class BoardFragment : Fragment(R.layout.fragment_board) {

    private val binding by viewBinding(FragmentBoardBinding::bind)
    private val preferences by inject<Prefs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapterViaIndicators()
        setupClick()
        nextScreen()
        setupVisibility()
    }

    private fun setupAdapterViaIndicators() {
        val texts = resources.getStringArray(R.array.text).toList()
        val adapter = BoardAdapter(texts)
        binding.viewPager.adapter = adapter
        binding.wormDotsIndicator.attachTo(binding.viewPager)
    }

    private fun setupClick() {
        binding.btnSkip.setOnClickListener {
            findNavController().navigate(R.id.signInFragment)
            preferences.board = true
        }
    }

    private fun nextScreen() {
        binding.btnNext.setOnClickListener {
            val texts = resources.getStringArray(R.array.text).toList()
            if (binding.viewPager.currentItem < texts.size - 1) {
                binding.viewPager.setCurrentItem(binding.viewPager.currentItem + 1, false)
            }

        }
    }

    private fun setupVisibility() = with(binding) {
        viewPager.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                when (position == (viewPager.adapter?.itemCount?.minus(1) ?: 0)) {
                    true -> {
                        btnNext.isGone = true
                        btnSkip.isGone = true
                        btnGetStarted.isGone = false
                    }
                    false -> {
                        btnNext.isGone = false
                        btnSkip.isGone = false
                        btnGetStarted.isGone = true
                    }
                }
            }
        })
    }
}