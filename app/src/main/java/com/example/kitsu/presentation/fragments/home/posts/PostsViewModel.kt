package com.example.kitsu.presentation.fragments.home.posts

import androidx.paging.map
import com.example.domain.usecases.FetchPagingPostsUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.models.toUI
import kotlinx.coroutines.flow.map

/**
 * ViewModel для экрана "Посты".
 * @param postsUseCase use-case для получения списка постов с помощью Paging3 библиотеки.
 *
 * @author Erlan
 * @since 1.0v
 */
class PostsViewModel(
    private val postsUseCase: FetchPagingPostsUseCase
) : BaseViewModel() {
    /**
     * Запрашивает список постов с помощью [postsUseCase] и преобразует его в UI модель.
     * @return Flow<PagingData<PostsUI>>, представляющий список постов в UI модели.
     */
    fun pagingPosts() = postsUseCase().map { pagingData -> pagingData.map { it.toUI() } }
}