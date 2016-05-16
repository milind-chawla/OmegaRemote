package com.omega.actor.transport

/**
  * Created by milind on 5/16/2016.
  */
object BookTransport {
  trait BookAction

  case class BookCreated(id: Long, name: String) extends BookAction
  case class BookUpdated(id: Long, name: String) extends BookAction
}
