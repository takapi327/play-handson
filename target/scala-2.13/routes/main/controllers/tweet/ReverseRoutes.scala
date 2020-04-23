// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/takapi327/projects/play-handson/conf/routes
// @DATE:Thu Apr 23 23:54:06 JST 2020

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
  
  }


}
