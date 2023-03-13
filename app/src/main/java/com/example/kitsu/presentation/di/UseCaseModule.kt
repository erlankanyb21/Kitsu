package com.example.kitsu.presentation.di

import com.example.domain.usecases.FetchAnimeUseCase
import com.example.domain.usecases.FetchPagingAnimeUseCase
import org.koin.dsl.module

val UseCaseModule = module {
    factory {
        FetchAnimeUseCase(get())
    }
    factory {
        FetchPagingAnimeUseCase(get())
    }
}