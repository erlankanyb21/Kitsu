package com.example.kitsu.presentation.ui.customView

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import com.example.kitsu.databinding.ToastGreetingBinding

/**
 * Класс для создания и отображения пользовательских Toast уведомлений.
 * @property context контекст текущей активности
 *
 * @author Erlan
 * @since 1.0v
 */
@Suppress("DEPRECATION")
class CustomToast(private val context: Context) {
    /**
     * Переменная для хранения binding'а View компонента toast'а.
     */
    private var binding: ToastGreetingBinding? = null

    /**
     * [show] - Метод для отображения пользовательского Toast уведомления с заданным сообщением.
     * @param message сообщение, которое будет отображаться в Toast уведомлении
     */
    fun show(message: String) {
        binding = ToastGreetingBinding.inflate(LayoutInflater.from(context))
        binding!!.toastMessage.text = message

        val toast = Toast(context)
        toast.apply {
            setGravity(Gravity.CENTER, 21, 21)
            duration = Toast.LENGTH_LONG
            view = binding!!.root

            show()
        }
    }

    companion object {
        /**
         * Статический метод для отображения пользовательского Toast уведомления с заданным сообщением.
         * @param context контекст текущей активности
         * @param message сообщение, которое будет отображаться в Toast уведомлении
         */
        fun show(context: Context, message: String) {
            val customToast = CustomToast(context)
            customToast.show(message)
        }
    }
}