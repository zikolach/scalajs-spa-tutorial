package spatutorial.client.modules

import japgolly.scalajs.react.ReactComponentB
import japgolly.scalajs.react.vdom.prefix_<^._
import spatutorial.client.components.LeafletMap
import spatutorial.client.components.LeafletMap.MapProps

object Locations {
  private val component = ReactComponentB[Unit]("Locations")
    .render_P { case _ =>
      <.div(
        LeafletMap(MapProps("test"))
      )
    }.build

  def apply() = component()
}
