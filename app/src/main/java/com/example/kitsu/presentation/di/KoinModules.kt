package com.example.kitsu.presentation.di

import com.example.data.network.di.networkModule
import com.example.data.repositories.dataSourceImpl

val koinModules = listOf(
    repoModules,
    viewModules,
    UseCaseModule,
    networkModule,
    dataSourceImpl
)