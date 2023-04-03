package com.example.domain.usecases

import com.example.domain.repositories.PostsRepository
import org.koin.core.annotation.Factory

@Factory
class FetchPagingPostsUseCase(
    private val postsRepository: PostsRepository
) {
    operator fun invoke() = postsRepository.fetchPosts()
}