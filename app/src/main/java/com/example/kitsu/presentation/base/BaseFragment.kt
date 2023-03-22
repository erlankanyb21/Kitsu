package com.example.kitsu.presentation.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.paging.PagingData
import androidx.viewbinding.ViewBinding
import com.example.kitsu.presentation.state.UIState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

abstract class BaseFragment<ViewModel : BaseViewModel, Binding : ViewBinding>(
    @LayoutRes layoutId: Int
) : Fragment(layoutId) {

    protected abstract val viewModel: ViewModel
    protected abstract val binding: Binding
    final override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    protected open fun initialize() {}

    protected fun <T> StateFlow<UIState<T>>.collectStates(
        onLoading: () -> Unit, onError: (msg: String) -> Unit, onSuccess: (data: T) -> Unit
    ) {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                this@collectStates.collect {
                    when (it) {
                        is UIState.Loading -> {
                            onLoading()
                        }
                        is UIState.Error -> {
                            onError(it.error)
                        }
                        is UIState.Success -> {
                            onSuccess(it.data)
                        }
                        else -> {
                            it.toString()
                        }
                    }
                }
            }
        }
    }

    protected fun <T : Any> Flow<PagingData<T>>.collectPaging(
        lifecycleState: Lifecycle.State = Lifecycle.State.STARTED,
        action: suspend (value: PagingData<T>) -> Unit
    ) {
        safeFlowGather(lifecycleState) { this.collectLatest { action(it) } }
    }

    protected fun safeFlowGather(
        lifecycleState: Lifecycle.State = Lifecycle.State.STARTED, action: suspend () -> Unit
    ) {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(lifecycleState) {
                action()
            }
        }
    }
}