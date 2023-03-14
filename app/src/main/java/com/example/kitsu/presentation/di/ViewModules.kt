package com.example.kitsu.presentation.di


import com.example.kitsu.presentation.fragments.home.anime.AnimeViewModel
import com.example.kitsu.presentation.fragments.home.manga.MangaViewModel
import com.example.kitsu.presentation.fragments.home.users.UsersViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModules: Module = module {
    viewModel { AnimeViewModel(get()) }
    viewModel { MangaViewModel(get()) }
    viewModel { UsersViewModel(get()) }

}