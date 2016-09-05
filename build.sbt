name := "kanban"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(JettyPlugin)

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases"
resolvers += "jcenter repository" at "https://jcenter.bintray.com"
scalaVersion := "2.10.0"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "6.0.3",
  "org.scalaz" %% "scalaz-http" % "6.0.3",
  "org.eclipse.jetty" % "jetty-servlet" % "9.3.8.v20160314" % "container",
  "org.eclipse.jetty" % "jetty-webapp" % "9.3.8.v20160314" % "test, container",
  "org.eclipse.jetty" % "jetty-server" % "9.3.8.v20160314" % "container",
  "org.squeryl" % "squeryl_2.10" % "0.9.5-6",
  "com.h2database" % "h2" % "1.4.192"

)




//fork in(Test, run) := true

//seq(com.github.siasia.WebPlugin.webSettings :_*)