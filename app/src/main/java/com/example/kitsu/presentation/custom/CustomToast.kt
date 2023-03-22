package com.example.kitsu.presentation.custom

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import com.example.kitsu.databinding.ToastGreetingBinding

@Suppress("DEPRECATION")
class CustomToast(private val context: Context) {

    private var binding: ToastGreetingBinding? = null

    fun show(message: String) {
        binding = ToastGreetingBinding.inflate(LayoutInflater.from(context))

        binding!!.toastMessage.text = message

        val toast = Toast(context)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.duration = Toast.LENGTH_LONG
        toast.view = binding!!.root

        toast.show()
    }

    companion object {
        fun show(context: Context, message: String) {
            val customToast = CustomToast(context)
            customToast.show(message)
        }
    }
}