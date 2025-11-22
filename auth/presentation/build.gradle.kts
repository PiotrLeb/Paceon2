plugins {
    alias(libs.plugins.paceon.android.feature.ui)
}

android {
    namespace = "me.piotrleb.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}