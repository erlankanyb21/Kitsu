package com.example.kitsu.presentation.fragments.add

import com.example.domain.usecases.CreatePostsUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.models.CreatePostsResponseUI
import com.example.kitsu.presentation.models.toUI
import kotlinx.coroutines.flow.asStateFlow

class AddViewModel(
    private val createPostsUseCase: CreatePostsUseCase
) : BaseViewModel() {
    private val _postState = mutableUiStateFlow<CreatePostsResponseUI>()
    val postState = _postState.asStateFlow()
    fun createPost(content: String, nsfw: Boolean, spoiler: Boolean) =
        createPostsUseCase(content, nsfw, spoiler).gatherRequest(_postState) { it!!.toUI() }
}