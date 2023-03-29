package com.example.domain.repositories

import androidx.paging.PagingData
import com.example.domain.models.AnimeModel
import com.example.domain.models.MangaModel
import kotlinx.coroutines.flow.Flow

/**
 * Интерфейс [MangaRepository] содержит функцию [fetchPagingManga] для получения
 * [PagingData] объектов [MangaModel.Data] с помощью [MangaApiService].
 *
 * @author Erlan
 * @since 1.0v
 */
interface MangaRepository {
    /**
     * Функция [fetchPagingManga] возвращает [Flow] объект, который представляет собой
     * список [MangaModel.Data], обернутый в [PagingData], полученный из [MangaApiService].
     * @param query опциональный параметр для фильтрации манги по категории
     * @param text опциональный параметр для поиска манги по тексту
     * @return возвращает [Flow] объект, который содержит [PagingData] с объектами [AnimeModel.Data]
     */
    fun fetchPagingManga(query: String?, text: String?): Flow<PagingData<MangaModel.Data>>
}