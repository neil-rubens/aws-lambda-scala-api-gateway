name := "aws-lambda-scala-api-gateway"

organization := "org.activeintel"

version := "1.0"

scalaVersion := "2.11.7"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

retrieveManaged := true

val awsVersion = "1.10.22"

libraryDependencies += "com.amazonaws" % "aws-java-sdk-lambda" % awsVersion

libraryDependencies += "com.amazonaws" % "aws-lambda-java-core" % "1.0.0"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
