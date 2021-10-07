
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/abbygwin/Lab-2-Ebean/ebean-backend/conf/routes
// @DATE:Thu Oct 07 12:14:53 CDT 2021


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
