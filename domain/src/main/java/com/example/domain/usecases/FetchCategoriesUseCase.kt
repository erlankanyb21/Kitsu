package com.example.domain.usecases

import com.example.domain.repositories.CategoriesRepository

class FetchCategoriesUseCase(
    private val categoriesRepository: CategoriesRepository
) {
    operator fun invoke() = categoriesRepository.fetchCategoryList()
}