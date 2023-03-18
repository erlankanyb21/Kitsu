package com.example.domain.di

import com.example.domain.usecases.FetchPagingAnimeUseCase
import com.example.domain.usecases.FetchPagingMangaUseCase
import com.example.domain.usecases.FetchPagingUsersUseCase
import com.example.domain.usecases.SignInUseCase
import org.koin.dsl.module

val UseCaseModule = module {
    factory {
        FetchPagingAnimeUseCase(get())
    }
    factory {
        FetchPagingMangaUseCase(get())
    }
    factory {
        FetchPagingUsersUseCase(get())
    }
    factory {
        SignInUseCase(get())
    }
}