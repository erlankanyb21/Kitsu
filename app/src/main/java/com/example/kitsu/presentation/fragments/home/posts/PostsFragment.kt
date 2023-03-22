package com.example.kitsu.presentation.fragments.home.posts

import androidx.core.view.isVisible
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentPostsBinding
import com.example.kitsu.presentation.adapters.MainLoadStateAdapter
import com.example.kitsu.presentation.adapters.PostsAdapter
import com.example.kitsu.presentation.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class PostsFragment : BaseFragment<PostsViewModel, FragmentPostsBinding>(R.layout.fragment_posts) {

    override val viewModel by viewModel<PostsViewModel>()
    override val binding by viewBinding(FragmentPostsBinding::bind)
    private val postsAdapter = PostsAdapter()

    override fun initialize() {
        setupRecyclerView()
        loadStateListener()
        showUsersList()
    }

    private fun showUsersList() {
        viewModel.pagingPosts().collectPaging { data ->
            postsAdapter.submitData(data)
        }
    }

    private fun setupRecyclerView() {
        binding.recyclerPosts.adapter = postsAdapter.withLoadStateFooter(
            footer = MainLoadStateAdapter()
        )
    }

    private fun loadStateListener() {
        postsAdapter.addLoadStateListener { state ->
            binding.recyclerPosts.isVisible = state.refresh != LoadState.Loading
            binding.progress.isVisible = state.refresh == LoadState.Loading
        }
    }
}