package com.example.kitsu.presentation.fragments.add

import android.util.Log
import com.example.domain.usecases.CreatePostsUseCase
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.models.CreatePostsResponseUI
import com.example.kitsu.presentation.models.toUI
import com.example.kitsu.presentation.state.UIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class AddViewModel(
    private val createPostsUseCase: CreatePostsUseCase
) : BaseViewModel() {
    private val _postState = MutableStateFlow<UIState<CreatePostsResponseUI?>>(UIState.Empty())
    val postState = _postState.asStateFlow()
    fun createPost(content: String, nsfw: Boolean, spoiler: Boolean) =
        createPostsUseCase(content, nsfw, spoiler).collectingStates({
            _postState.value = UIState.Loading()
        }, {
            _postState.value = UIState.Error(it.toString())
        }, {
            Log.e("pos", "createPost: ${it}")
            _postState.value = UIState.Success(data = it!!.toUI())
        })
}