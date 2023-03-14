package com.example.kitsu.presentation.fragments.home.manga

import android.widget.Toast
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentMangaBinding
import com.example.kitsu.presentation.adapters.MangaAdapter
import com.example.kitsu.presentation.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class MangaFragment : BaseFragment<MangaViewModel, FragmentMangaBinding>(R.layout.fragment_manga) {

    override val binding: FragmentMangaBinding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel: MangaViewModel by viewModel()
    private val mangaAdapter = MangaAdapter(this::onItemClick)

    private fun onItemClick(name: String?) {
        Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
    }

    override fun initialize() {
        binding.recyclerview.adapter = mangaAdapter
    }

    override fun setupListeners() {
        viewModel.pagingManga().collectPaging {
            mangaAdapter.submitData(it)
        }
    }
}