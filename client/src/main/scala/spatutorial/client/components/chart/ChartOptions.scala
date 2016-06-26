package spatutorial.client.components.chart

import scala.scalajs.js

@js.native
trait ChartOptions extends js.Object {
  def responsive: Boolean = js.native
}

object ChartOptions {
  def apply(responsive: Boolean = true, maintainAspectRatio: Boolean = false): ChartOptions = {
    js.Dynamic.literal(
      responsive = responsive,
      maintainAspectRatio = maintainAspectRatio
    ).asInstanceOf[ChartOptions]
  }
}
