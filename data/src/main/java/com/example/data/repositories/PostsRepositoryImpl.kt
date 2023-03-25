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

class PostsRepositoryImpl(
    private val postsApiService: PostsApiService
) : PostsRepository, BaseRepository() {

    override fun fetchPosts(): Flow<PagingData<PostsModel.Data>> =
        makePagingRequest(
            PostsPagingSource(
                postsApiService = postsApiService
            )
        )

    override fun createPosts(
        content: String,
        nsfw: Boolean,
        spoiler: Boolean
    ): Flow<Either<String, CreatePostsResponseModel?>> =
        makeNetworkRequest(null) {
            postsApiService.createPost(
                createPostsDto = CreatePostsDto(
                    CreatePostsDto.Data(
                        CreatePostsDto.Data.Attributes(
                            content = content,
                            nsfw = nsfw,
                            spoiler = spoiler
                        )
                    )
                )
            ).toDomain()
        }
}