package com.example.domain.repositories

import androidx.paging.PagingData
import com.example.domain.models.AnimeModel
import kotlinx.coroutines.flow.Flow
/**
 * Интерфейс [AnimeRepository] содержит функцию [fetchPagingAnime] для получения
 * [PagingData] объектов [AnimeModel.Data] с помощью [AnimeApiService].
 *
 * @author Erlan
 * @since 1.0v
 */
interface AnimeRepository {
    /**
     * Функция [fetchPagingAnime] возвращает [Flow] объект, который представляет собой
     * список [AnimeModel.Data], обернутый в [PagingData], полученный из [AnimeApiService].
     * @param category опциональный параметр для фильтрации аниме по категории
     * @param text опциональный параметр для поиска аниме по тексту
     * @return возвращает [Flow] объект, который содержит [PagingData] с объектами [AnimeModel.Data]
     */
    fun fetchPagingAnime(category: String?, text: String?): Flow<PagingData<AnimeModel.Data>>
}