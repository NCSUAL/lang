plugins {
    kotlin("jvm") version "2.2.0"
}

group = "camp.nextstep.edu"
version = "1.0-SNAPSHOT"

kotlin {
    jvmToolchain(21)
    jvmToolchain(8)
}

repositories {
    mavenCentral()
    maven { setUrl("https://jitpack.io") }
}

dependencies {
    implementation("com.github.woowacourse-projects:mission-utils:1.2.0")
    implementation(kotlin("stdlib-jdk8"))
}

tasks {
    test {
        useJUnitPlatform()
    }
}
