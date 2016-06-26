package spatutorial.client.modules

import diode.data.Pot
import diode.react._
import japgolly.scalajs.react.ReactComponentB
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.prefix_<^._
import spatutorial.client.SPAMain.{Loc, TodoLoc}
import spatutorial.client.components._
import spatutorial.client.components.chart.{ChartData, ChartDataset}

import scalacss.ScalaCssReact._

object Dashboard {

  case class Props(router: RouterCtl[Loc], proxy: ModelProxy[Pot[String]])

  private val labels = ('A' to 'F').map(letter => (letter.toString, s"#$letter$letter$letter"))
  // create dummy data for the chart
  val cp = Chart.ChartProps(
    "Test chart",
    Chart.BarChart,
    ChartData(
      Seq("January", "February", "March", "April", "May", "June", "July"),
      Seq(ChartDataset(
        label = "My First dataset",
        data = Seq(65.0, 59.0, 80.0, 81.0, 56.0, 55.0, 40.0),
        backgroundColor = "rgba(255,99,132,0.2)",
        borderColor = "rgba(255,99,132,1)",
        hoverBackgroundColor = "rgba(255,99,132,0.4)"
      ))
    )
  )

  // create the React component for Dashboard
  private val component = ReactComponentB[Props]("Dashboard")
    .render_P { case Props(router, proxy) =>
      <.div(
        // header, MessageOfTheDay and chart components
        <.h2("Dashboard"),
        // use connect from ModelProxy to give Motd only partial view to the model
        proxy.connect(m => m)(Motd(_)),
        <.div(
          GlobalStyles.chart,
          Chart(cp)
        ),
        // create a link to the To Do view
        <.div(router.link(TodoLoc)("Check your todos!"))
      )
    }.build

  def apply(router: RouterCtl[Loc], proxy: ModelProxy[Pot[String]]) = component(Props(router, proxy))
}
