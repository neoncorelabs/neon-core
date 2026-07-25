package neoncore.theme

/**
 * NEON//CORE motion tokens.
 * Source: docs/neon-core-design-system-v1.0.md — "Motion Language"
 *
 * Principle: everything feels mechanical, not playful. No animation in the
 * system should ever exceed 300ms.
 */
object NeonMotion {
    const val QUICK_ACTION_MS = 140
    const val DIALOG_MS = 180
    const val DEFAULT_MS = 220
    const val SCREEN_TRANSITION_MS = 260

    /** Hard ceiling — nothing in NEON//CORE should animate longer than this. */
    const val MAX_MS = 300

    /** Press animation: scale 100% -> 97% -> 100% */
    const val PRESS_DURATION_MS = 120
    const val PRESS_SCALE_DOWN = 0.97f

    /** Accent flash: brief light-up + fade back to neutral, never a persistent glow. */
    const val ACCENT_FLASH_FADE_MS = 120

    /** Status transition (e.g. READY -> COMPUTING) per CALC-01 §2 */
    const val STATUS_TRANSITION_MS = 150

    /** Error header pulse duration per CALC-01 §13 */
    const val ERROR_PULSE_MS = 400
}
