group = "hexlet.code"
version = "1.0-SNAPSHOT"

plugins {
    application
    id("java")
    id("com.github.ben-manes.versions") version "0.52.0"
}

application {
    mainClass = "hexlet.code.App"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.11.4"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

