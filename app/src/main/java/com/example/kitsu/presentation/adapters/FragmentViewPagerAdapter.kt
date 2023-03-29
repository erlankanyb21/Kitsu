package com.example.kitsu.presentation.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kitsu.presentation.fragments.home.anime.AnimeFragment
import com.example.kitsu.presentation.fragments.home.manga.MangaFragment
import com.example.kitsu.presentation.fragments.home.posts.PostsFragment
import com.example.kitsu.presentation.fragments.home.users.UsersFragment

/**
 * Класс [FragmentViewPagerAdapter] - Адаптер для ViewPager, управляющий фрагментами внутри Fragment.
 * @param fragment Родительский Fragment, к которому привязан этот адаптер.
 * @param numOfTabs Количество вкладок (фрагментов), которые будут управляться этим адаптером.
 *
 * @author Erlan
 * @since 1.0v
 */
class FragmentViewPagerAdapter(fragment: Fragment, private val numOfTabs: Int = 4) :
    FragmentStateAdapter(fragment) {
    /**
     * [getItemCount] возвращает количество фрагментов, которые будут управляться этим
     * адаптером.
     * @return Количество фрагментов.
     */
    override fun getItemCount(): Int = numOfTabs

    /**
     * [createFragment] создает новый фрагмент для заданной позиции.
     * @param position Позиция фрагмента.
     * @return Созданный фрагмент.
     */
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AnimeFragment()
            1 -> MangaFragment()
            2 -> UsersFragment()
            else -> PostsFragment()
        }
    }
}