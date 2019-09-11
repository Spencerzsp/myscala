package com.fsnip.recursive

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 16:39 2019/9/11
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object RecursiveReverseString {
  def main(args: Array[String]): Unit = {
    val str = "hello"
    println(reverseString(str))
  }

  def reverseString(str: String): String ={
    if(str.length == 1)
      str
    else
      reverseString(str.tail) + str.head
  }
}
