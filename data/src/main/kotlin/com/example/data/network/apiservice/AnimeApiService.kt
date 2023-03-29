package com.example.data.network.apiservice

import com.example.data.network.models.AnimeDto
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *  Интерфейс для выполнения HTTP-запросов к API аниме.
 *
 * @author Erlan
 * @since 1.0v
 */
interface AnimeApiService {
    /**
     * [fetchAnimeList] - получает список аниме согласно указанным параметрам. Может фильтровать
     * список по категориям и тексту.
     * @param limit Максимальное количество элементов в списке (по умолчанию 20).
     * @param offset Смещение относительно начала списка.
     * @param category Категория, по которой нужно произвести фильтрацию списка.
     * @param text Текст, по которому нужно произвести поиск в списке.
     * @return DTO списка аниме или null, если произошла ошибка при выполнении запроса.
     */
    @GET("/api/edge/anime")
    suspend fun fetchAnimeList(
        @Query("page[limit]") limit: Int = 20,
        @Query("page[offset]") offset: Int,
        @Query("filter[categories]") category: String? = null,
        @Query("filter[text]") text: String? = null,
    ): AnimeDto?
}