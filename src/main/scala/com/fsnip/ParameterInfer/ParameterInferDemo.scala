package com.fsnip.ParameterInfer

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 14:01 2019/9/11
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object ParameterInferDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    // 当传入的参数只有一个时，可以省去括号
    // 如果变量只在=>右边出现一次，可以使用_来代替
    println(list.map((x: Int) => x + 1))
    println(list.map((x) => x + 1))
    println(list.map(x => x + 1))
    println(list.map(_ + 1))

    println(list.reduce(f1))
    println(list.reduce((n1: Int, n2: Int) => n1 + n2))
    println(list.reduce((n1, n2) => n1 + n2))
    println(list.reduce(_ + _))
    def f1(n1: Int, n2: Int): Int ={
      n1 + n2
    }

//    val f = makeSuffix(".jpg")
//    println(f("dog"))
//    println(f("cat.jpg"))

    // 闭包：一个函数不可避免的引入了另一个函数的变量
    def makeSuffix(suffix: String) ={
      (fileName: String) => {
        if(fileName.endsWith(suffix))
          fileName
        else
          fileName + suffix
      }
    }

    val f = makeSuffix(".jpg")
    println(f("dog"))
    println(f("cat.jpg"))
  }
}
