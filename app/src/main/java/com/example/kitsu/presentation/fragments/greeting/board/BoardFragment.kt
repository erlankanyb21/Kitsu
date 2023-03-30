package com.example.kitsu.presentation.fragments.greeting.board

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.data.local.Prefs
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentBoardBinding
import com.example.kitsu.presentation.adapters.BoardAdapter
import org.koin.android.ext.android.inject

class BoardFragment : Fragment(R.layout.fragment_board) {

    private val binding by viewBinding(FragmentBoardBinding::bind)
    private val preferences by inject<Prefs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapterViaIndicators()
    }

    private fun setupAdapterViaIndicators() {
        val texts = resources.getStringArray(R.array.text).toList()
        val adapter = BoardAdapter(texts, this::setupClick, this::nextScreen)
        binding.viewPager.adapter = adapter
        binding.wormDotsIndicator.attachTo(binding.viewPager)
    }

    private fun setupClick() {
        findNavController().navigate(R.id.signInFragment)
        preferences.board = true
    }

    private fun nextScreen() {
        val texts = resources.getStringArray(R.array.text).toList()
        if (binding.viewPager.currentItem < texts.size - 1) {
            binding.viewPager.setCurrentItem(binding.viewPager.currentItem + 1, false)
        }

    }
}