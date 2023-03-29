package com.example.data.di

import com.example.data.repositories.*
import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * модуль Koin для репозиториев (repositories). Каждый репозиторий внедряет зависимость необходимого
 * API-сервиса, который используется для выполнения операций чтения и записи данных.
 *
 * Здесь объявляются singleton-объекты для каждого репозитория. Каждый репозиторий имеет свой
 * конструктор, который принимает зависимости, необходимые для его функционирования, например,
 * соответствующий API-сервис. Зависимости передаются Koin, который обеспечивает их создание и
 * предоставление репозиторию при его использовании.
 *
 * @author Erlan
 * @since 1.0v
 */
val repoModules: Module = module {
    single { AnimeRepositoryImpl(get()) }
    single { MangaRepositoryImpl(get()) }
    single { UsersRepositoryImpl(get()) }
    single { AuthRepositoryImpl(get()) }
    single { PostsRepositoryImpl(get()) }
}