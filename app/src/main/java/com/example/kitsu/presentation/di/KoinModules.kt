package com.example.kitsu.presentation.di

import com.example.data.network.di.networkModule
import com.example.data.repositories.kitsuDataSourceImpl

val koinModules = listOf(
    repoModules,
    viewModules,
    UseCaseModule,
    networkModule,
    kitsuDataSourceImpl,
)