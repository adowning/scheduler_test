// @SOURCE:/home/ash/testfactory_play2/zentasks/conf/routes
// @HASH:c18d791edad1f0061d4750afe1b7110d163d451a
// @DATE:Mon Apr 02 22:40:46 CDT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:43
// @LINE:40
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:40
class ReverseAssets {
    


 
// @LINE:40
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:43
class ReverseScheduler {
    


 
// @LINE:43
def index() = {
   Call("GET", "/scheduler")
}
                                                        

                      
    
}
                            

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseTasks {
    


 
// @LINE:32
def addFolder() = {
   Call("POST", "/tasks/folder")
}
                                                        
 
// @LINE:27
def index(project:Long) = {
   Call("GET", "/projects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/tasks")
}
                                                        
 
// @LINE:28
def add(project:Long, folder:String) = {
   Call("POST", "/projects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/tasks" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("folder", folder)))))
}
                                                        
 
// @LINE:30
def delete(task:Long) = {
   Call("DELETE", "/tasks/" + implicitly[PathBindable[Long]].unbind("task", task))
}
                                                        
 
// @LINE:34
def renameFolder(project:Long, folder:String) = {
   Call("PUT", "/project/" + implicitly[PathBindable[Long]].unbind("project", project) + "/tasks/folder" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("folder", folder)))))
}
                                                        
 
// @LINE:29
def update(task:Long) = {
   Call("PUT", "/tasks/" + implicitly[PathBindable[Long]].unbind("task", task))
}
                                                        
 
// @LINE:33
def deleteFolder(project:Long, folder:String) = {
   Call("DELETE", "/projects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/tasks/folder" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("folder", folder)))))
}
                                                        

                      
    
}
                            

// @LINE:37
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    


 
// @LINE:10
def authenticate() = {
   Call("POST", "/login")
}
                                                        
 
// @LINE:11
def logout() = {
   Call("GET", "/logout")
}
                                                        
 
// @LINE:9
def login() = {
   Call("GET", "/login")
}
                                                        
 
// @LINE:37
def javascriptRoutes() = {
   Call("GET", "/assets/javascripts/routes")
}
                                                        

                      
    
}
                            

// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:6
class ReverseProjects {
    


 
// @LINE:23
def addUser(project:Long) = {
   Call("POST", "/projects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/team")
}
                                                        
 
// @LINE:18
def renameGroup(group:String) = {
   Call("PUT", "/projects/groups" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("group", group)))))
}
                                                        
 
// @LINE:17
def deleteGroup(group:String) = {
   Call("DELETE", "/projects/groups" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("group", group)))))
}
                                                        
 
// @LINE:20
def delete(project:Long) = {
   Call("DELETE", "/projects/" + implicitly[PathBindable[Long]].unbind("project", project))
}
                                                        
 
// @LINE:16
def addGroup() = {
   Call("POST", "/projects/groups")
}
                                                        
 
// @LINE:24
def removeUser(project:Long) = {
   Call("DELETE", "/projects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/team")
}
                                                        
 
// @LINE:21
def rename(project:Long) = {
   Call("PUT", "/projects/" + implicitly[PathBindable[Long]].unbind("project", project))
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:14
def add() = {
   Call("POST", "/projects")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:43
// @LINE:40
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:40
class ReverseAssets {
    


 
// @LINE:40
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:43
class ReverseScheduler {
    


 
// @LINE:43
def index = JavascriptReverseRoute(
   "controllers.Scheduler.index",
   """
      function() {
      return _wA({method:"GET", url:"/scheduler"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseTasks {
    


 
// @LINE:32
def addFolder = JavascriptReverseRoute(
   "controllers.Tasks.addFolder",
   """
      function() {
      return _wA({method:"POST", url:"/tasks/folder"})
      }
   """
)
                                                        
 
// @LINE:27
def index = JavascriptReverseRoute(
   "controllers.Tasks.index",
   """
      function(project) {
      return _wA({method:"GET", url:"/projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/tasks"})
      }
   """
)
                                                        
 
// @LINE:28
def add = JavascriptReverseRoute(
   "controllers.Tasks.add",
   """
      function(project,folder) {
      return _wA({method:"POST", url:"/projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/tasks" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("folder", folder)])})
      }
   """
)
                                                        
 
// @LINE:30
def delete = JavascriptReverseRoute(
   "controllers.Tasks.delete",
   """
      function(task) {
      return _wA({method:"DELETE", url:"/tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("task", task)})
      }
   """
)
                                                        
 
// @LINE:34
def renameFolder = JavascriptReverseRoute(
   "controllers.Tasks.renameFolder",
   """
      function(project,folder) {
      return _wA({method:"PUT", url:"/project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/tasks/folder" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("folder", folder)])})
      }
   """
)
                                                        
 
// @LINE:29
def update = JavascriptReverseRoute(
   "controllers.Tasks.update",
   """
      function(task) {
      return _wA({method:"PUT", url:"/tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("task", task)})
      }
   """
)
                                                        
 
// @LINE:33
def deleteFolder = JavascriptReverseRoute(
   "controllers.Tasks.deleteFolder",
   """
      function(project,folder) {
      return _wA({method:"DELETE", url:"/projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/tasks/folder" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("folder", folder)])})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:37
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    


 
// @LINE:10
def authenticate = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"/login"})
      }
   """
)
                                                        
 
// @LINE:11
def logout = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"/logout"})
      }
   """
)
                                                        
 
// @LINE:9
def login = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"/login"})
      }
   """
)
                                                        
 
// @LINE:37
def javascriptRoutes = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"/assets/javascripts/routes"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:6
class ReverseProjects {
    


 
// @LINE:23
def addUser = JavascriptReverseRoute(
   "controllers.Projects.addUser",
   """
      function(project) {
      return _wA({method:"POST", url:"/projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/team"})
      }
   """
)
                                                        
 
// @LINE:18
def renameGroup = JavascriptReverseRoute(
   "controllers.Projects.renameGroup",
   """
      function(group) {
      return _wA({method:"PUT", url:"/projects/groups" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("group", group)])})
      }
   """
)
                                                        
 
// @LINE:17
def deleteGroup = JavascriptReverseRoute(
   "controllers.Projects.deleteGroup",
   """
      function(group) {
      return _wA({method:"DELETE", url:"/projects/groups" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("group", group)])})
      }
   """
)
                                                        
 
// @LINE:20
def delete = JavascriptReverseRoute(
   "controllers.Projects.delete",
   """
      function(project) {
      return _wA({method:"DELETE", url:"/projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project)})
      }
   """
)
                                                        
 
// @LINE:16
def addGroup = JavascriptReverseRoute(
   "controllers.Projects.addGroup",
   """
      function() {
      return _wA({method:"POST", url:"/projects/groups"})
      }
   """
)
                                                        
 
// @LINE:24
def removeUser = JavascriptReverseRoute(
   "controllers.Projects.removeUser",
   """
      function(project) {
      return _wA({method:"DELETE", url:"/projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/team"})
      }
   """
)
                                                        
 
// @LINE:21
def rename = JavascriptReverseRoute(
   "controllers.Projects.rename",
   """
      function(project) {
      return _wA({method:"PUT", url:"/projects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project)})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Projects.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:14
def add = JavascriptReverseRoute(
   "controllers.Projects.add",
   """
      function() {
      return _wA({method:"POST", url:"/projects"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:43
// @LINE:40
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:40
class ReverseAssets {
    


 
// @LINE:40
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:43
class ReverseScheduler {
    


 
// @LINE:43
def index() = new play.api.mvc.HandlerRef(
   controllers.Scheduler.index(), HandlerDef(this, "controllers.Scheduler", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseTasks {
    


 
// @LINE:32
def addFolder() = new play.api.mvc.HandlerRef(
   controllers.Tasks.addFolder(), HandlerDef(this, "controllers.Tasks", "addFolder", Seq())
)
                              
 
// @LINE:27
def index(project:Long) = new play.api.mvc.HandlerRef(
   controllers.Tasks.index(project), HandlerDef(this, "controllers.Tasks", "index", Seq(classOf[Long]))
)
                              
 
// @LINE:28
def add(project:Long, folder:String) = new play.api.mvc.HandlerRef(
   controllers.Tasks.add(project, folder), HandlerDef(this, "controllers.Tasks", "add", Seq(classOf[Long], classOf[String]))
)
                              
 
// @LINE:30
def delete(task:Long) = new play.api.mvc.HandlerRef(
   controllers.Tasks.delete(task), HandlerDef(this, "controllers.Tasks", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:34
def renameFolder(project:Long, folder:String) = new play.api.mvc.HandlerRef(
   controllers.Tasks.renameFolder(project, folder), HandlerDef(this, "controllers.Tasks", "renameFolder", Seq(classOf[Long], classOf[String]))
)
                              
 
// @LINE:29
def update(task:Long) = new play.api.mvc.HandlerRef(
   controllers.Tasks.update(task), HandlerDef(this, "controllers.Tasks", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:33
def deleteFolder(project:Long, folder:String) = new play.api.mvc.HandlerRef(
   controllers.Tasks.deleteFolder(project, folder), HandlerDef(this, "controllers.Tasks", "deleteFolder", Seq(classOf[Long], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:37
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    


 
// @LINE:10
def authenticate() = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq())
)
                              
 
// @LINE:11
def logout() = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq())
)
                              
 
// @LINE:9
def login() = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq())
)
                              
 
// @LINE:37
def javascriptRoutes() = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Seq())
)
                              

                      
    
}
                            

// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:6
class ReverseProjects {
    


 
// @LINE:23
def addUser(project:Long) = new play.api.mvc.HandlerRef(
   controllers.Projects.addUser(project), HandlerDef(this, "controllers.Projects", "addUser", Seq(classOf[Long]))
)
                              
 
// @LINE:18
def renameGroup(group:String) = new play.api.mvc.HandlerRef(
   controllers.Projects.renameGroup(group), HandlerDef(this, "controllers.Projects", "renameGroup", Seq(classOf[String]))
)
                              
 
// @LINE:17
def deleteGroup(group:String) = new play.api.mvc.HandlerRef(
   controllers.Projects.deleteGroup(group), HandlerDef(this, "controllers.Projects", "deleteGroup", Seq(classOf[String]))
)
                              
 
// @LINE:20
def delete(project:Long) = new play.api.mvc.HandlerRef(
   controllers.Projects.delete(project), HandlerDef(this, "controllers.Projects", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:16
def addGroup() = new play.api.mvc.HandlerRef(
   controllers.Projects.addGroup(), HandlerDef(this, "controllers.Projects", "addGroup", Seq())
)
                              
 
// @LINE:24
def removeUser(project:Long) = new play.api.mvc.HandlerRef(
   controllers.Projects.removeUser(project), HandlerDef(this, "controllers.Projects", "removeUser", Seq(classOf[Long]))
)
                              
 
// @LINE:21
def rename(project:Long) = new play.api.mvc.HandlerRef(
   controllers.Projects.rename(project), HandlerDef(this, "controllers.Projects", "rename", Seq(classOf[Long]))
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Projects.index(), HandlerDef(this, "controllers.Projects", "index", Seq())
)
                              
 
// @LINE:14
def add() = new play.api.mvc.HandlerRef(
   controllers.Projects.add(), HandlerDef(this, "controllers.Projects", "add", Seq())
)
                              

                      
    
}
                            
}
                    
                