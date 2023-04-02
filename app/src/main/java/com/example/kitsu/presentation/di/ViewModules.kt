package com.example.kitsu.presentation.di


import com.example.kitsu.presentation.fragments.add.AddViewModel
import com.example.kitsu.presentation.fragments.home.anime.AnimeViewModel
import com.example.kitsu.presentation.fragments.home.manga.MangaViewModel
import com.example.kitsu.presentation.fragments.home.posts.PostsViewModel
import com.example.kitsu.presentation.fragments.home.users.UsersViewModel
import com.example.kitsu.presentation.fragments.signIn.SignInViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * Здесь определен модуль Koin, который объявляет зависимости для ViewModel-классов.
 *
 * @author Erlan
 * @since 1.0v
 */

val viewModules: Module = module {
    viewModelOf(::AnimeViewModel)
    viewModelOf(::MangaViewModel)
    viewModelOf(::UsersViewModel)
    viewModelOf(::SignInViewModel)
    viewModelOf(::PostsViewModel)
    viewModelOf(::AddViewModel)
}