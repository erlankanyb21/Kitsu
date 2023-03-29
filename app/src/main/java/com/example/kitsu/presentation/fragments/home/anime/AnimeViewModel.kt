package com.example.kitsu.presentation.fragments.home.anime

import androidx.paging.map
import com.example.domain.usecases.FetchPagingAnimeUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.mapper.toUI
import kotlinx.coroutines.flow.map

/**
 * ViewModel для экрана "Аниме".
 * @param fetchAnimeUseCase use-case для получения списка аниме с помощью Paging3 библиотеки.
 *
 * @author Erlan
 * @since 1.0v
 */
class AnimeViewModel(
    private val fetchAnimeUseCase: FetchPagingAnimeUseCase
) : BaseViewModel() {
    /**
     * Запрашивает список аниме с помощью [fetchAnimeUseCase] и преобразует его в UI модель.
     * @param category категория для фильтрации аниме, null если фильтрация не нужна.
     * @param text текст для поиска аниме, null если поиск не нужен.
     * @return Flow<PagingData<AnimeUI>>, представляющий список аниме в UI модели.
     */
    fun pagingAnime(category: String?, text: String?) =
        fetchAnimeUseCase(category, text).map { pagingData -> pagingData.map { it.toUI() } }
}