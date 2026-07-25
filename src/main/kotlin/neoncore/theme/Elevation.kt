package neoncore.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * NEON//CORE elevation tokens.
 * Source: docs/neon-core-design-system-v1.0.md — "Elevation"
 *
 * NEON//CORE avoids heavy shadows; use layered surfaces instead.
 * No colored shadows, ever — shadowColor should always be neutral/black
 * regardless of which accent is nearby.
 */
data class NeonElevationSpec(
    val offsetY: Dp,
    val blurRadius: Dp,
    val opacity: Float
)

object NeonElevation {
    val Surface1 = NeonElevationSpec(offsetY = 2.dp, blurRadius = 8.dp, opacity = 0.12f)
    val Surface2 = NeonElevationSpec(offsetY = 6.dp, blurRadius = 20.dp, opacity = 0.16f)
    val Floating = NeonElevationSpec(offsetY = 12.dp, blurRadius = 36.dp, opacity = 0.22f)
}
