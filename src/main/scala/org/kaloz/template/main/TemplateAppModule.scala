package org.kaloz.template.main

import akka.actor.ActorSystem
import akka.util.Timeout

import scala.concurrent.duration._

trait TemplateAppModule {

  implicit val system = ActorSystem("template")
  implicit val timeout: Timeout = 10 second

}
