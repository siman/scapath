import sbt._
import Keys._
import spray.revolver.RevolverPlugin.Revolver

object Build extends Build {

  import Settings._

  // configure prompt to show current project
  override lazy val settings = super.settings :+ {
    shellPrompt := { s => Project.extract(s).currentProject.id + " > " }
  }

  lazy val root = Project("root",file("."))
	  .settings(basicSettings: _*)
//    .settings(Revolver.settings: _*)
}