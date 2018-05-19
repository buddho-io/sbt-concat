lazy val `sbt-concat` = project in file(".")

organization := "net.ground5hark.sbt"

name := "sbt-concat"

git.baseVersion := "0.1.0"

scalaVersion := "2.12.6"

enablePlugins(GitVersioning, GitBranchPrompt)

addSbtWeb("1.4.3")

scriptedLaunchOpts ++= Seq(
  "-Xmx1024M",
  "-XX:MaxPermSize=256M",
  s"-Dproject.version=${version.value}"
)

bintrayOrganization := Option("buddho")
bintrayPackageLabels := Seq("sbt", "sbt-plugin", "concat")
bintrayReleaseOnPublish in ThisBuild := false
bintrayRepository := "sbt-plugins"
publishMavenStyle := false
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
//publish <<= publish dependsOn (test in Test)

