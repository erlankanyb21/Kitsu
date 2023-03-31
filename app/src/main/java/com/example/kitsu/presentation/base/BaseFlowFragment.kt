package com.example.kitsu.presentation.base

import android.os.Bundle
import android.view.View
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

/**
 * Абстрактный класс [BaseFlowFragment] представляет собой базовый класс для фрагментов, которые
 * содержат навигационный хост (NavHostFragment), который управляет потоком навигации в приложении.
 * @param layoutId - идентификатор макета, используемого для отображения фрагмента;
 * @param navHostFragmentId - идентификатор NavHostFragment, вложенного в макет фрагмента.
 *
 * @author Erlan
 * @since 1.0v
 */
abstract class BaseFlowFragment(
    @LayoutRes layoutId: Int,
    @IdRes private val navHostFragmentId: Int
) : Fragment(layoutId) {

    /**
     * В методе [onViewCreated] создается экземпляр NavController из NavHostFragment, который
     * находится в макете фрагмента, и затем вызывается метод [setupNavigation], который можно
     * переопределить в дочерних классах для настройки навигации.
     */
    final override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navHostFragment =
            childFragmentManager.findFragmentById(navHostFragmentId) as NavHostFragment
        val navController = navHostFragment.navController

        setupNavigation(navController)
    }

    /**
     * [setupNavigation] - метод переопределяется в дочерних классах, чтобы настроить
     * навигацию с помощью переданного экземпляра NavController.
     */
    protected open fun setupNavigation(navController: NavController) {}
}