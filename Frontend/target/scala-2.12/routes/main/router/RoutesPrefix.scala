// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/abbygwin/Downloads/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Tue Oct 05 16:03:38 CDT 2021


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
