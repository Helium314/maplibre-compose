package org.maplibre.compose.style

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.runAndroidComposeUiTest
import com.mapbox.mapboxsdk.Mapbox

@OptIn(ExperimentalTestApi::class)
class AndroidStyleNodeTest : StyleNodeTest() {
  override fun platformSetup() =
    runAndroidComposeUiTest<ComponentActivity> {
      activity!!.runOnUiThread { Mapbox.getInstance(activity!!) }
    }
}
