import sbt._

object Deps {

  val resolutionRepos = Seq(
    "spray repo" at "http://repo.spray.io/",
    "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
  )

  object V {
		val spray = "1.3.2"
		val akka = "2.3.6"
  }
  
  lazy val deps = Seq(
	  "com.typesafe.akka" %% "akka-actor" % V.akka,
	  "com.typesafe" % "config" % "1.0.2",
	 
	  "io.spray" %% "spray-can" % V.spray,
	  "io.spray" %% "spray-http" % V.spray,
	  "io.spray" %% "spray-httpx" % V.spray,
	  "io.spray" %% "spray-util" % V.spray,
	  "io.spray" %% "spray-client" % V.spray,
	  "io.spray" %% "spray-routing" % V.spray,
	  
	  "com.typesafe.akka" %% "akka-testkit" % V.akka % "test",
	  "io.spray" %% "spray-testkit" % V.spray % "test",
	  "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
	  "org.mockito" % "mockito-core" % "1.9.5" % "test",
	  "org.mockito" % "mockito-all" % "1.9.5" % "test"
	)

	def compile   (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "compile")
	def provided  (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "provided")
	def test      (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "test")
	def runtime   (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "runtime")
	def container (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "container")
}