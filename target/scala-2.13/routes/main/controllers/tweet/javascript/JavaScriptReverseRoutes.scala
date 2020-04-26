// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/takapi327/projects/play-handson/conf/routes
// @DATE:Sun Apr 26 12:40:03 JST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers.tweet.javascript {

  // @LINE:9
  class ReverseTweetController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.tweet.TweetController.delete",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tweet/delete"})
        }
      """
    )
  
    // @LINE:10
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.tweet.TweetController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tweet/" + (""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:13
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.tweet.TweetController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tweet/" + (""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/edit"})
        }
      """
    )
  
    // @LINE:12
    def store: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.tweet.TweetController.store",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tweet/store"})
        }
      """
    )
  
    // @LINE:14
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.tweet.TweetController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tweet/" + (""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:11
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.tweet.TweetController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tweet/store"})
        }
      """
    )
  
    // @LINE:9
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.tweet.TweetController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tweet/list"})
        }
      """
    )
  
  }


}
