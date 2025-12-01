package me.piotrleb.presentation.designsystem

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

val DarkColorScheme = darkColorScheme(
    primary = PaceonGreen,
    background = PaceonBlack,
    surface = PaceonDarkGray,
    secondary = PaceonWhite,
    tertiary = PaceonWhite,
    primaryContainer = PaceonGreen30,
    onPrimary = PaceonBlack,
    onBackground = PaceonWhite,
    onSurface = PaceonWhite,
    onSurfaceVariant = PaceonGray
)

@Composable
fun PaceonTheme(
    content: @Composable () -> Unit
) {
    val colorScheme = DarkColorScheme
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}