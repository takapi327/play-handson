
package views.html

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(
  title:  String,
  script: Html = Html(""),
  css:    Html = Html(""),
)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*12.1*/("""
"""),format.raw/*13.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*16.62*/("""
        """),format.raw/*17.9*/("""<title>"""),_display_(/*17.17*/title),format.raw/*17.22*/("""</title>
        <link href="https://unpkg.com/sanitize.css" rel="stylesheet"/>
        <link rel="stylesheet" href="https://fonts.googleapis.com/earlyaccess/notosansjapanese.css">
        <link href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" rel="stylesheet">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*21.54*/routes/*21.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*21.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*22.59*/routes/*22.65*/.Assets.versioned("images/favicon.png")),format.raw/*22.104*/("""">
        """),_display_(/*23.10*/css),format.raw/*23.13*/("""
    """),format.raw/*24.5*/("""</head>
    <body>
        """),format.raw/*27.32*/("""
       """),_display_(/*28.9*/content),format.raw/*28.16*/("""
       """),format.raw/*29.8*/("""<script src=""""),_display_(/*29.22*/routes/*29.28*/.Assets.versioned("javascripts/main.js")),format.raw/*29.68*/("""" type="text/javascript"></script>
       """),_display_(/*30.9*/script),format.raw/*30.15*/("""
    """),format.raw/*31.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,script:Html,css:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,script,css)(content)

  def f:((String,Html,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,script,css) => (content) => apply(title,script,css)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-29T13:23:45.585676
                  SOURCE: /Users/takapi327/projects/play-handson/app/views/main.scala.html
                  HASH: 9e69106d73b3949c58db1f5093e32e7bc69e62e4
                  MATRIX: 997->260|1182->351|1210->352|1290->457|1326->466|1361->474|1387->479|1743->808|1758->814|1821->855|1909->916|1924->922|1985->961|2024->973|2048->976|2080->981|2135->1098|2170->1107|2198->1114|2233->1122|2274->1136|2289->1142|2350->1182|2419->1225|2446->1231|2478->1236
                  LINES: 26->7|35->12|36->13|39->16|40->17|40->17|40->17|44->21|44->21|44->21|45->22|45->22|45->22|46->23|46->23|47->24|49->27|50->28|50->28|51->29|51->29|51->29|51->29|52->30|52->30|53->31
                  -- GENERATED --
              */
          