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

/**
 * Фрагмент для добавления нового поста.
 * Использует [AddViewModel] для взаимодействия с данными и логики.
 * Имеет [FragmentAddBinding] для управления разметкой фрагмента.
 *
 * @author Erlan
 * @since 1.0v
 */
class AddFragment : BaseFragment<AddViewModel, FragmentAddBinding>(R.layout.fragment_add) {
    override val viewModel by viewModel<AddViewModel>()
    override val binding by viewBinding(FragmentAddBinding::bind)

    /**
     * Инициализация фрагмента.
     * Вызывает методы для настройки интерфейса и обработки событий нажатия кнопок.
     */
    override fun initialize() {
        checkState()
        clickPost()
        clickBack()
    }

    /**
     * Обработчик события нажатия кнопки "Назад".
     * Возвращает на предыдущий фрагмент в стеке навигации.
     */
    private fun clickBack() {
        binding.tvBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }

    /**
     * Проверка состояния [AddViewModel.postState] и отображение сообщений об ошибках или успешной отправке поста.
     */

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

    /**
     * [clickPost] - Обработчик события нажатия кнопки "Отправить".
     * Создает запрос на добавление нового поста, передавая введенный текст и значения флажков NSFW и Spoiler.
     * В случае некорректных данных выводит соответствующее сообщение об ошибке.
     */
    private fun clickPost() {
        binding.tvPost.setOnClickListener {
            createPostRequest()
        }
    }

    /**
     * [createPostRequest] - Создает запрос на добавление нового поста с указанными параметрами.
     * Если поле комментария пустое, выводит сообщение об ошибке.
     */
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