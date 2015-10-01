package org.kaloz.$name$

import akka.actor.ActorSystem
import akka.util.Timeout

import scala.concurrent.duration._

trait $name;format="Camel"$AppModule with $name;format="Camel"$AppConfig {

  implicit val system = ActorSystem("$name$")
  implicit val timeout: Timeout = 10 second

}
