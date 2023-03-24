plugins {
    id(libs.plugins.javaLibrary.library.get().pluginId)
    id(libs.plugins.jetbrainsKotlin.jvm.get().pluginId)
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {

    //koin
    api(libs.koin.koinCore)
    //paging
    implementation(libs.paging.common)

    //Kotlin Coroutine core
    implementation(libs.coroutine.coroutineCore)

}