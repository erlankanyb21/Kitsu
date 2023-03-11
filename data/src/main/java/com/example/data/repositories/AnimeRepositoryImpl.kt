package com.example.data.repositories

import android.util.Log
import com.example.data.base.BaseRepository
import com.example.data.mappers.toDomain
import com.example.data.network.apiservice.AnimeApiService
import com.example.domain.models.AnimeModel
import com.example.domain.repositories.AnimeRepository
import com.example.domain.resource.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import org.koin.dsl.module

val dataSourceImpl = module {
    factory { AnimeRepositoryImpl(get()) }
}

class AnimeRepositoryImpl(
    private val animeApiService: AnimeApiService
) : AnimeRepository, BaseRepository() {
    override fun fetchAnimeList(): Flow<Resource<AnimeModel?>> {
        return flow {
            emit(Resource.Loading())
            try {
                val response = animeApiService.fetchAnimeList()
                if (response.data.isNotEmpty()) {
                    emit(
                        Resource.Success(
                            data = response.toDomain()
                        )
                    )
                    Log.e(
                        "Kitsu", "fetchAnimeList: ${response.data}"
                    )
                }
            } catch (e: IOException) {
                emit(Resource.Error(e.localizedMessage as String))
            }
        }
    }
}