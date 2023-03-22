package com.example.kitsu.presentation.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kitsu.presentation.fragments.home.anime.AnimeFragment
import com.example.kitsu.presentation.fragments.home.manga.MangaFragment
import com.example.kitsu.presentation.fragments.home.posts.PostsFragment
import com.example.kitsu.presentation.fragments.home.users.UsersFragment

class FragmentViewPagerAdapter(fragment: Fragment, private val numOfTabs: Int = 4) :
    FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = numOfTabs

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AnimeFragment()
            1 -> MangaFragment()
            2 -> UsersFragment()
            else -> PostsFragment()
        }
    }
}