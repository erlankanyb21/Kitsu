package com.example.kitsu.presentation.fragments.dialogs

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentFilterDialogBinding
import com.example.kitsu.presentation.adapters.CategoriesAdapter
import com.example.kitsu.presentation.base.BaseDialogFragment
import com.example.kitsu.presentation.fragments.sharedvm.SharedViewModel

class AnimeDialogFragment : BaseDialogFragment<FragmentFilterDialogBinding>() {

    private val sharedViewModel by activityViewModels<SharedViewModel>()
    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFilterDialogBinding =
        FragmentFilterDialogBinding.inflate(
            inflater,
            container,
            false
        )

    override fun initialize() {

        dialog?.window?.attributes?.windowAnimations = R.style.DialogAnimation
        dialog?.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        val categories = resources.getStringArray(R.array.filters).toList()
        val adapter = CategoriesAdapter(this::onItemClick,categories)
        binding.recyclerview.adapter = adapter
    }

    override fun initListener() {
        binding.btnCancel.setOnClickListener {
          sharedViewModel.animeData(null)
            dismiss()
        }
    }

    private fun onItemClick(name:String?){
        sharedViewModel.animeData(name)
        dismiss()
    }
}