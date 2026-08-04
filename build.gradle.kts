plugins {
    kotlin("jvm") version "2.0.21"
    application
}

group = "com.kelvindsa"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Testes
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}
