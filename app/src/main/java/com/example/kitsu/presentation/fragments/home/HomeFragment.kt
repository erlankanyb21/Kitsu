package com.example.kitsu.presentation.fragments.home

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentHomeBinding
import com.example.kitsu.presentation.adapters.FragmentViewPagerAdapter
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.fragments.home.anime.AnimeFragment
import com.example.kitsu.presentation.fragments.home.manga.MangaFragment
import com.example.kitsu.presentation.fragments.home.users.UsersFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>(R.layout.fragment_home) {

    override val binding: FragmentHomeBinding by viewBinding(FragmentHomeBinding::bind)
    override val viewModel: HomeViewModel by viewModels()

    private val fragmentList = listOf(
        AnimeFragment(), MangaFragment(), UsersFragment()
    )
    private val fragmentTitles = listOf(
        "Anime", "Manga", "Users"
    )

    override fun initialize() {
        super.initialize()
        homeTabs()
    }

    private fun homeTabs() {
        val adapter = FragmentViewPagerAdapter(requireActivity(), fragmentList)
        binding.viewPagerManga.adapter = adapter
        TabLayoutMediator(
            binding.tabLayoutManga, binding.viewPagerManga
        ) { tab: TabLayout.Tab, i: Int ->
            tab.text = fragmentTitles[i]
        }.attach()
    }

}