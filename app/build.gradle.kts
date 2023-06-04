/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.4/userguide/building_java_projects.html
 */

val ktor_version = "2.3.0"
val kotlin_version = "1.8.21"
val logback_version = "1.2.11"
//val kotlin.code.style="official"
val postgres_version ="42.5.1"
val app_version = "0.0.1"

plugins {

    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.8.21"

    id ("io.ktor.plugin") version "2.3.0"

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    implementation ("io.ktor:ktor-server-core-jvm:$ktor_version")
    implementation ("io.ktor:ktor-server-auth-jvm:$ktor_version")

    implementation ("io.ktor:ktor-server-auth-jwt-jvm:$ktor_version")
    implementation ("io.ktor:ktor-server-cors-jvm:$ktor_version")
    implementation ("io.ktor:ktor-server-openapi:$ktor_version")
    implementation ("io.ktor:ktor-server-swagger:$ktor_version")
    implementation ("io.ktor:ktor-server-content-negotiation-jvm:$ktor_version")
    implementation ("io.ktor:ktor-serialization-kotlinx-json-jvm:$ktor_version")
    implementation ("io.ktor:ktor-serialization-gson-jvm:$ktor_version")
    implementation ("io.ktor:ktor-server-netty-jvm:$ktor_version")
    implementation ("org.postgresql:postgresql:$postgres_version")
    implementation ("ch.qos.logback:logback-classic:$logback_version")

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:30.1.1-jre")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    // Define the main class for the application.
    mainClass.set("com.fcg.AppKt")
}
