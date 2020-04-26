
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Tweet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tweet: Tweet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("詳細画面")/*3.14*/{_display_(Seq[Any](format.raw/*3.15*/("""
  """),format.raw/*4.3*/("""<h1>詳細画面です</h1>
  <div id="detail">
    <div>id: """),_display_(/*6.15*/tweet/*6.20*/.id),format.raw/*6.23*/("""</div>
    <div>id: """),_display_(/*7.15*/tweet/*7.20*/.content),format.raw/*7.28*/("""</div>
  </div>
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(tweet:Tweet): play.twirl.api.HtmlFormat.Appendable = apply(tweet)

  def f:((Tweet) => play.twirl.api.HtmlFormat.Appendable) = (tweet) => apply(tweet)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-26T10:39:51.011806
                  SOURCE: /Users/takapi327/projects/play-handson/app/views/tweet/show.scala.html
                  HASH: ff1f05259d5bb90bb39b2bf208dcb8b2a653820a
                  MATRIX: 733->1|841->16|868->18|888->30|926->31|955->34|1031->84|1044->89|1067->92|1114->113|1127->118|1155->126|1201->143
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|30->6|30->6|30->6|31->7|31->7|31->7|33->9
                  -- GENERATED --
              */
          