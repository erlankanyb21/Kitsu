package com.example.kitsu.presentation.di

import com.example.data.network.client.networkModule
import com.example.data.repositories.dataSourceImpl

val koinModules = listOf(
    repoModules,
    viewModules,
    domainModule,
    networkModule,
    dataSourceImpl
)