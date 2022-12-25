ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.9"

lazy val root = (project in file("."))
  .settings(
    name := "MCPack converter"
  )

libraryDependencies += "com.google.code.gson" % "gson" % "2.9.1"
