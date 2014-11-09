name := """simulator"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.1"

scalaSource in Compile := baseDirectory.value / "app"

scalaSource in Test := baseDirectory.value / "test"

libraryDependencies ++= Seq(
  "org.mongodb" %% "casbah" % "2.7.3",
  "com.novus" %% "salat" % "1.9.9",
  "org.specs2" % "specs2_2.11" % "2.3.12" % "test"
)