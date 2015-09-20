import sbt.Keys._
import sbtassembly.AssemblyKeys._

object Assembly {

  lazy val $name$AssemblySettings =
  Seq(
    mainClass in assembly := Some("org.kaloz.$name$.$name;format="Camel"$App"),
    assemblyJarName in assembly := "$name$.jar"
  )

}
