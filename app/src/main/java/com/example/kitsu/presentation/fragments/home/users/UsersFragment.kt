package com.example.kitsu.presentation.fragments.home.users

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentUsersBinding
import com.example.kitsu.presentation.base.BaseFragment

class UsersFragment : BaseFragment<UsersViewModel, FragmentUsersBinding>(R.layout.fragment_users) {

    override val binding: FragmentUsersBinding by viewBinding(FragmentUsersBinding::bind)
    override val viewModel: UsersViewModel by viewModels()

    override fun initialize() {
        super.initialize()

    }

}