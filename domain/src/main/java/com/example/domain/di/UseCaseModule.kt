package com.example.domain.di

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module

/**
 * Конфигурационный модуль, предоставляющий фабрики для создания экземпляров use case'ов.
 *
 * @author Erlan
 * @since 1.0v
 */
@Module
@ComponentScan("com.example.domain")
class UseCaseModule