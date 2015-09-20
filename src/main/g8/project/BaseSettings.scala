import sbt._
import Keys._
import net.virtualvoid.sbt.graph.Plugin

object BaseSettings {

  lazy val settings =
  Seq(
    version := "1.0.0",
    organization := "org.kaloz.$name$",
    description := "$name;format="Camel"$ Project",
    scalaVersion := "2.11.6",
    homepage := Some(url("http://kaloz.org")),
    scalacOptions := Seq(
      "-encoding", "utf8",
      "-feature",
      "-unchecked",
      "-deprecation",
      "-target:jvm-1.8",
      "-language:postfixOps",
      "-language:implicitConversions"
    ),
    javacOptions := Seq(
      "-Xlint:unchecked", 
      "-Xlint:deprecation"
    ),
    mainClass in (Compile, run) := Some("org.kaloz.$name$.$name;format="Camel"$App")
    shellPrompt := { s => "[" + scala.Console.BLUE + Project.extract(s).currentProject.id + scala.Console.RESET + "] $"$"$ "}
  ) ++
  ResolverSettings.settings ++
  Testing.settings ++
  Plugin.graphSettings

}
