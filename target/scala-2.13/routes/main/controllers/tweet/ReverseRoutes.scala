// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/takapi327/projects/play-handson/conf/routes
// @DATE:Sun Apr 26 12:40:03 JST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers.tweet {

  // @LINE:9
  class ReverseTweetController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def delete(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tweet/delete")
    }
  
    // @LINE:10
    def show(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tweet/" + implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:13
    def edit(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tweet/" + implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id) + "/edit")
    }
  
    // @LINE:12
    def store(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tweet/store")
    }
  
    // @LINE:14
    def update(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tweet/" + implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:11
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tweet/store")
    }
  
    // @LINE:9
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tweet/list")
    }
  
  }


}
