import com.android.build.api.dsl.LibraryExtension
import me.piotrleb.convention.ExtensionType
import me.piotrleb.convention.configureBuildTypes
import me.piotrleb.convention.configureKotlinAndroid
import me.piotrleb.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

class JvmKtorConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("org.jetbrains.kotlin.plugin.serialization")

            dependencies {
                "implementation"(libs.findBundle("ktor").get())
            }
        }
    }
}