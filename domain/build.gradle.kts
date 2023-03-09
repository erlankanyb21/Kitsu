plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies{

    //koin
    implementation(Dependencies.Koin.koinCore)

    //Kotlin Coroutine
    implementation(Dependencies.Kotlin.coroutineCore)

}