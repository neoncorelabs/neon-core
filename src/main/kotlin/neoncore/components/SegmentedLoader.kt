package neoncore.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import neoncore.theme.NeonAccent
import neoncore.theme.NeonDark

/**
 * Segmented loading indicator.
 *
 * Source: docs/neon-core-design-system-v1.0.md — "Loading"
 * > No spinning circles. Instead: ██████░░░░ fills left-to-right using
 * > segmented bars.
 *
 * @param progress 0f..1f. For indeterminate loading (duration genuinely
 *   unknown), animate this value externally rather than adding a spinner
 *   mode here — segmented bars are the ONE loading motif in NEON//CORE.
 */
@Composable
fun SegmentedLoader(
    progress: Float,
    modifier: Modifier = Modifier,
    segmentCount: Int = 10
) {
    val filledCount = (progress.coerceIn(0f, 1f) * segmentCount).toInt()

    Row(modifier = modifier) {
        repeat(segmentCount) { index ->
            Row(
                modifier = Modifier
                    .padding(end = 2.dp)
                    .width(12.dp)
                    .height(4.dp)
                    .background(
                        if (index < filledCount) NeonAccent.Green else NeonDark.Background2
                    )
            ) {}
        }
    }
}
