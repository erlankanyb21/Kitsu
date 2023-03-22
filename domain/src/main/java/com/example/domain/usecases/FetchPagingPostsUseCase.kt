package com.example.domain.usecases

import com.example.domain.repositories.PostsRepository

class FetchPagingPostsUseCase(
    private val postsRepository: PostsRepository
) {
    operator fun invoke() = postsRepository.fetchPosts()
}