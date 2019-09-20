package com.fsnip.test

import scala.math.sqrt

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:28 2019/9/20
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object HighOrderFunctionDemo {
  def main(args: Array[String]): Unit = {
    val h = compose(f, g)
    println(h(2))

  }

  def f(x: Double) = if (x > 0) Some(sqrt(x)) else None

  def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None

  def compose(f: Double => Option[Double], g: Double => Option[Double]) = {
    (x: Double) => {
      if (f(x) == None || g(x) == None) None
      else g(x)
    }
  }
}
