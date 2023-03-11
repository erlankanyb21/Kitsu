package com.example.kitsu.presentation.di

import com.example.data.repositories.AnimeRepositoryImpl
import org.koin.core.module.Module
import org.koin.dsl.module

val repoModules: Module = module {
    single { AnimeRepositoryImpl(get()) }
}