
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object q22 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <body>

        <header class="topbar">
            <h1>
                Query 2.2 Productive Authors Search
            </h1>

        </header>

        <div>
            <p>
                """),_display_(/*15.18*/message),format.raw/*15.25*/("""
            """),format.raw/*16.13*/("""</p>

        </div>

        <form action = """"),_display_(/*20.26*/routes/*20.32*/.HomeController.q22Handler()),format.raw/*20.60*/("""" method="GET">
            <button id="api-get-page"  class="btn btn-primary" type="submit">2.2 Productive Authors Search</button>
        </form>
    </body>
</html>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-10-06T23:29:41.395
                  SOURCE: /Users/adam/Desktop/Lab-2-Ebean/Frontend/app/views/q22.scala.html
                  HASH: 36dd79b81ab5f00d60347cd38bf2f18307461206
                  MATRIX: 946->1|1057->19|1305->240|1333->247|1374->260|1448->307|1463->313|1512->341
                  LINES: 28->1|33->2|46->15|46->15|47->16|51->20|51->20|51->20
                  -- GENERATED --
              */
          