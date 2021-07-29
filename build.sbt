name := "Supervision"


version := "0.1"

scalaVersion := "2.13.5"


libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-actor" % "2.5.23",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.23",
  "org.scalatest" %% "scalatest" % "3.2.3",
"com.typesafe.akka" % "akka-actor-typed_2.12" % "2.6.9",
"com.typesafe.akka" % "akka-actor-testkit-typed_2.12" % "2.6.9" % Test
)