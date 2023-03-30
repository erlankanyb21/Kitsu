package com.example.data.local

import android.content.SharedPreferences
import androidx.core.content.edit

/**
 * Класс [Prefs] представляет собой обертку над объектом [SharedPreferences] и используется для работы
 * с настройками приложения. Он содержит свойство [token], которое позволяет получить или изменить сохраненный токен.
 *
 * @author Erlan
 * @since 1.0v
 */
class Prefs(private val sharedPreferences: SharedPreferences) {
    var token: String
        get() = sharedPreferences.getString("token", "") ?: ""
        set(value) = sharedPreferences.edit { putString("token", value) }
    var board: Boolean
        get() = sharedPreferences.getBoolean("board", false)
        set(value) = sharedPreferences.edit { putBoolean("board", value) }
}
