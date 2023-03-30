package com.example.kitsu.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

/**
 * Класс [MainActivity] отвечает за управление пользовательским интерфейсом и навигацией в приложении.
 * Он использует библиотеку Koin для внедрения зависимостей и библиотеку Android Navigation для
 * навигации между фрагментами.
 *
 * @author Erlan
 * @since 1.0v
 */
class MainActivity : AppCompatActivity() {
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
        // панель дейстивий
        supportActionBar?.hide()

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_search,
                R.id.navigation_add,
                R.id.notificationsFragment,
                R.id.libraryFragment
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}