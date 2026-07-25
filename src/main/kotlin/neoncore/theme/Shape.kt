package neoncore.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

/**
 * NEON//CORE corner radius tokens.
 * Source: docs/neon-core-design-system-v1.0.md — "Corner Radius"
 */
object NeonShape {
    val Card = RoundedCornerShape(20.dp)
    val Button = RoundedCornerShape(16.dp)
    val InputField = RoundedCornerShape(16.dp)
    val Dialog = RoundedCornerShape(24.dp)
    val BottomSheet = RoundedCornerShape(32.dp)
    val Fab = RoundedCornerShape(20.dp)

    /** Icon corner radius (spec: "Icon System" — 4dp radius on 24×24 grid icons) */
    val Icon = RoundedCornerShape(4.dp)
}

/**
 * Layout grid tokens — everything follows an 8dp system (spec §3, Mechanical Precision).
 */
object NeonSpacing {
    val Tight = 8.dp
    val Small = 16.dp
    val Medium = 24.dp
    val Large = 40.dp

    val MarginHorizontal = 24.dp
    val MarginTopSafeArea = 24.dp
    val MarginBottom = 24.dp
}
