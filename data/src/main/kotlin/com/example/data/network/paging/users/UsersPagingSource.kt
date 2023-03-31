package com.example.data.network.paging.users

import com.example.data.network.apiservice.UsersApiService
import com.example.data.network.models.toDomain
import com.example.data.network.paging.base.BasePagingSource
import com.example.domain.models.UsersModel

/**
 * Источник данных [PagingSource], который загружает данные из сервиса пользователей в постраничном режиме.
 *
 * @param usersApiService Сервис [UsersApiService], который будет использоваться для получения данных об пользователе.
 * @param category Категория пользователей для загрузки. Если значение null, будут загружены все категории.
 * @param text Текст для фильтрации пользователей. Если значение null, фильтрация не будет применяться.
 *
 * @author Erlan
 * @since 1.0v
 */
class UsersPagingSource(
    private val usersApiService: UsersApiService
) : BasePagingSource<Int, UsersModel.Data>() {
    /**
     * Начальный ключ, используемый для загрузки данных. По умолчанию равен 0.
     */
    override val initialKey: Int = 0

    /**
     * Получает данные из сервиса пользователей с использованием заданных параметров [params].
     *
     * @param params Параметры [LoadParams], определяющие, как загружать данные.
     * @return Список загруженных данных [UsersModel.Data] из сервиса пользователей.
     */
    override suspend fun fetchData(params: LoadParams<Int>): List<UsersModel.Data> {
        val response = usersApiService.fetchUsersList(
            offset = params.key ?: 0,
        )
        return response?.toDomain()?.data ?: emptyList()
    }

    /**
     * Возвращает ключ для заданного элемента [item].
     *
     * @param item Элемент [UsersModel.Data], для которого нужно получить ключ.
     * @return Ключ для заданного элемента.
     */
    override fun getKey(item: UsersModel.Data): Int {
        return item.id!!.toInt()
    }

    /**
     * Возвращает ключ для загрузки следующей страницы данных после заданного ключа [key].
     *
     * @param key Текущий ключ.
     * @param data Список данных, загруженных для текущего ключа.
     * @return Ключ для загрузки следующей страницы данных или null, если следующей страницы нет.
     */
    override fun getNextKey(key: Int, data: List<UsersModel.Data>): Int? {
        return if (data.isEmpty()) null else key + 20
    }
}