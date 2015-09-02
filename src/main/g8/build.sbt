lazy val root = Project("root", file("."))
  .aggregate($name$)
  .settings(BaseSettings.settings: _*)


lazy val $name$ = Project("$name$", file("."))
  .settings(BaseSettings.settings: _*)
  .settings(Dependencies.$name$: _*)
  .settings(mainClass in (Compile, run) := Some("org.kaloz.$name$.$name;format="Camel"$App"))