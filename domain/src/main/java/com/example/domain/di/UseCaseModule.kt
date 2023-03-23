package com.example.domain.di

import com.example.domain.usecases.*
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
    factory {
        FetchPagingPostsUseCase(get())
    }
    factory {
        CreatePostsUseCase(get())
    }
}