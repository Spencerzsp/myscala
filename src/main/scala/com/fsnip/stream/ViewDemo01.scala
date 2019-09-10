package com.fsnip.stream

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 17:07 2019/8/30
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object ViewDemo01 {
  def main(args: Array[String]): Unit = {

    val s = eq _

    val viewSquares1 = (1 to 100).filter(s)
    println(viewSquares1)

    val viewSquares2 = (1 to 100).view.filter(eq)
    println(viewSquares2)
    for(item <- viewSquares2)
      println("item= "+ item)


  }

  def eq(i: Int): Boolean = {
    i.toString.equals(i.toString.reverse)
  }

}
