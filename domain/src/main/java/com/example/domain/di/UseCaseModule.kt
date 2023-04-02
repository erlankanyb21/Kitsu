package com.example.domain.di

import com.example.domain.usecases.*
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

/**
 * Конфигурационный модуль, предоставляющий фабрики для создания экземпляров use case'ов.
 *
 * @author Erlan
 * @since 1.0v
 */
val UseCaseModule = module {
    factoryOf(::FetchPagingAnimeUseCase)
    factoryOf(::FetchPagingMangaUseCase)
    factoryOf(::FetchPagingUsersUseCase)
    factoryOf(::SignInUseCase)
    factoryOf(::FetchPagingPostsUseCase)
    factoryOf(::CreatePostsUseCase)
}