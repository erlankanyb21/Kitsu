package com.example.kitsu.presentation.fragments.home.anime

import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentAnimeBinding
import com.example.kitsu.presentation.adapters.AnimeAdapter
import com.example.kitsu.presentation.adapters.MainLoadStateAdapter
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.fragments.dialogs.AnimeDialogFragment
import com.example.kitsu.presentation.fragments.dialogs.sharedvm.SharedViewModel
import kotlinx.coroutines.flow.takeWhile
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class AnimeFragment : BaseFragment<AnimeViewModel, FragmentAnimeBinding>(R.layout.fragment_anime) {

    override val binding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel by viewModel<AnimeViewModel>()
    private val animeAdapter = AnimeAdapter(this::onItemClick)
    private val sharedViewModel by activityViewModels<SharedViewModel>()
    override fun initialize() {
        binding.recyclerview.adapter = animeAdapter.withLoadStateHeaderAndFooter(
            header = MainLoadStateAdapter(),
            footer = MainLoadStateAdapter()
        )
        lifecycleScope.launch {
            viewModel.pagingAnime(null)
                .collectPaging { data->
                animeAdapter.submitData(data)
            }
        }
    }

    override fun setupListeners() {
        animeAdapter.addLoadStateListener { state ->
            binding.recyclerview.isVisible = state.refresh != LoadState.Loading
            binding.progress.isVisible = state.refresh == LoadState.Loading
        }
        showFilter()
    }

    private fun showFilter() {
        binding.btnFilter.setOnClickListener {
            AnimeDialogFragment().show(parentFragmentManager,"manga")

            lifecycleScope.launch {
                sharedViewModel.animeState
                    .takeWhile { lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED) }
                    .collect { category ->
                        viewModel.pagingAnime(category.takeUnless { it.isEmpty() })
                            .collectPaging { data -> animeAdapter.submitData(data) }
                    }
            }
        }
    }
    private fun onItemClick(name: String?) {
        Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
    }
}