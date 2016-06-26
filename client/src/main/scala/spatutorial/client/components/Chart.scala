package spatutorial.client.components

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{Callback, ReactComponentB}
import org.scalajs.dom.raw.HTMLCanvasElement
import spatutorial.client.components.chart.{Chart, ChartConfiguration, ChartData}

object Chart {

  // available chart styles
  sealed trait ChartStyle

  case object LineChart extends ChartStyle

  case object BarChart extends ChartStyle

  case class ChartProps(name: String,
                        style: ChartStyle,
                        data: ChartData,
                        width: Int = 500,
                        height: Int = 300)

  val Chart = ReactComponentB[ChartProps]("Chart")
    .render_P(p =>
      <.canvas(
        ^.width := s"${p.width}px",
        ^.height := s"${p.height}px")
    )
    .domType[HTMLCanvasElement]
    .componentDidMount(scope => Callback {
      // access context of the canvas
      val ctx = scope.getDOMNode().getContext("2d")
      // create the actual chart using the 3rd party component
      scope.props.style match {
        case LineChart => new Chart(ctx, ChartConfiguration("line", scope.props.data))
        case BarChart => new Chart(ctx, ChartConfiguration("bar", scope.props.data))
        case _ => throw new IllegalArgumentException
      }
    }).build

  def apply(props: ChartProps) = Chart(props)
}
