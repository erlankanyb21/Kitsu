// Top-level build file where you can add configuration options common to all sub-projects/modules.
import org.gradle.accessors.dm.LibrariesForConfig
import org.jetbrains.dokka.DokkaConfiguration.Visibility
import org.jetbrains.dokka.base.DokkaBase
import org.jetbrains.dokka.base.DokkaBaseConfiguration
import org.jetbrains.dokka.gradle.DokkaTaskPartial
import java.time.Year

val config = the<LibrariesForConfig>()
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.jetbrainsKotlin.android) apply false
    alias(libs.plugins.jetbrainsKotlin.jvm) apply false
    alias(libs.plugins.navSafeArgs) apply false
    alias(libs.plugins.jetbrainsKotlin.dokka)
    alias(libs.plugins.ksp)

}
buildscript {
    dependencies {
        classpath(libs.jetBrains.dokka.gradle)
        classpath(libs.jetBrains.dokka.android.documentation)
        classpath(libs.jetBrains.dokka.android.gradle)
    }
}
allprojects {
    apply(plugin = rootProject.project.libs.plugins.jetbrainsKotlin.dokka.get().pluginId)

    tasks.withType<DokkaTaskPartial>().configureEach {
        suppressInheritedMembers.set(true)
        dokkaSourceSets.configureEach {
            documentedVisibilities.set(
                Visibility.values().toSet()
            )
        }

        pluginConfiguration<DokkaBase, DokkaBaseConfiguration> {
            footerMessage =
                config.versions.documentationCommonFooterMessage.get() + "© ${Year.now().value} Copyright."
        }
    }
}

tasks.register("clean", Delete::class) {
    buildDir.delete()
}

tasks.dokkaHtmlMultiModule {
    moduleName.set("")
    moduleVersion.set(config.versions.versionName.get())

    pluginConfiguration<DokkaBase, DokkaBaseConfiguration> {
        customAssets = listOf(file("$projectDir/geek-studio.svg"))
        footerMessage =
            config.versions.documentationCommonFooterMessage.get() + "© ${Year.now().value} Copyright."
        customStyleSheets =
            listOf(file("$projectDir/logo-style.css"), file("$projectDir/logo-styles.css"))
    }
}