package com.example.kitsu.presentation.fragments.home.manga

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentMangaBinding
import com.example.kitsu.presentation.base.BaseFragment

class MangaFragment : BaseFragment<MangaViewModel, FragmentMangaBinding>(R.layout.fragment_manga) {

    override val binding: FragmentMangaBinding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel: MangaViewModel by viewModels()

    override fun initialize() {
        super.initialize()

    }

}