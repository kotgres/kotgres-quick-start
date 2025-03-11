plugins {
    kotlin("jvm") version "2.1.0"
    kotlin("plugin.noarg") version "2.1.0"
    id("com.google.devtools.ksp") version "2.1.0-1.0.29"
}

repositories {
    mavenCentral()
    maven { setUrl("https://jitpack.io") }
    mavenLocal()
}

noArg {
    annotation("io.kotgres.orm.annotations.Table")
}

dependencies {
    implementation("com.github.kotgres:kotgres-dsl:v0.1.1")
//    ksp("com.github.kotgres:kotgres:v0.1.2")
//    implementation("com.github.kotgres:kotgres:v0.1.2")
    ksp("io.kotgres:kotgres:0.1.2")
    implementation("io.kotgres:kotgres:0.1.2")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}
