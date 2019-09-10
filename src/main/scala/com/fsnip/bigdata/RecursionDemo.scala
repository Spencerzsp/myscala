package com.fsnip.bigdata

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 9:12 2019/8/15
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object RecursionDemo {
  def main(args: Array[String]): Unit = {
    val result = mx(0, 0)
    println(result)

    val result2 = mx2(0, 0)
    println(result2)
  }

  def mx(i: Int, sum: Int): Int = {
    if (i > 10)
      return sum
    else
      mx(i + 1, sum + i)
  }

  def mx2(i: Int, sum: Int): Int = {
    if (sum > 50 || i > 100)
      sum
    else if (i % 2 == 0)
      mx2(i + 1, sum)
    else
      mx2(i + 1, sum + i)
  }
}
