package com.example.kitsu.presentation.di

import com.example.domain.usecases.FetchAnimeUseCase
import org.koin.dsl.module

val domainModule = module {
    factory {
        FetchAnimeUseCase(get())
    }
}