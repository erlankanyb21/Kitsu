package com.example.kitsu.presentation.ui.adapters

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnticipateOvershootInterpolator
import androidx.core.view.isVisible
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.kitsu.databinding.ItemAnimeRvBinding
import com.example.kitsu.presentation.models.AnimeUI


/**
 * Класс [AnimeAdapter] является адаптером для RecyclerView и отвечает за отображение элементов
 * списка в пользовательском интерфейсе. Он принимает анонимную функцию onItemClick в конструкторе,
 * которое будет вызываться при щелчке на элементе списка. Класс [AnimeAdapter] использует библиотеку
 * Glide для загрузки изображений и библиотеку DiffUtil для оптимизации обновления элементов списка.
 *
 * @author Erlan
 * @since 1.0v
 */
class AnimeAdapter(
    private val onItemClick: (name: String?) -> Unit
) :
    PagingDataAdapter<AnimeUI.Data, AnimeAdapter.AnimeViewHolder>(Companion) {
    /**
     * [onCreateViewHolder] создает и возвращает
     * экземпляр [AnimeViewHolder], связанный с макетом элемента списка.
     *
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = AnimeViewHolder(
        ItemAnimeRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    /**
     * [onBindViewHolder] связывает данные
     * с экземпляром [AnimeViewHolder] в указанной позиции.
     *
     */
    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    /**
     * [AnimeViewHolder] - внутренний класс, который представляет элемент
     * списка и содержит метод [onBind], который связывает данные с макетом элемента списка.
     */
    inner class AnimeViewHolder(private val binding: ItemAnimeRvBinding) :
        RecyclerView.ViewHolder(binding.root) {

        /**
         * [onBind] - метод в котором данные из модели  присваиваются к элементам в
         * присоединённый макет [ItemAnimeRvBinding]
         */
        fun onBind(data: AnimeUI.Data) = with(binding) {
            animateItemView(itemView)
            Log.e("", "onBind: ${data.attributes?.posterImage?.medium}")
            if (data.attributes?.posterImage?.medium?.isNotEmpty() == true) {
                animeItemImg.load(data.attributes.posterImage.medium) {
                    listener { request, result ->
                        progress.isVisible = false
                    }
                }
            }
            itemView.setOnClickListener {
                onItemClick(data.attributes?.canonicalTitle)
            }
        }
    }

    /**
     * [Companion] - объект-компаньон, который содержит методы для
     * сравнения элементов списка в DiffUtil.
     */
    companion object : DiffUtil.ItemCallback<AnimeUI.Data>() {
        /**
         * [areItemsTheSame] - статический метод,
         * который проверяет, являются ли два элемента списка идентичными.
         */
        override fun areItemsTheSame(oldItem: AnimeUI.Data, newItem: AnimeUI.Data) =
            oldItem.id == newItem.id

        /**
         * [areContentsTheSame] - статический метод,
         * который проверяет, содержат ли два элемента списка одинаковые данные.
         */
        override fun areContentsTheSame(
            oldItem: AnimeUI.Data,
            newItem: AnimeUI.Data
        ) = oldItem == newItem
    }

    fun animateItemView(itemView: View) {
        //hide the itemView
        itemView.alpha = 0f

        //moving the itemView down 400f
        ObjectAnimator.ofFloat(itemView, "translationY", 0f, 400f)
            .apply { duration = 1L }.start()

        //show
        //itemView.alpha = 1f

        //moving the itemView up 400f
        val translateUp = ObjectAnimator.ofFloat(itemView, "translationY", 400f, 0f)
            .apply {
                duration = 1000L
                interpolator = AnticipateOvershootInterpolator(2f)
            }

        //animating alpha
        val fade = ValueAnimator.ofFloat(0f, 1f)
            .apply {
                addUpdateListener {
                    itemView.alpha = this.animatedValue as Float
                }
                duration = 400L
            }

        //applying
        AnimatorSet().apply { playTogether(translateUp, fade) }.start()


    }
}