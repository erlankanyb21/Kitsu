package com.example.kitsu.presentation.fragments.home.anime

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentAnimeBinding
import com.example.kitsu.presentation.base.BaseFragment

class AnimeFragment : BaseFragment<AnimeViewModel,FragmentAnimeBinding>(R.layout.fragment_anime) {

    override val binding: FragmentAnimeBinding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel: AnimeViewModel by viewModels()

    override fun initialize() {
        super.initialize()

    }

    override fun setupListeners() {
        super.setupListeners()

    }


}