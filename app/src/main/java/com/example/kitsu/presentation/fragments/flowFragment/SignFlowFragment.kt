package com.example.kitsu.presentation.fragments.flowFragment

import androidx.navigation.NavController
import com.example.data.local.Prefs
import com.example.kitsu.R
import com.example.kitsu.presentation.base.BaseFlowFragment
import org.koin.android.ext.android.inject

/**
 * Фрагмент, управляющий навигацией в рамках экрана авторизации.
 * Унаследован от базового фрагмента с установленным макетом и ID контейнера навигации.
 *
 * @author Erlan
 * @since 1.0v
 */
class SignFlowFragment : BaseFlowFragment(
    R.layout.fragment_sign_flow, R.id.nav_host_fragment_sign
) {
    private val preferences by inject<Prefs>()
    override fun setupNavigation(navController: NavController) {
        val navGraph = navController.navInflater.inflate(R.navigation.sign_graph)
        when {
            !preferences.board ->
                navGraph.setStartDestination(R.id.boardFragment)
            preferences.board ->
                navGraph.setStartDestination(R.id.signInFragment)
        }
        navController.graph = navGraph
    }
}