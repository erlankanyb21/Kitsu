package com.example.kitsu.presentation.fragments.home.users

import android.widget.Toast
import androidx.core.view.isVisible
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentUsersBinding
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.ui.adapters.MainLoadStateAdapter
import com.example.kitsu.presentation.ui.adapters.UsersAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Фрагмент, отображающий список пользователей
 *
 * @author Erlan
 * @since 1.0v
 */
class UsersFragment : BaseFragment<UsersViewModel, FragmentUsersBinding>(R.layout.fragment_users) {

    override val binding by viewBinding(FragmentUsersBinding::bind)
    override val viewModel by viewModel<UsersViewModel>()
    private val usersAdapter = UsersAdapter(this::onItemClick)

    /**
     * Инициализация вью фрагмента
     */
    override fun initialize() {
        setupRecyclerView()
        loadStateListener()
        showUsersList()
    }

    /**
     * Настройка RecyclerView и адаптера
     */
    private fun setupRecyclerView() {
        binding.recyclerview.adapter = usersAdapter.withLoadStateFooter(
            footer = MainLoadStateAdapter()
        )
    }

    /**
     * Настройка прогрессбара
     */
    private fun loadStateListener() {
        usersAdapter.addLoadStateListener { state ->
            binding.recyclerview.isVisible = state.refresh != LoadState.Loading
            binding.progress.isVisible = state.refresh == LoadState.Loading
        }
    }

    /**
     * Отображение списка пользователей
     */
    private fun showUsersList() {
        viewModel.pagingUsers().collectPaging { data -> usersAdapter.submitData(data) }
    }

    /**
     * Обработка клика на элемент списка пользователей
     * @param name Название элемента, на котором произошел клик
     */
    private fun onItemClick(name: String?) {
        Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
    }
}
