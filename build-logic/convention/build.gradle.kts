plugins {
    `kotlin-dsl`
}

group = "me.piotrleb.paceon.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("AndroidApplication") {
            id = "paceon.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
    }
}