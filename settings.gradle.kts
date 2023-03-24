pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()

        maven { url = uri("https://jitpack.io") }
    }
}
enableFeaturePreview("VERSION_CATALOGS")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()

        maven { url = uri("https://jitpack.io") }
    }
    versionCatalogs {
        create("config"){
            from(files("gradle/config.versions.toml"))
        }
    }
}
rootProject.name = "Kitsu"
include(":app")
include(":domain")
include(":data")
