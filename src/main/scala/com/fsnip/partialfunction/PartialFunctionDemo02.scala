package com.fsnip.partialfunction

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:28 2019/9/10
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object PartialFunctionDemo02 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, "hello")
    // 定义一个偏函数
    // 1.表示偏函数接收的参数类型是Any，返回的类型是Int
    // 2.如果返回true，就会去调用apply方法构建对象实例，如果是false,过滤
    val partialFun = new PartialFunction[Any, Int] {
      override def isDefinedAt(x: Any) = x.isInstanceOf[Int]

      override def apply(v1: Any) = v1.asInstanceOf[Int] + 1
    }
    // 使用偏函数，不能使用map，应该使用collect
    val result = list.collect(partialFun)
    println(result)
  }
}
