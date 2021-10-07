
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

object q12 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>

    <body>

        <header class="topbar">
            <h1>
                Query 1.2 Journal Search
            </h1>

        </header>

        <div>
            <p>
                """),_display_(/*16.18*/message),format.raw/*16.25*/("""
            """),format.raw/*17.13*/("""</p>

        </div>

        <form action = """"),_display_(/*21.26*/routes/*21.32*/.HomeController.q12Handler()),format.raw/*21.60*/("""" method="GET">
            <label>Journal name</label>
            <input type = "text" maxlength="100" id="title" name="title">
            <label>Year</label>
            <input type = "text" maxlength="100" id="year" name="year">
            <label>Journal issue</label>
            <input type = "text" maxlength="100" id="issue" name="issue">
            <button id="api-get-page" class="btn btn-primary" type="submit">1.2 Journal Search</button>
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
                  DATE: 2021-10-06T23:23:52.355
                  SOURCE: /Users/adam/Desktop/Lab-2-Ebean/Frontend/app/views/q12.scala.html
                  HASH: 769091584049f8a7ef796241ed54c041f1498643
                  MATRIX: 946->1|1057->19|1295->230|1323->237|1364->250|1438->297|1453->303|1502->331
                  LINES: 28->1|33->2|47->16|47->16|48->17|52->21|52->21|52->21
                  -- GENERATED --
              */
          