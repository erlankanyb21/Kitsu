package com.example.kitsu.presentation.fragments.home.posts

import androidx.paging.map
import com.example.domain.usecases.FetchPagingPostsUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.mapper.toUI
import kotlinx.coroutines.flow.map

class PostsViewModel(
    private val postsUseCase: FetchPagingPostsUseCase
) : BaseViewModel() {
    fun pagingPosts() = postsUseCase().map { pagingData -> pagingData.map { it.toUI() } }
}