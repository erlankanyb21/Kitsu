package com.example.kitsu.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.data.local.Prefs
import com.example.kitsu.R
import com.example.kitsu.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.koin.android.ext.android.inject

/**
 * Класс [MainActivity] отвечает за управление пользовательским интерфейсом и навигацией в приложении.
 * Он использует библиотеку Koin для внедрения зависимостей и библиотеку Android Navigation для
 * навигации между фрагментами.
 *
 * @author Erlan
 * @since 1.0v
 */
class MainActivity : AppCompatActivity() {
    private val preferences by inject<Prefs>()
    private var binding: ActivityMainBinding? = null

    /**
     * [onCreate] - вызывается при создании экземпляра
     * [MainActivity]. Он устанавливает макет для активности, скрывает панель действий, настраивает
     * нижнюю навигационную панель и устанавливает начальное назначение навигации.
     *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        // панель дейстивий
        supportActionBar?.hide()

        val navView: BottomNavigationView = binding?.navView!!

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

        setupNavigation()
    }

    /**
     * [setupNavigation] - определяет начальное назначение навигации в зависимости
     * от того, авторизован ли пользователь (наличие токена в preferences).
     *
     */
    private fun setupNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
        val navController = navHostFragment.navController

        val navGraph = navController.navInflater.inflate(R.navigation.nav_graph)

        when {
            !preferences.splash -> {
                navGraph.setStartDestination(R.id.splashFragment)
            }
            preferences.splash -> {
                navGraph.setStartDestination(R.id.boardFragment)
            }
            !preferences.board -> {
                navGraph.setStartDestination(R.id.boardFragment)
            }
            preferences.board -> {
                navGraph.setStartDestination(R.id.signFlowFragment)
            }
            preferences.token.isEmpty() -> {
                navGraph.setStartDestination(R.id.signFlowFragment)
            }
            preferences.token.isNotEmpty() -> {
                navGraph.setStartDestination(R.id.mainFlowFragment)
            }
        }
        navController.graph = navGraph
    }

    /**
     * [onDestroy] - вызывается при уничтожении экземпляра [MainActivity] и
     * освобождает ресурсы, связанные с binding.
     *
     */
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}