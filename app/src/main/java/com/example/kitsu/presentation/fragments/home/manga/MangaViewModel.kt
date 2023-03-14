package com.example.kitsu.presentation.fragments.home.manga

import androidx.paging.map
import com.example.domain.usecases.FetchPagingMangaUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.mapper.toUI
import kotlinx.coroutines.flow.map

class MangaViewModel(
    private val pagingMangaUseCase: FetchPagingMangaUseCase
) : BaseViewModel() {
    fun pagingManga() =
        pagingMangaUseCase().map { pagingData -> pagingData.map { it.toUI() } }
}