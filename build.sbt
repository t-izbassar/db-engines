ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.github.t-izbassar"

lazy val root = (project in file("."))
  .settings(
    name := "db-engines",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % Test,
  )
