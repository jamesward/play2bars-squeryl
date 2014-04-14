name := "hello-play"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  "org.squeryl" %% "squeryl" % "0.9.5-6",
  "org.webjars" %% "webjars-play" % "2.2.2-1",
  "org.webjars" % "bootstrap" % "2.3.1",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)

play.Project.playScalaSettings