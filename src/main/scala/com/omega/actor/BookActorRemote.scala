package com.omega.actor

import akka.actor.{Actor, Props}

/**
  * Created by milind on 5/16/2016.
  */
class BookActorRemote extends Actor {
  import com.omega.actor.transport.BookTransport._

  override def receive = {
    case b @ BookCreated(_, _) => println(b)
    case b @ BookUpdated(_, _) => println(b)
    case x => println(x)
  }
}

object BookActorRemote {
  def props = Props[BookActorRemote]
}
