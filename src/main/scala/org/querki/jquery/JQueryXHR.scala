package org.querki.jquery

import scala.scalajs.js
import org.scalajs.dom.XMLHttpRequest

// TBD: is this signature correct?
@js.native
trait JQueryXHR extends XMLHttpRequest with JQueryDeferred {
  def overrideMimeType(): js.Dynamic = js.native
}
