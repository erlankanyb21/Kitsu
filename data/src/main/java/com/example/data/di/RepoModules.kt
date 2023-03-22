package com.example.data.di

import com.example.data.repositories.*
import org.koin.core.module.Module
import org.koin.dsl.module

val repoModules: Module = module {
    single { AnimeRepositoryImpl(get()) }
    single { MangaRepositoryImpl(get()) }
    single { UsersRepositoryImpl(get()) }
    single { AuthRepositoryImpl(get()) }
    single { PostsRepositoryImpl(get()) }
}