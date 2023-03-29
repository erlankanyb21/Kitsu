package com.example.data.network.paging.anime

import com.example.data.mappers.toDomain
import com.example.data.network.apiservice.AnimeApiService
import com.example.data.network.paging.base.BasePagingSource
import com.example.domain.models.AnimeModel

/**
 * Источник данных [PagingSource], который загружает данные из сервиса аниме в постраничном режиме.
 *
 * @param animeApiService Сервис [AnimeApiService], который будет использоваться для получения данных об аниме.
 * @param category Категория аниме для загрузки. Если значение null, будут загружены все категории.
 * @param text Текст для фильтрации аниме. Если значение null, фильтрация не будет применяться.
 *
 * @author Erlan
 * @since 1.0v
 */
class AnimePagingSource(
    private val animeApiService: AnimeApiService,
    private val category: String?,
    private val text: String?
) : BasePagingSource<Int, AnimeModel.Data>() {
    /**
     * Начальный ключ, используемый для загрузки данных. По умолчанию равен 0.
     */
    override val initialKey: Int = 0

    /**
     * Получает данные из сервиса аниме с использованием заданных параметров [params].
     *
     * @param params Параметры [LoadParams], определяющие, как загружать данные.
     * @return Список загруженных данных [AnimeModel.Data] из сервиса аниме.
     */
    override suspend fun fetchData(params: LoadParams<Int>): List<AnimeModel.Data> {
        val response = animeApiService.fetchAnimeList(
            offset = params.key ?: 0,
            category = category,
            text = text
        )
        return response?.toDomain()?.data ?: emptyList()
    }

    /**
     * Возвращает ключ для заданного элемента [item].
     *
     * @param item Элемент [AnimeModel.Data], для которого нужно получить ключ.
     * @return Ключ для заданного элемента.
     */
    override fun getKey(item: AnimeModel.Data): Int {
        return item.id!!.toInt()
    }

    /**
     * Возвращает ключ для загрузки следующей страницы данных после заданного ключа [key].
     *
     * @param key Текущий ключ.
     * @param data Список данных, загруженных для текущего ключа.
     * @return Ключ для загрузки следующей страницы данных или null, если следующей страницы нет.
     */
    override fun getNextKey(key: Int, data: List<AnimeModel.Data>): Int? {
        return if (data.isEmpty()) null else key + 20
    }
}