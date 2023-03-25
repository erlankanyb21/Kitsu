package com.example.kitsu.presentation.fragments.add

import androidx.core.view.isVisible
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentAddBinding
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.custom.CustomToast
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class AddFragment : BaseFragment<AddViewModel, FragmentAddBinding>(R.layout.fragment_add) {
    override val viewModel by viewModel<AddViewModel>()
    override val binding by viewBinding(FragmentAddBinding::bind)
    override fun initialize() {
        checkState()
        clickPost()
        clickBack()
    }

    private fun clickBack() {
        binding.tvBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }

    private fun checkState() {
        viewModel.viewModelScope.launch {
            viewModel.postState.spectateUiState(error = {
                CustomToast.show(requireContext(), it)
                binding.progress.isVisible = false
                binding.tvPost.isEnabled = true
            }, success = {
                binding.progress.isVisible = false
                binding.tvPost.isEnabled = true
                CustomToast.show(
                    requireContext(),
                    "Your comment ${it.data?.attributes?.content} was completely posted"
                )
            })
        }
    }

    private fun clickPost() {
        binding.tvPost.setOnClickListener {
            createPostRequest()
        }
    }

    private fun createPostRequest() {
        when {
            binding.commentEd.text.toString().isEmpty() -> {
                CustomToast.show(requireContext(), "Please write something")
            }
            else -> {
                viewModel.createPost(
                    binding.commentEd.text.toString(),
                    binding.nsfwBtn.isChecked,
                    binding.spoilerBtn.isChecked
                )
            }
        }
    }
}