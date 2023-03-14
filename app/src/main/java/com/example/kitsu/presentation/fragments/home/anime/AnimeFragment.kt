package com.example.kitsu.presentation.fragments.home.anime

import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentAnimeBinding
import com.example.kitsu.presentation.adapters.AnimeAdapter
import com.example.kitsu.presentation.adapters.MangaLoadStateAdapter
import com.example.kitsu.presentation.base.BaseFragment
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class AnimeFragment : BaseFragment<AnimeViewModel, FragmentAnimeBinding>(R.layout.fragment_anime) {

    override val binding: FragmentAnimeBinding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel: AnimeViewModel by viewModel()
    private val animeAdapter by lazy { AnimeAdapter(this::onItemClick) }

    override fun initialize() {
        with(binding){
            recyclerview.adapter = animeAdapter.withLoadStateHeaderAndFooter(
                header = MangaLoadStateAdapter(),
                footer = MangaLoadStateAdapter()
            )
        }

        animeAdapter.addLoadStateListener { state->
            with(binding){
                recyclerview.isVisible = state.refresh != LoadState.Loading
                progress.isVisible = state.refresh == LoadState.Loading
            }
        }
    }

    private fun onItemClick(name: String?) {
        Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
    }

    override fun setupSubscribers() {
        super.setupSubscribers()

        lifecycleScope.launch {
            viewModel.pagingAnime().collectPaging {
                animeAdapter.submitData(it)
            }
        }
    }
}