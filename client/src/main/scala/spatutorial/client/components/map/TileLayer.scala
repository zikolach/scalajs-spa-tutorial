package spatutorial.client.components.map

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait TileLayerOptions extends js.Object

object TileLayerOptions {
  def apply(maxZoom: Int, attribution: String, id: String): TileLayerOptions = {
    js.Dynamic.literal(
      maxZoome = maxZoom,
      attribution = attribution,
      id = id
    ).asInstanceOf[TileLayerOptions]
  }
}

@js.native
@JSName("L.TileLayer")
trait TileLayer extends js.Object {
  def addTo(map: LeafletMap): Unit = js.native
}
