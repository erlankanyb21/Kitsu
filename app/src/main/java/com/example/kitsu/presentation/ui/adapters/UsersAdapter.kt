package com.example.kitsu.presentation.ui.adapters

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnticipateOvershootInterpolator
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsu.databinding.ItemUsersRvBinding
import com.example.kitsu.presentation.extensions.loadImage
import com.example.kitsu.presentation.models.UsersUI
import com.example.kitsu.presentation.ui.adapters.AnimeAdapter.Companion.areContentsTheSame
import com.example.kitsu.presentation.ui.adapters.AnimeAdapter.Companion.areItemsTheSame
import com.example.kitsu.presentation.ui.adapters.PostsAdapter.Companion.areContentsTheSame
import com.example.kitsu.presentation.ui.adapters.PostsAdapter.Companion.areItemsTheSame

/**
 * Класс [UsersAdapter] является адаптером для RecyclerView и отвечает за отображение элементов
 * списка в пользовательском интерфейсе. Он принимает анонимную функцию onItemClick в конструкторе,
 * которое будет вызываться при щелчке на элементе списка. Класс [UsersAdapter] использует библиотеку
 * Glide для загрузки изображений и библиотеку DiffUtil для оптимизации обновления элементов списка.
 *
 * @author Erlan
 * @since 1.0v
 */
class UsersAdapter(
    private val onItemClick: (name: String?) -> Unit
) :
    PagingDataAdapter<UsersUI.Data, UsersAdapter.UsersViewHolder>(Companion) {
    /**
     * [onCreateViewHolder] создает и возвращает
     * экземпляр [UsersViewHolder], связанный с макетом элемента списка.
     *
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = UsersViewHolder(
        ItemUsersRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    /**
     * [onBindViewHolder] связывает данные
     * с экземпляром [UsersViewHolder] в указанной позиции.
     *
     */
    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    /**
     * [UsersViewHolder] - внутренний класс, который представляет элемент
     * списка и содержит метод [onBind], который связывает данные с макетом элемента списка.
     */
    inner class UsersViewHolder(private val binding: ItemUsersRvBinding) :
        RecyclerView.ViewHolder(binding.root) {

        /**
         * [onBind] - метод в котором данные из модели  присваиваются к элементам в
         * присоединённый макет [ItemUsersRvBinding]
         */
        fun onBind(data: UsersUI.Data) = with(binding) {
            animateItemView(itemView)
            // проверка в Log
            Log.e("", "onBindUsers: ${data.attributes.toString()}")
            // присваивание значении из модели
            userImg.loadImage(data.attributes?.avatar?.medium.toString())
            userName.text = data.attributes?.name
            userComment.text = data.attributes?.about
            // Устанавливаем обработчик клика на элемент списка
            itemView.setOnClickListener {
                onItemClick(data.attributes?.name)
            }
        }
    }

    /**
     * [Companion] - объект-компаньон, который содержит методы для
     * сравнения элементов списка в DiffUtil.
     */
    companion object : DiffUtil.ItemCallback<UsersUI.Data>() {
        /**
         * [areItemsTheSame] - статический метод,
         * который проверяет, являются ли два элемента списка идентичными.
         */
        override fun areItemsTheSame(oldItem: UsersUI.Data, newItem: UsersUI.Data) =
            oldItem.id == newItem.id

        /**
         * [areContentsTheSame] - статический метод,
         * который проверяет, содержат ли два элемента списка одинаковые данные.
         */
        override fun areContentsTheSame(
            oldItem: UsersUI.Data,
            newItem: UsersUI.Data
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