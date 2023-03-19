package com.example.kitsu.presentation.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsu.databinding.ItemMangaRvBinding
import com.example.kitsu.presentation.models.MangaUI
import com.example.kitsu.presentation.extensions.loadImage

class MangaAdapter(
    private val onItemClick: (name: String?) -> Unit
) :
    PagingDataAdapter<MangaUI.Data, MangaAdapter.MangaViewHolder>(Companion) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MangaViewHolder(
        ItemMangaRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MangaViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class MangaViewHolder(private val binding: ItemMangaRvBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(data: MangaUI.Data) = with(binding) {
            Log.e("", "onBind: ${data.attributes?.posterImage?.medium}")
            if (data.attributes?.posterImage?.medium?.isNotEmpty() == true) {
                mangaItemImg.loadImage(data.attributes.posterImage.medium)
            }
            itemView.setOnClickListener {
                onItemClick(data.attributes?.titles?.en_jp)
            }
        }
    }

    companion object : DiffUtil.ItemCallback<MangaUI.Data>() {
        override fun areItemsTheSame(oldItem: MangaUI.Data, newItem: MangaUI.Data) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(
            oldItem: MangaUI.Data,
            newItem: MangaUI.Data
        ) = oldItem == newItem
    }
}