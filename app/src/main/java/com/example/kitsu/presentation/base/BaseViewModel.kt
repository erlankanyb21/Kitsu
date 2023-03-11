package com.example.kitsu.presentation.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.resource.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

abstract class BaseViewModel: ViewModel() {
    protected fun <T> Flow<Resource<T>>.collectingFlow(
        loading:() ->Unit,
        error: (message: String?) -> Unit,
        success: (data: T?) -> Unit
    ){
        viewModelScope.launch {
            this@collectingFlow.collect {
                when (it) {
                    is Resource.Loading -> {
                        loading()
                    }
                    is Resource.Error ->{
                        error(it.message)
                    }
                    is Resource.Success -> {
                        success(it.data)
                    }
                }
            }
        }
    }
}
