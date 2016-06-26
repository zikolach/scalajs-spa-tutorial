package spatutorial.client.components

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{Callback, ReactComponentB}
import org.scalajs.dom.raw.HTMLDivElement
import spatutorial.client.components.map._


object LeafletMap {

  case class MapProps(name: String)

  private def demoTileLayer = Leaflet.tileLayer("https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token=pk.eyJ1IjoibWFwYm94IiwiYSI6ImNpandmbXliNDBjZWd2M2x6bDk3c2ZtOTkifQ._QA7i5Mpkd_m30IGElHziw", TileLayerOptions(
    maxZoom = 18,
    attribution =
      """Map data &copy; <a href="http://openstreetmap.org">OpenStreetMap</a> contributors,
        |<a href="http://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>,
        |Imagery © <a href="http://mapbox.com">Mapbox</a>
      """.stripMargin,
    id = "mapbox.streets"
  ))

  val LeafletMap = ReactComponentB[MapProps]("Map")
    .render_P(p =>
      <.div(^.id := "map", ^.height := "300px")
    )
    .domType[HTMLDivElement]
    .componentDidMount(scope => Callback {
      val id = scope.getDOMNode().getAttribute("id")
      val map = Leaflet.map(id)
      DefaultIcon.imagePath = "assets/lib/leaflet/images"
      map.setView(new LatLng(51.505, -0.09), 13)
      Leaflet.marker(new LatLng(51.505, -0.09), MarkerOptions(new DefaultIcon())).addTo(map)
      demoTileLayer.addTo(map)
    })
    .build

  def apply(props: MapProps) = LeafletMap(props)
}
