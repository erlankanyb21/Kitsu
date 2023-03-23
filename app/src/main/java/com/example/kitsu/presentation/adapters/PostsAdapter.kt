package com.example.kitsu.presentation.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsu.databinding.ItemPostsRvBinding
import com.example.kitsu.presentation.extensions.loadImage
import com.example.kitsu.presentation.models.PostsUI

class PostsAdapter :
    PagingDataAdapter<PostsUI.Data, PostsAdapter.PostsViewHolder>(Companion) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PostsViewHolder(
        ItemPostsRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class PostsViewHolder(private val binding: ItemPostsRvBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(data: PostsUI.Data) = with(binding) {
            Log.e("", "onBind: ${data.attributes?.content}")
            postDataTxt.text = data.attributes?.createdAt
            usersComment.text = data.attributes?.content
            if (data.attributes?.embed?.image?.url.toString().isNotEmpty())
                postsImg.loadImage(data.attributes?.embed?.url.toString())

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
            binding.spoiler.setOnClickListener {
                binding.spoiler.isVisible = false
                binding.usersComment.isVisible = true
            }
        }
    }

    companion object : DiffUtil.ItemCallback<PostsUI.Data>() {
        override fun areItemsTheSame(oldItem: PostsUI.Data, newItem: PostsUI.Data) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(
            oldItem: PostsUI.Data,
            newItem: PostsUI.Data
        ) = oldItem == newItem
    }
}