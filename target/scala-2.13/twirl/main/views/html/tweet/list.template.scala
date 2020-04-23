
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
      """),format.raw/*9.7*/("""<li>"""),_display_(/*9.12*/tweet/*9.17*/.content),format.raw/*9.25*/("""</li>
    """)))}),format.raw/*10.6*/("""
  """),format.raw/*11.3*/("""</ul>
""")))}),format.raw/*12.2*/("""
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
                  DATE: 2020-04-24T00:09:37.706708
                  SOURCE: /Users/takapi327/projects/play-handson/app/views/tweet/list.scala.html
                  HASH: f48ca963335b45458d3508015d435f64fabc5acc
                  MATRIX: 438->1|765->23|879->44|906->46|928->60|967->62|996->65|1049->93|1084->113|1122->114|1155->121|1186->126|1199->131|1227->139|1268->150|1298->153|1335->160
                  LINES: 17->1|22->3|27->4|28->5|28->5|28->5|29->6|31->8|31->8|31->8|32->9|32->9|32->9|32->9|33->10|34->11|35->12
                  -- GENERATED --
              */
          