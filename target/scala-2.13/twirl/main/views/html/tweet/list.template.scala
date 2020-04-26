
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
        <a href=""""),_display_(/*10.19*/controllers/*10.30*/.tweet.routes.TweetController.show(tweet.id.getOrElse(0))),format.raw/*10.87*/("""">"""),_display_(/*10.90*/tweet/*10.95*/.content),format.raw/*10.103*/("""</a>
      </li>
    """)))}),format.raw/*12.6*/("""
  """),format.raw/*13.3*/("""</ul>
""")))}),format.raw/*14.2*/("""
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
                  DATE: 2020-04-26T10:55:27.837532
                  SOURCE: /Users/takapi327/projects/play-handson/app/views/tweet/list.scala.html
                  HASH: 636f0d2a2500802c049c3b22ef701a46ef3e3c18
                  MATRIX: 438->1|765->23|879->44|906->46|928->60|967->62|996->65|1049->93|1084->113|1122->114|1155->121|1205->144|1225->155|1303->212|1333->215|1347->220|1377->228|1429->250|1459->253|1496->260
                  LINES: 17->1|22->3|27->4|28->5|28->5|28->5|29->6|31->8|31->8|31->8|32->9|33->10|33->10|33->10|33->10|33->10|33->10|35->12|36->13|37->14
                  -- GENERATED --
              */
          