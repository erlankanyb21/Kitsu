package com.example.data.repositories

import android.util.Log
import androidx.paging.PagingData
import com.example.data.base.BaseRepository
import com.example.data.mappers.toDomain
import com.example.data.network.apiservice.AnimeApiService
import com.example.data.network.paging.anime.AnimePagingSource
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
    override fun fetchAnimeList(limit: Int, offset: Int): Flow<Resource<AnimeModel?>> {
        return flow {
            emit(Resource.Loading())
            try {
                val response = animeApiService.fetchAnimeList(limit, offset)
                if (response?.data!!.isNotEmpty()) {
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

    override fun fetchPagingAnime(): Flow<PagingData<AnimeModel.Data>> =
        makePagingRequest(AnimePagingSource(animeApiService))
}