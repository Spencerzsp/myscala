package com.fsnip.bigdata

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 17:47 2019/8/2
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object LookSource {
  def main(args: Array[String]): Unit = {
    var array = new Array[Int](10)
    for (i <- array)
      println(i)
  }

  /**
    *
    * @param n1
    * @param n2
    * @return
    */
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }

}
