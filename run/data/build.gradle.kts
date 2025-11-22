plugins {
    alias(libs.plugins.paceon.android.library)
}

android {
    namespace = "me.piotrleb.run.data"
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.google.android.gms.play.services.location)
    implementation(libs.androidx.work)
    implementation(libs.koin.android.workmanager)
    implementation(libs.kotlinx.serialization.json)

    implementation(projects.core.domain)
    implementation(projects.run.domain)
    implementation(projects.core.database)

}