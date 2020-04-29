
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
  def apply/*2.2*/(tweets: Seq[Tweet])(implicit messagesProvider: MessagesProvider, requestHeader: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/css/*5.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.9*/("""
  """),format.raw/*6.3*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*6.48*/routes/*6.54*/.Assets.versioned("stylesheets/list.css")),format.raw/*6.95*/("""">
""")))};def /*10.2*/script/*10.8*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.12*/("""
  """),format.raw/*11.3*/("""<script src=""""),_display_(/*11.17*/routes/*11.23*/.Assets.versioned("javascripts/list.js")),format.raw/*11.63*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.23*/("""
"""),format.raw/*7.2*/("""

"""),format.raw/*9.22*/("""
"""),format.raw/*12.2*/("""

"""),format.raw/*14.27*/("""
"""),_display_(/*15.2*/main(
  title  = "一覧画面",
  script = script,
  css    = css,
)/*19.2*/ {_display_(Seq[Any](format.raw/*19.4*/("""
  """),format.raw/*20.30*/("""
  """),format.raw/*21.3*/("""<h1>一覧画面です</h1>
    """),_display_(/*22.6*/for(tweet <- tweets) yield /*22.26*/ {_display_(Seq[Any](format.raw/*22.28*/("""
      """),format.raw/*23.53*/("""
      """),format.raw/*24.7*/("""<div class="card" data-href=""""),_display_(/*24.37*/controllers/*24.48*/.tweet.routes.TweetController.show(tweet.id.getOrElse(0))),format.raw/*24.105*/("""">
        <div class="card_content">
          """),_display_(/*26.12*/tweet/*26.17*/.content),format.raw/*26.25*/("""
        """),format.raw/*27.9*/("""</div>
        <div class="card_footer">
          <div class="card_footer_item">
            <a href=""""),_display_(/*30.23*/controllers/*30.34*/.tweet.routes.TweetController.edit(tweet.id.getOrElse(0))),format.raw/*30.91*/("""">
              <i class="far fa-edit"></i>
            </a>
          </div>
          <div class="card_footer_item">
            """),_display_(/*35.14*/helper/*35.20*/.form(action = controllers.tweet.routes.TweetController.delete())/*35.85*/ {_display_(Seq[Any](format.raw/*35.87*/("""
              """),_display_(/*36.16*/helper/*36.22*/.CSRF.formField),format.raw/*36.37*/("""
              """),format.raw/*37.15*/("""<input type="hidden" value=""""),_display_(/*37.44*/tweet/*37.49*/.id),format.raw/*37.52*/("""" name="id">
              <i class="far fa-trash-alt delete"></i>
            """)))}),format.raw/*39.14*/("""
          """),format.raw/*40.11*/("""</div>
        </div>
      </div>
    """)))}),format.raw/*43.6*/("""
""")))}),format.raw/*44.2*/("""
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
                  DATE: 2020-04-29T13:23:45.532524
                  SOURCE: /Users/takapi327/projects/play-handson/app/views/tweet/list.scala.html
                  HASH: cdd26a3eb9d491c6d6c3c1b05d481e66d51fdc44
                  MATRIX: 438->1|796->22|969->143|979->146|1058->150|1087->153|1158->198|1172->204|1233->245|1260->274|1274->280|1355->284|1385->287|1426->301|1441->307|1502->347|1576->118|1604->141|1631->249|1660->272|1688->383|1718->411|1746->413|1815->474|1854->476|1885->506|1915->509|1962->530|1998->550|2038->552|2073->605|2107->612|2164->642|2184->653|2263->710|2339->759|2353->764|2382->772|2418->781|2549->885|2569->896|2647->953|2807->1086|2822->1092|2896->1157|2936->1159|2979->1175|2994->1181|3030->1196|3073->1211|3129->1240|3143->1245|3167->1248|3278->1328|3317->1339|3387->1379|3419->1381
                  LINES: 17->1|22->2|26->5|26->5|28->5|29->6|29->6|29->6|29->6|30->10|30->10|32->10|33->11|33->11|33->11|33->11|35->3|36->4|37->7|39->9|40->12|42->14|43->15|47->19|47->19|48->20|49->21|50->22|50->22|50->22|51->23|52->24|52->24|52->24|52->24|54->26|54->26|54->26|55->27|58->30|58->30|58->30|63->35|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|65->37|67->39|68->40|71->43|72->44
                  -- GENERATED --
              */
          