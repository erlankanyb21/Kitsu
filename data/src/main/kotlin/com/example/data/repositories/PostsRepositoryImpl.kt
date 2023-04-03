package com.example.data.repositories

import androidx.paging.PagingData
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.PostsApiService
import com.example.data.network.models.CreatePostsDto
import com.example.data.network.models.toDomain
import com.example.data.network.paging.posts.PostsPagingSource
import com.example.domain.either.Either
import com.example.domain.models.CreatePostsResponseModel
import com.example.domain.models.PostsModel
import com.example.domain.repositories.PostsRepository
import kotlinx.coroutines.flow.Flow
import org.koin.core.annotation.Single

/**
 * Реализация [PostsRepository], использующая [PostsApiService] для выполнения запросов.
 * Использует [BaseRepository] для выполнения запросов и обработки ошибок.
 * @param postsApiService Сервис для выполнения запросов к API.
 *
 * @author Erlan
 * @since 1.0v
 */
@Single
class PostsRepositoryImpl(
    private val postsApiService: PostsApiService
) : PostsRepository, BaseRepository() {

    /**
     * Загружает список постов с помощью [PostsPagingSource] и возвращает [Flow] с [PagingData] из [PostsModel.Data].
     * @return [Flow] с [PagingData] из [PostsModel.Data].
     */
    override fun fetchPosts(): Flow<PagingData<PostsModel.Data>> = makePagingRequest(
        PostsPagingSource(
            postsApiService = postsApiService
        )
    )

    /**
     * Создает новый пост с заданным содержанием, настройками nsfw и spoiler с помощью [PostsApiService] и возвращает [Flow] с [Either]
     * из [CreatePostsResponseModel] в случае успеха или [String] в случае ошибки.
     * @param content Содержание создаваемого поста.
     * @param nsfw Определяет, является ли пост NSFW.
     * @param spoiler Определяет, является ли пост спойлером.
     * @return [Flow] с [Either] из [CreatePostsResponseModel] в случае успеха или [String] в случае ошибки.
     */
    override fun createPosts(
        content: String, nsfw: Boolean, spoiler: Boolean
    ): Flow<Either<String, CreatePostsResponseModel?>> = makeNetworkRequest(null) {
        postsApiService.createPost(
            createPostsDto = CreatePostsDto(
                CreatePostsDto.Data(
                    CreatePostsDto.Data.Attributes(
                        content = content, nsfw = nsfw, spoiler = spoiler
                    )
                )
            )
        ).toDomain()
    }
}