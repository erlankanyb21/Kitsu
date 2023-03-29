package com.example.kitsu.presentation.extensions

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.kitsu.R

/**
 * Функция-расширения возвращает NavController активности, в которой расположен фрагмент. Для этого она
 * использует функцию [requireActivity], которая возвращает Activity, содержащую текущий фрагмент,
 * а затем вызывает метод [findNavController] для нахождения [NavController], управляющего фрагментом
 *
 * @author Erlan
 * @since 1.0v
 */
fun Fragment.activityNavController() =
    requireActivity().findNavController(R.id.nav_host_fragment_activity_main)

/**
 * Функция-расширения выполняет навигацию к указанному [actionId] только в том случае, если он является
 * действительным для текущего пункта назначения, на котором находится [NavController].
 * Если [actionId] не является действительным для текущего пункта назначения, то навигация не будет выполнена.
 * В противном случае будет вызван метод navigate(actionId), который запускает переход к новому пункту назначения.
 *
 * @author Erlan
 * @since 1.0v
 */
fun NavController.navigateSafely(@IdRes actionId: Int) {
    currentDestination?.getAction(actionId)?.let { navigate(actionId) }
}