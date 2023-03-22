package com.example.kitsu.presentation.fragments.home.users

import android.widget.Toast
import androidx.core.view.isVisible
import androidx.paging.LoadState
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentUsersBinding
import com.example.kitsu.presentation.adapters.MainLoadStateAdapter
import com.example.kitsu.presentation.adapters.UsersAdapter
import com.example.kitsu.presentation.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class UsersFragment : BaseFragment<UsersViewModel, FragmentUsersBinding>(R.layout.fragment_users) {

    override val binding by viewBinding(FragmentUsersBinding::bind)
    override val viewModel by viewModel<UsersViewModel>()
    private val usersAdapter = UsersAdapter(this::onItemClick)

    override fun initialize() {
        setupRecyclerView()
        loadStateListener()
        showUsersList()
    }

    private fun setupRecyclerView() {
        binding.recyclerview.adapter = usersAdapter.withLoadStateFooter(
            footer = MainLoadStateAdapter()
        )
    }

    private fun loadStateListener() {
        usersAdapter.addLoadStateListener { state ->
            binding.recyclerview.isVisible = state.refresh != LoadState.Loading
            binding.progress.isVisible = state.refresh == LoadState.Loading
        }
    }

    private fun showUsersList() {
        viewModel.pagingUsers().collectPaging { data -> usersAdapter.submitData(data) }
    }

    private fun onItemClick(name: String?) {
        Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
    }
}
