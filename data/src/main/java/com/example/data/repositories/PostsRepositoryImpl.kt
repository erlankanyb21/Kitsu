package com.example.data.repositories

import android.util.Log
import androidx.paging.PagingData
import com.example.data.base.BaseRepository
import com.example.data.network.apiservice.PostsApiService
import com.example.data.network.models.CreatePostsDto
import com.example.data.network.models.toDomain
import com.example.data.network.paging.posts.PostsPagingSource
import com.example.domain.models.CreatePostsResponseModel
import com.example.domain.models.PostsModel
import com.example.domain.repositories.PostsRepository
import com.example.domain.resource.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException

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
    ): Flow<Resource<CreatePostsResponseModel?>> {
        return flow {
            emit(Resource.Loading())
            try {
                val response = postsApiService.createPost(
                    CreatePostsDto(
                        CreatePostsDto.Data(
                            CreatePostsDto.Data.Attributes(
                                content = content,
                                nsfw = nsfw,
                                spoiler = spoiler
                            )
                        )
                    )
                )
                if (response.isSuccessful) {
                    emit(
                        Resource.Success(
                            data = response.body()?.toDomain()
                        )
                    )
                    Log.e(
                        "Kitsu", "CreatePost: ${response.body()}"
                    )
                } else {
                    emit(
                        Resource.Error("You don't have permission to create this post.`")
                    )
                }
            } catch (e: IOException) {
                emit(Resource.Error(e.localizedMessage as String))
            }
        }
    }
}