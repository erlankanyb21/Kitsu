package com.example.kitsu.presentation.fragments.home.manga

import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentMangaBinding
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.fragments.dialog.sharedvm.SharedViewModel
import com.example.kitsu.presentation.fragments.home.HomeFragmentDirections
import com.example.kitsu.presentation.ui.adapters.MainLoadStateAdapter
import com.example.kitsu.presentation.ui.adapters.MangaAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Фрагмент, отображающий список манги
 *
 * @author Erlan
 * @since 1.0v
 */
class MangaFragment : BaseFragment<MangaViewModel, FragmentMangaBinding>(R.layout.fragment_manga) {

    override val binding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel by viewModel<MangaViewModel>()
    private val mangaAdapter = MangaAdapter(this::onItemClick)
    private val sharedViewModel by activityViewModels<SharedViewModel>()

    /**
     * Инициализация вью фрагмента
     */
    override fun initialize() {
        setupRecyclerView()
        loadStateListener()
        showMangaList()
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
                    showMangaList()
                }
                else -> {
                    viewModel.pagingManga(null, it.toString()).collectPaging { data ->
                        mangaAdapter.submitData(data)
                    }
                }
            }

        }
    }

    /**
     * Настройка RecyclerView и адаптера
     */
    private fun setupRecyclerView() {
        binding.recyclerview.adapter = mangaAdapter.withLoadStateFooter(
            footer = MainLoadStateAdapter()
        )
    }

    /**
     * Настройка прогрессбара
     */
    private fun loadStateListener() {
        mangaAdapter.addLoadStateListener { state ->
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
                    2
                )
            )
        }
        showFilter()
    }

    /**
     * Отображение списка манги в соответствии с выбранным фильтром
     */
    private fun showFilter() {
        safeFlowGather {
            sharedViewModel.mangaState.collect { category ->
                when {
                    category.isNotEmpty() -> {
                        viewModel.pagingManga(category, null)
                            .collectPaging { data -> mangaAdapter.submitData(data) }
                    }
                    else -> {
                        showMangaList()
                    }
                }
            }
        }
    }

    /**
     * Отображение списка манги
     */
    private fun showMangaList() {
        viewModel.pagingManga(null, null).collectPaging { data -> mangaAdapter.submitData(data) }
    }

    /**
     * Обработка клика на элемент списка аниме
     * @param name Название элемента, на котором произошел клик
     */
    private fun onItemClick(name: String?) {
        Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
    }
}