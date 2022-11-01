ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.0"

lazy val root = (project in file("."))
  .settings(
    name := "ImportTest",
    libraryDependencies += "io.github.classgraph" % "classgraph"% "4.8.149"
  )

