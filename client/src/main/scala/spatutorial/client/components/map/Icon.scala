package spatutorial.client.components.map

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait IconOptions extends js.Object

object IconOptions {
  def apply(iconUrl: String,
            iconRetinaUrl: String,
            iconSize: Point,
            iconAnchor: Point,
            popupAnchor: Point,
            shadowUrl: String,
            shadowRetinaUrl: String,
            shadowSize: Point,
            shadowAnchor: Point,
            className: String = ""): IconOptions = {
    js.Dynamic.literal(
      iconUrl = iconUrl,
      iconRetinaUrl = iconRetinaUrl,
      iconSize = iconSize,
      iconAnchor = iconAnchor,
      popupAnchor = popupAnchor,
      shadowUrl = shadowUrl,
      shadowRetinaUrl = shadowRetinaUrl,
      shadowSize = shadowSize,
      shadowAnchor = shadowAnchor,
      className = className
    ).asInstanceOf[IconOptions]
  }
}

@js.native
trait Icon extends js.Object {
}

@js.native
@JSName("L.Icon")
object Icon extends js.Object

@js.native
@JSName("L.Icon.Default")
class DefaultIcon extends Icon

@js.native
@JSName("L.Icon.Default")
object DefaultIcon extends js.Object {
  var imagePath: String = js.native
}
