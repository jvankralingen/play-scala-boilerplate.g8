import sbt._
import Keys._
import play.Project

object ApplicationBuild extends Build {
	val appName         = "boilerplate"
	val appVersion      = "1.0-SNAPSHOT"

	val appDependencies = Seq(
		"org.webjars" % "webjars-play" % "2.1.0-1",
		"org.webjars" % "jquery" % "1.9.0",
		"org.webjars" % "bootstrap" % "2.2.2",
		"org.webjars" % "requirejs" % "2.1.5"
	)

	val main = Project(appName, appVersion, appDependencies).settings()
}