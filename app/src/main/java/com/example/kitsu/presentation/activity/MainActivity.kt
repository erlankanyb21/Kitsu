package com.example.kitsu.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.ActivityMainBinding

/**
 * Класс [MainActivity] отвечает за управление пользовательским интерфейсом и навигацией в приложении.
 * Он использует библиотеку Koin для внедрения зависимостей и библиотеку Android Navigation для
 * навигации между фрагментами.
 *
 * @author Erlan
 * @since 1.0v
 */
class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding by viewBinding(ActivityMainBinding::bind)

    /**
     * [onCreate] - вызывается при создании экземпляра
     * [MainActivity]. Он устанавливает макет для активности, скрывает панель действий, настраивает
     * нижнюю навигационную панель и устанавливает начальное назначение навигации.
     *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()
    }
}