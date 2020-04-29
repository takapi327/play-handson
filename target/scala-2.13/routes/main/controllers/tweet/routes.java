// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/takapi327/projects/play-handson/conf/routes
// @DATE:Wed Apr 29 13:23:45 JST 2020

package controllers.tweet;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.tweet.ReverseTweetController TweetController = new controllers.tweet.ReverseTweetController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.tweet.javascript.ReverseTweetController TweetController = new controllers.tweet.javascript.ReverseTweetController(RoutesPrefix.byNamePrefix());
  }

}
