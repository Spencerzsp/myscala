package com.fsnip.breakable

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:31 2019/9/17
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object BreakableDemo {
  def main(args: Array[String]): Unit = {

    val array=Array(1,4,2,7,9,10)

    /**
      * breakable的用法
      * 1、首先需要导入scala.util.control.Breaks._这个包
      * 2、将需要通过breakable控制的代码放到breakable的大括号中
      */

    import util.control.Breaks._
    // 相当于break，跳出整个循环
    breakable{
      for(i <- 0 until array.length){
        if(array(i) == 7){
          println("哈哈哈")
          break()
        }
        println(array(i))
      }
    }

    // 相当于continue，跳出本次循环，继续执行下一次循环
    for(i <- 0 until array.length){
      breakable{
        if(array(i) == 7){
          println("呵呵呵")
          break()
        }
        println(array(i))
      }
    }
  }
}
