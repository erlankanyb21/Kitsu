@file:Suppress("DEPRECATION")

plugins {
    id(libs.plugins.android.library.get().pluginId)
    id(libs.plugins.jetbrainsKotlin.android.get().pluginId)
    // KSP
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.example.data"
    compileSdk = config.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = config.versions.minSdk.get().toInt()
        targetSdk = config.versions.targetSdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName(config.versions.releaseBuildType.get()) {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }

        getByName(config.versions.debugBuildType.get()){
            buildConfigField("String", "BASE_URL", "\"https://kitsu.io/\"")
        }
        release {
            isMinifyEnabled = true
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
    //androidxCore
    implementation(libs.androidx.core)

//    koin
    implementation(libs.bundles.koin)
    implementation(libs.koin.koinAnnotations)
    ksp(libs.koin.compiler)

//    retrofit
    implementation(libs.bundles.retrofit)

//    okhttp-interceptor
    implementation(libs.bundles.okHttp)
    api(libs.bundles.room)

    //Paging 3
    api(libs.paging.runtime)
}

kotlin {
    sourceSets.debug {
        kotlin.srcDir("build/generated/ksp/debug/kotlin")
    }
    sourceSets.release {
        kotlin.srcDir("build/generated/ksp/release/kotlin")
    }
}