package com.example.data.network.di

import com.example.data.network.apiservice.AnimeApiService
import com.example.data.repositories.AnimeRepositoryImpl
import com.example.domain.repositories.AnimeRepository
import com.example.domain.utils.Const
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule: Module = module {
    factory { provideOkhttpClient() }
    single { provideRetrofit(get()) }
    single { provideAnimeApi(get()) }
    single { provideAnimeRepository(get()) }

}
private fun provideOkhttpClient(): OkHttpClient {
    val interceptor = HttpLoggingInterceptor()
    interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

    return OkHttpClient.Builder()
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .connectTimeout(30, TimeUnit.SECONDS)
        .addInterceptor(interceptor)
        .build()
}
private fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .baseUrl(Const.Base_Url)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
}
private fun provideAnimeApi(retrofit: Retrofit): AnimeApiService = retrofit.create(AnimeApiService::class.java)
private fun provideAnimeRepository(animeApiService: AnimeApiService):AnimeRepository = AnimeRepositoryImpl(animeApiService)
