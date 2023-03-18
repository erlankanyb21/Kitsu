package com.example.kitsu.presentation.fragments.home.manga

import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentMangaBinding
import com.example.kitsu.presentation.adapters.MainLoadStateAdapter
import com.example.kitsu.presentation.adapters.MangaAdapter
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.fragments.dialogs.MangaDialogFragment
import com.example.kitsu.presentation.fragments.sharedvm.SharedViewModel
import kotlinx.coroutines.flow.takeWhile
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class MangaFragment : BaseFragment<MangaViewModel, FragmentMangaBinding>(R.layout.fragment_manga) {
    override val binding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel by viewModel<MangaViewModel>()
    private val mangaAdapter = MangaAdapter(this::onItemClick)
    private val sharedViewModel by activityViewModels<SharedViewModel>()
    override fun initialize() {
        binding.recyclerview.adapter = mangaAdapter.withLoadStateHeaderAndFooter(
            header = MainLoadStateAdapter(),
            footer = MainLoadStateAdapter()
        )
        lifecycleScope.launch {
            viewModel.pagingManga(null)
                .collectPaging {
                mangaAdapter.submitData(it)
            }
        }
    }

    override fun setupListeners() {
        mangaAdapter.addLoadStateListener { state ->
            binding.recyclerview.isVisible = state.refresh != LoadState.Loading
            binding.progress.isVisible = state.refresh == LoadState.Loading
        }
        showFilter()
    }

    private fun showFilter() {
        binding.btnFilter.setOnClickListener {
            MangaDialogFragment().show(parentFragmentManager, "manga")

            lifecycleScope.launch {
                sharedViewModel.mangaState
                    .takeWhile { lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED) }
                    .collect { category ->
                        viewModel.pagingManga(category.takeUnless { it.isEmpty() })
                            .collectPaging { data -> mangaAdapter.submitData(data) }
                    }
            }
        }
    }

    private fun onItemClick(name: String?) {
        Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
    }

}