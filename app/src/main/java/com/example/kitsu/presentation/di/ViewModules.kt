package com.example.kitsu.presentation.di


import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module

/**
 * Здесь определен модуль Koin, который объявляет зависимости для ViewModel-классов.
 *
 * @author Erlan
 * @since 1.0v
 */
@Module
@ComponentScan("com.example.kitsu.presentation")
class ViewModules