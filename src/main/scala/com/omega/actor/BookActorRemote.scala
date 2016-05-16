package com.omega.actor

import akka.actor.{Actor, Props}

/**
  * Created by milind on 5/16/2016.
  */
class BookActorRemote extends Actor {
  import com.omega.actor.transport.BookTransport._

  override def receive = {
    case b @ BookCreated(id, name) => println(b)
    case b @ BookUpdated(id, name) => println(b)
    case x => println(x)
  }
}

object BookActorRemote {
  def props = Props[BookActorRemote]
}
