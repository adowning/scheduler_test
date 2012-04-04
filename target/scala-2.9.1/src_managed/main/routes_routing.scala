// @SOURCE:/home/ash/testfactory_play2/zentasks/conf/routes
// @HASH:c18d791edad1f0061d4750afe1b7110d163d451a
// @DATE:Mon Apr 02 22:40:46 CDT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Projects_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:10
val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:11
val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart("/logout"))))
                    

// @LINE:14
val controllers_Projects_add4 = Route("POST", PathPattern(List(StaticPart("/projects"))))
                    

// @LINE:16
val controllers_Projects_addGroup5 = Route("POST", PathPattern(List(StaticPart("/projects/groups"))))
                    

// @LINE:17
val controllers_Projects_deleteGroup6 = Route("DELETE", PathPattern(List(StaticPart("/projects/groups"))))
                    

// @LINE:18
val controllers_Projects_renameGroup7 = Route("PUT", PathPattern(List(StaticPart("/projects/groups"))))
                    

// @LINE:20
val controllers_Projects_delete8 = Route("DELETE", PathPattern(List(StaticPart("/projects/"),DynamicPart("project", """[^/]+"""))))
                    

// @LINE:21
val controllers_Projects_rename9 = Route("PUT", PathPattern(List(StaticPart("/projects/"),DynamicPart("project", """[^/]+"""))))
                    

// @LINE:23
val controllers_Projects_addUser10 = Route("POST", PathPattern(List(StaticPart("/projects/"),DynamicPart("project", """[^/]+"""),StaticPart("/team"))))
                    

// @LINE:24
val controllers_Projects_removeUser11 = Route("DELETE", PathPattern(List(StaticPart("/projects/"),DynamicPart("project", """[^/]+"""),StaticPart("/team"))))
                    

// @LINE:27
val controllers_Tasks_index12 = Route("GET", PathPattern(List(StaticPart("/projects/"),DynamicPart("project", """[^/]+"""),StaticPart("/tasks"))))
                    

// @LINE:28
val controllers_Tasks_add13 = Route("POST", PathPattern(List(StaticPart("/projects/"),DynamicPart("project", """[^/]+"""),StaticPart("/tasks"))))
                    

// @LINE:29
val controllers_Tasks_update14 = Route("PUT", PathPattern(List(StaticPart("/tasks/"),DynamicPart("task", """[^/]+"""))))
                    

// @LINE:30
val controllers_Tasks_delete15 = Route("DELETE", PathPattern(List(StaticPart("/tasks/"),DynamicPart("task", """[^/]+"""))))
                    

// @LINE:32
val controllers_Tasks_addFolder16 = Route("POST", PathPattern(List(StaticPart("/tasks/folder"))))
                    

// @LINE:33
val controllers_Tasks_deleteFolder17 = Route("DELETE", PathPattern(List(StaticPart("/projects/"),DynamicPart("project", """[^/]+"""),StaticPart("/tasks/folder"))))
                    

// @LINE:34
val controllers_Tasks_renameFolder18 = Route("PUT", PathPattern(List(StaticPart("/project/"),DynamicPart("project", """[^/]+"""),StaticPart("/tasks/folder"))))
                    

// @LINE:37
val controllers_Application_javascriptRoutes19 = Route("GET", PathPattern(List(StaticPart("/assets/javascripts/routes"))))
                    

// @LINE:40
val controllers_Assets_at20 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:43
val controllers_Scheduler_index21 = Route("GET", PathPattern(List(StaticPart("/scheduler"))))
                    
