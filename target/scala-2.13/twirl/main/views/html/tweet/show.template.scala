
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Tweet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(tweet: Tweet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("詳細画面")/*4.14*/{_display_(Seq[Any](format.raw/*4.15*/("""
  """),format.raw/*5.3*/("""<h1>詳細画面です</h1>
  <div id="detail">
    <div>id: """),_display_(/*7.15*/tweet/*7.20*/.id),format.raw/*7.23*/("""</div>
    <div>id: """),_display_(/*8.15*/tweet/*8.20*/.content),format.raw/*8.28*/("""</div>
  </div>
""")))}),format.raw/*10.2*/("""
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
                  DATE: 2020-04-29T13:23:45.512964
                  SOURCE: /Users/takapi327/projects/play-handson/app/views/tweet/show.scala.html
                  HASH: 5cb33cbbaa08903e481378c12a3b4b54d13bbb14
                  MATRIX: 438->1|760->22|868->37|895->39|915->51|953->52|982->55|1058->105|1071->110|1094->113|1141->134|1154->139|1182->147|1229->164
                  LINES: 17->1|22->2|27->3|28->4|28->4|28->4|29->5|31->7|31->7|31->7|32->8|32->8|32->8|34->10
                  -- GENERATED --
              */
          