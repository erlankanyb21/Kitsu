package com.example.kitsu.presentation.fragments.home.anime

import androidx.paging.map
import com.example.domain.usecases.FetchPagingAnimeUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.mapper.toUI
import kotlinx.coroutines.flow.map

class AnimeViewModel(
    private val fetchAnimeUseCase: FetchPagingAnimeUseCase
) : BaseViewModel() {
    fun pagingAnime(category:String?) = fetchAnimeUseCase(category).map { pagingData -> pagingData.map { it.toUI() } }
}