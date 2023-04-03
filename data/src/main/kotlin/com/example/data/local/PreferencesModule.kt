package com.example.data.local

import android.content.Context
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Singleton

/**
 * Конфигурация модуля для работы с SharedPreferences.
 * В этом модуле предоставляются синглтоны для этих объектов.
 *
 * @author Erlan
 * @since 1.0v
 */
@Module
@ComponentScan
class PreferencesModule {
    @Singleton
    fun provideSharedPreferences(context: Context) =
        context.getSharedPreferences("my_preferences", Context.MODE_PRIVATE)
}
