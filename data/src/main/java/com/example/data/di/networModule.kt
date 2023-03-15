package com.example.data.di

import com.example.data.network.apiservice.AnimeApiService
import com.example.data.network.apiservice.CategoriesApiService
import com.example.data.network.apiservice.MangaApiService
import com.example.data.network.apiservice.UsersApiService
import com.example.data.repositories.AnimeRepositoryImpl
import com.example.data.repositories.CategoriesRepositoryImpl
import com.example.data.repositories.MangaRepositoryImpl
import com.example.data.repositories.UsersRepositoryImpl
import com.example.domain.repositories.AnimeRepository
import com.example.domain.repositories.CategoriesRepository
import com.example.domain.repositories.MangaRepository
import com.example.domain.repositories.UsersRepository
import com.example.domain.baseurl.Const
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
    single { provideMangaApi(get()) }
    single { provideUsersApi(get()) }
    single { provideCategoriesApi(get()) }
    single { provideAnimeRepository(get()) }
    single { provideMangaRepository(get()) }
    single { provideUsersRepository(get()) }
    single { provideCategoriesRepository(get()) }
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
private fun provideMangaApi(retrofit: Retrofit): MangaApiService = retrofit.create(MangaApiService::class.java)
private fun provideUsersApi(retrofit: Retrofit): UsersApiService = retrofit.create(UsersApiService::class.java)
private fun provideCategoriesApi(retrofit: Retrofit): CategoriesApiService = retrofit.create(CategoriesApiService::class.java)
private fun provideAnimeRepository(animeApiService: AnimeApiService): AnimeRepository =
    AnimeRepositoryImpl(animeApiService = animeApiService)
private fun provideMangaRepository(mangaApiService: MangaApiService): MangaRepository =
    MangaRepositoryImpl(mangaApiService = mangaApiService)
private fun provideUsersRepository(usersApiService: UsersApiService): UsersRepository =
    UsersRepositoryImpl(usersApiService = usersApiService)
private fun provideCategoriesRepository(categoriesApiService: CategoriesApiService): CategoriesRepository =
    CategoriesRepositoryImpl(categoriesApiService = categoriesApiService)
