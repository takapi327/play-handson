// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/takapi327/projects/play-handson/conf/routes
// @DATE:Wed Apr 29 13:23:45 JST 2020


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
