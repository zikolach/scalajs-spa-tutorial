package spatutorial.client.components.chart

import scala.scalajs.js

@js.native
trait ChartConfiguration extends js.Object {
  def `type`: String = js.native

  def data: ChartData = js.native

  def options: ChartOptions = js.native
}

object ChartConfiguration {
  def apply(`type`: String,
            data: ChartData,
            options: ChartOptions = ChartOptions(
              responsive = true,
              maintainAspectRatio = false
            )): ChartConfiguration = {
    js.Dynamic.literal(
      `type` = `type`,
      data = data,
      options = options
    ).asInstanceOf[ChartConfiguration]
  }
}
