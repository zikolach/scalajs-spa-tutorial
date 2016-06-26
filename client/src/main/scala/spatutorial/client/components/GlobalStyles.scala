package spatutorial.client.components

import scalacss.Defaults._
import scalacss.Dsl

object GlobalStyles extends StyleSheet.Inline {

  import Dsl._

  val navbarHeight = 50

  style(unsafeRoot("body")(
    paddingTop(70.px))
  )

  // full-screen map
  style(unsafeRoot("#map")(
    marginTop(-20.px),
    marginLeft(-15.px),
    marginRight(-15.px)
  ))

  val bootstrapStyles = new BootstrapStyles

  val chart = style(width(500.px), height(300.px))

}
