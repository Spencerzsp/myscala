package com.fsnip.myimplicit

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:49 2019/8/21
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object ImplicitDemo01 {
  def main(args: Array[String]): Unit = {

//    编写一个隐式函数 Double -> Int
    implicit def f1(num: Double): Int ={
      num.toInt
    }

    val num: Int = 3.5

  }
}
