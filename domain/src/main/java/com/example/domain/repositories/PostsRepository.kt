package com.example.domain.repositories

import androidx.paging.PagingData
import com.example.domain.either.Either
import com.example.domain.models.CreatePostsResponseModel
import com.example.domain.models.PostsModel
import kotlinx.coroutines.flow.Flow

/**
 * Интерфейс [PostsRepository] содержит функцию [fetchPosts] для получения
 * [PagingData] объектов [PostsModel.Data] с помощью [PostsApiService], а также
 * функцию [createPosts] для публикации поста с помощью [PostsApiService].
 *
 * @author Erlan
 * @since 1.0v
 */
interface PostsRepository {
    /**
     * Функция [fetchPosts] возвращает [Flow] объект, который представляет собой
     * список [PostsModel.Data], обернутый в [PagingData], полученный из [PostsApiService].
     * @return возвращает [Flow] объект, который содержит [PagingData] с объектами [PostsModel.Data]
     */
    fun fetchPosts(): Flow<PagingData<PostsModel.Data>>

    /**
     * Функция [createPosts] возвращает [Flow] объект, который представляет собой
     * объект [CreatePostsResponseModel], обернутый в [Either], полученный из [PostsApiService].
     * содержит параметры:
     * @param content - комментарии пользователя
     * @param nsfw - (not safe for work) означает что контент содержит неприличный характер.
     * @param spoiler - контент содержит в себе спойлеры
     */
    fun createPosts(
        content: String,
        nsfw: Boolean,
        spoiler: Boolean
    ): Flow<Either<String, CreatePostsResponseModel?>>
}