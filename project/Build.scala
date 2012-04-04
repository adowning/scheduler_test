import sbt._
import Keys._

import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "zentask"
    val appVersion      = "1.0"

    val appDependencies = Seq(
    // Add your project dependencies here,
    )
  
    val main = PlayProject(appName, appVersion, mainLang = SCALA)

}
            
