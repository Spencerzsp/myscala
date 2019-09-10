package com.fsnip.partialfunction

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 16:40 2019/9/10
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object PartialFunctionDemo03 {
  def main(args: Array[String]): Unit = {
    // 偏函数的简写形式
    def partialFun2 : PartialFunction[Any, Int] = {
      case i: Int => i + 1
    }
    val list = List(1, 2, 3, 4, "hello")
    val result = list.collect(partialFun2)
    println(result)
  }
}
