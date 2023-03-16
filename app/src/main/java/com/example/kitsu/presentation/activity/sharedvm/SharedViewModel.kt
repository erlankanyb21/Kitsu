package com.example.kitsu.presentation.activity.sharedvm

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SharedViewModel : ViewModel(){
    private val _data = MutableStateFlow("")
    val data = _data.asStateFlow()

    fun updateData(value:String?){
        _data.value = value!!
    }
}