package com.example.data.network.apiservice

import com.example.data.network.models.MangaDto
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *  Интерфейс для выполнения HTTP-запросов к API манги.
 *
 * @author Erlan
 * @since 1.0v
 */
interface MangaApiService {
    /**
     * [fetchMangaList] - получает список манги согласно указанным параметрам. Может фильтровать
     * список по категориям и тексту.
     * @param limit Максимальное количество элементов в списке.
     * @param offset Смещение относительно начала списка.
     * @param category Категория, по которой нужно произвести фильтрацию списка.
     * @param text Текст, по которому нужно произвести поиск в списке.
     * @return DTO списка манги или null, если произошла ошибка при выполнении запроса.
     */
    @GET("api/edge/manga")
    suspend fun fetchMangaList(
        @Query("page[limit]") limit: Int = 20,
        @Query("page[offset]") offset: Int,
        @Query("filter[categories]") category: String? = null,
        @Query("filter[text]") text: String? = null,
    ): MangaDto?
}