package spatutorial.client.components.map

import scala.scalajs.js

@js.native
trait MarkerOptions extends js.Object

object MarkerOptions {
  def apply(icon: Icon,
            clickable: Boolean = true,
            draggable: Boolean = false,
            keyboard: Boolean = true,
            title: String = "",
            alt: String = "",
            zIndexOffset: Int = 0,
            opacity: Double = 1.0,
            riseOnHover: Boolean = false,
            riseOffset: Int = 250): MarkerOptions = {
    js.Dynamic.literal(
      icon = icon, clickable = clickable, draggable = draggable, keyboard = keyboard, title = title, alt = alt,
      zIndexOffset = zIndexOffset, opacity = opacity, riseOnHover = riseOnHover, riseOffset = riseOffset
    ).asInstanceOf[MarkerOptions]
  }
}

@js.native
trait Marker extends js.Object {

  def addTo(map: LeafletMap): Marker = js.native

  def bindPopup(popupContent: String): Popup = js.native

}
