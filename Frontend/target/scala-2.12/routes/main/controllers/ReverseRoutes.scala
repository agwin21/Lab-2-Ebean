// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/adam/Desktop/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Thu Oct 07 11:25:42 CDT 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def query14(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query14")
    }
  
    // @LINE:16
    def q15Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query15Handler")
    }
  
    // @LINE:14
    def q14Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query14Handler")
    }
  
    // @LINE:9
    def query11(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query11")
    }
  
    // @LINE:8
    def q11Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query11Handler")
    }
  
    // @LINE:11
    def query12(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query12")
    }
  
    // @LINE:17
    def query15(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query15")
    }
  
    // @LINE:13
    def query13(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query13")
    }
  
    // @LINE:10
    def q12Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query12Handler")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:12
    def q13Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query13Handler")
    }
  
  }

  // @LINE:27
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
