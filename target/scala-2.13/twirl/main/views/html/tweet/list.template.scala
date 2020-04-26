
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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Tweet],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(tweets: Seq[Tweet]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("一覧画面です")/*5.16*/ {_display_(Seq[Any](format.raw/*5.18*/("""
  """),format.raw/*6.3*/("""<h1>一覧画面です</h1>
  <ul>
    """),_display_(/*8.6*/for(tweet <- tweets) yield /*8.26*/{_display_(Seq[Any](format.raw/*8.27*/("""
      """),format.raw/*9.7*/("""<li>
        <a href=""""),_display_(/*10.19*/controllers/*10.30*/.tweet.routes.TweetController.show(tweet.id.getOrElse(0))),format.raw/*10.87*/("""">
          """),_display_(/*11.12*/tweet/*11.17*/.content),format.raw/*11.25*/("""
        """),format.raw/*12.9*/("""</a>
      </li>
      <li>
      <a href=""""),_display_(/*15.17*/controllers/*15.28*/.tweet.routes.TweetController.edit(tweet.id.getOrElse(0))),format.raw/*15.85*/("""">
        <button type="button">編集</button>
      </a>
    </li>
    """)))}),format.raw/*19.6*/("""
  """),format.raw/*20.3*/("""</ul>
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(tweets:Seq[Tweet]): play.twirl.api.HtmlFormat.Appendable = apply(tweets)

  def f:((Seq[Tweet]) => play.twirl.api.HtmlFormat.Appendable) = (tweets) => apply(tweets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-26T12:34:04.980291
                  SOURCE: /Users/takapi327/projects/play-handson/app/views/tweet/list.scala.html
                  HASH: e9698efa99fdf1abc2a0ed4a7eab5ae71854c0e8
                  MATRIX: 438->1|765->23|879->44|906->46|928->60|967->62|996->65|1049->93|1084->113|1122->114|1155->121|1205->144|1225->155|1303->212|1344->226|1358->231|1387->239|1423->248|1494->292|1514->303|1592->360|1693->431|1723->434|1760->441
                  LINES: 17->1|22->3|27->4|28->5|28->5|28->5|29->6|31->8|31->8|31->8|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|38->15|38->15|38->15|42->19|43->20|44->21
                  -- GENERATED --
              */
          