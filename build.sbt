name := "scalameta"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies += "org.scalameta" %% "scalameta" % "1.3.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % Test

addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M11" cross CrossVersion.full)
scalacOptions += "-Xplugin-require:macroparadise"
