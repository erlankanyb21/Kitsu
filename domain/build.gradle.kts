plugins {
    id(libs.plugins.javaLibrary.library.get().pluginId)
    id(libs.plugins.jetbrinsKotlin.jvm.get().pluginId)
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {

    //koin
    implementation(libs.koin.koinCore)
    //paging
    implementation(libs.paging.common)

    //Kotlin Coroutine core
    implementation(libs.coroutine.coroutineCore)

}