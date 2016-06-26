package spatutorial.client.components.map

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


@js.native
@JSName("L.Map")
trait LeafletMap extends js.Object {
  def setView(center: LatLng, zoom: Int): Unit = js.native
}
