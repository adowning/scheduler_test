
package views.html.projects

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
object group extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Seq[Project],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(group: String, projects: Seq[Project] = Nil):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.47*/("""

<li data-group=""""),_display_(Seq(/*3.18*/group)),format.raw/*3.23*/("""">
    <span class="toggle"></span>
    <h4 class="groupName">"""),_display_(Seq(/*5.28*/group)),format.raw/*5.33*/("""</h4>
    <span class="loader">Loading</span>
    <dl class="options">
        <dt>Options</dt>
        <dd>
            <button class="newProject">New project</button>
            <button class="deleteGroup">Remove group</button>
        </dd>
    </dl>
    <ul>
        """),_display_(Seq(/*15.10*/projects/*15.18*/.map/*15.22*/ { project =>_display_(Seq(format.raw/*15.35*/("""
            """),_display_(Seq(/*16.14*/views/*16.19*/.html.projects.item(project))),format.raw/*16.47*/("""
        """)))})),format.raw/*17.10*/("""
    </ul>
</li>
"""))}
    }
    
    def render(group:String,projects:Seq[Project]) = apply(group,projects)
    
    def f:((String,Seq[Project]) => play.api.templates.Html) = (group,projects) => apply(group,projects)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 30 23:10:02 CDT 2012
                    SOURCE: /home/ash/testfactory_play2/zentasks/app/views/projects/group.scala.html
                    HASH: 68a575de1dec1d7205f53bdcec2ab19bcefadac6
                    MATRIX: 527->1|644->46|693->65|719->70|812->133|838->138|1142->411|1159->419|1172->423|1218->436|1263->450|1277->455|1327->483|1369->493
                    LINES: 19->1|22->1|24->3|24->3|26->5|26->5|36->15|36->15|36->15|36->15|37->16|37->16|37->16|38->17
                    -- GENERATED --
                */
            