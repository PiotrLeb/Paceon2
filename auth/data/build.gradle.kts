plugins {
    alias(libs.plugins.paceon.android.library)
    alias(libs.plugins.paceon.jvm.ktor)
}

android {
    namespace = "me.piotrleb.auth.data"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
    implementation(projects.core.data)
}