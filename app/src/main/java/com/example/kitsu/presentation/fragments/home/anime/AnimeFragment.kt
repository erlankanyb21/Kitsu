package com.example.kitsu.presentation.fragments.home.anime

import android.view.View
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.paging.flatMap
import androidx.paging.map
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentAnimeBinding
import com.example.kitsu.presentation.adapters.AnimeAdapter
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.mapper.toUI
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class AnimeFragment : BaseFragment<AnimeViewModel, FragmentAnimeBinding>(R.layout.fragment_anime) {

    override val binding: FragmentAnimeBinding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel: AnimeViewModel by viewModel()
    private val animeAdapter = AnimeAdapter(this::onItemClick)

    override fun initialize() {
        binding.recyclerview.adapter = animeAdapter
    }

    private fun onItemClick(position: String?) {
        Toast.makeText(requireContext(), position, Toast.LENGTH_SHORT).show()
    }

    override fun setupListeners() {
        lifecycleScope.launch {
            viewModel.pagingAnime().collectLatest {
                binding.progress.visibility = View.VISIBLE
                delay(1500)
                binding.progress.visibility = View.GONE
                animeAdapter.submitData(it.map { it.toUI() })

            }
        }
//
//        viewLifecycleOwner.lifecycleScope.launch {
////            viewModel.anime(20,35)
//            viewModel.fetchAnimeState.collectStates(
//                onLoading = {
//                    binding.progress.visibility = View.VISIBLE
//                }, onSuccess = {
//                    binding.progress.visibility = View.GONE
//                    binding.recyclerview.adapter = animeAdapter
//                    animeAdapter.submitList(it.data)
//                }, onError = {
//                    Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
//                })
//        }
//    }
    }
}