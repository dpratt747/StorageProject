name := "HerdingCats"

version := "0.1"

scalaVersion := "2.12.6"

scalacOptions += "-Ypartial-unification"

libraryDependencies ++= Seq(
  //herding cats dependencies
  "org.typelevel" %% "cats-core" % "1.0.1",
  "org.typelevel" %% "cats-effect" % "1.0.0-RC",
  "org.typelevel" %% "cats-mtl-core" % "0.2.1",
  //slick dependencies
  "com.typesafe.slick" %% "slick" % "3.2.3",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.3",

  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41"


)
