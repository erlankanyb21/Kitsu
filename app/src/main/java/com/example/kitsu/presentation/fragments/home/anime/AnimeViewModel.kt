package com.example.kitsu.presentation.fragments.home.anime

import android.util.Log
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.example.domain.usecases.FetchPagingAnimeUseCase
import com.example.kitsu.presentation.UIState
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.models.anime.AnimeUI
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class AnimeViewModel(
    private val fetchPagingAnimeUseCase: FetchPagingAnimeUseCase
) : BaseViewModel() {

    private val _fetchAnimeState = MutableStateFlow<UIState<AnimeUI>>(UIState.Empty())
    val fetchAnimeState = _fetchAnimeState.asStateFlow()

    private val _fetchAnimePaging = MutableStateFlow<PagingData<AnimeUI>>(PagingData.empty())
    val fetchAnimePaging = _fetchAnimeState.asStateFlow()


    init {
        pagingAnime()
    }

    fun pagingAnime() = fetchPagingAnimeUseCase()

//    fun anime(limit:Int,offset:Int) {
//        fetchAnimeUseCase.fetchAnime(limit, offset).collectingStates({
//            _fetchAnimeState.value = UIState.Loading()
//        }, { error ->
//            _fetchAnimeState.value = UIState.Error("debil")
//        }, { data ->
//            data?.let {
//                _fetchAnimeState.value = UIState.Success(
//                    data.toUI()
//                )
//            }
//        })
//    }
}