ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.github.t-izbassar"

val ZIOVersion = "1.0.0-RC17"

lazy val root = (project in file("."))
  .settings(
    name := "db-engines"
  )

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full)

addCommandAlias("scalafmtAll", "all scalafmtSbt scalafmt test:scalafmt")
addCommandAlias("scalafmtCheckAll", "all scalafmtSbtCheck scalafmtCheck test:scalafmtCheck")

libraryDependencies ++= Seq(
  "dev.zio"       %% "zio"       % ZIOVersion,
  "org.scalatest" %% "scalatest" % "3.1.0" % Test
)

scalacOptions in Compile := Seq(
  "-language:higherKinds",
  "-language:existentials",
  "-deprecation",
  "-explaintypes",
  "-feature",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint:_,-type-parameter-shadow",
  "-Yrangepos",
  "-Ywarn-extra-implicit",
  "-Ywarn-unused:_,imports",
  "-Ywarn-unused:imports",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard"
)
