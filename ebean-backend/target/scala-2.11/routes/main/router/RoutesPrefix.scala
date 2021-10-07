
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/adam/Downloads/CS_7340_Lab2-main/ebean-backend/conf/routes
// @DATE:Wed Oct 06 21:22:22 CDT 2021


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
