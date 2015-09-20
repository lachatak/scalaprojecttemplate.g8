lazy val $name$ = Project("$name$", file("."))
  .settings(BaseSettings.settings: _*)
  .settings(Dependencies.$name$: _*)
  .settings(Assembly.$name$AssemblySettings: _*)