package com.example.kitsu.presentation.fragments.home.users

import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.viewModelScope
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentUsersBinding
import com.example.kitsu.presentation.adapters.MainLoadStateAdapter
import com.example.kitsu.presentation.adapters.UsersAdapter
import com.example.kitsu.presentation.base.BaseFragment
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class UsersFragment : BaseFragment<UsersViewModel, FragmentUsersBinding>(R.layout.fragment_users) {

    override val binding by viewBinding(FragmentUsersBinding::bind)
    override val viewModel by viewModel<UsersViewModel>()
    private val usersAdapter = UsersAdapter(this::onItemClick)

    override fun initialize() {
        binding.recyclerview.adapter = usersAdapter.withLoadStateHeaderAndFooter(
            header = MainLoadStateAdapter(),
            footer = MainLoadStateAdapter()
        )
    }

    override fun setupListeners() {
        usersAdapter.addLoadStateListener { state ->
            with(binding) {
                recyclerview.isVisible = state.refresh != LoadState.Loading
                progress.isVisible = state.refresh == LoadState.Loading
            }
        }
    }

    override fun setupSubscribers() {
        viewModel.viewModelScope.launch {
            viewModel.pagingUsers()
                .collectPaging {
                usersAdapter.submitData(it)
            }
        }
    }

    private fun onItemClick(name: String?) {
        Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
    }
}
