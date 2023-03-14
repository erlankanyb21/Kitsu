package com.example.kitsu.presentation.fragments.home.manga

import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.viewModelScope
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentMangaBinding
import com.example.kitsu.presentation.adapters.MangaAdapter
import com.example.kitsu.presentation.adapters.MangaLoadStateAdapter
import com.example.kitsu.presentation.base.BaseFragment
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class MangaFragment : BaseFragment<MangaViewModel, FragmentMangaBinding>(R.layout.fragment_manga) {

    override val binding: FragmentMangaBinding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel: MangaViewModel by viewModel()
    private val mangaAdapter by lazy { MangaAdapter(this::onItemClick) }

    private fun onItemClick(name: String?) {
        Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
    }

    override fun initialize() {
        with(binding){
            recyclerview.adapter = mangaAdapter.withLoadStateHeaderAndFooter(
                header = MangaLoadStateAdapter(),
                footer = MangaLoadStateAdapter()
            )
        }

        mangaAdapter.addLoadStateListener { state->
            with(binding){
                recyclerview.isVisible = state.refresh != LoadState.Loading
                progress.isVisible = state.refresh == LoadState.Loading
            }
        }
    }

    override fun setupSubscribers() {
        super.setupSubscribers()
        viewModel.viewModelScope.launch {
            viewModel.pagingManga().collectPaging{
                mangaAdapter.submitData(it)
            }
        }
    }
}