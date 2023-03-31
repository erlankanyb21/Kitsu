package com.example.kitsu.presentation.fragments.flowFragment

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentMainFlowBinding
import com.example.kitsu.presentation.base.BaseFlowFragment

/**
 * Фрагмент основного потока (Main Flow) приложения, в котором находится BottomNavigationView и контейнер
 * для фрагментов, управляемых навигационным компонентом. Наследуется от [BaseFlowFragment].
 * @param layoutResId id ресурса макета для фрагмента
 * @param navHostFragmentId id ресурса NavHostFragment в макете
 *
 * @author Erlan
 * @since 1.0v
 */
class MainFlowFragment : BaseFlowFragment(
    R.layout.fragment_main_flow, R.id.nav_host_fragment_main
) {
    private val binding by viewBinding(FragmentMainFlowBinding::bind)

    /**
     * Настраивает навигационный компонент и связывает BottomNavigationView с ним.
     * @param navController навигационный компонент для управления фрагментами
     */
    override fun setupNavigation(navController: NavController) {
        binding.navView.setupWithNavController(navController)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_search,
                R.id.navigation_add,
                R.id.notificationsFragment,
                R.id.libraryFragment
            )
        )
        setupActionBarWithNavController(
            requireActivity() as AppCompatActivity,
            navController,
            appBarConfiguration
        )
    }
}