
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

object store extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[TweetFormData],MessagesProvider,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(form: Form[TweetFormData])(implicit messageProvider: MessagesProvider, requestHeader: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("登録画面")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""
  """),format.raw/*5.3*/("""<h1>登録画面です</h1>
  """),_display_(/*6.4*/helper/*6.10*/.form(action = controllers.tweet.routes.TweetController.store())/*6.74*/ {_display_(Seq[Any](format.raw/*6.76*/("""
    """),_display_(/*7.6*/helper/*7.12*/.CSRF.formField),format.raw/*7.27*/("""
    """),_display_(/*8.6*/helper/*8.12*/.textarea(form("content"),
    'row -> 7, 'cols -> 40,
    'label -> "ツイート", '_showConstraints -> false
    )),format.raw/*11.6*/("""
    """),format.raw/*12.5*/("""<input type="submit" value="登録">
  """)))}),format.raw/*13.4*/("""
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(form:Form[TweetFormData],messageProvider:MessagesProvider,requestHeader:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(form)(messageProvider,requestHeader)

  def f:((Form[TweetFormData]) => (MessagesProvider,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (form) => (messageProvider,requestHeader) => apply(form)(messageProvider,requestHeader)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-29T13:23:45.565057
                  SOURCE: /Users/takapi327/projects/play-handson/app/views/tweet/store.scala.html
                  HASH: cd7d8b8b8f63518b4917493e3166e77f8525dd47
                  MATRIX: 438->1|825->41|1020->143|1047->145|1067->157|1106->159|1135->162|1179->181|1193->187|1265->251|1304->253|1335->259|1349->265|1384->280|1415->286|1429->292|1558->401|1590->406|1656->442|1688->444
                  LINES: 17->1|22->2|27->3|28->4|28->4|28->4|29->5|30->6|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|35->11|36->12|37->13|38->14
                  -- GENERATED --
              */
          