
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/abbygwin/Downloads/Lab-2-Ebean/ebean-backend/conf/routes
// @DATE:Wed Oct 06 21:55:25 CDT 2021


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
