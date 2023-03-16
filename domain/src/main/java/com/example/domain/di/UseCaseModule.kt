package com.example.domain.di

import com.example.domain.usecases.FetchCategoryAnimeUseCase
import com.example.domain.usecases.FetchPagingMangaUseCase
import com.example.domain.usecases.FetchPagingUsersUseCase
import org.koin.dsl.module

val UseCaseModule = module {
    factory {
        FetchCategoryAnimeUseCase(get())
    }
    factory {
        FetchPagingMangaUseCase(get())
    }
    factory {
        FetchPagingUsersUseCase(get())
    }

}