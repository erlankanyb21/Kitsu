package com.example.data.repositories

import android.util.Log
import com.example.data.base.BaseRepository
import com.example.data.mappers.toDomain
import com.example.data.network.apiservice.CategoriesApiService
import com.example.domain.models.CategoriesModel
import com.example.domain.repositories.CategoriesRepository
import com.example.domain.resource.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import org.koin.dsl.module

val categoriesDataSourceImpl = module {
    single { CategoriesRepositoryImpl(get()) }
}
class CategoriesRepositoryImpl(
    private val categoriesApiService: CategoriesApiService
) : CategoriesRepository, BaseRepository() {
    override fun fetchCategoryList(): Flow<Resource<CategoriesModel?>> {
        return flow {
            emit(Resource.Loading())
            try {
                val response = categoriesApiService.fetchCategories()
                if (response?.data!!.isNotEmpty()) {
                    emit(
                        Resource.Success(
                            data = response.toDomain()
                        )
                    )
                    Log.e(
                        "Kitsu", "fetchCategoryList: ${response.data}"
                    )
                }
            } catch (e: IOException) {
                emit(Resource.Error(e.localizedMessage as String))
            }
        }
    }

}