package com.example.kitsu.presentation.fragments.add

import com.example.domain.usecases.CreatePostsUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.models.CreatePostsResponseUI
import com.example.kitsu.presentation.models.toUI
import kotlinx.coroutines.flow.asStateFlow
import org.koin.android.annotation.KoinViewModel

/**
 * ViewModel для фрагмента добавления поста.
 * @property createPostsUseCase UseCase для создания нового поста.
 * @property _postState MutableStateFlow для хранения текущего состояния создания поста.
 * @property postState Наблюдаемый объект _postState, содержащий текущее состояние создания поста.
 *
 * @author Erlan
 * @since 1.0v
 */
@KoinViewModel
class AddViewModel(
    private val createPostsUseCase: CreatePostsUseCase
) : BaseViewModel() {
    private val _postState = mutableUiStateFlow<CreatePostsResponseUI>()
    val postState = _postState.asStateFlow()

    /**
     * Вызывает [createPostsUseCase] для создания нового поста и обрабатывает результат через [gatherRequest].
     * @param content Содержание поста.
     * @param nsfw Указывает, является ли пост не безопасным для работы.
     * @param spoiler Указывает, содержит ли пост спойлер.
     */
    fun createPost(content: String, nsfw: Boolean, spoiler: Boolean) =
        createPostsUseCase(content, nsfw, spoiler).gatherRequest(_postState) { it!!.toUI() }
}