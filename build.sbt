name := "GoL"

version := "0.1"

scalaVersion := "2.13.1"


//this is minimum for Specs²
libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "4.8.3" % "test")
scalacOptions in Test ++= Seq("-Yrangepos")
//this is minimum for Scala Test
libraryDependencies += "org.scalactic" %% "scalactic" % "3.1.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % "test"

