package com.example.data.local

import android.content.Context
import org.koin.core.module.Module
import org.koin.dsl.module

val prefsModule: Module = module {
//    single { Prefs(androidContext()) }
}
class Prefs(context: Context?) {

    private val prefs = context?.getSharedPreferences("app_prefs", Context.MODE_PRIVATE)

    fun saveToken(token: String?) = prefs?.edit()?.putString("token", token)?.apply()

    fun setToken(): String? = prefs?.getString("token", "")

}