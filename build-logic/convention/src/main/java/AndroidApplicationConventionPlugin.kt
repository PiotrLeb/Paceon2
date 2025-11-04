import com.android.build.api.dsl.ApplicationExtension
import me.piotrleb.convention.configureKotlinAndroid
import me.piotrleb.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

// Gradle Plugin to globally use same config declared in one place
class AndroidApplicationConventionPlugin: Plugin<Project>{

    // Function that is called when the plugin is used
    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                // Declaring multiple plugins that are necessary to function properly
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")

            }

            extensions.configure<ApplicationExtension>{
                defaultConfig {
                    applicationId = libs.findVersion("projectApplicationId").get().toString()
                    targetSdk = libs.findVersion("projectTargetSdkVersion").get().toString().toInt()

                    versionCode = libs.findVersion("projectVersionCode").get().toString().toInt()
                    versionName = libs.findVersion("projectVersionName").get().toString()
                }

                configureKotlinAndroid(this)

            }

        }
    }

}