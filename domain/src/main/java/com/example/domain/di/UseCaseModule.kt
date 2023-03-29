package com.example.domain.di

import com.example.domain.usecases.*
import org.koin.dsl.module

/**
 * Конфигурационный модуль, предоставляющий фабрики для создания экземпляров use case'ов.
 *
 * @author Erlan
 * @since 1.0v
 */
val UseCaseModule = module {
    /**
     * Фабрика для создания экземпляра use case [FetchPagingAnimeUseCase].
     *
     * @param animeRepository Репозиторий [AnimeRepository], используемый в [FetchPagingAnimeUseCase].
     *
     * @return Экземпляр [FetchPagingAnimeUseCase].
     */
    factory {
        FetchPagingAnimeUseCase(get())
    }
    /**
     * Фабрика для создания экземпляра use case [FetchPagingMangaUseCase].
     *
     * @param mangaRepository Репозиторий [MangaRepository], используемый в [FetchPagingMangaUseCase].
     *
     * @return Экземпляр [FetchPagingMangaUseCase].
     */
    factory {
        FetchPagingMangaUseCase(get())
    }
    /**
     * Фабрика для создания экземпляра use case [FetchPagingUsersUseCase].
     *
     * @param usersRepository Репозиторий [UsersRepository], используемый в [FetchPagingUsersUseCase].
     *
     * @return Экземпляр [FetchPagingUsersUseCase].
     */
    factory {
        FetchPagingUsersUseCase(get())
    }
    /**
     * Фабрика для создания экземпляра use case [SignInUseCase].
     *
     * @param authRepository Репозиторий [AuthRepository], используемый в [SignInUseCase].
     *
     * @return Экземпляр [SignInUseCase].
     */
    factory {
        SignInUseCase(get())
    }
    /**
     * Фабрика для создания экземпляра use case [FetchPagingPostsUseCase].
     *
     * @param postsRepository Репозиторий [PostsRepository], используемый в [FetchPagingPostsUseCase].
     *
     * @return Экземпляр [FetchPagingPostsUseCase].
     */
    factory {
        FetchPagingPostsUseCase(get())
    }
    /**
     * Фабрика для создания экземпляра use case [CreatePostsUseCase].
     *
     * @param postsRepository Репозиторий [PostsRepository], используемый в [CreatePostsUseCase].
     *
     * @return Экземпляр [CreatePostsUseCase].
     */
    factory {
        CreatePostsUseCase(get())
    }
}