package neoncore.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

/**
 * NEON//CORE theme entry point. Wrap any NEON//CORE app's root composable in this.
 *
 * Usage (in an app, e.g. CALC):
 *   setContent {
 *       NeonCoreTheme(darkTheme = true) {
 *           CalcApp()
 *       }
 *   }
 *
 * Dark is the primary/default theme per spec ("Dark Theme (Primary)").
 */

private val NeonDarkColorScheme = darkColorScheme(
    background = NeonDark.Background0,
    surface = NeonDark.Background1,
    surfaceVariant = NeonDark.Background2,
    surfaceTint = NeonDark.ElevatedSurface,
    primary = NeonAccent.Magenta,      // Primary Action
    secondary = NeonAccent.Green,      // Active / Connected / Success
    tertiary = NeonAccent.Blue,        // Information
    error = NeonAccent.Red,
    onBackground = NeonDark.TextPrimary,
    onSurface = NeonDark.TextPrimary,
    outline = NeonDark.Divider,
)

private val NeonLightColorScheme = lightColorScheme(
    background = NeonLight.Background,
    surface = NeonLight.Surface,
    surfaceVariant = NeonLight.Elevated,
    surfaceTint = NeonLight.Card,
    primary = NeonAccent.Magenta,
    secondary = NeonAccent.Green,
    tertiary = NeonAccent.Blue,
    error = NeonAccent.Red,
    onBackground = NeonLight.Text,
    onSurface = NeonLight.Text,
)

@Composable
fun NeonCoreTheme(
    darkTheme: Boolean = true, // dark is Primary per spec
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) NeonDarkColorScheme else NeonLightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        // Typography/Shapes intentionally NOT wired into MaterialTheme.typography/shapes here —
        // NEON//CORE's type scale (NeonType) and shapes (NeonShape) are deliberately more
        // specific than Material3's default roles, so components should reference
        // neoncore.theme.NeonType.* / NeonShape.* directly rather than MaterialTheme.typography.*.
        content = content
    )
}
