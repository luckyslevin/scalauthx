name := """scalauthx"""

organization := "com.ejisan"

version := "1.0-SNAPSHOT"

scalaVersion := "3.3.1"
githubOwner := "luckyslevin"
githubRepository := "scalauthx"
githubTokenSource := TokenSource.GitConfig("github.token")

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies += "org.specs2" %% "specs2-core" % "5.3.2" % Test
