package com.example.kitsu.presentation.fragments.dialogs.sharedvm

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SharedViewModel : ViewModel(){
    private val _animeFilter = MutableStateFlow("")
    val animeState = _animeFilter.asStateFlow()

    private val _mangaFilter = MutableStateFlow("")
    val mangaState = _mangaFilter.asStateFlow()

    fun animeData(value:String?){
        _animeFilter.value = value.orEmpty()
    }
    fun mangaData(value:String?){
        _mangaFilter.value = value.orEmpty()
    }
}