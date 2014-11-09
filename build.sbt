name := """stockhub"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala).aggregate(core).dependsOn(core).dependsOn(richplayground).aggregate(richplayground)
lazy val simulator = project.in(file("modules/simulator")).dependsOn(core)
lazy val core = project.in(file("modules/core"))

lazy val richplayground = (project in file("modules/richplayground")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
)



