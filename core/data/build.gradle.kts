plugins {
    alias(libs.plugins.paceon.android.library)
}

android {
    namespace = "me.piotrleb.core.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}