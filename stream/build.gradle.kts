plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit.jupiter)

    implementation(libs.guava)
    implementation(libs.kafka.streams)
    implementation(libs.kafka.clients)
    implementation(libs.kafka.streams.test.utils)
    implementation(libs.jackson.annotations)
    implementation(libs.jackson.databind)
    implementation(libs.log4j.slf4j.impl)
}

application {
    mainClass = "app.App"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}