package com.example.kitsu.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsu.R
import com.example.kitsu.databinding.BoardPagerBinding

class BoardAdapter(
    private val desc: List<String>,
) : RecyclerView.Adapter<BoardAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: BoardPagerBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) = with(binding) {
            when (position) {
                0 -> {
                    lottieAnim.setAnimation(R.raw.laptop_animation)
                }
                1 -> {
                    lottieAnim.setAnimation(R.raw.app_animation)
                }
                2 -> {
                    lottieAnim.setAnimation(R.raw.boy_avatar_listening)
                }
                3 -> {
                    lottieAnim.setAnimation(R.raw.scrolling)

                }
                4 -> {
                    lottieAnim.setAnimation(R.raw.gorgoes_progress)
                }
            }
            text.text = desc[position]
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        BoardPagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = desc.size

}