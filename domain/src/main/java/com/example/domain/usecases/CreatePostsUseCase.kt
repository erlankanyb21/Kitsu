package com.example.domain.usecases

import com.example.domain.repositories.PostsRepository

class CreatePostsUseCase(
    private val postsRepository: PostsRepository
) {
    operator fun invoke(content: String, nsfw: Boolean, spoiler: Boolean) =
        postsRepository.createPosts(content, nsfw, spoiler)
}