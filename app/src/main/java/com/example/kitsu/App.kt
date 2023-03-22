package com.example.kitsu


import android.app.Application
import com.example.data.di.networkModule
import com.example.data.di.preferencesModule
import com.example.data.di.repoModules
import com.example.domain.di.UseCaseModule
import com.example.kitsu.presentation.di.viewModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    repoModules,
                    viewModules,
                    UseCaseModule,
                    networkModule,
                    preferencesModule
                )
            )
        }
    }
}