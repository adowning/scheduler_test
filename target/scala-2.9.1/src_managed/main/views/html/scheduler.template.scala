
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
object scheduler extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: User):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.14*/("""
<html>
    <head>
		<script type="text/javascript" src=""""),_display_(Seq(/*4.40*/routes/*4.46*/.Assets.at("javascripts/dhtmlxscheduler.js"))),format.raw/*4.90*/(""""></script>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*5.70*/routes/*5.76*/.Assets.at("stylesheets/login.css"))),format.raw/*5.111*/("""">
                <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*6.78*/routes/*6.84*/.Assets.at("stylesheets/libs/dhtmlxscheduler_glossy.css"))),format.raw/*6.141*/("""">

<script type="text/javascript" src=""""),_display_(Seq(/*8.38*/routes/*8.44*/.Assets.at("javascripts/scheduler.js"))),format.raw/*8.82*/(""""></script>
	
</head>


    <body>
    <header>
            <a href=""""),_display_(Seq(/*15.23*/routes/*15.29*/.Projects.index)),format.raw/*15.44*/("""" id="logo"><span>Zen</span>tasks</a>
            <dl id="user">
                <dt>"""),_display_(Seq(/*17.22*/user/*17.26*/.name)),format.raw/*17.31*/(""" <span>("""),_display_(Seq(/*17.40*/user/*17.44*/.email)),format.raw/*17.50*/(""")</span></dt>
                <dd>
                    <a href=""""),_display_(Seq(/*19.31*/routes/*19.37*/.Application.logout())),format.raw/*19.58*/("""">Logout</a>
                </dd>
            </dl>
    </header>

	<div id="scheduler_here" class="dhx_cal_container" style='width:100%; height:100%;'>
		<div class="dhx_cal_navline">
			<div class="dhx_cal_prev_button">&nbsp;</div>
			<div class="dhx_cal_next_button">&nbsp;</div>
			<div class="dhx_cal_today_button"></div>
			<div class="dhx_cal_date"></div>
			<div class="dhx_cal_tab" name="day_tab" style="right:204px;"></div>
			<div class="dhx_cal_tab" name="week_tab" style="right:140px;"></div>
			<div class="dhx_cal_tab" name="month_tab" style="right:76px;"></div>
		</div>
		<div class="dhx_cal_header">
		</div>
		<div class="dhx_cal_data">
		</div>		
	</div>
	</body>

    
</html>

"""))}
    }
    
    def render(user:User) = apply(user)
    
    def f:((User) => play.api.templates.Html) = (user) => apply(user)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 03 21:11:31 CDT 2012
                    SOURCE: /home/ash/testfactory_play2/zentasks/app/views/scheduler.scala.html
                    HASH: a9a3357f18201ee6a886cdb56ca15d9822d1314a
                    MATRIX: 507->1|591->13|679->71|693->77|758->121|869->202|883->208|940->243|1050->323|1064->329|1143->386|1214->427|1228->433|1287->471|1388->541|1403->547|1440->562|1557->648|1570->652|1597->657|1637->666|1650->670|1678->676|1774->741|1789->747|1832->768
                    LINES: 19->1|22->1|25->4|25->4|25->4|26->5|26->5|26->5|27->6|27->6|27->6|29->8|29->8|29->8|36->15|36->15|36->15|38->17|38->17|38->17|38->17|38->17|38->17|40->19|40->19|40->19
                    -- GENERATED --
                */
            