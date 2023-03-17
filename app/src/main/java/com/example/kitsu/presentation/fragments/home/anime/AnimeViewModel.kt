package com.example.kitsu.presentation.fragments.home.anime

import androidx.paging.map
import com.example.domain.usecases.FetchCategoryAnimeUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.mapper.toUI
import kotlinx.coroutines.flow.map

class AnimeViewModel(
    private val fetchSearchAnimeUseCase: FetchCategoryAnimeUseCase
) : BaseViewModel() {
    fun pagingAnime(category:String?) = fetchSearchAnimeUseCase(category).map { pagingData -> pagingData.map { it.toUI() } }
}