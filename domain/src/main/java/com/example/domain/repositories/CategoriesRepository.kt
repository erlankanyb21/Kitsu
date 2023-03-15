package com.example.domain.repositories

import com.example.domain.models.CategoriesModel
import com.example.domain.resource.Resource
import kotlinx.coroutines.flow.Flow

interface CategoriesRepository {

    fun fetchCategoryList() : Flow<Resource<CategoriesModel?>>
}