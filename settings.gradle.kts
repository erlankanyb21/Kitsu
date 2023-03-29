pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()

    }
}
enableFeaturePreview("VERSION_CATALOGS")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()

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
