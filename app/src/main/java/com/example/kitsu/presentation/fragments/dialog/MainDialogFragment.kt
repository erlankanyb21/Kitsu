package com.example.kitsu.presentation.fragments.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentMainFilterDialogBinding
import com.example.kitsu.presentation.adapters.CategoriesAdapter
import com.example.kitsu.presentation.fragments.dialog.sharedvm.SharedViewModel

class MainDialogFragment : DialogFragment(R.layout.fragment_main_filter_dialog) {
    private var binding: FragmentMainFilterDialogBinding? = null
    private val sharedViewModel by activityViewModels<SharedViewModel>()
    private val args by navArgs<MainDialogFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainFilterDialogBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupDialog()
        setupRecyclerView()
        setupListener()
    }

    private fun setupDialog() {
        dialog?.window?.attributes?.windowAnimations = R.style.DialogAnimation
        dialog?.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    }

    private fun setupRecyclerView() {
        val categories = resources.getStringArray(R.array.filters).toList()
        val adapter = CategoriesAdapter(this::onItemClick, categories)
        binding?.recyclerview?.adapter = adapter
    }

    private fun setupListener() {
        binding?.btnCancel?.setOnClickListener {
            when (args.whereToApplyFilter) {
                1 -> sharedViewModel.animeData("")
                2 -> sharedViewModel.mangaData("")
            }
            dismiss()
        }
    }

    private fun onItemClick(name: String?) {
        when (args.whereToApplyFilter) {
            1 -> sharedViewModel.animeData(name)
            2 -> sharedViewModel.mangaData(name)
        }
        dismiss()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}