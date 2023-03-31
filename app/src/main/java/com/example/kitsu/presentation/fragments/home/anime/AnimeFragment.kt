package com.example.kitsu.presentation.fragments.home.anime

import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentAnimeBinding
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.fragments.dialog.sharedvm.SharedViewModel
import com.example.kitsu.presentation.fragments.home.HomeFragmentDirections
import com.example.kitsu.presentation.ui.adapters.AnimeAdapter
import com.example.kitsu.presentation.ui.adapters.MainLoadStateAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Фрагмент, отображающий список аниме
 *
 * @author Erlan
 * @since 1.0v
 */

class AnimeFragment : BaseFragment<AnimeViewModel, FragmentAnimeBinding>(R.layout.fragment_anime) {

    override val binding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel by viewModel<AnimeViewModel>()
    private val animeAdapter = AnimeAdapter(this::onItemClick)
    private val sharedViewModel by activityViewModels<SharedViewModel>()

    /**
     * Инициализация вью фрагмента
     */
    override fun initialize() {
        setupRecyclerView()
        loadStateListener()
        showAnimeList()
        setupFilter()
        setupSearch()
    }

    /**
     * Настройка функционала поиска
     */
    private fun setupSearch() {
        binding.searchView.addTextChangedListener {
            when {
                binding.searchView.text.isEmpty() -> {
                    showAnimeList()
                }
                else -> {
                    viewModel.pagingAnime(null, it.toString()).collectPaging { data ->
                        animeAdapter.submitData(data)
                    }
                }
            }

        }
    }

    /**
     * Настройка RecyclerView и адаптера
     */
    private fun setupRecyclerView() {
        binding.recyclerview.adapter = animeAdapter.withLoadStateFooter(
            footer = MainLoadStateAdapter()
        )
    }

    /**
     * Настройка прогрессбара
     */
    private fun loadStateListener() {
        animeAdapter.addLoadStateListener { state ->
            binding.recyclerview.isVisible = state.refresh != LoadState.Loading
            binding.progress.isVisible = state.refresh == LoadState.Loading
        }
    }

    /**
     * Настройка функционала фильтрации
     */
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

    /**
     * Отображение списка аниме в соответствии с выбранным фильтром
     */
    private fun showFilter() {
        safeFlowGather {
            sharedViewModel.animeState.collect { category ->
                when {
                    category.isNotEmpty() -> {
                        viewModel.pagingAnime(category, null)
                            .collectPaging { data -> animeAdapter.submitData(data) }
                    }
                    else -> {
                        showAnimeList()
                    }
                }
            }
        }
    }

    /**
     * Отображение списка аниме
     */
    private fun showAnimeList() {
        viewModel.pagingAnime(null, null).collectPaging { data -> animeAdapter.submitData(data) }
    }

    /**
     * Обработка клика на элемент списка аниме
     * @param name Название элемента, на котором произошел клик
     */
    private fun onItemClick(name: String?) {
        Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
    }
}