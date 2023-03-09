package com.example.kitsu.presentation.fragments.home.anime

import com.example.domain.usecases.FetchAnimeUseCase
import com.example.kitsu.presentation.base.BaseViewModel

class AnimeViewModel(
    private val fetchAnimeUseCase: FetchAnimeUseCase
) : BaseViewModel() {

}