package com.example.kitsu.presentation.fragments.dialog.sharedvm

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * ViewModel для общих данных между фрагментами AnimeFragment и MangaFragment.
 * Содержит фильтры поиска аниме и манги.
 *
 * @author Erlan
 * @since 1.0v
 */
class SharedViewModel : ViewModel() {
    /**
     *  Внутренний [MutableStateFlow], хранящий значение фильтра поиска для аниме
     */
    private val _animeFilter = MutableStateFlow("")

    /**
     * [StateFlow], позволяющий получать текущее значение фильтра поиска для аниме.
     */
    val animeState = _animeFilter.asStateFlow()

    /**
     *  Внутренний [MutableStateFlow], хранящий значение фильтра поиска для манги
     */
    private val _mangaFilter = MutableStateFlow("")

    /**
     * [StateFlow], позволяющий получать текущее значение фильтра поиска для манги.
     */
    val mangaState = _mangaFilter.asStateFlow()

    /**
     * Устанавливает значение фильтра поиска для аниме в переданное значение.
     * Если переданное значение равно null, то фильтр будет установлен в пустую строку.
     * @param value значение фильтра поиска для аниме.
     */
    fun animeData(value: String?) {
        _animeFilter.value = value.orEmpty()
    }

    /**
     * Устанавливает значение фильтра поиска для манги в переданное значение.
     * Если переданное значение равно null, то фильтр будет установлен в пустую строку.
     * @param value значение фильтра поиска для манги.
     */
    fun mangaData(value: String?) {
        _mangaFilter.value = value.orEmpty()
    }
}