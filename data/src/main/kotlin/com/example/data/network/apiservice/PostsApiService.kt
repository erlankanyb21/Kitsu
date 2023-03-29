package com.example.data.network.apiservice

import com.example.data.network.models.CreatePostsDto
import com.example.data.network.models.CreatePostsResponseDto
import com.example.data.network.models.PostsDto
import retrofit2.http.*

/**
 *  Интерфейс для выполнения HTTP-запросов к API posts.
 *
 * @author Erlan
 * @since 1.0v
 */
interface PostsApiService {
    /**
     * Получает список постов.
     *
     * @param limit Максимальное количество постов в ответе (по умолчанию 20).
     * @param offset Смещение списка (начиная с какого элемента получать список).
     *
     * @return Объект типа [PostsDto] с данными о постах.
     */
    @GET("/api/edge/posts")
    suspend fun fetchPosts(
        @Query("page[limit]") limit: Int = 20,
        @Query("page[offset]") offset: Int,
    ): PostsDto?

    /**
     * Создает новый пост.
     *
     * @param createPostsDto Объект типа [CreatePostsDto], содержащий данные для создания поста.
     * @param contentType Тип контента запроса (по умолчанию "application/vnd.api+json").
     *
     * @return Объект типа [CreatePostsResponseDto] с данными о созданном посте.
     */
    @POST("/api/edge/posts")
    suspend fun createPost(
        @Body createPostsDto: CreatePostsDto,
        @Header("Content-Type") contentType: String = "application/vnd.api+json"
    ): CreatePostsResponseDto
}