package com.example.data.network.apiservice

import com.example.data.network.models.categories.CategoriesDto
import retrofit2.http.GET

interface CategoriesApiService {

    @GET("/api/edge/categories")
    suspend fun fetchCategories(): CategoriesDto?

}