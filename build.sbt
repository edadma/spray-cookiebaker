name          := "spray-cookiebaker"

version       := "0.1"

organization  := "xyz.hyperreal"

scalaVersion  := "2.11.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers += "Hyperreal Repository" at "https://dl.bintray.com/edadma/maven"

libraryDependencies ++= {
	val akkaV = "2.3.12"
	val sprayV = "1.3.3"
	Seq(
	"io.spray"            %%  "spray-can"     % sprayV,
	"io.spray"            %%  "spray-routing" % sprayV,
	"io.spray"            %%  "spray-json"    % "1.3.2",
	"io.spray"            %%  "spray-testkit" % sprayV  % "test",
	"com.typesafe.akka"   %%  "akka-actor"    % akkaV,
	"com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
	"org.specs2"          %%  "specs2-core"   % "2.3.11" % "test",
	"commons-codec"       %   "commons-codec" % "1.7"
	)
}

Revolver.settings


seq(bintraySettings:_*)


publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

homepage := Some(url("https://github.com/edadma/spray-cookiebaker"))

pomExtra := (
  <scm>
    <url>git@github.com:edadma/spray-cookiebaker.git</url>
    <connection>scm:git:git@github.com:edadma/spray-cookiebaker.git</connection>
  </scm>
  <developers>
    <developer>
      <id>azeem</id>
      <name>Azeem Arshad</name>
      <url>https://github.com/azeem</url>
    </developer>
  </developers>)