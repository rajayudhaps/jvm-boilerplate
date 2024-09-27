plugins {
    `kotlin-dsl`
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.20")
    implementation("com.netflix.nebula:nebula-clojure-plugin:14.2.0")
    implementation("com.diffplug.spotless:spotless-plugin-gradle:7.0.0.BETA2")
}

repositories {
    gradlePluginPortal()
}