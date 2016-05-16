package com.omega.helpers

/**
  * Created by milind on 5/11/2016.
  */
object Helpers {
  def noexec[T](f: => T): T = {
    null.asInstanceOf[T]
  }

  def exec[T](f: => T): T = {
    val exe: T => T = (t: T) => { println("~" * 50); t }
    exe(f)
  }

  implicit class StringHelper(s: String) {
    def printSpecial: Unit = {
      val len = s.length
      println("-" * (len + 8))
      println("|   " + s + "   |")
      println("-" * (len + 8))
    }
  }
}
