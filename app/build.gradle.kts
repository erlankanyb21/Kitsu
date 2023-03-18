 plugins {
    id(Dependencies.idPlugins.application)
    id(Dependencies.idPlugins.jetbrainsAndroid)
    id(Dependencies.idPlugins.kapt)
 }

android {
    namespace = "com.example.kitsu"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.kitsu"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(project(":data"))
    implementation(project(":domain"))

//    core
    implementation(Dependencies.Core.core)

//    ui
    implementation(Dependencies.UIComponents.appCompat)
    implementation(Dependencies.UIComponents.material)
    implementation(Dependencies.UIComponents.constraintLayout)
    implementation(Dependencies.UIComponents.viewBindingPropertyDelegate)

//    androidx
    implementation(Dependencies.Androidx.legacySupport)
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.0")
    testImplementation(Dependencies.Androidx.junit)
    androidTestImplementation(Dependencies.Androidx.testJunit)
    androidTestImplementation(Dependencies.Androidx.testEspresso)

    // Retrofit
    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.converterGson)

    //Glide
    implementation(Dependencies.Glide.glide)

    // Lifecycle
    implementation(Dependencies.Lifecycle.liveData)
    implementation(Dependencies.Lifecycle.viewModel)
    implementation(Dependencies.Lifecycle.runtime)
    implementation(Dependencies.Lifecycle.lifecycleCommon)

    // okhttp-Interceptor
    implementation(Dependencies.OkHttp.okHttp)
    implementation(Dependencies.OkHttp.loggingInterceptor)

    //room
    implementation(Dependencies.Room.runtime)
    annotationProcessor(Dependencies.Room.compiler)
    implementation(Dependencies.Room.room_ktx)
    kapt(Dependencies.Room.kapt)

    //Paging 3
    implementation(Dependencies.Paging.common)
    implementation(Dependencies.Paging.runtime)

    //Kotlin Coroutine
    implementation(Dependencies.Kotlin.coroutinesAndroid)
    implementation(Dependencies.Kotlin.coroutineCore)

    // viewPager2
    implementation(Dependencies.viewpager2.viewpager2)

    //Koin
    implementation (Dependencies.Koin.koinAndroid)
    implementation(Dependencies.Koin.koinNav)

    //navigation components
    implementation(Dependencies.Navigation.fragment)
    implementation(Dependencies.Navigation.ui)

}