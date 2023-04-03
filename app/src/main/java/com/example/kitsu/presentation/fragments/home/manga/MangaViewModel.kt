package com.example.kitsu.presentation.fragments.home.manga

import androidx.paging.map
import com.example.domain.usecases.FetchPagingMangaUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.models.toUI
import kotlinx.coroutines.flow.map
import org.koin.android.annotation.KoinViewModel

/**
 * ViewModel для экрана "Манга".
 * @param pagingMangaUseCase use-case для получения списка аниме с помощью Paging3 библиотеки.
 *
 * @author Erlan
 * @since 1.0v
 */
@KoinViewModel
class MangaViewModel(
    private val pagingMangaUseCase: FetchPagingMangaUseCase
) : BaseViewModel() {
    /**
     * Запрашивает список манги с помощью [pagingMangaUseCase] и преобразует его в UI модель.
     * @param category категория для фильтрации манги, null если фильтрация не нужна.
     * @param text текст для поиска манги, null если поиск не нужен.
     * @return Flow<PagingData<MangaUI>>, представляющий список манги в UI модели.
     */
    fun pagingManga(category: String?, text: String?) =
        pagingMangaUseCase(category, text).map { pagingData -> pagingData.map { it.toUI() } }
}