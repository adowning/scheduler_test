
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
object item extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Project,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(project: Project):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.20*/("""

<li data-project=""""),_display_(Seq(/*3.20*/project/*3.27*/.id)),format.raw/*3.30*/("""">
    <a class="name" href="#"""),_display_(Seq(/*4.29*/routes/*4.35*/.Tasks.index(project.id.get))),format.raw/*4.63*/("""">"""),_display_(Seq(/*4.66*/project/*4.73*/.name)),format.raw/*4.78*/("""</a>
    <button class="delete" href=""""),_display_(Seq(/*5.35*/routes/*5.41*/.Projects.delete(project.id.get))),format.raw/*5.73*/("""">Delete</button>
    <span class="loader">Loading</span>
</li>
"""))}
    }
    
    def render(project:Project) = apply(project)
    
    def f:((Project) => play.api.templates.Html) = (project) => apply(project)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 30 23:10:02 CDT 2012
                    SOURCE: /home/ash/testfactory_play2/zentasks/app/views/projects/item.scala.html
                    HASH: e3044b48454b1e393523439da077081971baf704
                    MATRIX: 514->1|604->19|655->40|670->47|694->50|755->81|769->87|818->115|851->118|866->125|892->130|961->169|975->175|1028->207
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|25->4|25->4|25->4|25->4|26->5|26->5|26->5
                    -- GENERATED --
                */
            