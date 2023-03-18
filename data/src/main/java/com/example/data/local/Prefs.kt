package com.example.data.local

import android.content.SharedPreferences
import androidx.core.content.edit

class Prefs(private val sharedPreferences: SharedPreferences) {

    fun getToken(): String {
        return sharedPreferences.getString("token", "") ?: ""
    }

    fun saveToken(token: String) {
        sharedPreferences.edit {
            putString("token", token)
        }
    }
}
