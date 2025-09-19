package org.maplibre.compose.layers

import com.mapbox.mapboxsdk.style.layers.Layer as MLNLayer

internal actual class UnknownLayer(override val impl: MLNLayer) : Layer()
