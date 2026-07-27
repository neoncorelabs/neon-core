package neoncore.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import neoncore.theme.NeonAccent
import neoncore.theme.NeonDark
import neoncore.theme.NeonMotion
import neoncore.theme.NeonSpacing
import neoncore.theme.NeonType

/**
 * The System Status Header.
 *
 * Source: docs/neon-core-design-system-v1.0.md — "Signature Element"
 *
 * > Every app contains a System Status Header. [...] The status changes
 * > live. It is the one element every app shares.
 *
 * Examples from the spec:
 *   CALC / Precision Engine / READY
 *   ARCHIVE / Local Storage / READY
 *   MAIL / Communication Node / SYNCED
 *   VOICELOG / Recording Engine / LISTENING
 *
 * Every NEON//CORE app should use THIS composable for its header rather
 * than reimplementing it — that shared identity is the entire point.
 */

/** A status label paired with its functional accent color (spec §2, Functional Color). */
data class NeonStatus(
    val label: String,
    val color: Color
) {
    companion object {
        // Common CALC-01 states, provided as a starting vocabulary.
        // Apps may define their own NeonStatus values — the constraint is
        // that color must always carry the same meaning (see NeonAccent).
        val Ready = NeonStatus("READY", NeonAccent.Green)
        val Computing = NeonStatus("COMPUTING", NeonAccent.Blue)
        val Error = NeonStatus("ERROR", NeonAccent.Red)
        val Warning = NeonStatus("WARNING", NeonAccent.Amber)
        val Active = NeonStatus("ACTIVE", NeonAccent.Magenta)
    }
}

@Composable
fun StatusHeader(
    moduleName: String,
    subtitle: String,
    status: NeonStatus,
    modifier: Modifier = Modifier
) {
    val animatedStatusColor by animateColorAsState(
        targetValue = status.color,
        animationSpec = tween(durationMillis = NeonMotion.STATUS_TRANSITION_MS),
        label = "statusColor"
    )

    Column(
        modifier = modifier.padding(
            top = NeonSpacing.MarginTopSafeArea,
            start = NeonSpacing.MarginHorizontal,
            end = NeonSpacing.MarginHorizontal
        )
    ) {
        Text(
            text = moduleName,
            style = NeonType.Title,
            color = NeonDark.TextPrimary
        )
        Text(
            text = subtitle,
            style = NeonType.Secondary,
            color = NeonDark.TextSecondary
        )
        Text(
            text = status.label.uppercase(),
            style = NeonType.Status,
            color = animatedStatusColor,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}
