package com.example.data.network.paging.manga

import com.example.data.mappers.toDomain
import com.example.data.network.apiservice.MangaApiService
import com.example.data.network.paging.base.BasePagingSource
import com.example.domain.models.MangaModel

/**
 * Источник данных [PagingSource], который загружает данные из манга сервиса в постраничном режиме.
 *
 * @param mangaApiService Сервис [MangaApiService], который будет использоваться для получения данных об манге.
 * @param category Категория манги для загрузки. Если значение null, будут загружены все категории.
 * @param text Текст для фильтрации манги. Если значение null, фильтрация не будет применяться.
 *
 * @author Erlan
 * @since 1.0v
 */
class MangaPagingSource(
    private val mangaApiService: MangaApiService,
    private val category: String?,
    private val text: String?
) : BasePagingSource<Int, MangaModel.Data>() {
    /**
     * Начальный ключ, используемый для загрузки данных. По умолчанию равен 0.
     */
    override val initialKey: Int = 0

    /**
     * Получает данные из манга сервиса с использованием заданных параметров [params].
     *
     * @param params Параметры [LoadParams], определяющие, как загружать данные.
     * @return Список загруженных данных [MangaModel.Data] из манга сервиса.
     */
    override suspend fun fetchData(params: LoadParams<Int>): List<MangaModel.Data> {
        val response = mangaApiService.fetchMangaList(
            offset = params.key ?: 0,
            category = category,
            text = text
        )
        return response?.toDomain()?.data ?: emptyList()
    }

    /**
     * Возвращает ключ для заданного элемента [item].
     *
     * @param item Элемент [MangaModel.Data], для которого нужно получить ключ.
     * @return Ключ для заданного элемента.
     */
    override fun getKey(item: MangaModel.Data): Int {
        return item.id!!.toInt()
    }

    /**
     * Возвращает ключ для загрузки следующей страницы данных после заданного ключа [key].
     *
     * @param key Текущий ключ.
     * @param data Список данных, загруженных для текущего ключа.
     * @return Ключ для загрузки следующей страницы данных или null, если следующей страницы нет.
     */
    override fun getNextKey(key: Int, data: List<MangaModel.Data>): Int? {
        return if (data.isEmpty()) null else key + 20
    }
}