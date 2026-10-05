plugins {
    id("java")
}

allprojects {
    group = "com.jvmspace"
    version = "0.0.0"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply( plugin = "java" )

    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.10.0"))
        testImplementation("org.junit.jupiter:junit-jupiter")
    }

    tasks.test {
        useJUnitPlatform()
    }
}