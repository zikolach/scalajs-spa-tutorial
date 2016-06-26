package spatutorial.client.components.map

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("L")
object Leaflet extends js.Object {
  def map(elt: String): LeafletMap = js.native

  def tileLayer(url: String, opts: TileLayerOptions): TileLayer = js.native

  def marker(latlng: LatLng, options: MarkerOptions): Marker = js.native

  def icon(options: IconOptions): Icon = js.native

  def point(x: Double, y: Double, round: Boolean): Point = js.native
}

