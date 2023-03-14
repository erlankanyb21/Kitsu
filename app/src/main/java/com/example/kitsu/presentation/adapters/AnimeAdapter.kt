package com.example.kitsu.presentation.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsu.databinding.ItemAnimeRvBinding
import com.example.kitsu.presentation.models.anime.AnimeUI
import com.example.kitsu.presentation.utils.loadImage

class AnimeAdapter(
    private val onItemClick: (name: String?) -> Unit
) :
    PagingDataAdapter<AnimeUI.Data, AnimeAdapter.AnimeViewHolder>(Companion) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = AnimeViewHolder(
        ItemAnimeRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class AnimeViewHolder(private val binding: ItemAnimeRvBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(data: AnimeUI.Data) = with(binding) {
            Log.e("", "onBind: ${data.attributes?.posterImage?.medium}")
            if (data.attributes?.posterImage?.medium?.isNotEmpty() == true) {
                animeItemImg.loadImage(data.attributes.posterImage.medium)
            }
            itemView.setOnClickListener {
                onItemClick(data.attributes?.canonicalTitle)
            }
        }
    }

    companion object : DiffUtil.ItemCallback<AnimeUI.Data>() {
        override fun areItemsTheSame(oldItem: AnimeUI.Data, newItem: AnimeUI.Data) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(
            oldItem: AnimeUI.Data,
            newItem: AnimeUI.Data
        ) = oldItem == newItem
    }
}