package com.fsnip.partialfunction

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:15 2019/9/10
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object PartialFunctionDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, "hello")
    println(list.filter(f1).map(f3).map(f2))  //List(2, 3, 4, 5)

    def f1(n: Any): Boolean ={
      n.isInstanceOf[Int]
    }

    def f2(n: Int): Int ={
      n + 1
    }

    def f3(n: Any): Int ={
      n.asInstanceOf[Int]
    }

    def addOne(i: Any): Any ={
      i match {
        case x: Int => x + 1
        case _ =>
      }
    }
    println(list.map(addOne))   // List(2, 3, 4, 5, ())
  }
}
