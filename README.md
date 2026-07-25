# NEON//CORE

**An operating system identity, not a theme.**

The shared design system and Compose component library for every app under
[NeonCoreLabs](https://github.com/neoncorelabs) — starting with
[`calc`](https://github.com/neoncorelabs/calc).

This repo is an **implementation**, not documentation. The full specification —
principles, color/type/motion tables, component specs, icon rationale — lives
in [`neoncorelabs/docs`](https://github.com/neoncorelabs/docs), which is the single
canonical source of truth across the whole organization.

| Looking for... | Go to |
|---|---|
| Design principles | [`docs/core/PRINCIPLES.md`](https://github.com/neoncorelabs/docs/blob/main/core/PRINCIPLES.md) |
| Full design system spec | [`docs/core/CORE-DS-01.md`](https://github.com/neoncorelabs/docs/blob/main/core/CORE-DS-01.md) |
| Component specs | [`docs/core/CORE-COMPONENTS-01.md`](https://github.com/neoncorelabs/docs/blob/main/core/CORE-COMPONENTS-01.md) |
| Icon / brand mark rationale | [`docs/core/CORE-ICONS-01.md`](https://github.com/neoncorelabs/docs/blob/main/core/CORE-ICONS-01.md) |

## What's here

```
neon-core/
├── src/main/kotlin/neoncore/
│   ├── theme/          Color, Type, Shape, Motion, Elevation, Theme.kt
│   └── components/      StatusHeader.kt, SegmentedLoader.kt
├── icons/                the Status Dot mark — SVG variants + raster exports
├── foundation/           reserved; empty until a real cross-cutting primitive lands here
└── build.gradle.kts
```

Nothing app-specific belongs in this repo. If a component or token only makes
sense for one app, it belongs in that app's repo instead.

## Using this in an app

```kotlin
// settings.gradle.kts (consuming app)
includeBuild("../neon-core")
```

Depend on a **tagged version** (`v1.0.0`+), not a moving branch, so a
NEON//CORE change can't silently break an app mid-development.

## Principle

> Structure follows demonstrated complexity, not anticipated complexity.

See [`docs/core/PRINCIPLES.md`](https://github.com/neoncorelabs/docs/blob/main/core/PRINCIPLES.md)
for the full list.
