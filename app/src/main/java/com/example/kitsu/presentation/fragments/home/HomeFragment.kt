package com.example.kitsu.presentation.fragments.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentHomeBinding
import com.example.kitsu.presentation.ui.adapters.FragmentViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

/**
 * Класс [HomeFragment] отвечает за главный экран приложения,
 * который содержит ViewPager с четырьмя фрагментами
 */
class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    /**
     * Вызывается после того, как фрагмент был создан.
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPagerAndTabs()
    }

    /**
     * Настройка ViewPager и вкладки.
     */
    private fun setupViewPagerAndTabs() {
        val adapter = FragmentViewPagerAdapter(this)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Anime"
                1 -> tab.text = "Manga"
                2 -> tab.text = "Users"
                3 -> tab.text = "Posts"
            }
        }.attach()
    }
}