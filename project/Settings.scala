import sbt._
import Keys._

object Settings {

  lazy val basicSettings = Seq(
    scalaVersion := "2.11.4",

    name := "scapath",
    version := "1.0",
    //homepage              := Some(new URL("http://scapath.io")),
    organization := "ScaPath Inc",
    //organizationHomepage  := Some(new URL("http://scapath.io")),
    description := "Scalable XPath",
    startYear := Some(2015),
    licenses := Seq("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt")),

    resolvers ++= Deps.resolutionRepos,
    libraryDependencies ++= Deps.deps,

    scalacOptions := Seq(
      "-encoding", "utf8",
      "-feature",
      "-unchecked",
      "-deprecation",
      "-target:jvm-1.8",
      "-language:_",
      "-Xlog-reflective-calls"
    )
  )
}