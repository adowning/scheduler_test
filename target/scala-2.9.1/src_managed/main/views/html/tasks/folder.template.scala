
package views.html.tasks

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
object folder extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Seq[Task],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(folder: String, tasks: Seq[Task] = Nil):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.42*/("""

<div class="folder" data-folder-id=""""),_display_(Seq(/*3.38*/folder)),format.raw/*3.44*/("""">
    <header>
        <input type="checkbox" />
        <h3>"""),_display_(Seq(/*6.14*/folder)),format.raw/*6.20*/("""</h3>
        <span class="counter"></span>
        <dl class="options">
            <dt>Options</dt>
            <dd>
                <a class="deleteCompleteTasks" href="#">Remove complete tasks</a>
                <a class="deleteAllTasks" href="#">Remove all tasks</a>
                <a class="deleteFolder" href="#">Delete folder</a>
            </dd>
        </dl>
        <span class="loader">Loading</span>
    </header>
    <ul class="list">
        """),_display_(Seq(/*19.10*/tasks/*19.15*/.map/*19.19*/ { task =>_display_(Seq(format.raw/*19.29*/("""
            """),_display_(Seq(/*20.14*/views/*20.19*/.html.tasks.item( task ))),format.raw/*20.43*/("""
        """)))})),format.raw/*21.10*/("""
    </ul>
    <form class="addTask">
        <input type="hidden" name="folder" value=""""),_display_(Seq(/*24.52*/folder)),format.raw/*24.58*/("""" />
        <input type="text" name="taskBody" placeholder="New task..." />
        <input type="text" name="dueDate" class="dueDate" placeholder="Due date: mm/dd/yy" />
        <div class="assignedTo">
            <input type="text" name="assignedTo" placeholder="Assign to..." />
        </div>
        <input type="submit" />
    </form>
</div>

"""))}
    }
    
    def render(folder:String,tasks:Seq[Task]) = apply(folder,tasks)
    
    def f:((String,Seq[Task]) => play.api.templates.Html) = (folder,tasks) => apply(folder,tasks)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 30 23:10:03 CDT 2012
                    SOURCE: /home/ash/testfactory_play2/zentasks/app/views/tasks/folder.scala.html
                    HASH: 5050b9b6ee8720ddb98640a1d6554ff4b16025fb
                    MATRIX: 522->1|634->41|703->80|730->86|823->149|850->155|1342->616|1356->621|1369->625|1412->635|1457->649|1471->654|1517->678|1559->688|1679->777|1707->783
                    LINES: 19->1|22->1|24->3|24->3|27->6|27->6|40->19|40->19|40->19|40->19|41->20|41->20|41->20|42->21|45->24|45->24
                    -- GENERATED --
                */
            