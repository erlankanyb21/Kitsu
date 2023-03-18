package com.example.data.di

import android.content.Context
import android.content.SharedPreferences
import com.example.data.local.Prefs
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val preferencesModule = module {
    single<SharedPreferences> {
        androidContext().getSharedPreferences("my_preferences", Context.MODE_PRIVATE)
    }
    single {
        Prefs(get())
    }
}