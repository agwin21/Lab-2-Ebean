
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

    <style>
            .grid-container """),format.raw/*6.29*/("""{"""),format.raw/*6.30*/("""
                """),format.raw/*7.17*/("""display: grid;
                grid-template-columns: auto auto auto;
                background-color: #2196F3;
                padding: 10px;
            """),format.raw/*11.13*/("""}"""),format.raw/*11.14*/("""

            """),format.raw/*13.13*/(""".grid-item """),format.raw/*13.24*/("""{"""),format.raw/*13.25*/("""
                """),format.raw/*14.17*/("""background-color: rgba(255, 255, 255, 0.8);
                border: 1px solid rgba(0, 0, 0, 0.8);
                padding: 5px;
                font-size: 30px;
                text-align: center;
            """),format.raw/*19.13*/("""}"""),format.raw/*19.14*/("""

            """),format.raw/*21.13*/(""".button """),format.raw/*21.21*/("""{"""),format.raw/*21.22*/("""
                """),format.raw/*22.17*/("""background-color: #4CAF50; /* Green */
                border: none;
                color: white;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                cursor: pointer;
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/("""
    """),format.raw/*33.5*/("""</style>


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
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Part 1 Queries</strong>
            </h1>
        </header>


        <div class="grid-container">
            <div class="grid-item">
                <form action = """"),_display_(/*62.34*/routes/*62.40*/.HomeController.query11()),format.raw/*62.65*/("""" method="GET">
                    <button id="api-get-page"  class="button" type="submit">1.1 Paper Search</button>
                </form>

            </div>

            <div class="grid-item">
                <button id="api-get-page" class="button" type="query12">1.2 Journal Search</button>
            </div>
            <div class="grid-item">
                <button id="api-get-page" class="button" type="query13">1.3 Author Title Search</button>
            </div>
            <div class="grid-item">
                <button id="api-get-page" class="button" type="query14">1.4 Authors With 10+ Papers</button>
            </div>
            <div class="grid-item"></div>
            <div class="grid-item">
                <button id="api-get-page" class="button" type="query15">1.5 Conference Location Search</button>
            </div>
        </div>


        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Part 2 Queries</strong>
            </h1>
        </header>


        <div class="grid-container">
            <div class="grid-item">
                <button id="api-get-page" class="button" type="query21">2.1 Author Paper Search</button>
            </div>

            <div class="grid-item">
                <button id="api-get-page" class="button" type="query12">2.2 Productive Authors Co-Authors</button>
            </div>
            <div class="grid-item">
                <button id="api-get-page" class="button" type="query13">2.3 Map of Conference Locations</button>
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
                  DATE: 2021-10-05T16:03:38.949
                  SOURCE: /Users/abbygwin/Downloads/Lab-2-Ebean/Frontend/app/views/login.scala.html
                  HASH: f6d08355ada77459c1f0e7124835fb338800562a
                  MATRIX: 948->1|1068->28|1159->92|1187->93|1231->110|1415->266|1444->267|1486->281|1525->292|1554->293|1599->310|1836->519|1865->520|1907->534|1943->542|1972->543|2017->560|2405->920|2434->921|2466->926|3996->2431|4011->2437|4057->2462
                  LINES: 28->1|33->2|37->6|37->6|38->7|42->11|42->11|44->13|44->13|44->13|45->14|50->19|50->19|52->21|52->21|52->21|53->22|63->32|63->32|64->33|93->62|93->62|93->62
                  -- GENERATED --
              */
          