package com.example.kitsu.presentation.fragments.home.anime

import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentAnimeBinding
import com.example.kitsu.presentation.adapters.AnimeAdapter
import com.example.kitsu.presentation.adapters.MainLoadStateAdapter
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.fragments.dialog.sharedvm.SharedViewModel
import com.example.kitsu.presentation.fragments.home.HomeFragmentDirections
import org.koin.androidx.viewmodel.ext.android.viewModel

class AnimeFragment : BaseFragment<AnimeViewModel, FragmentAnimeBinding>(R.layout.fragment_anime) {

    override val binding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel by viewModel<AnimeViewModel>()
    private val animeAdapter = AnimeAdapter(this::onItemClick)
    private val sharedViewModel by activityViewModels<SharedViewModel>()
    override fun initialize() {
        setupRecyclerView()
        loadStateListener()
        showAnimeList()
        setupFilter()
    }

    private fun setupRecyclerView() {
        binding.recyclerview.adapter = animeAdapter.withLoadStateFooter(
            footer = MainLoadStateAdapter()
        )
    }

    private fun loadStateListener() {
        animeAdapter.addLoadStateListener { state ->
            binding.recyclerview.isVisible = state.refresh != LoadState.Loading
            binding.progress.isVisible = state.refresh == LoadState.Loading
        }
    }

    private fun setupFilter() {
        binding.btnFilter.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.actionNavigationHomeToMainDialogFragment(
                    1
                )
            )
        }
        showFilter()
    }

    private fun showFilter() {
        safeFlowGather {
            sharedViewModel.animeState.collect { category ->
                when {
                    category.isNotEmpty() -> {
                        viewModel.pagingAnime(category)
                            .collectPaging { data -> animeAdapter.submitData(data) }
                    }
                    else -> {
                        showAnimeList()
                    }
                }
            }
        }
    }

    private fun showAnimeList() {
        viewModel.pagingAnime(null).collectPaging { data -> animeAdapter.submitData(data) }
    }

    private fun onItemClick(name: String?) {
        Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
    }
}