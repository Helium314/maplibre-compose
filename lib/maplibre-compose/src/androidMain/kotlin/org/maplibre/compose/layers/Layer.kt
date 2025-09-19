package org.maplibre.compose.layers

import com.mapbox.mapboxsdk.style.layers.Layer as MlnLayer
import com.mapbox.mapboxsdk.style.layers.Property
import com.mapbox.mapboxsdk.style.layers.PropertyFactory

internal actual sealed class Layer {
  abstract val impl: MlnLayer

  actual val id: String by lazy { impl.id }

  actual var minZoom: Float
    get() = impl.minZoom
    set(value) {
      impl.minZoom = value
    }

  actual var maxZoom: Float
    get() = impl.maxZoom
    set(value) {
      impl.maxZoom = value
    }

  actual var visible: Boolean
    get() = impl.visibility.value == Property.VISIBLE
    set(value) {
      impl.setProperties(PropertyFactory.visibility(if (value) Property.VISIBLE else Property.NONE))
    }

  override fun toString() = "${this::class.simpleName}(id=\"$id\")"
}
