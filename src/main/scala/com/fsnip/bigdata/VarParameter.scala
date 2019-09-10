package com.fsnip.bigdata

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 9:54 2019/8/13
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object VarParameter {
  def main(args: Array[String]): Unit = {
    println(sum(1, 2, 3, 4))

  }

  def sum(n1: Int, args: Int *): Int = {
    var sum = 0
    for(i <- args){
      sum += i
    }
    sum
  }

}
