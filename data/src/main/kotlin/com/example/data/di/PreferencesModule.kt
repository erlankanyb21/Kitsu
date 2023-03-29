package com.example.data.di

import android.content.Context
import android.content.SharedPreferences
import com.example.data.local.Prefs
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

/**
 * Конфигурация модуля для работы с SharedPreferences.
 * В этом модуле предоставляются синглтоны для этих объектов.
 *
 * @author Erlan
 * @since 1.0v
 */
val preferencesModule = module {
    // Предоставление объекта SharedPreferences
    single<SharedPreferences> {
        androidContext().getSharedPreferences("my_preferences", Context.MODE_PRIVATE)
    }
    // Предоставление объекта Prefs, использующего SharedPreferences
    single {
        Prefs(get())
    }
}