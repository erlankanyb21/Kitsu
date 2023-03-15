package com.example.kitsu.presentation.fragments.dialog

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kitsu.R

class FilterDialogFragment : Fragment() {

    companion object {
        fun newInstance() = FilterDialogFragment()
    }

    private lateinit var viewModel: FilterDialogViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_filter_dialog, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FilterDialogViewModel::class.java)
        // TODO: Use the ViewModel
    }

}