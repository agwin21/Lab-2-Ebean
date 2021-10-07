
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

object q23 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>

<html>

    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css"
    integrity="sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A=="
    crossorigin=""/>
        <!-- Make sure you put this AFTER Leaflet's CSS -->
    <script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js"
    integrity="sha512-XQoYMqMTK8LvdxXYG3nZ448hOEQiglfqkJs1NOQV44cWnUrBc8PkAOcXy20w0vlaXaVUearIOBhiXZ5V3ynxwA=="
    crossorigin=""></script>

    <style>

            #mapid """),format.raw/*16.20*/("""{"""),format.raw/*16.21*/(""" """),format.raw/*16.22*/("""height: 600px; """),format.raw/*16.37*/("""}"""),format.raw/*16.38*/("""
    """),format.raw/*17.5*/("""</style>

    <body>

        <header class="topbar">
            <h1>
                Query 2.3 Map Search
            </h1>

        </header>

        <div>
            <p>
                """),_display_(/*30.18*/message),format.raw/*30.25*/("""
            """),format.raw/*31.13*/("""</p>

        </div>

        <form action = """"),_display_(/*35.26*/routes/*35.32*/.HomeController.q23Handler()),format.raw/*35.60*/("""" method="GET">
            <label>Conference</label>
            <input type = "text" maxlength="100" id="conference" name="conference">
            <label>Years</label>
            <input type = "text" maxlength="100" id="years" name="years">
            <button id="api-get-page"  class="btn btn-primary" type="submit">2.3 Map Search</button>
        </form>

        <div id="mapid"></div>
        <script>

                let icws = """),format.raw/*46.28*/("""{"""),format.raw/*46.29*/("""
                    """),format.raw/*47.21*/("""LVx: 36.1699,//vegas 2003
                    LVy: -115.1398,
                    SDx: 32.7157,//san diego 2004
                    SDy: -117.611,
                    OFx: 28.5384,//orlando florida 2005
                    OFy: -81.3789,
                    CIx: 41.8781,//chicago illinois 2006
                    CIy: -87.6298,
                    SLx: 40.7608,//salt lake city utah 2007
                    SLy: -111.8910,
                    BCx: 39.9042,//beijing china 2008
                    BCy: 116.4074,
                    LAx: 34.0522,//los angeles 2009
                    LAy: -118.2437,
                    MFx: 25.7617,//miami florida 2010
                    MFy: -80.1918,
                    DCx: 38.9072,//washington dc 2011
                    DCy: -77.0369,
                    HHx: 21.3069,//honolulu hawaii 2012
                    HHy: -157.8583,
                    SCx: 37.3541,//santa clara california 2013
                    SCy: -121.9552,
                    AAx: 61.2181,//anchorage alaska 2014
                    AAy: -149.9003,
                    NYx: 40.7128,//new york city 2015
                    NYy: -74.0060,
                    SFx: 37.7749,//san francisco 2016
                    SFy: -122.4194,
                    MIx: 45.4642,//milan italy 2019
                    MIy: 9.1900,
                    //no duplicates for 2017 honolulu, 2018 san fran, 2020 beijing
                    //add them if you want but I couldn't store a key as a number
                """),format.raw/*79.17*/("""}"""),format.raw/*79.18*/("""

                """),format.raw/*81.17*/("""let scc = """),format.raw/*81.27*/("""{"""),format.raw/*81.28*/("""
                    """),format.raw/*82.21*/("""BIx: 12.9716,//bangalore india
                    BIy: 77.5946,
                    //bangalore is only unique value (2009) in scc
                    //the rest of the values appear in icws with the same year
                """),format.raw/*86.17*/("""}"""),format.raw/*86.18*/("""

                """),format.raw/*88.17*/("""var mymap = L.map('mapid').setView([0, 0], 2);

                L.tileLayer('https://api.maptiler.com/maps/streets/"""),format.raw/*90.68*/("""{"""),format.raw/*90.69*/("""z"""),format.raw/*90.70*/("""}"""),format.raw/*90.71*/("""/"""),format.raw/*90.72*/("""{"""),format.raw/*90.73*/("""x"""),format.raw/*90.74*/("""}"""),format.raw/*90.75*/("""/"""),format.raw/*90.76*/("""{"""),format.raw/*90.77*/("""y"""),format.raw/*90.78*/("""}"""),format.raw/*90.79*/(""".png?key=dcj0rBj8ACT4YDvql2hH', """),format.raw/*90.111*/("""{"""),format.raw/*90.112*/("""
                    """),format.raw/*91.21*/("""attribution: '<a href="https://www.maptiler.com/copyright/" target="_blank">&copy; MapTiler</a> <a href="https://www.openstreetmap.org/copyright" target="_blank">&copy; OpenStreetMap contributors</a>',
                """),format.raw/*92.17*/("""}"""),format.raw/*92.18*/(""").addTo(mymap);

                //var marker = L.marker([51.5, -.09]).addTo(mymap); //londok UK test marker
                var LV = L.marker([icws["LVx"], icws["LVy"]]).addTo(mymap);
                var SD = L.marker([icws["SDx"], icws["SDy"]]).addTo(mymap);
                var OF = L.marker([icws["OFx"], icws["OFy"]]).addTo(mymap);
                var BC = L.marker([icws["BCx"], icws["BCy"]]).addTo(mymap);
                var HH = L.marker([icws["HHx"], icws["HHy"]]).addTo(mymap);
                var SF = L.marker([icws["SFx"], icws["SFy"]]).addTo(mymap);
                var SC = L.marker([icws["SCx"], icws["SCy"]]).addTo(mymap);
                var MF = L.marker([icws["MFx"], icws["MFy"]]).addTo(mymap);
                var DC = L.marker([icws["DCx"], icws["DCy"]]).addTo(mymap);
                var MI = L.marker([icws["MIx"], icws["MIy"]]).addTo(mymap);
                var LA = L.marker([icws["LAx"], icws["LAy"]]).addTo(mymap);
                var AA = L.marker([icws["AAx"], icws["AAy"]]).addTo(mymap);
                var SL = L.marker([icws["SLx"], icws["SLy"]]).addTo(mymap);
                var CI = L.marker([icws["CIx"], icws["CIy"]]).addTo(mymap);
                var NY = L.marker([icws["NYx"], icws["NYy"]]).addTo(mymap);

                var BI = L.marker([scc["BIx"], scc["BIy"]]).addTo(mymap);
        </script>

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
                  DATE: 2021-10-06T23:29:41.428
                  SOURCE: /Users/adam/Desktop/Lab-2-Ebean/Frontend/app/views/q23.scala.html
                  HASH: 57563717f458e559e7898a97548f594a430f1892
                  MATRIX: 946->1|1057->19|1626->562|1655->563|1684->564|1727->579|1756->580|1788->585|2008->778|2036->785|2077->798|2151->845|2166->851|2215->879|2682->1318|2711->1319|2760->1340|4298->2850|4327->2851|4373->2869|4411->2879|4440->2880|4489->2901|4744->3128|4773->3129|4819->3147|4962->3262|4991->3263|5020->3264|5049->3265|5078->3266|5107->3267|5136->3268|5165->3269|5194->3270|5223->3271|5252->3272|5281->3273|5342->3305|5372->3306|5421->3327|5667->3545|5696->3546
                  LINES: 28->1|33->2|47->16|47->16|47->16|47->16|47->16|48->17|61->30|61->30|62->31|66->35|66->35|66->35|77->46|77->46|78->47|110->79|110->79|112->81|112->81|112->81|113->82|117->86|117->86|119->88|121->90|121->90|121->90|121->90|121->90|121->90|121->90|121->90|121->90|121->90|121->90|121->90|121->90|121->90|122->91|123->92|123->92
                  -- GENERATED --
              */
          