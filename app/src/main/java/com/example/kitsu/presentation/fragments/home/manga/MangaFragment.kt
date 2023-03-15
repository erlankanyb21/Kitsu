package com.example.kitsu.presentation.fragments.home.manga

import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.setFragmentResultListener
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentMangaBinding
import com.example.kitsu.presentation.adapters.MainLoadStateAdapter
import com.example.kitsu.presentation.adapters.MangaAdapter
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.fragments.dialog.FilterDialogFragment
import com.example.kitsu.presentation.fragments.home.anime.AnimeFragment
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class MangaFragment : BaseFragment<MangaViewModel, FragmentMangaBinding>(R.layout.fragment_manga) {
    override val binding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel by viewModel<MangaViewModel>()
    private val mangaAdapter = MangaAdapter(this::onItemClick)
    override fun initialize() {
        binding.recyclerview.adapter = mangaAdapter.withLoadStateHeaderAndFooter(
            header = MainLoadStateAdapter(),
            footer = MainLoadStateAdapter()
        )
        lifecycleScope.launch {
            viewModel.pagingManga(AnimeFragment.defaultValue).collectPaging {
                mangaAdapter.submitData(it)
            }
        }
    }
    override fun setupListeners() {
        super.setupListeners()
        mangaAdapter.addLoadStateListener { state ->
            binding.recyclerview.isVisible = state.refresh != LoadState.Loading
            binding.progress.isVisible = state.refresh == LoadState.Loading
        }
        searchListener()
        showFilter()
    }
    private fun showFilter() {
        binding.btnFilter.setOnClickListener {
            val filterDialogFragment = FilterDialogFragment()
            setFragmentResultListener("bundle") { requestKey: String, bundle: Bundle ->
                bundle.getBundle("key")
                lifecycleScope.launch {
                    viewModel.pagingManga(bundle.toString()).collectPaging {
                        mangaAdapter.submitData(it)
                    }
                }
            }
            val manager = requireActivity().supportFragmentManager
            filterDialogFragment.show(manager, "filter")
        }
    }

    private fun searchListener() {
        binding.searchView.addTextChangedListener{ text->
            viewModel.viewModelScope.launch {
                viewModel.pagingManga(query = text.toString().trim()).collectPaging {
                    mangaAdapter.submitData(it)
                }
            }
        }
    }
    private fun onItemClick(name: String?) {
        Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
    }
}