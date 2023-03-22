package com.example.data.di

import com.example.data.BuildConfig
import com.example.data.network.apiservice.*
import com.example.data.repositories.*
import com.example.domain.repositories.*
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
    single { provideAuthApi(get()) }
    single { providePostsApi(get()) }
    single { provideAnimeRepository(get()) }
    single { provideMangaRepository(get()) }
    single { provideUsersRepository(get()) }
    single { provideAuthRepository(get()) }
    single { providePostsRepository(get()) }
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
        .baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
}

/*Api*/
private fun provideAnimeApi(retrofit: Retrofit): AnimeApiService =
    retrofit.create(AnimeApiService::class.java)

private fun provideMangaApi(retrofit: Retrofit): MangaApiService =
    retrofit.create(MangaApiService::class.java)

private fun provideUsersApi(retrofit: Retrofit): UsersApiService =
    retrofit.create(UsersApiService::class.java)

private fun provideAuthApi(retrofit: Retrofit): AuthApiService =
    retrofit.create(AuthApiService::class.java)

private fun providePostsApi(retrofit: Retrofit): PostsApiService =
    retrofit.create(PostsApiService::class.java)
/*---------------------------------------------------------------------------*/

/*Repository*/
private fun provideAnimeRepository(animeApiService: AnimeApiService): AnimeRepository =
    AnimeRepositoryImpl(animeApiService = animeApiService)

private fun provideMangaRepository(mangaApiService: MangaApiService): MangaRepository =
    MangaRepositoryImpl(mangaApiService = mangaApiService)

private fun provideUsersRepository(usersApiService: UsersApiService): UsersRepository =
    UsersRepositoryImpl(usersApiService = usersApiService)

private fun provideAuthRepository(authApiService: AuthApiService): AuthRepository =
    AuthRepositoryImpl(authApiService = authApiService)

private fun providePostsRepository(postsApiService: PostsApiService): PostsRepository =
    PostsRepositoryImpl(postsApiService = postsApiService)


