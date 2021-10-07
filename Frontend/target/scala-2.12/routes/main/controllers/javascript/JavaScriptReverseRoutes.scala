// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/adam/Desktop/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Thu Oct 07 11:25:42 CDT 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def query14: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query14",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query14"})
        }
      """
    )
  
    // @LINE:16
    def q15Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.q15Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query15Handler"})
        }
      """
    )
  
    // @LINE:14
    def q14Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.q14Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query14Handler"})
        }
      """
    )
  
    // @LINE:9
    def query11: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query11",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query11"})
        }
      """
    )
  
    // @LINE:8
    def q11Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.q11Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query11Handler"})
        }
      """
    )
  
    // @LINE:11
    def query12: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query12",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query12"})
        }
      """
    )
  
    // @LINE:17
    def query15: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query15",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query15"})
        }
      """
    )
  
    // @LINE:13
    def query13: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query13",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query13"})
        }
      """
    )
  
    // @LINE:10
    def q12Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.q12Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query12Handler"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:12
    def q13Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.q13Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query13Handler"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
