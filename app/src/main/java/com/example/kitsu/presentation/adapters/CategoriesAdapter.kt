package com.example.kitsu.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsu.R

/**
 * Класс [CategoriesAdapter] является адаптером для RecyclerView и отвечает за отображение элементов
 * списка в диалоговом пользовательском интерфейсе. Он принимает анонимную функцию [onItemClick] в конструкторе,
 * которое будет вызываться при щелчке на элементе списка, а также сам список [categories]
 * которое будет оторбражатся в диалоговом пользовательском интерфейсе.
 *
 * @author Erlan
 * @since 1.0v
 */
class CategoriesAdapter(
    private val onItemClick: (name: String?) -> Unit,
    private val categories: List<String>
) : RecyclerView.Adapter<CategoriesAdapter.ViewHolder>() {

    /**
     * [ViewHolder] - внутренний класс, который представляет элемент
     * списка и содержит @property [categoryName] - Текстовое представление категории.
     */
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryName: TextView = itemView.findViewById(R.id.category_text)
    }

    /**
     * [onCreateViewHolder] - Создает и возвращает
     * экземпляр [ViewHolder], связанный с макетом элемента списка.
     *
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_filter_rv, parent, false)
        return ViewHolder(view)
    }

    /**
     * [onBindViewHolder] - Связывает данные с элементом списка категорий.
     * @param holder ViewHolder, который будет связан с данными.
     * @param position Позиция элемента в списке.
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Получаем данные для данной позиции из списка категорий
        val category = categories[position]

        // Устанавливаем текст для TextView в ViewHolder'е
        holder.categoryName.text = category

        // Устанавливаем обработчик клика на элемент списка
        holder.itemView.setOnClickListener {
            onItemClick(category)
        }
    }

    /**
     * [getItemCount] - возвращает количество элементов в списке категорий.
     */
    override fun getItemCount(): Int = categories.size

}