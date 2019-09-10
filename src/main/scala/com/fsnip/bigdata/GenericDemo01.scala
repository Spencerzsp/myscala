package com.fsnip.bigdata

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 11:02 2019/8/13
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object GenericDemo01 {
  def main(args: Array[String]): Unit = {
    val intMessage = new IntMessage[Int](10)
    println(intMessage)
    val stringMessage = new StringMessage[String]("hello")
    println(stringMessage)
  }
}

abstract class Message[T](s: T) {
  def get = s
}

class IntMessage[Int](v: Int) extends Message(v)
class StringMessage[String](v: String) extends Message(v)