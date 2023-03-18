package com.example.data.di

import com.example.data.repositories.AnimeRepositoryImpl
import com.example.data.repositories.AuthRepositoryImpl
import com.example.data.repositories.MangaRepositoryImpl
import com.example.data.repositories.UsersRepositoryImpl
import org.koin.core.module.Module
import org.koin.dsl.module

val repoModules: Module = module {
    single { AnimeRepositoryImpl(get()) }
    single { MangaRepositoryImpl(get()) }
    single { UsersRepositoryImpl(get()) }
    single { AuthRepositoryImpl(get()) }
}