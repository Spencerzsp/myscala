package com.fsnip.mymap

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 15:22 2019/8/28
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object HighOrderFuncDemo02 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3)

    val scanList = list.scanLeft(4)(add)
    println(scanList) //(4,5,7,10)
    val scanRight = list.scanRight(4)(sub)
    println(scanRight) //(-2,3,-1,4)

    val reduceLeft = list.reduceLeft(add)
    println(reduceLeft) //6
    val reduceRight = list.reduceRight(sub)
    println(reduceRight)  // (1-(2-3))=2

    val foldLeft = list.foldLeft(4)(sub)
    println(foldLeft) //((4-1)-2)-3=-2
    val foldRight = list.foldRight(4)(sub)
    println(foldRight)  //1-(2-(3-4))=-2
  }
  def add(n1: Int, n2: Int): Int ={
    n1 + n2
  }
  def sub(n1: Int, n2: Int): Int ={
    n1 - n2
  }
}
