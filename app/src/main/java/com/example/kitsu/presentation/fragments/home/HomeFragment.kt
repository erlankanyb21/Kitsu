package com.example.kitsu.presentation.fragments.home

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentHomeBinding
import com.example.kitsu.presentation.adapters.FragmentViewPagerAdapter
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.fragments.home.anime.AnimeFragment
import com.example.kitsu.presentation.fragments.home.manga.MangaFragment
import com.example.kitsu.presentation.fragments.home.posts.PostsFragment
import com.example.kitsu.presentation.fragments.home.users.UsersFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>(R.layout.fragment_home) {

    override val binding by viewBinding(FragmentHomeBinding::bind)
    override val viewModel by viewModels<HomeViewModel>()

    override fun initialize() {
        val adapter = FragmentViewPagerAdapter(requireActivity(), listOf(
            AnimeFragment(),
            MangaFragment(),
            UsersFragment(),
            PostsFragment()
        ))
        binding.viewPagerManga.adapter = adapter
        TabLayoutMediator(
            binding.tabLayoutManga, binding.viewPagerManga
        ) { tab: TabLayout.Tab, i: Int ->
            tab.text = when(i){
                0 -> "Anime"
                1 -> "Manga"
                2 -> "Users"
                3 -> "Posts"
                else -> throw IndexOutOfBoundsException("Invalid position $i")
            }
        }.attach()
    }
}