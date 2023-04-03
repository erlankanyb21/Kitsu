package com.example.data.repositories

import androidx.paging.PagingData
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.AnimeApiService
import com.example.data.network.paging.anime.AnimePagingSource
import com.example.domain.models.AnimeModel
import com.example.domain.repositories.AnimeRepository
import kotlinx.coroutines.flow.Flow
import org.koin.core.annotation.Single

/**
 * Реализация репозитория Anime.
 *
 * @property animeApiService API сервис для получения данных о аниме.
 *
 * @author Erlan
 * @since 1.0v
 */
@Single
class AnimeRepositoryImpl(
    private val animeApiService: AnimeApiService
) : AnimeRepository, BaseRepository() {
    /**
     * Получить список аниме с помощью пагинации.
     *
     * @param category категория, по которой нужно производить фильтрацию.
     * @param text строка для поиска.
     * @return [Flow] пагинированных данных об аниме.
     */
    override fun fetchPagingAnime(
        category: String?, text: String?
    ): Flow<PagingData<AnimeModel.Data>> = makePagingRequest(
        AnimePagingSource(
            animeApiService = animeApiService, category = category, text = text
        )
    )
}
