package com.example.data.network

import com.example.data.local.Prefs
import com.example.data.network.apiservice.*
import com.example.data.repositories.*
import com.example.domain.repositories.*
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Factory
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * модуль Koin для настройки зависимостей, связанных с сетью в приложении. Каждый элемент в
 * этом модуле представляет собой функцию для предоставления объекта соответствующего типа.
 *
 * @author Erlan
 * @since 1.0v
 *
 */

@Module
@ComponentScan
class NetworkModule

val base_url = "https://kitsu.io/"

/**
 * предоставляет OkHttpClient, который используется для выполнения запросов к серверу
 */

@Factory
fun provideOkhttpClient(prefs: Prefs): OkHttpClient {
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
@Single
fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
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
@Single
fun provideAnimeApi(retrofit: Retrofit): AnimeApiService =
    retrofit.create(AnimeApiService::class.java)

/**
 * предоставляет интерфейс для взаимодействия с API, связанным с мангой
 */
@Single
fun provideMangaApi(retrofit: Retrofit): MangaApiService =
    retrofit.create(MangaApiService::class.java)

/**
 * предоставляет интерфейс для взаимодействия с API, связанным с пользователями
 */
@Single
fun provideUsersApi(retrofit: Retrofit): UsersApiService =
    retrofit.create(UsersApiService::class.java)

/**
 * предоставляет интерфейс для взаимодействия с API, связанным с авторицазцией
 */
@Single
fun provideAuthApi(retrofit: Retrofit): AuthApiService =
    retrofit.create(AuthApiService::class.java)

/**
 * предоставляет интерфейс для взаимодействия с API, связанным с постом
 */
@Single
fun providePostsApi(retrofit: Retrofit): PostsApiService =
    retrofit.create(PostsApiService::class.java)
/*---------------------------------------------------------------------------*/

/*Repository*/
/**
 * предоставляет репозиторий для работы с данными, связанными с аниме
 */
@Single
fun provideAnimeRepository(animeApiService: AnimeApiService): AnimeRepository =
    AnimeRepositoryImpl(animeApiService = animeApiService)

/**
 * предоставляет репозиторий для работы с данными, связанными с мангой
 */
@Single
fun provideMangaRepository(mangaApiService: MangaApiService): MangaRepository =
    MangaRepositoryImpl(mangaApiService = mangaApiService)

/**
 * предоставляет репозиторий для работы с данными, связанными с пользователями
 */
@Single
fun provideUsersRepository(usersApiService: UsersApiService): UsersRepository =
    UsersRepositoryImpl(usersApiService = usersApiService)

/**
 * предоставляет репозиторий для работы с данными, связанными с авторизацией
 */
@Single
fun provideAuthRepository(authApiService: AuthApiService): AuthRepository =
    AuthRepositoryImpl(authApiService = authApiService)

/**
 * предоставляет репозиторий для работы с данными, связанными с постам
 */
@Single
fun providePostsRepository(postsApiService: PostsApiService): PostsRepository =
    PostsRepositoryImpl(postsApiService = postsApiService)


