plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {

    //koin
    implementation(Dependencies.Koin.koinCore)
    implementation(Dependencies.Paging.common)


    //Kotlin Coroutine
    implementation(Dependencies.Kotlin.coroutineCore)

}