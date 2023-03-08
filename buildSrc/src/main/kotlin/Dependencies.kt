object Dependencies {
    object Kotlin {
        private const val version = "1.6.4"

        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4"
        const val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"

    }

    object UIComponents {
        const val material = "com.google.android.material:material:1.6.1"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
        const val viewBindingPropertyDelegate =
            "com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.6"
        const val appCompat = "androidx.appcompat:appcompat:1.6.0"
    }

    object Core {
        private const val version = "1.8.0"
        const val core = "androidx.core:core-ktx:$version"
    }

    object viewpager2 {
        const val viewpager2 = "androidx.viewpager2:viewpager2:view_pager_version"
    }

    object Lifecycle {
        private const val version = "2.4.1"

        // | for Lifecycles only (without ViewModel or LiveData)
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$version"

        // | for ViewModel
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
    }

    object Navigation {
        private const val version = "2.5.3"

        const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
        const val ui = "androidx.navigation:navigation-ui-ktx:$version"
    }

    object Retrofit {
        private const val version = "2.9.0"

        const val retrofit = "com.squareup.retrofit2:retrofit:$version"
        const val converterGson = "com.squareup.retrofit2:converter-gson:2.9.0"
    }

    object Androidx {

        const val legacySupport = "androidx.legacy:legacy-support-v4:1.0.0"
        const val junit = "junit:junit:4.13.2"
        const val testJunit = "androidx.test.ext:junit:1.1.5"
        const val testEspresso = "androidx.test.espresso:espresso-core:3.5.1"

    }

    object OkHttp {
        private const val version = "5.0.0-alpha.5"

        const val okHttp = "com.squareup.okhttp3:okhttp"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2"
    }

    object Room {
        private const val version = "2.5.0"

        const val runtime = "androidx.room:room-runtime:$version"
        const val compiler = "androidx.room:room-compiler:$version"
        const val room_ktx = "androidx.room:room-ktx:$version"
        const val kapt = "androidx.room:room-compiler:$version"

    }

    object Paging {
        private const val version = "3.1.1"

        const val runtime = "androidx.paging:paging-runtime-ktx:$version"
        const val common = "androidx.paging:paging-common:3.1.1"
    }

    object Glide {
        private const val version = "4.13.0"

        const val glide = "com.github.bumptech.glide:glide:4.13.0"
        const val glideCompiler = "com.github.bumptech.glide:compiler:4.13.0"
    }

    object Koin {
        private const val version = "2.2.3"

        const val koinAndroid = "io.insert-koin:koin-android:$version"
        const val koinScope = "io.insert-koin:koin-androidx-scope:$version"
        const val koinViewModel = "io.insert-koin:koin-androidx-viewmodel:$version"
        const val koinFragment = "io.insert-koin:koin-androidx-fragment:$version"

    }

}