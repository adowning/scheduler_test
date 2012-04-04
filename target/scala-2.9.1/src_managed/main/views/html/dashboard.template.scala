
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
object dashboard extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Seq[Project],Seq[scala.Tuple2[Task, Project]],User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(projects: Seq[Project], todoTasks: Seq[(Task,Project)], user: User):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.70*/("""

"""),_display_(Seq(/*3.2*/main(projects, user)/*3.22*/{_display_(Seq(format.raw/*3.23*/("""
    
    <header>
        <hgroup>
            <h1>Dashboard</h1>
            <h2>Tasks over all projects</h2>
        </hgroup>
    </header>
    
    <article  class="tasks">
        """),_display_(Seq(/*13.10*/todoTasks/*13.19*/.groupBy(_._2).map/*13.37*/ {/*14.13*/case (project, projectTasks) =>/*14.44*/ {_display_(Seq(format.raw/*14.46*/("""
                <div class="folder" data-folder-id=""""),_display_(Seq(/*15.54*/project/*15.61*/.id)),format.raw/*15.64*/("""">
                    <header>
                        <h3><a href="#"""),_display_(Seq(/*17.40*/routes/*17.46*/.Tasks.index(project.id.get))),format.raw/*17.74*/("""">"""),_display_(Seq(/*17.77*/project/*17.84*/.name)),format.raw/*17.89*/("""</a></h3>
                        <span class="loader">Loading</span>
                    </header>
                    <ul class="list">
                        """),_display_(Seq(/*21.26*/projectTasks/*21.38*/.map/*21.42*/ {/*22.29*/case (task, _) =>/*22.46*/ {_display_(Seq(format.raw/*22.48*/("""
                                """),_display_(Seq(/*23.34*/tasks/*23.39*/.item(task, isEditable = false))),format.raw/*23.70*/("""
                            """)))}})),format.raw/*25.26*/("""
                    </ul>
                </div>
            """)))}})),format.raw/*29.10*/("""
    </article>
    
""")))})),format.raw/*32.2*/("""

"""))}
    }
    
    def render(projects:Seq[Project],todoTasks:Seq[scala.Tuple2[Task, Project]],user:User) = apply(projects,todoTasks,user)
    
    def f:((Seq[Project],Seq[scala.Tuple2[Task, Project]],User) => play.api.templates.Html) = (projects,todoTasks,user) => apply(projects,todoTasks,user)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 30 23:10:02 CDT 2012
                    SOURCE: /home/ash/testfactory_play2/zentasks/app/views/dashboard.scala.html
                    HASH: 3d14d891d26d54f2ff121e8f2db74398b0f45581
                    MATRIX: 553->1|693->69|725->72|753->92|786->93|1004->280|1022->289|1049->307|1060->322|1100->353|1135->355|1220->409|1236->416|1261->419|1363->490|1378->496|1428->524|1462->527|1478->534|1505->539|1699->702|1720->714|1733->718|1744->750|1770->767|1805->769|1870->803|1884->808|1937->839|2000->895|2096->968|2149->990
                    LINES: 19->1|22->1|24->3|24->3|24->3|34->13|34->13|34->13|34->14|34->14|34->14|35->15|35->15|35->15|37->17|37->17|37->17|37->17|37->17|37->17|41->21|41->21|41->21|41->22|41->22|41->22|42->23|42->23|42->23|43->25|46->29|49->32
                    -- GENERATED --
                */
            