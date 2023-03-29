package com.example.kitsu.presentation.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Функция-расширения [loadImage] загружает изображение по указанному URL-адресу и отображает его в ImageView.
 * Она использует библиотеку Glide для загрузки изображения и привязки его к ImageView.
 *
 * @author Erlan
 * @since 1.0v
 */
fun ImageView.loadImage(url: String) {
    Glide.with(this).load(url).into(this)
}