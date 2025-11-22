plugins {
    alias(libs.plugins.paceon.android.library)
}

android {
    namespace = "me.piotrleb.run.network"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
}