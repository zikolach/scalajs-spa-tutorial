package spatutorial.client.components.chart

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait ChartDataset extends js.Object {
  def label: String = js.native

  def data: js.Array[Double] = js.native

  def fillColor: String = js.native

  def strokeColor: String = js.native
}

object ChartDataset {
  def apply(data: Seq[Double],
            label: String,
            backgroundColor: String = "#8080FF",
            borderColor: String = "#404080",
            hoverBackgroundColor: String = "#8080FF"): ChartDataset = {
    js.Dynamic.literal(
      label = label,
      data = data.toJSArray,
      backgroundColor = backgroundColor,
      borderColor = borderColor,
      hoverBackgroundColor = hoverBackgroundColor
    ).asInstanceOf[ChartDataset]
  }
}