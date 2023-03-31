package com.example.kitsu.presentation.fragments.home.posts

import androidx.core.view.isVisible
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentPostsBinding
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.ui.adapters.MainLoadStateAdapter
import com.example.kitsu.presentation.ui.adapters.PostsAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Фрагмент, отображающий список постов
 *
 * @author Erlan
 * @since 1.0v
 */
class PostsFragment : BaseFragment<PostsViewModel, FragmentPostsBinding>(R.layout.fragment_posts) {

    override val viewModel by viewModel<PostsViewModel>()
    override val binding by viewBinding(FragmentPostsBinding::bind)
    private val postsAdapter = PostsAdapter()

    /**
     * Инициализация вью фрагмента
     */
    override fun initialize() {
        setupRecyclerView()
        loadStateListener()
        showPostsList()
    }

    /**
     * Отображение списка постов
     */
    private fun showPostsList() {
        viewModel.pagingPosts().collectPaging { data ->
            postsAdapter.submitData(data)
        }
    }

    /**
     * Настройка RecyclerView и адаптера
     */
    private fun setupRecyclerView() {
        binding.recyclerPosts.adapter = postsAdapter.withLoadStateFooter(
            footer = MainLoadStateAdapter()
        )
    }

    /**
     * Настройка прогрессбара
     */
    private fun loadStateListener() {
        postsAdapter.addLoadStateListener { state ->
            binding.recyclerPosts.isVisible = state.refresh != LoadState.Loading
            binding.progress.isVisible = state.refresh == LoadState.Loading
        }
    }
}