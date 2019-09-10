package com.fsnip.mymap

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 13:39 2019/8/28
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object HighOrderFuncDemo01 {
  def main(args: Array[String]): Unit = {
    val result = test(sum, 3.5)
    println(result)

//    val f1 = myPrint()  //直接就执行了

    // 在scala中，可以直接把一个函数赋值给变量，但是不执行函数
    val f1 = myPrint _
    f1


  }

  def myPrint(): Unit ={
    println("hello world!")
  }

  def test(f: Double => Double, n1: Double): Double ={
    f(n1)
  }

  def sum(n: Double): Double ={
    n + n
  }
}
