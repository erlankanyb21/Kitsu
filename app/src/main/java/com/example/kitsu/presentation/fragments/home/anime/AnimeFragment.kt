package com.example.kitsu.presentation.fragments.home.anime

import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentAnimeBinding
import com.example.kitsu.presentation.adapters.AnimeAdapter
import com.example.kitsu.presentation.adapters.MainLoadStateAdapter
import com.example.kitsu.presentation.base.BaseFragment
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class AnimeFragment : BaseFragment<AnimeViewModel, FragmentAnimeBinding>(R.layout.fragment_anime) {

    override val binding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel by viewModel<AnimeViewModel>()
    private val animeAdapter = AnimeAdapter(this::onItemClick)
    override fun initialize() {
        binding.recyclerview.adapter = animeAdapter.withLoadStateHeaderAndFooter(
            header = MainLoadStateAdapter(),
            footer = MainLoadStateAdapter()
        )
        lifecycleScope.launch {
            viewModel.pagingAnime(defaultValue).collectPaging {
                animeAdapter.submitData(it)
            }
        }
    }

    override fun setupListeners() {
        animeAdapter.addLoadStateListener { state ->
            with(binding) {
                recyclerview.isVisible = state.refresh != LoadState.Loading
                progress.isVisible = state.refresh == LoadState.Loading
            }
        }
        searchListener()
    }

    private fun searchListener() {
        binding.searchViewMain.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun afterTextChanged(text: Editable?) {
                lifecycleScope.launch {
                    viewModel.pagingAnime(text.toString().trim()).collectPaging {
                        animeAdapter.submitData(it)
                    }
                }
            }
        })
    }

    private fun onItemClick(name: String?) {
        Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
    }

    companion object {
        const val defaultValue = "adventure"
    }
}