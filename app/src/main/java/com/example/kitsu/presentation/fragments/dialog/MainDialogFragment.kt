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

/**
 * Фрагмент, который отображает диалоговое окно с выбором категорий.
 * Определяет и управляет поведением для отображения списка категорий,
 * обработки событий нажатия на элементы списка и отмены диалога.
 * @constructor создает экземпляр фрагмента [MainDialogFragment].
 *
 * @author Erlan
 * @since 1.0v
 */
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

    /**
     * Настраивает параметры отображения диалогового окна.
     */
    private fun setupDialog() {
        dialog?.window?.attributes?.windowAnimations = R.style.DialogAnimation
        dialog?.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    }

    /**
     * Настраивает отображение списка категорий.
     */
    private fun setupRecyclerView() {
        val categories = resources.getStringArray(R.array.filters).toList()
        val adapter = CategoriesAdapter(this::onItemClick, categories)
        binding?.recyclerview?.adapter = adapter
    }

    /**
     * Настраивает обработку событий нажатия на элементы списка.
     */
    private fun setupListener() {
        binding?.btnCancel?.setOnClickListener {
            when (args.whereToApplyFilter) {
                1 -> sharedViewModel.animeData("")
                2 -> sharedViewModel.mangaData("")
            }
            dismiss()
        }
    }

    /**
     * Обрабатывает нажатие на элемент списка категорий.
     * @param name имя выбранной категории.
     */
    private fun onItemClick(name: String?) {
        when (args.whereToApplyFilter) {
            1 -> sharedViewModel.animeData(name)
            2 -> sharedViewModel.mangaData(name)
        }
        dismiss()
    }

    /**
     * [onDestroyView] - вызывается при уничтожении экземпляра [MainDialogFragment] и
     * освобождает ресурсы, связанные с binding.
     *
     */
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}