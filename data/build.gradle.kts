plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.data"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        debug {
            buildConfigField("String", "BASE_URL", "\"https://kitsu.io/\"")
        }
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":domain"))

    implementation(Dependencies.Core.core)

    implementation(Dependencies.UIComponents.appCompat)
    implementation(Dependencies.UIComponents.material)

    testImplementation(Dependencies.Androidx.junit)
    androidTestImplementation(Dependencies.Androidx.testJunit)
    androidTestImplementation(Dependencies.Androidx.testEspresso)

//    koin
    implementation(Dependencies.Koin.koinCore)

//    retrofit
    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.converterGson)

//    okhttp-interceptor
    implementation(Dependencies.OkHttp.okHttp)
    implementation(Dependencies.OkHttp.loggingInterceptor)

    //Paging 3
    implementation(Dependencies.Paging.common)
    implementation(Dependencies.Paging.runtime)

}