package com.fsnip.abstractcontrol

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:27 2019/9/11
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object AbstractControlDemo02 {
  def main(args: Array[String]): Unit = {
    var x = 10
    while (x > 0){
      x -= 1
      println("x = " + x)
    }

    // 使用抽象控制实现while的功能
    def until(f1: => Boolean)(f2: => Unit): Unit ={
      if(f1){
        f2
        until(f1)(f2) // 递归的时候必须指定函数返回值类型
      }
    }

    var y  = 10
    until(y > 0){
      y -= 1
      println("until y = " + y)
    }
  }
}
