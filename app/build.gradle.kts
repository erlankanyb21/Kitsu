plugins {
    id(libs.plugins.android.application.get().pluginId)
    id(libs.plugins.jetbrinsKotlin.android.get().pluginId)
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

//    ui
    implementation(libs.bundles.uicomponents)
    implementation(libs.uicomponents.constraintLayout)
    implementation(libs.uicomponents.viewBindingPropertyDelegate)

//    androidx
    implementation(libs.bundles.androidxlegacyAndCore)
    testImplementation(libs.androidx.junit)
    androidTestImplementation(libs.bundles.test)

    // Retrofit
    implementation(libs.bundles.retrofit)

    //Glide
    implementation(libs.glide)

    // Lifecycle
    implementation(libs.bundles.lifecycle)

    // okhttp-Interceptor
    implementation(libs.bundles.okHttp)

    //room
    implementation(libs.bundles.room)
    annotationProcessor(libs.room.compiler)
    kapt(libs.room.kapt)

    //Paging 3
    implementation(libs.bundles.paging)

    //Kotlin Coroutine
    implementation(libs.bundles.coroutine)

    // viewPager2
    implementation(libs.uicomponents.viewpager)

    //Koin
    implementation(libs.bundles.koin)

    //navigation components
    implementation(libs.bundles.navigation)
}