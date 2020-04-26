// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/takapi327/projects/play-handson/conf/routes
// @DATE:Sun Apr 26 10:38:12 JST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers.tweet {

  // @LINE:9
  class ReverseTweetController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tweet/list")
    }
  
    // @LINE:10
    def show(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tweet/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }


}
