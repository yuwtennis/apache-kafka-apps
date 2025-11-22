plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)

    implementation(libs.guava)
    implementation(libs.kafka.streams)
    implementation(libs.kafka.clients)
    implementation(libs.log4j.slf4j.impl)
}

application {
    mainClass = "app.App"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}