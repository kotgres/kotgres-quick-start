plugins {
    kotlin("jvm") version "2.1.0"
    kotlin("plugin.noarg") version "2.1.0"

}

repositories {
    mavenCentral()
    maven { setUrl("https://jitpack.io") }
//    mavenLocal()
}

noArg {
    annotation("io.koworm.orm.annotations.Table")
}

dependencies {
    implementation("com.github.kotgres:kotgres-dsl:v0.1.1")
    implementation("com.github.kotgres:kotgres:v0.1.1")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}
