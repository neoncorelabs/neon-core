package neoncore.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * NEON//CORE typography tokens.
 * Source: docs/neon-core-design-system-v1.0.md — "Typography" / "Type Scale"
 *
 * Primary typeface: SF Pro Display (fallback: Inter) — used for all UI text.
 * Monospace: JetBrains Mono — status, numbers, time, metadata, logs ONLY.
 * Never use monospace for body text (explicit spec rule).
 */

// Swap these for actual bundled font resources (androidx.compose.ui.text.font.Font)
// once font files are added to the consuming app/module.
val NeonPrimaryFontFamily = FontFamily.Default   // SF Pro Display, fallback Inter
val NeonMonoFontFamily = FontFamily.Monospace    // JetBrains Mono

object NeonType {
    val DisplayXL = TextStyle(fontFamily = NeonPrimaryFontFamily, fontSize = 48.sp, fontWeight = FontWeight.Bold)
    val Display   = TextStyle(fontFamily = NeonPrimaryFontFamily, fontSize = 40.sp, fontWeight = FontWeight.Bold)
    val H1        = TextStyle(fontFamily = NeonPrimaryFontFamily, fontSize = 32.sp, fontWeight = FontWeight.Bold)
    val H2        = TextStyle(fontFamily = NeonPrimaryFontFamily, fontSize = 28.sp, fontWeight = FontWeight.SemiBold)
    val H3        = TextStyle(fontFamily = NeonPrimaryFontFamily, fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
    val H4        = TextStyle(fontFamily = NeonPrimaryFontFamily, fontSize = 20.sp, fontWeight = FontWeight.Medium)
    val Title     = TextStyle(fontFamily = NeonPrimaryFontFamily, fontSize = 18.sp, fontWeight = FontWeight.Medium)
    val Body      = TextStyle(fontFamily = NeonPrimaryFontFamily, fontSize = 16.sp, fontWeight = FontWeight.Normal)
    val Secondary = TextStyle(fontFamily = NeonPrimaryFontFamily, fontSize = 14.sp, fontWeight = FontWeight.Normal)
    val Caption   = TextStyle(fontFamily = NeonPrimaryFontFamily, fontSize = 12.sp, fontWeight = FontWeight.Medium)

    /** Status text: JetBrains Mono, uppercase by convention (applied at call site), always paired with a functional accent color. */
    val Status    = TextStyle(fontFamily = NeonMonoFontFamily, fontSize = 11.sp, fontWeight = FontWeight.Medium)
}
