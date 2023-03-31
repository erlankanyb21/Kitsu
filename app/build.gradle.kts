plugins {
    id(libs.plugins.android.application.get().pluginId)
    id(libs.plugins.jetbrainsKotlin.android.get().pluginId)
    id(libs.plugins.kotlin.kapt.get().pluginId)
    id(libs.plugins.navSafeArgs.get().pluginId)
}

android {
    namespace = "com.example.kitsu"
    compileSdk = config.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.example.kitsu"
        minSdk = config.versions.minSdk.get().toInt()
        targetSdk = config.versions.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName(config.versions.releaseBuildType.get()) {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
        getByName(config.versions.debugBuildType.get()){
            applicationIdSuffix = ".debug"
            isDebuggable = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":data"))
//    ui
    implementation(libs.bundles.uicomponents)

//    androidx
    implementation(libs.bundles.androidxlegacyAndCore)

    // Retrofit
    implementation(libs.bundles.retrofit)

    //Glide
    implementation(libs.glide)

    // Lifecycle
    implementation(libs.bundles.lifecycle)

    // okhttp-Interceptor
    implementation(libs.bundles.okHttp)

    //room
    kapt(libs.room.kapt)

    //Kotlin Coroutine
    implementation(libs.bundles.coroutine)

    //Koin
    implementation(libs.bundles.koin)

    //navigation components
    implementation(libs.bundles.navigation)

}