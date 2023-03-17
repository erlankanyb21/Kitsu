package com.example.kitsu.presentation.fragments.auth

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kitsu.R

class SignFlowFragment : Fragment() {

    companion object {
        fun newInstance() = SignFlowFragment()
    }

    private lateinit var viewModel: SignFlowViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_flow, container, false)
    }

}