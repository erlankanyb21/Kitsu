package com.example.kitsu.presentation.fragments.home.anime

import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentAnimeBinding
import com.example.kitsu.presentation.activity.sharedvm.SharedViewModel
import com.example.kitsu.presentation.adapters.AnimeAdapter
import com.example.kitsu.presentation.adapters.MainLoadStateAdapter
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.fragments.dialog.FilterDialogFragment
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
            viewModel.pagingAnime(defaultValue).collectPaging { data->
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
            FilterDialogFragment().show(parentFragmentManager, "anime")
            lifecycleScope.launch {
                sharedViewModel.data.collect {
                    viewModel.pagingAnime(it).collectPaging {
                        animeAdapter.submitData(it)
                    }
                }
            }
        }
    }
    private fun onItemClick(name: String?) {
        Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
    }
    companion object {
        const val defaultValue = "adventure"
    }
}