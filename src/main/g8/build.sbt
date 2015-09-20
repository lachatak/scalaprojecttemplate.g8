lazy val root = Project("root", file("."))
  .aggregate($name$)
  .settings(BaseSettings.settings: _*)


lazy val $name$ = Project("$name$", file("$name$"))
  .settings(BaseSettings.settings: _*)
  .settings(mainClass in (Compile, run) := Some("org.kaloz.$name$.$name;format="Camel"$App"))
  .settings(Dependencies.$name$: _*)
  .settings(Assembly.$name$AssemblySettings: _*)