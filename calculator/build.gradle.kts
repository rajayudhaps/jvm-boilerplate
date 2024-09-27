import nebula.plugin.clojuresque.tasks.ClojureCompile

plugins {
  id("build.java-library")
  id("build.kotlin-conventions")
  id("build.clojure-conventions")
  id("build.style-conventions")
}

dependencies {
  implementation(libs.org.clojure.core)
  implementation(libs.org.jetbrains.kotlin.stdlib)
  testImplementation(libs.org.jetbrains.kotlin.test)
  testImplementation(libs.org.junit.jupiter.api)
  testRuntimeOnly(libs.org.junit.platform.launcher)
}

description = "Calculator"

tasks.withType<ClojureCompile> {
  mustRunAfter(":${project.name}:compileJava", ":${project.name}:compileKotlin")
}
