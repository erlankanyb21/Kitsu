package com.example.kitsu.presentation.di


import com.example.kitsu.presentation.fragments.home.anime.AnimeViewModel
import com.example.kitsu.presentation.fragments.home.manga.MangaViewModel
import com.example.kitsu.presentation.fragments.home.users.UsersViewModel
import com.example.kitsu.presentation.fragments.signIn.SignInViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModules: Module = module {
    viewModel { AnimeViewModel(get()) }
    viewModel { MangaViewModel(get()) }
    viewModel { UsersViewModel(get()) }
    viewModel { SignInViewModel(get()) }

}