package com.omega

import java.io.File

import akka.actor.ActorSystem
import com.omega.actor.BookActorRemote
import com.typesafe.config.ConfigFactory

/**
  * Created by milind on 5/16/2016.
  */
object Main {
  def main(args: Array[String]) {
    val configFile = getClass.getClassLoader.getResource("application.remote.conf").getFile
    val config = ConfigFactory.parseFile(new File(configFile))

    val system = ActorSystem("OmegaActorSystemRemote", config)

    val bookActorRemote = system.actorOf(BookActorRemote.props, name="bookActorRemote")
  }
}
