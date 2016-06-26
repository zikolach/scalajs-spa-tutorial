package spatutorial.client.components.chart

import scala.scalajs.js
import scala.scalajs.js.JSConverters._


@js.native
trait ChartData extends js.Object {
  def labels: js.Array[String] = js.native

  def datasets: js.Array[ChartDataset] = js.native
}

object ChartData {
  def apply(labels: Seq[String], datasets: Seq[ChartDataset]): ChartData = {
    js.Dynamic.literal(
      labels = labels.toJSArray,
      datasets = datasets.toJSArray
    ).asInstanceOf[ChartData]
  }
}