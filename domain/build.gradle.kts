plugins {
    id(libs.plugins.javaLibrary.library.get().pluginId)
    id(libs.plugins.jetbrainsKotlin.jvm.get().pluginId)
    // KSP
    alias(libs.plugins.ksp)
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {

    //koin
    api(libs.koin.koinCore)
    implementation(libs.koin.koinAnnotations)
    ksp(libs.koin.compiler)
    //paging
    implementation(libs.paging.common)

    //Kotlin Coroutine core
    implementation(libs.coroutine.coroutineCore)
}

kotlin {
    sourceSets.main {
        kotlin.srcDir("build/generated/ksp/main/kotlin")
    }
}