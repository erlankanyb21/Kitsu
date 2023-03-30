package com.example.kitsu.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsu.R
import com.example.kitsu.databinding.BoardPagerBinding

class BoardAdapter(
    private val desc: List<String>,
    private val startClick: () -> Unit,
    private val nextScreen: () -> Unit
) : RecyclerView.Adapter<BoardAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: BoardPagerBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) = with(binding) {
            when (position) {
                0 -> {
                    lottieAnim.setAnimation(R.raw.laptop_animation)
                    btnGetStarted.isVisible = false
                }
                1 -> {
                    lottieAnim.setAnimation(R.raw.app_animation)
                    btnGetStarted.isVisible = false
                    btnSkip.isVisible = false
                }
                2 -> {
                    lottieAnim.setAnimation(R.raw.boy_avatar_listening)
                    btnSkip.isVisible = false
                    btnGetStarted.isVisible = false
                }
                3 -> {
                    lottieAnim.setAnimation(R.raw.scrolling)
                    btnSkip.isVisible = false
                    btnGetStarted.isVisible = false
                }
                4 -> {
                    lottieAnim.setAnimation(R.raw.gorgoes_progress)
                    btnSkip.isVisible = false
                    btnNext.isVisible = false
                    btnGetStarted.isVisible = true
                }
            }
            text.text = desc[position]
            btnSkip.setOnClickListener {
                startClick()
            }
            btnGetStarted.setOnClickListener {
                startClick()
            }
            btnNext.setOnClickListener {
                nextScreen()
            }
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