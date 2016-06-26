package spatutorial.client.components.map

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("L.Point")
trait Point extends js.Object

object Point {
  def apply(x: Double, y: Double, round: Boolean = false): Point = {
    js.Dynamic.literal(
      x = x, y = y, round = round
    ).asInstanceOf[Point]
  }
}