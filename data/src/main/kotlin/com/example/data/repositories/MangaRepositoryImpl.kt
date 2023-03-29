package com.example.data.repositories

import androidx.paging.PagingData
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.MangaApiService
import com.example.data.network.paging.manga.MangaPagingSource
import com.example.domain.models.MangaModel
import com.example.domain.repositories.MangaRepository
import kotlinx.coroutines.flow.Flow
/**
 * Реализация репозитория Magnga.
 *
 * @property mangaApiService API сервис для получения данных о манге.
 *
 * @author Erlan
 * @since 1.0v
 */
class MangaRepositoryImpl(
    private val mangaApiService: MangaApiService
) : MangaRepository, BaseRepository() {
    /**
     * Получить список манги с помощью пагинации.
     *
     * @param query категория, по которой нужно производить фильтрацию.
     * @param text строка для поиска.
     * @return [Flow] пагинированных данных об манге.
     */
    override fun fetchPagingManga(
        query: String?, text: String?
    ): Flow<PagingData<MangaModel.Data>> = makePagingRequest(
        MangaPagingSource(
            mangaApiService = mangaApiService, category = query, text = text
        )
    )
}