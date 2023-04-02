package com.example.data.di

import com.example.data.local.Prefs
import com.example.data.network.apiservice.*
import com.example.data.repositories.*
import com.example.domain.repositories.*
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.module.Module
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * модуль Koin для настройки зависимостей, связанных с сетью в приложении. Каждый элемент в
 * этом модуле представляет собой функцию для предоставления объекта соответствующего типа.
 *
 * @author Erlan
 * @since 1.0v
 */
val networkModule: Module = module {
    factoryOf(::provideOkhttpClient)
    singleOf(::provideRetrofit)
    singleOf(::provideAnimeApi)
    singleOf(::provideMangaApi)
    singleOf(::provideUsersApi)
    singleOf(::provideAuthApi)
    singleOf(::providePostsApi)
    singleOf(::provideAnimeRepository)
    singleOf(::provideMangaRepository)
    singleOf(::provideUsersRepository)
    singleOf(::provideAuthRepository)
    singleOf(::providePostsRepository)
}

private const val base_url = "https://kitsu.io/"

/**
 * предоставляет OkHttpClient, который используется для выполнения запросов к серверу
 */
private fun provideOkhttpClient(prefs: Prefs): OkHttpClient {
    val interceptor = HttpLoggingInterceptor()
    interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

    val tokenInterceptor = Interceptor { chain ->
        val request = chain.request()
        val newRequest = request.newBuilder()
            .header("Authorization", "Bearer ${prefs.token}")
            .build()
        chain.proceed(newRequest)
    }

    return OkHttpClient.Builder()
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .connectTimeout(30, TimeUnit.SECONDS)
        .addInterceptor(interceptor)
        .addInterceptor(tokenInterceptor)
        .build()
}

/**
 * предоставляет объект Retrofit, который используется для создания интерфейсов API
 */
private fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .baseUrl(base_url)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
}

/*Api*/
/**
 * предоставляет интерфейс для взаимодействия с API, связанным с аниме
 */
private fun provideAnimeApi(retrofit: Retrofit): AnimeApiService =
    retrofit.create(AnimeApiService::class.java)

/**
 * предоставляет интерфейс для взаимодействия с API, связанным с мангой
 */
private fun provideMangaApi(retrofit: Retrofit): MangaApiService =
    retrofit.create(MangaApiService::class.java)

/**
 * предоставляет интерфейс для взаимодействия с API, связанным с пользователями
 */
private fun provideUsersApi(retrofit: Retrofit): UsersApiService =
    retrofit.create(UsersApiService::class.java)

/**
 * предоставляет интерфейс для взаимодействия с API, связанным с авторицазцией
 */
private fun provideAuthApi(retrofit: Retrofit): AuthApiService =
    retrofit.create(AuthApiService::class.java)

/**
 * предоставляет интерфейс для взаимодействия с API, связанным с постом
 */
private fun providePostsApi(retrofit: Retrofit): PostsApiService =
    retrofit.create(PostsApiService::class.java)
/*---------------------------------------------------------------------------*/

/*Repository*/
/**
 * предоставляет репозиторий для работы с данными, связанными с аниме
 */
private fun provideAnimeRepository(animeApiService: AnimeApiService): AnimeRepository =
    AnimeRepositoryImpl(animeApiService = animeApiService)

/**
 * предоставляет репозиторий для работы с данными, связанными с мангой
 */
private fun provideMangaRepository(mangaApiService: MangaApiService): MangaRepository =
    MangaRepositoryImpl(mangaApiService = mangaApiService)

/**
 * предоставляет репозиторий для работы с данными, связанными с пользователями
 */
private fun provideUsersRepository(usersApiService: UsersApiService): UsersRepository =
    UsersRepositoryImpl(usersApiService = usersApiService)

/**
 * предоставляет репозиторий для работы с данными, связанными с авторизацией
 */
private fun provideAuthRepository(authApiService: AuthApiService): AuthRepository =
    AuthRepositoryImpl(authApiService = authApiService)

/**
 * предоставляет репозиторий для работы с данными, связанными с постам
 */
private fun providePostsRepository(postsApiService: PostsApiService): PostsRepository =
    PostsRepositoryImpl(postsApiService = postsApiService)


