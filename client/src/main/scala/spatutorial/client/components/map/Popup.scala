package spatutorial.client.components.map

import scala.scalajs.js

@js.native
trait PopupOptions extends js.Object

object PopupOptions {
  def apply(autoPan: Boolean = true): PopupOptions = {
    js.Dynamic.literal(
      autoPan = autoPan
    ).asInstanceOf[PopupOptions]
  }
}

@js.native
trait Popup extends js.Object {

  def setLatLng(latlng: LatLng): Popup = js.native

  def setContent(htmlContent: String): Popup = js.native

  def openOn(map: LeafletMap): Popup = js.native

  def isOpen(): Boolean = js.native

  def openPopup(): Popup = js.native

}