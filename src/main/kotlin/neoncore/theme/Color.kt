package neoncore.theme

import androidx.compose.ui.graphics.Color

/**
 * NEON//CORE color tokens.
 * Source: docs/neon-core-design-system-v1.0.md — "Color System"
 *
 * Functional Color principle: every accent below has ONE fixed meaning.
 * Never repurpose an accent color for decoration. See NeonAccent doc comments.
 */

// ---- Dark Theme (Primary) ----

object NeonDark {
    val Background0 = Color(0xFF06070A)   // base background
    val Background1 = Color(0xFF0B0D12)
    val Background2 = Color(0xFF11141C)
    val ElevatedSurface = Color(0xFF181C25)
    val Card = Color(0xFF1D2230)
    val Divider = Color(0xFF2A3144)

    val TextPrimary = Color(0xFFF2F5FA)
    val TextSecondary = Color(0xFFBAC4D6)
    val TextMuted = Color(0xFF7B8599)
    val TextDisabled = Color(0xFF4B5567)
}

// ---- Light Theme ----

object NeonLight {
    val Background = Color(0xFFF5F7FA)
    val Surface = Color(0xFFFFFFFF)
    val Elevated = Color(0xFFF0F3F7)
    val Card = Color(0xFFE8ECF2)

    val Text = Color(0xFF11141B)
    val TextMuted = Color(0xFF69758A)

    // Accent colors remain identical across dark/light per spec.
}

// ---- Functional Accent Colors (identical in both themes) ----

/**
 * Functional Color principle (spec §2): every accent has exactly one meaning.
 * Do not use these decoratively or interchangeably.
 */
object NeonAccent {
    /** Active / Connected / Success */
    val Green = Color(0xFF46FF88)

    /** Primary Action */
    val Magenta = Color(0xFFFF2FB2)

    /** Information */
    val Blue = Color(0xFF44B8FF)

    /** Warning */
    val Amber = Color(0xFFFFC44A)

    /** Error */
    val Red = Color(0xFFFF5757)
}
