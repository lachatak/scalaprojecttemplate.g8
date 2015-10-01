package org.kaloz.$name$

import com.typesafe.config.ConfigFactory

trait $name;format="Camel"$AppConfig {
  private val config = ConfigFactory.load()
}
