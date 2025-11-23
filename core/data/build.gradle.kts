plugins {
    alias(libs.plugins.paceon.android.library)
    alias(libs.plugins.paceon.jvm.ktor)
}

android {
    namespace = "me.piotrleb.core.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}