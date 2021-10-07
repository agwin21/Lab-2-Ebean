// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/adam/Desktop/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Thu Oct 07 11:25:42 CDT 2021


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
