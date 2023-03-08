package com.example.kitsu.presentation.base

import androidx.lifecycle.ViewModel
import com.example.kitsu.presentation.UIState
import kotlinx.coroutines.flow.MutableStateFlow

abstract class BaseViewModel: ViewModel() {

    fun <T> uiStateFlow() = MutableStateFlow<UIState<T>>(UIState.Loading())

//    fun <T> Flow<Resource<T>>.collectFlow(_state: MutableStateFlow<UIState<T>>) {
//        viewModelScope.launch {
//            this@collectFlow.collect {
//                when (it) {
//                    is Resource.Loading -> {
//                        _state.value = UIState.Loading()
//                    }
//                    is Resource.Error -> {
//                        _state.value = UIState.Error(it.message ?: "Something went wrong")
//                    }
//                    is Resource.Success -> {
//                        if (it.data != null) {
//                            _state.value = UIState.Success(it.data)
//                        }
//                    }
//                }
//            }
//        }
//    }
}