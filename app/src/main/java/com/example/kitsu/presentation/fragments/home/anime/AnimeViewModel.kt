package com.example.kitsu.presentation.fragments.home.anime

import androidx.paging.map
import com.example.domain.usecases.FetchPagingAnimeUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.mapper.toUI
import kotlinx.coroutines.flow.map

class AnimeViewModel(
    private val fetchPagingAnimeUseCase: FetchPagingAnimeUseCase
) : BaseViewModel() {
    fun pagingAnime(text:String) = fetchPagingAnimeUseCase(text).map { pagingData -> pagingData.map { it.toUI() } }
}