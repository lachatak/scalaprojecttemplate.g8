lazy val main = Project("main", file("."))
  .settings(BaseSettings.settings: _*)
  .settings(Dependencies.$name$: _*)
  .settings(mainClass in (Compile, run) := Some("org.kaloz.$name$.$name;format="Camel"$App"))