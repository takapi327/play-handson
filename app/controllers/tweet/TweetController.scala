package controllers.tweet

import javax.inject.{Inject,Singleton}
import play.api.mvc.ControllerComponents
import play.api.mvc.BaseController
import play.api.mvc.Request
import play.api.mvc.AnyContent
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.i18n._

import models.Tweet

case class TweetFormData(content: String)

@Singleton
class TweetController @Inject()(
  val controllerComponents: ControllerComponents
) extends BaseController with I18nSupport {

  val tweets = scala.collection.mutable.ArrayBuffer((1L to 10L).map(
    i => Tweet(Some(i), s"test tweet${i.toString}")
  ):_*)
  def list() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tweet.list(tweets.toSeq))
  }

  def show(id: Long) = Action { implicit request: Request[AnyContent] =>
    tweets.find(_.id.exists(_ == id)) match {
      case Some(tweet) => Ok(views.html.tweet.show(tweet))
      case None        => NotFound(views.html.error.page404())
    }
  }

  val form = Form(
    mapping(
      "content" -> nonEmptyText(maxLength = 140)
    )(TweetFormData.apply)(TweetFormData.unapply)
  )

  def register() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tweet.store(form))
  }

  def store() = Action { implicit request: Request[AnyContent] => 
    form.bindFromRequest().fold(
      (formWithErrors: Form[TweetFormData]) => {
        BadRequest(views.html.tweet.store(formWithErrors))
      },
      (tweetFormData: TweetFormData) => {
        tweets += Tweet(Some(tweets.size + 1L), tweetFormData.content)
        Redirect("/tweet/list")
      }
    )
  }
}
