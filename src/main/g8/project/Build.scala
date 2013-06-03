import sbt._
import Keys._
import play.Project

object ApplicationBuild extends Build {
	val appName         = "$name$"
	val appVersion      = "1.0-SNAPSHOT"

	val appDependencies = Seq(
	    "nl.rhinofly" %% "jira-exception-processor" % "3.0.1",
		"org.webjars" % "webjars-play" % "2.1.0-1",
		"org.webjars" % "jquery" % "1.9.0",
		"org.webjars" % "bootstrap" % "2.3.1-1",
		"org.webjars" % "requirejs" % "2.1.5"
	)
	
	val main = play.Project(appName, appVersion, appDependencies).settings(
		resolvers += "Rhinofly Internal Repository" at "http://maven-repository.rhinofly.net:8081/artifactory/libs-release-local"
	)
}