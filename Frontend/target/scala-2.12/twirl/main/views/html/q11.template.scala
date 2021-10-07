
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

object q11 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>

    <body>

        <header class="topbar">
            <h1>
                Query 1.1 Paper Search
            </h1>

        </header>

        <div>
            <p>
                """),_display_(/*16.18*/message),format.raw/*16.25*/("""
            """),format.raw/*17.13*/("""</p>

        </div>

        <form action = """"),_display_(/*21.26*/routes/*21.32*/.HomeController.q11Handler()),format.raw/*21.60*/("""" method="GET">
            <label>Paper Name</label>
            <input type = "text" maxlength="100" id="title" name="title">
            <button id="api-get-page"  class="btn btn-primary" type="submit">1.1 Paper Search</button>
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
                  DATE: 2021-10-06T23:26:29.089
                  SOURCE: /Users/adam/Desktop/Lab-2-Ebean/Frontend/app/views/q11.scala.html
                  HASH: d57d2cea5e7dca23f8f60b0b7f325ff5147003b4
                  MATRIX: 946->1|1057->19|1293->228|1321->235|1362->248|1436->295|1451->301|1500->329
                  LINES: 28->1|33->2|47->16|47->16|48->17|52->21|52->21|52->21
                  -- GENERATED --
              */
          