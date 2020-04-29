
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Long,Form[TweetFormData],MessagesProvider,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* idを引数に追加 */
  def apply/*3.2*/(id: Long, form: Form[TweetFormData])(implicit messagesProvider: MessagesProvider, requestHeader: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("編集画面")/*5.14*/ {_display_(Seq[Any](format.raw/*5.16*/("""
  """),format.raw/*6.3*/("""<h1>編集画面です</h1>
  """),_display_(/*7.4*/helper/*7.10*/.form(action = controllers.tweet.routes.TweetController.update(id))/*7.77*/ {_display_(Seq[Any](format.raw/*7.79*/("""
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""
    """),_display_(/*9.6*/helper/*9.12*/.textarea(form("content"),
      'rows -> 7, 'cols -> 40,
      '_label -> "ツイート" ,'_showConstraints -> false
    )),format.raw/*12.6*/("""

    """),format.raw/*14.5*/("""<input type="submit" value="更新">
  """)))}),format.raw/*15.4*/("""
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(id:Long,form:Form[TweetFormData],messagesProvider:MessagesProvider,requestHeader:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(id,form)(messagesProvider,requestHeader)

  def f:((Long,Form[TweetFormData]) => (MessagesProvider,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (id,form) => (messagesProvider,requestHeader) => apply(id,form)(messagesProvider,requestHeader)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-29T13:23:45.550418
                  SOURCE: /Users/takapi327/projects/play-handson/app/views/tweet/edit.scala.html
                  HASH: 4e6e36b35d6048ffd83d578916376e538a0e24d1
                  MATRIX: 438->1|839->56|1045->169|1072->171|1092->183|1131->185|1160->188|1204->207|1218->213|1293->280|1332->282|1363->288|1377->294|1412->309|1443->315|1457->321|1592->436|1625->442|1691->478|1723->480
                  LINES: 17->1|22->3|27->4|28->5|28->5|28->5|29->6|30->7|30->7|30->7|30->7|31->8|31->8|31->8|32->9|32->9|35->12|37->14|38->15|39->16
                  -- GENERATED --
              */
          