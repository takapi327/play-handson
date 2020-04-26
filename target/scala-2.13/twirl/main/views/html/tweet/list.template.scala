
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
/*1.2*/import models.Tweet

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Seq[Tweet],MessagesProvider,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(tweets: Seq[Tweet])(implicit messagesProvider: MessagesProvider, requestHeader: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("一覧画面です")/*5.16*/ {_display_(Seq[Any](format.raw/*5.18*/("""
  """),format.raw/*6.3*/("""<h1>一覧画面です</h1>
  <ul>
    """),_display_(/*8.6*/for(tweet <- tweets) yield /*8.26*/{_display_(Seq[Any](format.raw/*8.27*/("""
      """),_display_(/*9.8*/helper/*9.14*/.form(action = controllers.tweet.routes.TweetController.delete())/*9.79*/ {_display_(Seq[Any](format.raw/*9.81*/("""
        """),_display_(/*10.10*/helper/*10.16*/.CSRF.formField),format.raw/*10.31*/("""
        """),format.raw/*11.9*/("""<input type="hidden" value=""""),_display_(/*11.38*/tweet/*11.43*/.id),format.raw/*11.46*/("""" name="id">
        <li>
          <a href=""""),_display_(/*13.21*/controllers/*13.32*/.tweet.routes.TweetController.show(tweet.id.getOrElse(0))),format.raw/*13.89*/("""">
            """),_display_(/*14.14*/tweet/*14.19*/.content),format.raw/*14.27*/("""
          """),format.raw/*15.11*/("""</a>
        </li>
        <li>
        <a href=""""),_display_(/*18.19*/controllers/*18.30*/.tweet.routes.TweetController.edit(tweet.id.getOrElse(0))),format.raw/*18.87*/("""">
          <button type="button">編集</button>
        </a>
      </li>
      <li>
        <input type="submit" value="削除">
      </li>
      """)))}),format.raw/*25.8*/("""
    """)))}),format.raw/*26.6*/("""
  """),format.raw/*27.3*/("""</ul>
""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(tweets:Seq[Tweet],messagesProvider:MessagesProvider,requestHeader:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(tweets)(messagesProvider,requestHeader)

  def f:((Seq[Tweet]) => (MessagesProvider,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (tweets) => (messagesProvider,requestHeader) => apply(tweets)(messagesProvider,requestHeader)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-26T12:43:12.808030
                  SOURCE: /Users/takapi327/projects/play-handson/app/views/tweet/list.scala.html
                  HASH: 216936bb1440a094e1c991c6c91192ed0d485c1f
                  MATRIX: 438->1|796->23|985->119|1012->121|1034->135|1073->137|1102->140|1155->168|1190->188|1228->189|1261->197|1275->203|1348->268|1387->270|1424->280|1439->286|1475->301|1511->310|1567->339|1581->344|1605->347|1678->393|1698->404|1776->461|1819->477|1833->482|1862->490|1901->501|1978->551|1998->562|2076->619|2249->762|2285->768|2315->771|2352->778
                  LINES: 17->1|22->3|27->4|28->5|28->5|28->5|29->6|31->8|31->8|31->8|32->9|32->9|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|34->11|36->13|36->13|36->13|37->14|37->14|37->14|38->15|41->18|41->18|41->18|48->25|49->26|50->27|51->28
                  -- GENERATED --
              */
          