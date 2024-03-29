plugins {
    id("java")
}

group = "org.com"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.assertj:assertj-core:3.25.1")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.10.1")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

tasks.test {
    useJUnitPlatform()
}