// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/takapi327/projects/play-handson/conf/routes
// @DATE:Sun Apr 26 12:40:03 JST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_2: controllers.HomeController,
  // @LINE:9
  TweetController_0: controllers.tweet.TweetController,
  // @LINE:18
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_2: controllers.HomeController,
    // @LINE:9
    TweetController_0: controllers.tweet.TweetController,
    // @LINE:18
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_2, TweetController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, TweetController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tweet/list""", """controllers.tweet.TweetController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tweet/""" + "$" + """id<[0-9]+>""", """controllers.tweet.TweetController.show(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tweet/store""", """controllers.tweet.TweetController.register"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tweet/store""", """controllers.tweet.TweetController.store"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tweet/""" + "$" + """id<[0-9]+>/edit""", """controllers.tweet.TweetController.edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tweet/""" + "$" + """id<[0-9]+>/update""", """controllers.tweet.TweetController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tweet/delete""", """controllers.tweet.TweetController.delete"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_tweet_TweetController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tweet/list")))
  )
  private[this] lazy val controllers_tweet_TweetController_list1_invoker = createInvoker(
    TweetController_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.tweet.TweetController",
      "list",
      Nil,
      "GET",
      this.prefix + """tweet/list""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_tweet_TweetController_show2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tweet/"), DynamicPart("id", """[0-9]+""",false)))
  )
  private[this] lazy val controllers_tweet_TweetController_show2_invoker = createInvoker(
    TweetController_0.show(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.tweet.TweetController",
      "show",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tweet/""" + "$" + """id<[0-9]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_tweet_TweetController_register3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tweet/store")))
  )
  private[this] lazy val controllers_tweet_TweetController_register3_invoker = createInvoker(
    TweetController_0.register,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.tweet.TweetController",
      "register",
      Nil,
      "GET",
      this.prefix + """tweet/store""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_tweet_TweetController_store4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tweet/store")))
  )
  private[this] lazy val controllers_tweet_TweetController_store4_invoker = createInvoker(
    TweetController_0.store,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.tweet.TweetController",
      "store",
      Nil,
      "POST",
      this.prefix + """tweet/store""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_tweet_TweetController_edit5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tweet/"), DynamicPart("id", """[0-9]+""",false), StaticPart("/edit")))
  )
  private[this] lazy val controllers_tweet_TweetController_edit5_invoker = createInvoker(
    TweetController_0.edit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.tweet.TweetController",
      "edit",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tweet/""" + "$" + """id<[0-9]+>/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_tweet_TweetController_update6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tweet/"), DynamicPart("id", """[0-9]+""",false), StaticPart("/update")))
  )
  private[this] lazy val controllers_tweet_TweetController_update6_invoker = createInvoker(
    TweetController_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.tweet.TweetController",
      "update",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """tweet/""" + "$" + """id<[0-9]+>/update""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_tweet_TweetController_delete7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tweet/delete")))
  )
  private[this] lazy val controllers_tweet_TweetController_delete7_invoker = createInvoker(
    TweetController_0.delete,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.tweet.TweetController",
      "delete",
      Nil,
      "POST",
      this.prefix + """tweet/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:9
    case controllers_tweet_TweetController_list1_route(params@_) =>
      call { 
        controllers_tweet_TweetController_list1_invoker.call(TweetController_0.list)
      }
  
    // @LINE:10
    case controllers_tweet_TweetController_show2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_tweet_TweetController_show2_invoker.call(TweetController_0.show(id))
      }
  
    // @LINE:11
    case controllers_tweet_TweetController_register3_route(params@_) =>
      call { 
        controllers_tweet_TweetController_register3_invoker.call(TweetController_0.register)
      }
  
    // @LINE:12
    case controllers_tweet_TweetController_store4_route(params@_) =>
      call { 
        controllers_tweet_TweetController_store4_invoker.call(TweetController_0.store)
      }
  
    // @LINE:13
    case controllers_tweet_TweetController_edit5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_tweet_TweetController_edit5_invoker.call(TweetController_0.edit(id))
      }
  
    // @LINE:14
    case controllers_tweet_TweetController_update6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_tweet_TweetController_update6_invoker.call(TweetController_0.update(id))
      }
  
    // @LINE:15
    case controllers_tweet_TweetController_delete7_route(params@_) =>
      call { 
        controllers_tweet_TweetController_delete7_invoker.call(TweetController_0.delete)
      }
  
    // @LINE:18
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
