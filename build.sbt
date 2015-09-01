lazy val main = Project("main", file("."))
  .settings(BaseSettings.settings: _*)
  .settings(Dependencies.template: _*)
  .settings(mainClass in (Compile, run) := Some("org.kaloz.template.main.TemplateApp"))