def documentation = List(("""GET""","""/""","""controllers.Projects.index"""),("""GET""","""/login""","""controllers.Application.login"""),("""POST""","""/login""","""controllers.Application.authenticate"""),("""GET""","""/logout""","""controllers.Application.logout"""),("""POST""","""/projects""","""controllers.Projects.add"""),("""POST""","""/projects/groups""","""controllers.Projects.addGroup()"""),("""DELETE""","""/projects/groups""","""controllers.Projects.deleteGroup(group:String)"""),("""PUT""","""/projects/groups""","""controllers.Projects.renameGroup(group:String)"""),("""DELETE""","""/projects/$project<[^/]+>""","""controllers.Projects.delete(project:Long)"""),("""PUT""","""/projects/$project<[^/]+>""","""controllers.Projects.rename(project:Long)"""),("""POST""","""/projects/$project<[^/]+>/team""","""controllers.Projects.addUser(project:Long)"""),("""DELETE""","""/projects/$project<[^/]+>/team""","""controllers.Projects.removeUser(project:Long)"""),("""GET""","""/projects/$project<[^/]+>/tasks""","""controllers.Tasks.index(project:Long)"""),("""POST""","""/projects/$project<[^/]+>/tasks""","""controllers.Tasks.add(project:Long, folder:String)"""),("""PUT""","""/tasks/$task<[^/]+>""","""controllers.Tasks.update(task:Long)"""),("""DELETE""","""/tasks/$task<[^/]+>""","""controllers.Tasks.delete(task:Long)"""),("""POST""","""/tasks/folder""","""controllers.Tasks.addFolder"""),("""DELETE""","""/projects/$project<[^/]+>/tasks/folder""","""controllers.Tasks.deleteFolder(project:Long, folder:String)"""),("""PUT""","""/project/$project<[^/]+>/tasks/folder""","""controllers.Tasks.renameFolder(project:Long, folder:String)"""),("""GET""","""/assets/javascripts/routes""","""controllers.Application.javascriptRoutes"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/scheduler""","""controllers.Scheduler.index"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Projects_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Projects.index, HandlerDef(this, "controllers.Projects", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.login, HandlerDef(this, "controllers.Application", "login", Nil))
   }
}
                    

// @LINE:10
case controllers_Application_authenticate2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.authenticate, HandlerDef(this, "controllers.Application", "authenticate", Nil))
   }
}
                    

// @LINE:11
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.logout, HandlerDef(this, "controllers.Application", "logout", Nil))
   }
}
                    

// @LINE:14
case controllers_Projects_add4(params) => {
   call { 
        invokeHandler(_root_.controllers.Projects.add, HandlerDef(this, "controllers.Projects", "add", Nil))
   }
}
                    

// @LINE:16
case controllers_Projects_addGroup5(params) => {
   call { 
        invokeHandler(_root_.controllers.Projects.addGroup(), HandlerDef(this, "controllers.Projects", "addGroup", Nil))
   }
}
                    

// @LINE:17
case controllers_Projects_deleteGroup6(params) => {
   call(params.fromQuery[String]("group", None)) { (group) =>
        invokeHandler(_root_.controllers.Projects.deleteGroup(group), HandlerDef(this, "controllers.Projects", "deleteGroup", Seq(classOf[String])))
   }
}
                    

// @LINE:18
case controllers_Projects_renameGroup7(params) => {
   call(params.fromQuery[String]("group", None)) { (group) =>
        invokeHandler(_root_.controllers.Projects.renameGroup(group), HandlerDef(this, "controllers.Projects", "renameGroup", Seq(classOf[String])))
   }
}
                    

// @LINE:20
case controllers_Projects_delete8(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(_root_.controllers.Projects.delete(project), HandlerDef(this, "controllers.Projects", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:21
case controllers_Projects_rename9(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(_root_.controllers.Projects.rename(project), HandlerDef(this, "controllers.Projects", "rename", Seq(classOf[Long])))
   }
}
                    

// @LINE:23
case controllers_Projects_addUser10(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(_root_.controllers.Projects.addUser(project), HandlerDef(this, "controllers.Projects", "addUser", Seq(classOf[Long])))
   }
}
                    

// @LINE:24
case controllers_Projects_removeUser11(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(_root_.controllers.Projects.removeUser(project), HandlerDef(this, "controllers.Projects", "removeUser", Seq(classOf[Long])))
   }
}
                    

// @LINE:27
case controllers_Tasks_index12(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(_root_.controllers.Tasks.index(project), HandlerDef(this, "controllers.Tasks", "index", Seq(classOf[Long])))
   }
}
                    

// @LINE:28
case controllers_Tasks_add13(params) => {
   call(params.fromPath[Long]("project", None), params.fromQuery[String]("folder", None)) { (project, folder) =>
        invokeHandler(_root_.controllers.Tasks.add(project, folder), HandlerDef(this, "controllers.Tasks", "add", Seq(classOf[Long], classOf[String])))
   }
}
                    

// @LINE:29
case controllers_Tasks_update14(params) => {
   call(params.fromPath[Long]("task", None)) { (task) =>
        invokeHandler(_root_.controllers.Tasks.update(task), HandlerDef(this, "controllers.Tasks", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:30
case controllers_Tasks_delete15(params) => {
   call(params.fromPath[Long]("task", None)) { (task) =>
        invokeHandler(_root_.controllers.Tasks.delete(task), HandlerDef(this, "controllers.Tasks", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:32
case controllers_Tasks_addFolder16(params) => {
   call { 
        invokeHandler(_root_.controllers.Tasks.addFolder, HandlerDef(this, "controllers.Tasks", "addFolder", Nil))
   }
}
                    

// @LINE:33
case controllers_Tasks_deleteFolder17(params) => {
   call(params.fromPath[Long]("project", None), params.fromQuery[String]("folder", None)) { (project, folder) =>
        invokeHandler(_root_.controllers.Tasks.deleteFolder(project, folder), HandlerDef(this, "controllers.Tasks", "deleteFolder", Seq(classOf[Long], classOf[String])))
   }
}
                    

// @LINE:34
case controllers_Tasks_renameFolder18(params) => {
   call(params.fromPath[Long]("project", None), params.fromQuery[String]("folder", None)) { (project, folder) =>
        invokeHandler(_root_.controllers.Tasks.renameFolder(project, folder), HandlerDef(this, "controllers.Tasks", "renameFolder", Seq(classOf[Long], classOf[String])))
   }
}
                    

// @LINE:37
case controllers_Application_javascriptRoutes19(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.javascriptRoutes, HandlerDef(this, "controllers.Application", "javascriptRoutes", Nil))
   }
}
                    

// @LINE:40
case controllers_Assets_at20(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:43
case controllers_Scheduler_index21(params) => {
   call { 
        invokeHandler(_root_.controllers.Scheduler.index, HandlerDef(this, "controllers.Scheduler", "index", Nil))
   }
}
                    
}
    
}
                