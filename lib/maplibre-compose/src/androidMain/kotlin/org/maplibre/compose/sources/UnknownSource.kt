package org.maplibre.compose.sources

import com.mapbox.mapboxsdk.style.sources.Source as MLNSource

public actual class UnknownSource(override val impl: MLNSource) : Source()
