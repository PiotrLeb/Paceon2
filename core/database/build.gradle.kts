plugins {
    alias(libs.plugins.paceon.android.library)
}

android {
    namespace = "me.piotrleb.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}