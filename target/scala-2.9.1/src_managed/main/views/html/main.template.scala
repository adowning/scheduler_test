
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Seq[Project],User,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(projects: Seq[Project], user: User)(body: Html):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.50*/("""

<html>
    <head>
        <title>Zentasks</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq(/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*7.70*/routes/*7.76*/.Assets.at("stylesheets/main.css"))),format.raw/*7.110*/("""">
        <script type="text/javascript" src=""""),_display_(Seq(/*8.46*/routes/*8.52*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*8.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq(/*9.46*/routes/*9.52*/.Assets.at("javascripts/jquery-play-1.7.1.js"))),format.raw/*9.98*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq(/*10.46*/routes/*10.52*/.Assets.at("javascripts/underscore-min.js"))),format.raw/*10.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq(/*11.46*/routes/*11.52*/.Assets.at("javascripts/backbone-min.js"))),format.raw/*11.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq(/*12.46*/routes/*12.52*/.Assets.at("javascripts/main.js"))),format.raw/*12.85*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq(/*13.46*/routes/*13.52*/.Application.javascriptRoutes)),format.raw/*13.81*/(""""></script>
    </head>
    <body>
        <header>
            <a href=""""),_display_(Seq(/*17.23*/routes/*17.29*/.Projects.index)),format.raw/*17.44*/("""" id="logo"><span>Zen</span>tasks</a>
            <dl id="user">
                <dt>"""),_display_(Seq(/*19.22*/user/*19.26*/.name)),format.raw/*19.31*/(""" <span>("""),_display_(Seq(/*19.40*/user/*19.44*/.email)),format.raw/*19.50*/(""")</span></dt>
                <dd>
                    <a href=""""),_display_(Seq(/*21.31*/routes/*21.37*/.Application.logout())),format.raw/*21.58*/("""">Logout</a>
                </dd>
            </dl>
        </header>
        <nav>
            <h4 class="dashboard"><a href="#/">Dashboard</a></h4>
            <ul id="projects">
                """),_display_(Seq(/*28.18*/projects/*28.26*/.groupBy(_.folder).map/*28.48*/ {/*29.21*/case (group, projects) =>/*29.46*/ {_display_(Seq(format.raw/*29.48*/("""
                        """),_display_(Seq(/*30.26*/views/*30.31*/.html.projects.group(group, projects))),format.raw/*30.68*/("""
                    """)))}})),format.raw/*32.18*/("""
            </ul>
            <button id="newGroup">New group</button>
        </nav>
        <section id="main">
            """),_display_(Seq(/*37.14*/body)),format.raw/*37.18*/("""
        </section>
    </body>
</html>

"""))}
    }
    
    def render(projects:Seq[Project],user:User,body:Html) = apply(projects,user)(body)
    
    def f:((Seq[Project],User) => (Html) => play.api.templates.Html) = (projects,user) => (body) => apply(projects,user)(body)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 30 23:10:02 CDT 2012
                    SOURCE: /home/ash/testfactory_play2/zentasks/app/views/main.scala.html
                    HASH: 15210be47308c294279503be1278cc6d5b7a498c
                    MATRIX: 520->1|640->49|780->159|794->165|847->197|949->269|963->275|1019->309|1097->357|1111->363|1173->404|1260->461|1274->467|1341->513|1429->570|1444->576|1509->619|1597->676|1612->682|1675->723|1763->780|1778->786|1833->819|1921->876|1936->882|1987->911|2092->985|2107->991|2144->1006|2261->1092|2274->1096|2301->1101|2341->1110|2354->1114|2382->1120|2478->1185|2493->1191|2536->1212|2766->1411|2783->1419|2814->1441|2825->1464|2859->1489|2894->1491|2951->1517|2965->1522|3024->1559|3079->1599|3238->1727|3264->1731
                    LINES: 19->1|22->1|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13|38->17|38->17|38->17|40->19|40->19|40->19|40->19|40->19|40->19|42->21|42->21|42->21|49->28|49->28|49->28|49->29|49->29|49->29|50->30|50->30|50->30|51->32|56->37|56->37
                    -- GENERATED --
                */
            