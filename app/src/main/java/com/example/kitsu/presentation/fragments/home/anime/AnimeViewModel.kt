package com.example.kitsu.presentation.fragments.home.anime

import androidx.paging.PagingData
import com.example.domain.usecases.FetchPagingAnimeUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.models.anime.AnimeUI
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class AnimeViewModel(
    private val fetchPagingAnimeUseCase: FetchPagingAnimeUseCase
) : BaseViewModel() {

    private val _fetchAnimePaging = MutableStateFlow<PagingData<AnimeUI>>(PagingData.empty())
    val fetchAnimePaging = _fetchAnimePaging.asStateFlow()

    fun pagingAnime() = fetchPagingAnimeUseCase()

}