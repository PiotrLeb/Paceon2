package me.piotrleb.convention

import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

// Połączenie z libs.versions.toml, żeby móc mieć do nich dostęp w pluginach
val Project.libs
    get() = extensions.getByType<VersionCatalogsExtension>().named("libs")