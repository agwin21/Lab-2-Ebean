
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

object q15 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <body>

        <header class="topbar">
            <h1>
                Query 1.5 Conference Search
            </h1>

        </header>

        <div>
            <p>
                """),_display_(/*15.18*/message),format.raw/*15.25*/("""
            """),format.raw/*16.13*/("""</p>

        </div>

        <form action = """"),_display_(/*20.26*/routes/*20.32*/.HomeController.q15Handler()),format.raw/*20.60*/("""" method="GET">
            <label>Conference</label>
            <input type = "text" maxlength="100" id="conference" name="conference">
            <label>Year</label>
            <input type = "text" maxlength="100" id="year" name="year">
            <button id="api-get-page"  class="btn btn-primary" type="submit">1.5 Conference Search</button>
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
                  DATE: 2021-10-07T13:23:21.961
                  SOURCE: /Users/abbygwin/Lab-2-Ebean/Frontend/app/views/q15.scala.html
                  HASH: 0780dd23e0ebae5b8eb475a0d0d80a47068621e5
                  MATRIX: 946->1|1057->19|1297->232|1325->239|1366->252|1440->299|1455->305|1504->333
                  LINES: 28->1|33->2|46->15|46->15|47->16|51->20|51->20|51->20
                  -- GENERATED --
              */
          