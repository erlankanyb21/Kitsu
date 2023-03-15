package com.example.kitsu.presentation.fragments.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResult
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentFilterDialogBinding
import com.example.kitsu.presentation.adapters.CategoriesAdapter
import com.example.kitsu.presentation.base.BaseDialogFragment

class FilterDialogFragment : BaseDialogFragment<FragmentFilterDialogBinding>() {
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

    private fun onItemClick(name:String?){
        val bundle = Bundle()
        bundle.putString("key",name)
        setFragmentResult("bundle",bundle)
        dismiss()
    }
}