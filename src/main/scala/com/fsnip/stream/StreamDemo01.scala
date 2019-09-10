package com.fsnip.stream

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 16:53 2019/8/30
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object StreamDemo01 {
  def main(args: Array[String]): Unit = {
    def numForm(n: BigInt): Stream[BigInt] = n #:: numForm(n + 1)
    val stream = numForm(1)
    println(stream)
    println(stream.head)
    println(stream.tail)
    println(stream.head)
    println(stream)
    println(stream.tail)
    println(stream)
  }
}
