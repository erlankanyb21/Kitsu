plugins {
    id(libs.plugins.android.library.get().pluginId)
    id(libs.plugins.jetbrinsKotlin.android.get().pluginId)
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
    //androidxCore
    implementation(libs.androidx.core)

    //ui-Components
    implementation(libs.bundles.uicomponents)

    //test
    testImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.testJunit)
    androidTestImplementation(libs.androidx.testEspresso)

//    koin
    implementation(libs.bundles.koin)

//    retrofit
    implementation(libs.bundles.retrofit)

//    okhttp-interceptor
    implementation(libs.bundles.okHttp)

    //Paging 3
    implementation(libs.bundles.paging)
}