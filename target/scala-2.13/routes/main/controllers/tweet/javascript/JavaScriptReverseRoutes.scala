// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/takapi327/projects/play-handson/conf/routes
// @DATE:Sun Apr 26 10:38:12 JST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers.tweet.javascript {

  // @LINE:9
  class ReverseTweetController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.tweet.TweetController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tweet/list"})
        }
      """
    )
  
    // @LINE:10
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.tweet.TweetController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tweet/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
