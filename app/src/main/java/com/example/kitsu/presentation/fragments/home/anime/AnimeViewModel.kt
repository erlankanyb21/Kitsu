package com.example.kitsu.presentation.fragments.home.anime

import com.example.domain.usecases.FetchAnimeUseCase
import com.example.kitsu.presentation.UIState
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.mapper.toUI
import com.example.kitsu.presentation.models.anime.AnimeUI
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class AnimeViewModel(
    private val fetchAnimeUseCase: FetchAnimeUseCase
) : BaseViewModel() {

    private val _fetchAnimeState = MutableStateFlow<UIState<AnimeUI>>(UIState.Empty())
    val fetchAnimeState = _fetchAnimeState.asStateFlow()

    fun anime() {
        fetchAnimeUseCase.fetchAnime().collectingStates({
            _fetchAnimeState.value = UIState.Loading()
        }, { error ->
            _fetchAnimeState.value = UIState.Error("debil")
        }, { data ->
            data?.let {
                _fetchAnimeState.value = UIState.Success(
                    data.toUI()
                )
            }
        })
    }
}