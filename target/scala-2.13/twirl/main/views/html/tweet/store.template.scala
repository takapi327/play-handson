
package views.html.tweet

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
/*1.2*/import controllers.tweet.TweetFormData

object store extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[TweetFormData],MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(form: Form[TweetFormData])(implicit messageProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("登録画面")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""
  """),format.raw/*5.3*/("""<h1>登録画面です</h1>
  """),_display_(/*6.4*/helper/*6.10*/.form(action = controllers.tweet.routes.TweetController.store())/*6.74*/ {_display_(Seq[Any](format.raw/*6.76*/("""
    """),_display_(/*7.6*/helper/*7.12*/.inputText(form("content"))),format.raw/*7.39*/("""
    """),format.raw/*8.5*/("""<input type="submit" value="登録">
  """)))}),format.raw/*9.4*/("""
""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(form:Form[TweetFormData],messageProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(form)(messageProvider)

  def f:((Form[TweetFormData]) => (MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (form) => (messageProvider) => apply(form)(messageProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-26T11:44:11.706636
                  SOURCE: /Users/takapi327/projects/play-handson/app/views/tweet/store.scala.html
                  HASH: ab5d8313f29ce6f989bcf6fb0597dd5cb529dc4f
                  MATRIX: 438->1|811->41|976->113|1003->115|1023->127|1062->129|1091->132|1135->151|1149->157|1221->221|1260->223|1291->229|1305->235|1352->262|1383->267|1448->303|1480->305
                  LINES: 17->1|22->2|27->3|28->4|28->4|28->4|29->5|30->6|30->6|30->6|30->6|31->7|31->7|31->7|32->8|33->9|34->10
                  -- GENERATED --
              */
          