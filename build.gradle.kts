import com.diffplug.gradle.spotless.SpotlessCheck
import nebula.plugin.clojuresque.tasks.ClojureCompile

plugins {
  `java-library`
  kotlin("jvm") version "2.0.20"
  id("nebula.clojure") version "14.2.0"
  id("com.diffplug.spotless") version "7.0.0.BETA2"
  checkstyle
  pmd
  `maven-publish`
}

repositories { mavenCentral() }

group = "me.rajayudhaps"

version = "1.0.0-SNAPSHOT"

description = "boilerplate"

java.setSourceCompatibility(JavaVersion.VERSION_17)

dependencies {
  api(libs.org.clojure.core)
  api(libs.org.clojure.tools.logging)
  testImplementation(kotlin("test"))
}

java {
  withSourcesJar()
  withJavadocJar()
}

sourceSets {
  main {
    resources {
      filter.exclude("**/*.java", "**/*.log")
      filter.exclude("**/.svn/*", "**/.git*")
    }
  }
}

tasks.withType<JavaCompile> { options.encoding = "UTF-8" }

tasks.withType<Javadoc> { options.encoding = "UTF-8" }

clojure.aotCompile.value(true)

tasks.withType<ClojureCompile> { mustRunAfter(":compileJava", ":compileKotlin") }

spotless {
  java {
    googleJavaFormat()
    licenseHeaderFile("${project.rootDir.toString()}/header.txt")
  }
  kotlin {
    ktfmt()
    licenseHeaderFile("${project.rootDir.toString()}/header.txt")
  }
  kotlinGradle {
    target("*.gradle.kts") // default target for kotlinGradle
    ktfmt()
  }
}

tasks.withType<SpotlessCheck> { dependsOn(":spotlessApply") }

pmd {
  isConsoleOutput = true
  ruleSetFiles = files("${project.rootDir.toString()}/config/pmd/ruleset.xml")
}

tasks.withType<Test> { useJUnitPlatform() }

publishing { publications.create<MavenPublication>("maven") { from(components["java"]) } }
