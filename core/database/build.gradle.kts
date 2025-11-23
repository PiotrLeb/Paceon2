plugins {
    alias(libs.plugins.paceon.android.library)
    alias(libs.plugins.paceon.android.room)
}

android {
    namespace = "me.piotrleb.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}