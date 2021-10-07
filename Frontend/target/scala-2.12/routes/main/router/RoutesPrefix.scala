// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/abbygwin/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Thu Oct 07 13:23:21 CDT 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
