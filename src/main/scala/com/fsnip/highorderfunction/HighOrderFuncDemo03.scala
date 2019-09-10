package com.fsnip.highorderfunction

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 17:28 2019/9/10
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object HighOrderFunctionDemo01 {
  def main(args: Array[String]): Unit = {

    // minusxy是一个高阶函数，因为它返回的是匿名函数
    // 返回的匿名函数也可以使用变量接收
    def minusxy(x: Int) ={
      (y: Int) => x - y
    }

    // 分步执行
    // f1就是(y: Int) => 3 - y
    val f1 = minusxy(3)
    println(f1(1))

    // 函数的柯里化
    // 首先执行minusxy(3)，返回一个函数3-y，再将参数6传递给返回的函数执行
    println(minusxy(3)(6))
  }
}
