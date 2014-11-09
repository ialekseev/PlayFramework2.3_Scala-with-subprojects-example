name := """core"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.1"

scalaSource in Compile := baseDirectory.value / "app"

scalaSource in Test := baseDirectory.value / "test"

libraryDependencies ++= Seq( "joda-time" % "joda-time" % "2.3",
  "org.joda"  % "joda-convert" % "1.6"
)