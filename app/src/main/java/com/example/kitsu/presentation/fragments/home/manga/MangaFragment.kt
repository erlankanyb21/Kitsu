package com.example.kitsu.presentation.fragments.home.manga

import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentMangaBinding
import com.example.kitsu.presentation.adapters.MainLoadStateAdapter
import com.example.kitsu.presentation.adapters.MangaAdapter
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.fragments.dialog.sharedvm.SharedViewModel
import com.example.kitsu.presentation.fragments.home.HomeFragmentDirections
import org.koin.androidx.viewmodel.ext.android.viewModel

class MangaFragment : BaseFragment<MangaViewModel, FragmentMangaBinding>(R.layout.fragment_manga) {

    override val binding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel by viewModel<MangaViewModel>()
    private val mangaAdapter = MangaAdapter(this::onItemClick)
    private val sharedViewModel by activityViewModels<SharedViewModel>()
    override fun initialize() {
        setupRecyclerView()
        loadStateListener()
        showMangaList()
        setupFilter()
    }

    private fun setupRecyclerView() {
        binding.recyclerview.adapter = mangaAdapter.withLoadStateFooter(
            footer = MainLoadStateAdapter()
        )
    }

    private fun loadStateListener() {
        mangaAdapter.addLoadStateListener { state ->
            binding.recyclerview.isVisible = state.refresh != LoadState.Loading
            binding.progress.isVisible = state.refresh == LoadState.Loading
        }
    }

    private fun setupFilter() {
        binding.btnFilter.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.actionNavigationHomeToMainDialogFragment(
                    2
                )
            )
        }
        showFilter()
    }

    private fun showFilter() {
        safeFlowGather {
            sharedViewModel.mangaState.collect { category ->
                when {
                    category.isNotEmpty() -> {
                        viewModel.pagingManga(category)
                            .collectPaging { data -> mangaAdapter.submitData(data) }
                    }
                    else -> {
                        showMangaList()
                    }
                }
            }
        }
    }

    private fun showMangaList() {
        viewModel.pagingManga(null).collectPaging { data -> mangaAdapter.submitData(data) }
    }

    private fun onItemClick(name: String?) {
        Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
    }
}