import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.cutajarjames",
      scalaVersion := "2.13.15",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "FunctionalProgrammingExercises",
    libraryDependencies += scalaTest % Test
  )
