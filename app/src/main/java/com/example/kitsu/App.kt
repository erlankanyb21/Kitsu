package com.example.kitsu


import android.app.Application
import com.example.data.local.PreferencesModule
import com.example.data.network.NetworkModule
import com.example.domain.di.UseCaseModule
import com.example.kitsu.presentation.di.ViewModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module
import org.koin.ksp.generated.module


class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(module {
                includes(
                    ViewModules().module,
                    UseCaseModule().module,
                    NetworkModule().module,
                    PreferencesModule().module
                )
            })
        }
    }
}