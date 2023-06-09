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
import com.example.kitsu.databinding.ItemPostsRvBinding
import com.example.kitsu.presentation.models.PostsUI
import com.example.kitsu.presentation.ui.adapters.AnimeAdapter.Companion.areContentsTheSame
import com.example.kitsu.presentation.ui.adapters.AnimeAdapter.Companion.areItemsTheSame

/**
 * Класс [PostsAdapter] является адаптером для RecyclerView и отвечает за отображение элементов
 * списка в пользовательском интерфейсе. Класс [PostsAdapter] использует библиотеку
 * Glide для загрузки изображений и библиотеку DiffUtil для оптимизации обновления элементов списка.
 *
 * @author Erlan
 * @since 1.0v
 */
class PostsAdapter :
    PagingDataAdapter<PostsUI.Data, PostsAdapter.PostsViewHolder>(Companion) {
    /**
     * [onCreateViewHolder] создает и возвращает
     * экземпляр [PostsViewHolder], связанный с макетом элемента списка.
     *
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PostsViewHolder(
        ItemPostsRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    /**
     * [onBindViewHolder] связывает данные
     * с экземпляром [PostsViewHolder] в указанной позиции.
     *
     */
    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    /**
     * [PostsViewHolder] - внутренний класс, который представляет элемент
     * списка и содержит метод [onBind], который связывает данные с макетом элемента списка.
     */
    inner class PostsViewHolder(private val binding: ItemPostsRvBinding) :
        RecyclerView.ViewHolder(binding.root) {

        /**
         * [onBind] - метод в котором данные из модели  присваиваются к элементам в
         * присоединённый макет [ItemPostsRvBinding]
         *
         *
         */
        fun onBind(data: PostsUI.Data) = with(binding) {
            animateItemView(itemView)
            // проверка в Log
            Log.e("", "onBind: ${data.attributes?.content}")
            // присваивание значении
            postDataTxt.text = data.attributes?.createdAt
            usersComment.text = data.attributes?.content
            if (data.attributes?.embed?.image?.url.toString().isNotEmpty())
                postsImg.load(data.attributes?.embed?.url.toString())

            // условие для data.attributes?.spoiler
            when {
                data.attributes?.spoiler == true -> {
                    binding.usersComment.isVisible = false
                    binding.spoiler.visibility = View.VISIBLE
                }
                data.attributes?.spoiler != true -> {
                    binding.usersComment.visibility = View.VISIBLE
                    binding.spoiler.visibility = View.GONE
                }
            }
            // Устанавливаем обработчик клика на элемент списка
            binding.spoiler.setOnClickListener {
                binding.spoiler.isVisible = false
                binding.usersComment.isVisible = true
            }
        }
    }

    /**
     * [Companion] - объект-компаньон, который содержит методы для
     * сравнения элементов списка в DiffUtil.
     */
    companion object : DiffUtil.ItemCallback<PostsUI.Data>() {
        /**
         * [areItemsTheSame] - статический метод,
         * который проверяет, являются ли два элемента списка идентичными.
         */
        override fun areItemsTheSame(oldItem: PostsUI.Data, newItem: PostsUI.Data) =
            oldItem.id == newItem.id

        /**
         * [areContentsTheSame] - статический метод,
         * который проверяет, содержат ли два элемента списка одинаковые данные.
         */
        override fun areContentsTheSame(
            oldItem: PostsUI.Data,
            newItem: PostsUI.Data
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