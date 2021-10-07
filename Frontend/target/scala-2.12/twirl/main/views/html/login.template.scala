
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>


    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Play Setup Demo</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body>

        <header class="topbar">
            <h1>
                <strong>Part 1</strong>
            </h1>
        </header>


        <div class="container">
            <div class="row">
            <div class="col-2">
                <form action = """"),_display_(/*32.34*/routes/*32.40*/.HomeController.query11()),format.raw/*32.65*/("""" method="GET">
                    <button id="api-get-page"  class="btn btn-primary" type="submit">1.1 Paper Search</button>
                </form>

            </div>
            </div>

            <div class="row">
            <div class="col-2">
                <form action = """"),_display_(/*41.34*/routes/*41.40*/.HomeController.query12()),format.raw/*41.65*/("""" method="GET">
                    <button id="api-get-page" class="btn btn-primary" type="submit">1.2 Journal Search</button>
                </form>
            </div>
            </div>
            <div class="row">
            <div class="col-2">
                <form action = """"),_display_(/*48.34*/routes/*48.40*/.HomeController.query13()),format.raw/*48.65*/("""" method="GET">
                    <button id="api-get-page" class="btn btn-primary" type="submit">1.3 Author Title Search</button>
                </form>
            </div>
            </div>
            <div class="row">
            <div class="col-2">
                <form action = """"),_display_(/*55.34*/routes/*55.40*/.HomeController.query14()),format.raw/*55.65*/("""" method="GET">
                    <button id="api-get-page" class="btn btn-primary" type="submit">1.4 Authors With 10+ Papers</button>
                </form>
            </div>
            </div>
            <div class="row">
            <div class="col-2">
                <form action = """"),_display_(/*62.34*/routes/*62.40*/.HomeController.query15()),format.raw/*62.65*/("""" method="GET">
                    <button id="api-get-page" class="btn btn-primary" type="submit">1.5 Conference Location Search</button>
                </form>
            </div>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(authorizeMessage:String): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage) => apply(authorizeMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-10-06T23:24:52.431
                  SOURCE: /Users/adam/Desktop/Lab-2-Ebean/Frontend/app/views/login.scala.html
                  HASH: 084e607bd7e6272f89b0a96f3f616b7f0473fbbe
                  MATRIX: 948->1|1068->28|2553->1488|2568->1494|2614->1519|2927->1805|2942->1811|2988->1836|3300->2121|3315->2127|3361->2152|3678->2442|3693->2448|3739->2473|4060->2767|4075->2773|4121->2798
                  LINES: 28->1|33->2|63->32|63->32|63->32|72->41|72->41|72->41|79->48|79->48|79->48|86->55|86->55|86->55|93->62|93->62|93->62
                  -- GENERATED --
              */
          