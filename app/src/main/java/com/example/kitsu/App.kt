package com.example.kitsu


import android.app.Application
import com.example.data.di.networkModule
import com.example.data.di.repoModules
import com.example.data.repositories.animeDataSourceImpl
import com.example.data.repositories.categoriesDataSourceImpl
import com.example.data.repositories.mangaDataSourceImpl
import com.example.data.repositories.usersDataSourceImpl
import com.example.domain.di.UseCaseModule
import com.example.kitsu.presentation.di.viewModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(listOf(
                repoModules,
                viewModules,
                UseCaseModule,
                networkModule,
                animeDataSourceImpl,
                mangaDataSourceImpl,
                usersDataSourceImpl,
                categoriesDataSourceImpl,
            ))
        }
    }
}