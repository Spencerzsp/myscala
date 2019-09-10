package com.fsnip.bigdata

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 11:24 2019/8/13
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object GenericDemo02 {
  def main(args: Array[String]): Unit = {
    val list1 = List("hello", "spark", "scala")
    val list2 = List(1, 2, 3)
    println(midList[String](list1))
    println(midList[Int](list2))
  }

  def midList[T](l: List[T]): T = {
    l(l.length / 2)
  }
}
