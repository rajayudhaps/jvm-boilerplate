import com.diffplug.gradle.spotless.SpotlessCheck

plugins {
    id("com.diffplug.spotless")
    checkstyle
    pmd
}

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

tasks.withType<SpotlessCheck> { dependsOn(":${project.name}:spotlessApply") }

pmd {
  isConsoleOutput = true
  ruleSetFiles = files("${project.rootDir.toString()}/config/pmd/ruleset.xml")
}
