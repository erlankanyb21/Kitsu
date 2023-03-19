package com.example.kitsu.presentation.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsu.databinding.ItemUsersRvBinding
import com.example.kitsu.presentation.models.UsersUI
import com.example.kitsu.presentation.extensions.loadImage

class UsersAdapter(
    private val onItemClick: (name: String?) -> Unit
) :
    PagingDataAdapter<UsersUI.Data, UsersAdapter.UsersViewHolder>(Companion) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = UsersViewHolder(
        ItemUsersRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class UsersViewHolder(private val binding: ItemUsersRvBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(data: UsersUI.Data) = with(binding) {
            Log.e("", "onBindUsers: ${data.attributes.toString()}")

            if (data.attributes?.avatar?.medium?.isNotEmpty() == true) {
                userImg.loadImage(data.attributes.avatar.medium)
                userName.text = data.attributes.name
                userComment.text = data.attributes.about
            }
            itemView.setOnClickListener {
                onItemClick(data.attributes?.name)
            }
        }
    }

    companion object : DiffUtil.ItemCallback<UsersUI.Data>() {
        override fun areItemsTheSame(oldItem: UsersUI.Data, newItem: UsersUI.Data) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(
            oldItem: UsersUI.Data,
            newItem: UsersUI.Data
        ) = oldItem == newItem
    }
}