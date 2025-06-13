plugins {
    id("java")
    id("application")
}

application {
    mainClass.set("brian.dhbw.project.gradle.Game")
}

group = "brian.dhbw.project.gradle"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(23)
    }
}



repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.slf4j:jul-to-slf4j:2.1.0-alpha1")
    implementation ("ch.qos.logback:logback-classic:1.5.13")
    implementation ("org.mongodb:mongodb-driver-sync:4.11.1")
    implementation("org.json:json:20250107")
    implementation("com.googlecode.json-simple:json-simple:1.1.1")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.18.2")

}

tasks.test {
    useJUnitPlatform()
}
