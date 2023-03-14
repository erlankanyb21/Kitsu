package com.example.kitsu.presentation.di

import com.example.domain.usecases.FetchPagingAnimeUseCase
import com.example.domain.usecases.FetchPagingMangaUseCase
import com.example.domain.usecases.FetchPagingUsersUseCase
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
}